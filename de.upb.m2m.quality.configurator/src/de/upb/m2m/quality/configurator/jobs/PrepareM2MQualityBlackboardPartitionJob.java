package de.upb.m2m.quality.configurator.jobs;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.uka.ipd.sdq.workflow.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.RollbackFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;

/**
 * Job for preparing the work flow's blackboard for a measurement of metrics for
 * a specific language. The preparation's main task is to to set up a blackboard
 * partition for metamodels of (1) the transformation language of interest and
 * (2) the metrics to be measured.
 * 
 * @version 0.1
 * @author Kapova et al., Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class PrepareM2MQualityBlackboardPartitionJob implements
		IBlackboardInteractingJob<MDSDBlackboard> {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger
			.getLogger(PrepareM2MQualityBlackboardPartitionJob.class);

	/**
	 * The blackboard of the work flow.
	 */
	private MDSDBlackboard blackboard;

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
	public PrepareM2MQualityBlackboardPartitionJob(
			AbstractLanguageConfiguration langConf) {
		this.langConf = langConf;
	}

	/**
	 * Loads the metamodels of (1) language and (2) metrics into the respective
	 * blackboard partition.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		// load language metamodels
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Creating " + langConf.getName()
					+ " language metamodels Partition");
		}

		loadPartitionToBlackboard(langConf.getLanguageMetaModelsURI(),
				langConf.getLanguageModelPartitionId());

		// load metric metamodels
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Creating " + langConf.getName()
					+ " metrics Partition");
		}
		loadPartitionToBlackboard(langConf.getLanguageMetricsMetaModelsURI(),
				langConf.getLanguageMetricsModelPartitionId());

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return "Prepare PCM Blackboard Partions";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void rollback(IProgressMonitor monitor)
			throws RollbackFailedException {
		this.blackboard.removePartition(langConf.getLanguageModelPartitionId());
		this.blackboard.removePartition(langConf
				.getLanguageMetricsModelPartitionId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	/**
	 * Loads the given list of metamodels into the blackboard partition
	 * identified by the given partitionID.
	 * 
	 * @param metamodels
	 *            List of metamodels to be loaded into the blackboard partition
	 * @param partitionID
	 *            Partition ID of the blackboard partition
	 */
	private void loadPartitionToBlackboard(List<URI> metamodels,
			String partitionID) {
		ResourceSetPartition modelPartition = new ResourceSetPartition();
		this.blackboard.addPartition(partitionID, modelPartition);
		List<EPackage> packages = new ArrayList<EPackage>();
		ResourceSet resourceSet = new ResourceSetImpl();
		for (URI metaModel : metamodels) {
			packages.addAll(extractEPackages(metaModel, resourceSet));
		}
		modelPartition.initialiseResourceSetEPackages(packages
				.toArray(new EPackage[] {}));
	}

	/**
	 * Add all EPackages that are the root elements of the Ecore file (that's
	 * path in the file-system is passed to this method) to the processor.
	 * 
	 * @param ecorePath
	 *            Path to an Ecore file, that defines the metamodel of a model
	 *            that takes part in the transformation
	 * @param resourceSet
	 *            ResourceSet to get the resources from the Ecore file from
	 * @return List of extracted EPackages
	 */
	private List<EPackage> extractEPackages(URI ecorePath,
			ResourceSet resourceSet) {
		List<EPackage> metamodels = new ArrayList<EPackage>();
		Resource metaModelResource = resourceSet.getResource(ecorePath, true);

		EList<EObject> contents = metaModelResource.getContents();
		extractEPackages(metamodels, contents);
		return metamodels;
	}

	/**
	 * Adds all subpackages of the given list of EObjects to provided list of
	 * EPackages.
	 * 
	 * @param packages
	 *            The list where the nely extracted subpackages are added to
	 * @param contents
	 *            The list of EObjects to extract subpackages from
	 */
	private void extractEPackages(List<EPackage> packages,
			EList<? extends EObject> contents) {
		for (EObject content : contents) {
			if (content instanceof EPackage) {
				EList<EPackage> subpack = ((EPackage) content)
						.getESubpackages();

				if (!subpack.isEmpty()) {
					extractEPackages(packages, subpack);
				}

				packages.add((EPackage) content);
			}
		}
	}
}
