package de.upb.m2m.quality.configurator.jobs;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ModelLocation;
import de.uka.ipd.sdq.workflow.mdsd.emf.qvtr.QVTRScript;
import de.uka.ipd.sdq.workflow.mdsd.emf.qvtr.QVTRScriptInfo;
import de.uka.ipd.sdq.workflow.mdsd.emf.qvtr.jobs.QVTRTransformationJobConfiguration;
import de.upb.m2m.quality.configurator.M2MQualityConfiguration;
import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;

/**
 * Configures a QVT-R transformation job. Most important, this includes the
 * configuration of source and target models as well as the transformation
 * script. Minor configuration settings include the location where tracing
 * information are stored and the debug level of the QVT-R execution.
 * 
 * @version 0.1
 * @author Kapova et al., Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class QVTRConfigurationJob extends
		AbstractTransformationConfigurationJob {
	/**
	 * The QVT-R configuration object that will be passed to the workflow
	 * engine.
	 */
	private QVTRTransformationJobConfiguration jobConfiguration = null;

	/**
	 * Constructor initializing the language specification, the general
	 * configuration for this job, and the QVT-R configuration object.
	 * 
	 * @param config
	 *            The general configuration to be used
	 * @param langConf
	 *            The language configuration to be used
	 */
	public QVTRConfigurationJob(M2MQualityConfiguration config,
			AbstractLanguageConfiguration langConf) {
		super(config, langConf);

		this.jobConfiguration = new QVTRTransformationJobConfiguration();
		langConf.setQVTRTrafoJobConfiguration(jobConfiguration);
	}

	/**
	 * Sets up the configuration for the QVT-R configuration object. For this,
	 * the method needs to access the work flow blackboard to receive the
	 * respective source and target models. Furthermore, the language
	 * configuration object gives the path to store tracing information and the
	 * location of the transformation script.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		// TODO currently, only exactly 1 qvtr tranformation script is supported
		// - add support for other transformation languages?
		// - add support for multiple transformation scripts?
		assert (langConf.getLanguageToMetricsTransformationsURI().size() == 1);
		URI transformationScript = langConf
				.getLanguageToMetricsTransformationsURI().get(0);

		assert (jobConfiguration != null);

		// get the models to work with
		ModelLocation[] inputModelLocations = getModelsFromBlackboard(
				blackboard, langConf.getLanguageModelPartitionId());

		// Load meta models needed for transformation script
		List<EPackage> metamodels = new ArrayList<EPackage>();
		getMetaModelsFromBlackboard(blackboard,
				langConf.getLanguageModelPartitionId(), metamodels);
		getMetaModelsFromBlackboard(blackboard,
				langConf.getLanguageMetricsModelPartitionId(), metamodels);

		String outputFileString = config.getOutputMetricsPath()
				+ File.separator + "Output_" + langConf.getName() + ".xmi";
		ModelLocation[] outputModelLocations = new ModelLocation[] { createResourceToInputPartition(
				blackboard, langConf.getLanguageMetricsModelPartitionId(),
				URI.createFileURI(outputFileString)) };

		QVTRScript qvtrScript = createQVTScript(transformationScript,
				metamodels, null, null);

		// URI traceFileURI =
		// URI.createPlatformResourceURI(config.getTraceFilePath(), false);
		URI traceFileURI = URI.createFileURI(config.getTraceFilePath());

		// Not clearing the traces caused a bug with existing traces
		HashMap<String, String> properties = new HashMap<String, String>();
		properties.put("clearTraces", "true");

		// set the job configuration
		jobConfiguration.setDebug(true);
		jobConfiguration.setProperties(properties);

		jobConfiguration.addModelLocationSets(inputModelLocations);
		jobConfiguration.addModelLocationSets(outputModelLocations);

		jobConfiguration.setTraceFileURI(traceFileURI);
		jobConfiguration.setExtendedDebuggingLog(null);
		jobConfiguration.setQVTRScript(qvtrScript);
	}

	/**
	 * Creates a new QVT-R script instance with the help of the provided method
	 * parameters.
	 * 
	 * @param script
	 *            A path linking a QVT-R transformation script
	 * @param metaModels
	 *            Metamodels needed for the transformation
	 * @param transformation
	 *            Name of the transformation
	 * @param direction
	 *            Direction of the transformation
	 * @return The newly created QVTRScript object
	 */
	@SuppressWarnings("unchecked")
	// Suppresses this because of immature support for generics ;)
	// see http://stackoverflow.com/questions/262367/type-safety-unchecked-cast
	private QVTRScript createQVTScript(URI script,
			Collection<? extends Object> metaModels, String transformation,
			String direction) {
		QVTRScript qvtrScript = new QVTRScript();
		qvtrScript.setQVTFile(script.toString());

		qvtrScript.setMetaModels((Collection<Object>) metaModels);

		QVTRScriptInfo scriptinfo = new QVTRScriptInfo(qvtrScript);
		if (transformation == null) {
			transformation = scriptinfo.getTransformations()[0];
		}
		if (direction == null) {
			direction = scriptinfo.getDirections(transformation)[1];
		}

		qvtrScript.setTransformationName(transformation);
		qvtrScript.setTransformationDirection(direction);

		return qvtrScript;
	}
}
