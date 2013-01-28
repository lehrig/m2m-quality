package de.upb.m2m.quality.configurator.jobs;

import java.util.HashMap;

import org.eclipse.emf.ecore.xmi.XMIResource;

import de.uka.ipd.sdq.workflow.OrderPreservingBlackboardCompositeJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.SavePartitionToDiskJob;
import de.uka.ipd.sdq.workflow.mdsd.emf.qvtr.jobs.QVTRTransformationJob;
import de.upb.m2m.quality.configurator.M2MQualityConfiguration;
import de.upb.m2m.quality.configurator.M2MQualityConfiguratorPlugin;
import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;

/**
 * Implements the general work flow of the M2M Quality framework. The work flow
 * first parses each language of interest to create a language-specific AST
 * model and transforms it to a quality metrics model.
 * 
 * The class utilizes several subjobs and specifies the order in which these
 * jobs are executed. Each subjob is implemented within an own job class.
 * 
 * @version 0.1
 * @author Kapova et al., Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class M2MQualityCompositeJob extends
		OrderPreservingBlackboardCompositeJob<MDSDBlackboard> {
	/**
	 * The job constructor. It specifies the different subjobs and the order of
	 * their execution. Each language of interest is iteratively handled. For
	 * transforming from any language AST to any quality model, two
	 * transformation languages are currently supported: QVT-R and QVT-O. For
	 * future plug-ins, using QVT-O is the suggested method as the existing
	 * transformations realized via QVT-O seem to be better structured and,
	 * thus, more maintainable. However, this may just be my own, subjective
	 * impression and is open for a validation ;)
	 * 
	 * @param config
	 *            The configuration of the job including all information to
	 *            access launch configuration properties and the
	 *            language-specifc information
	 */
	public M2MQualityCompositeJob(M2MQualityConfiguration config) {
		HashMap<String, Object> opts = new HashMap<String, Object>();
		opts.put(XMIResource.OPTION_SCHEMA_LOCATION, true);

		logger.info("============================================================");
		logger.info("M2M Quality v" + M2MQualityConfiguratorPlugin.getVersion());
		logger.info("============================================================");

		// for each language to compare...
		for (AbstractLanguageConfiguration langConf : config
				.getLanguageConfigurations()) {
			// store required models in blackboard
			this.addJob(new PrepareM2MQualityBlackboardPartitionJob(langConf));

			// parse transformation files to AST
			this.addJob(new LanguageParserJob(config, langConf));

			// setup & execute transformation configuration
			switch (langConf.getTransformationJobType()) {
			case QVTR:
				this.addJob(new QVTRConfigurationJob(config, langConf));
				this.addJob(new QVTRTransformationJob(langConf
						.getQVTRTrafoJobConfiguration()));
				this.addJob(new QVTRLinesOfCodeJob(langConf));
				break;
			case QVTO:
				this.addJob(new QVTOTransformationJob(config, langConf));
				break;
			default:
				logger.error("Requested Transformation Job Type "
						+ langConf.getTransformationJobType()
						+ " not supported!");
				break;
			}

			// save to disk
			this.addJob(new SavePartitionToDiskJob(langConf
					.getLanguageMetricsModelPartitionId(), opts));
		}
	}
}
