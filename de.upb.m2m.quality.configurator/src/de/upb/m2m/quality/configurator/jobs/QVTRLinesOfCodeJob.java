package de.upb.m2m.quality.configurator.jobs;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.uka.ipd.sdq.workflow.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.RollbackFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;
import de.upb.m2m.quality.languages.LinesOfCode;

/**
 * This class allows to implant lines of code metrics into a loaded QVTMetrics
 * model. This is realized via obtaining the model from the blackboard and
 * adding the lines of code metric values to the respective EAttribute. For
 * this, the class applies dynamic EMF techniques (see link below). If possible,
 * this may be altered in future work. The problem that is that the blackboard
 * does only include dynamic EObjects. The reason for this is maybe a
 * miss-configuration when loading the respective resource sets.
 * 
 * @see "http://www.ibm.com/developerworks/library/os-eclipse-dynamicemf/"
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class QVTRLinesOfCodeJob implements
		IBlackboardInteractingJob<MDSDBlackboard> {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger
			.getLogger(QVTRLinesOfCodeJob.class);

	/**
	 * The blackboard of the work flow.
	 */
	protected MDSDBlackboard blackboard = null;

	/**
	 * The language-specific language configuration for this job.
	 */
	private AbstractLanguageConfiguration langConf;

	/**
	 * Constructor initializing the language specification for this job.
	 * 
	 * @param langConf
	 *            The language configuration to be used
	 */
	public QVTRLinesOfCodeJob(AbstractLanguageConfiguration langConf) {
		this.langConf = langConf;
	}

	/**
	 * Accesses the QVTMetrics model from the blackboard to add several
	 * lines of code metrics to the model.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		LinesOfCode locs = AbstractLanguageConfiguration.getLinesOfCode();

		String partitionID = langConf.getLanguageMetricsModelPartitionId();
		ResourceSetPartition partition = this.blackboard
				.getPartition(partitionID);
		ResourceSet resourceSet = partition.getResourceSet();
		Resource resource = resourceSet.getResources().get(0);
		EObject eObject = resource.getContents().get(0);

		// TODO eObject is of type "DynamicEObjectImpl" but we need
		// "TransformationImpl" here. Why is that? This solution here is
		// more like "hacking" the dynamic eObject.
		EPackage qvtMetricsPackage = (EPackage) eObject.eClass().eContainer();
		EClass transformationClass = (EClass) qvtMetricsPackage
				.getEClassifier("Transformation");
		EAttribute locAttribute = (EAttribute) transformationClass
				.getEStructuralFeature("loc");
		EAttribute blocAttribute = (EAttribute) transformationClass
				.getEStructuralFeature("bloc");
		EAttribute clocAttribute = (EAttribute) transformationClass
				.getEStructuralFeature("cloc");
		EAttribute slocAttribute = (EAttribute) transformationClass
				.getEStructuralFeature("sloc");
		eObject.eSet(locAttribute, locs.getLOC());
		eObject.eSet(blocAttribute, locs.getBLOC());
		eObject.eSet(clocAttribute, locs.getCLOC());
		eObject.eSet(slocAttribute, locs.getSLOC());

		LOGGER.info("Stored QVT-R Lines of Code Metrics");
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
	public String getName() {
		return "Saving QVT-R Lines of Code Metrics";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}
}
