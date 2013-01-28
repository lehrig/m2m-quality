package de.upb.m2m.quality.configurator.jobs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.uka.ipd.sdq.workflow.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.IJob;
import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.RollbackFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.upb.m2m.quality.configurator.M2MQualityConfiguration;
import de.upb.m2m.quality.configurator.jobs.utils.QVTOLogger;
import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;

/**
 * Configures and executes a QVT-O transformation job. Most important, this
 * includes the configuration of source and target models as well as the
 * transformation script. Minor configuration settings include the configuration
 * of the QVT-O logger.
 * 
 * Originally, the classes from de.uka.ipd.sdq.workflow.mdsd.emf.qvto were
 * intended to realize the above described functionality. However, their
 * inability to specify unexisting target models where no root element is
 * already included led to the implementation of this class. Future work may
 * resolve this issue; optimally by adding the functionality to the
 * de.uka.ipd.sdq.workflow.mdsd.emf.qvto classes.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class QVTOTransformationJob implements IJob,
		IBlackboardInteractingJob<MDSDBlackboard> {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger
			.getLogger(QVTOTransformationJob.class);

	/**
	 * The general configuration for this job.
	 */
	protected M2MQualityConfiguration config = null;

	/**
	 * The language-specific language configuration for this job.
	 */
	protected AbstractLanguageConfiguration langConf = null;

	/**
	 * Constructor initializing the language specification as well as the
	 * general configuration for this job.
	 * 
	 * @param config
	 *            The general configuration to be used
	 * @param langConf
	 *            The language configuration to be used
	 */
	public QVTOTransformationJob(M2MQualityConfiguration config,
			AbstractLanguageConfiguration langConf) {
		this.config = config;
		this.langConf = langConf;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * The method basically follows the explanations made within the QVT-O
	 * eclipse.org Wiki which explains how to configure and call the QVT-O
	 * engine from Java.
	 * 
	 * @see "http://wiki.eclipse.org/QVTOML/Examples/InvokeInJava"
	 */
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		// transformation script
		// TODO currently, only exactly 1 qvto tranformation script is supported
		// - add support for other transformation languages?
		// - add support for multiple transformation scripts?
		assert (langConf.getLanguageToMetricsTransformationsURI().size() == 1);
		URI transformationScriptURI = langConf
				.getLanguageToMetricsTransformationsURI().get(0);

		// input model
		ResourceSet resourceSet = new ResourceSetImpl();
		URI xmiURI = langConf.getASTInputURI(config.getOutputMetricsPath());
		xmiURI = URI.createFileURI(xmiURI.toString());
		// String inName = langConf.getInputFilePath();
		// URI xmiURI = URI.createFileURI(inName.concat(".xmi"));

		Resource inResource = resourceSet.getResource(xmiURI, true);
		EList<EObject> inObjects = inResource.getContents();
		ModelExtent input = new BasicModelExtent(inObjects);

		// create executor for the given transformation
		TransformationExecutor executor = new TransformationExecutor(
				transformationScriptURI);
		executor.loadTransformation();

		// create & configure execution context, i.e., setup the execution
		// environment details:
		// configuration properties, logger, monitor object etc.
		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setLog(new QVTOLogger(LOGGER));
		Map<String, Object> configPropertyMap = new HashMap<String, Object>();
		for (Entry<String, Object> entry : configPropertyMap.entrySet()) {
			context.setConfigProperty(entry.getKey(), entry.getValue());
		}

		// create the input extent (in- and outputs) with its initial contents
		List<ModelExtent> modelExtendList = new ArrayList<ModelExtent>();
		modelExtendList.add(input);
		ModelExtent output = new BasicModelExtent();
		modelExtendList.add(output);

		// run the transformation assigned to the executor with the given
		// input and output and execution context -> ChangeTheWorld(in, out)
		// Remark: variable arguments count is supported
		ExecutionDiagnostic result = executor.execute(context,
				modelExtendList.toArray(new BasicModelExtent[] {}));

		// check the result for success
		if (result.getSeverity() != Diagnostic.OK) {
			throw new JobFailedException("QVT-O Transformation failed: "
					+ result.getMessage(), result.getException());
		}

		// let's persist them using a resource
		ResourceSet outResourceSet = new ResourceSetImpl();
		String outputFileString = config.getOutputMetricsPath()
				+ File.separator + "Output_" + langConf.getName() + ".xmi";
		Resource outResource = outResourceSet.createResource(URI
				.createFileURI(outputFileString));
		List<EObject> outObjects = output.getContents();
		outResource.getContents().addAll(outObjects);
		try {
			outResource.save(Collections.emptyMap());
		} catch (IOException e) {
			LOGGER.error("Could not save to " + outputFileString);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return this.getClass().getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void rollback(IProgressMonitor monitor)
			throws RollbackFailedException {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
	}

}
