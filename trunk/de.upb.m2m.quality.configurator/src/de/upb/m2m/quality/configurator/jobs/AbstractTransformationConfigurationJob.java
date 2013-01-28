package de.upb.m2m.quality.configurator.jobs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.uka.ipd.sdq.workflow.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.RollbackFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ModelLocation;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.upb.m2m.quality.configurator.M2MQualityConfiguration;
import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;

/**
 * An abstract class for configuring transformation jobs. It comes with
 * capabilities to load and store required models from the work flow blackboard
 * and from files.
 * 
 * Originally, this class was intended to cover QVT-R as well as QVT-O aspects.
 * However, the QVT-O job is currently implemented _without_ an own
 * configuration job. Furthermore, it is unclear whether the QVT-R
 * transformation support will make it into the next version at all. These
 * decisions are left as a future work and may make this class obsolete or force
 * some refactorings of it. For instance, the static methods may be refactored
 * to static helper classes.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public abstract class AbstractTransformationConfigurationJob implements
		IBlackboardInteractingJob<MDSDBlackboard> {
	/**
	 * The blackboard of the work flow.
	 */
	protected MDSDBlackboard blackboard;

	/**
	 * The general configuration for this job.
	 */
	protected M2MQualityConfiguration config;

	/**
	 * The language-specific language configuration for this job.
	 */
	protected AbstractLanguageConfiguration langConf;

	/**
	 * Constructor initializing the language specification as well as the
	 * general configuration for this job.
	 * 
	 * @param config
	 *            The general configuration to be used
	 * @param langConf
	 *            The language configuration to be used
	 */
	public AbstractTransformationConfigurationJob(
			M2MQualityConfiguration config,
			AbstractLanguageConfiguration langConf) {
		this.config = config;
		this.langConf = langConf;
	}

	/**
	 * Builds the location objects out of the blackboard for the given model
	 * partition.
	 * 
	 * @param blackboard
	 *            A work flow blackboard
	 * @param modelPartitionID
	 *            Partition ID of the blackboard partition to get the models
	 *            from
	 * @return The prepared model locations for the given models
	 */
	public static ModelLocation[] getModelsFromBlackboard(
			MDSDBlackboard blackboard, String modelPartitionID) {
		ArrayList<ModelLocation> modelLocations = new ArrayList<ModelLocation>();
		ResourceSetPartition partition = blackboard
				.getPartition(modelPartitionID);
		partition.resolveAllProxies();
		for (Resource r : partition.getResourceSet().getResources()) {
			ModelLocation location = new ModelLocation(modelPartitionID,
					r.getURI());
			modelLocations.add(location);
		}

		return modelLocations.toArray(new ModelLocation[] {});
	}

	/**
	 * Adds metamodels from the blackboard and the given model partition to the
	 * provided list of metamodels.
	 * 
	 * @param blackboard
	 *            A work flow blackboard
	 * @param modelPartitionID
	 *            Partition ID of the blackboard partition to get the models
	 *            from
	 * @param metamodels
	 *            A list of metamodels to which the metamodels from the
	 *            blackboard partition are added
	 */
	public static void getMetaModelsFromBlackboard(MDSDBlackboard blackboard,
			String modelPartitionID, List<EPackage> metamodels) {
		ResourceSetPartition partition = blackboard
				.getPartition(modelPartitionID);
		Registry registry = partition.getResourceSet().getPackageRegistry();

		for (Object o : registry.values()) {
			if (o instanceof EPackage) {
				metamodels.add((EPackage) o);
			}
		}
	}

	/**
	 * Creates a new model location linking (1) a resource set partition given
	 * by blackboard and the partition ID as well as (2) a new resource set for
	 * the provided modelURI.
	 * 
	 * @param blackboard
	 *            A work flow blackboard
	 * @param modelPartitionID
	 *            Partition ID of the blackboard partition to which the model at
	 *            modelURI is stored to
	 * @param modelURI
	 *            The URI to the model to be stored
	 * @return The newly created model location
	 */
	public static ModelLocation createResourceToInputPartition(
			MDSDBlackboard blackboard, String modelPartitionID, URI modelURI) {
		ResourceSetPartition resourceSetPartition = blackboard
				.getPartition(modelPartitionID);
		Resource r = resourceSetPartition.getResourceSet().createResource(
				modelURI);
		return new ModelLocation(modelPartitionID, r.getURI());
	}

	/**
	 * Reads the given file and returns its contents as a resource by using the
	 * given resourceSet.
	 * 
	 * @param path
	 *            The path to the file of interest
	 * @param resourceSet
	 *            The ResourceSet allowing to receive a resource from the
	 *            provided file
	 * @return The newly created resource
	 */
	protected Resource getResourceFromFile(String path, ResourceSet resourceSet) {
		URI uri = URI.createFileURI(path);
		return resourceSet.createResource(uri);
	}

	/**
	 * Equal to getResourceFromFile but first checks whether the resource of
	 * interest is already loaded into the ResourceSet.
	 * 
	 * @param path
	 *            The path to the file of interest
	 * @param resourceSet
	 *            The ResourceSet allowing to receive a resource directly or
	 *            from the provided file
	 * @return The received or newly created resource
	 */
	protected Resource getOrCreateResourceFromFile(String path,
			ResourceSet resourceSet) {
		URI uri = URI.createFileURI(path);
		Resource resource = null;
		try {
			resource = resourceSet.getResource(uri, true);
		} catch (Throwable fileNotFoundException) {
			resource = resourceSet.createResource(uri);
		}
		return resource;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract void execute(IProgressMonitor monitor)
			throws JobFailedException, UserCanceledException;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return "Configure " + langConf.getName() + " transformation";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void rollback(IProgressMonitor monitor)
			throws RollbackFailedException {
	}
}
