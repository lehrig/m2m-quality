package de.upb.m2m.quality.configurator.jobs;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;

import de.uka.ipd.sdq.workflow.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.IJob;
import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.RollbackFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.upb.m2m.quality.configurator.M2MQualityConfiguration;
import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;
import de.upb.m2m.quality.languages.LinesOfCode;
import de.upb.m2m.quality.parser.LanguageParser;

/**
 * This class is responsible for controlling (1) the parsing of a transformation
 * file to a language-specific AST representation and (2) the calculation of
 * lines of code metrics for the transformation file. The class mainly
 * implements the order of steps necessary to execute these tasks. The parsing 
 * and lines of code metrics calculation is realized via external classes.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class LanguageParserJob implements IJob,
		IBlackboardInteractingJob<MDSDBlackboard> {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger
			.getLogger(LanguageParserJob.class);

	/**
	 * The blackboard of the work flow.
	 */
	private MDSDBlackboard blackboard;

	/**
	 * The general configuration for this job.
	 */
	private M2MQualityConfiguration config;
	
	/**
	 * The language-specific language configuration for this job.
	 */
	private AbstractLanguageConfiguration langConf;

	/**
	 * Constructor initializing the language specification as well as the
	 * general configuration for this job.
	 * 
	 * @param config
	 *            The general configuration to be used
	 * @param langConf
	 *            The language configuration to be used
	 */
	public LanguageParserJob(M2MQualityConfiguration config,
			AbstractLanguageConfiguration langConf) {
		this.config = config;
		this.langConf = langConf;
	}

	/**
	 * This execution consist of four steps: (1) parse the file of interest to
	 * a language-specific AST model, (2) calculate lines of code metrics for 
	 * the file, (3) store the gained information into the blackboard, and (4)
	 * serialize the AST model to an XMI file. The last point is especially
	 * important to investigate the parsing results. The storage location of
	 * the XMI file is set up via the language configuration object.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		String transformationPathString = langConf.getInputFilePath();
		URI transformationURI = URI.createURI(transformationPathString);
		URI xmiURI = langConf.getASTInputURI(config.getOutputMetricsPath());

		LOGGER.info("Parsing " + langConf.getName() + " file "
				+ transformationURI);
		LanguageParser myParser = new LanguageParser(langConf.getParser());
		myParser.parse(transformationURI);

		LOGGER.info("Calculating Lines of Code");
		new LinesOfCode(transformationURI, langConf);

		LOGGER.info("Loading " + langConf.getName()
				+ " XMI file into blackboard");
		ResourceSetPartition sourcePartition = this.blackboard
				.getPartition(langConf.getLanguageModelPartitionId());

		LOGGER.info("Writing " + langConf.getName() + " XMI to " + xmiURI);
		myParser.save(xmiURI);

		sourcePartition.loadModel(URI.createFileURI(xmiURI.toString()));
		sourcePartition.resolveAllProxies();
	}

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
		return "M2M Quality Job";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void rollback(IProgressMonitor monitor)
			throws RollbackFailedException {
		// Not needed.
	}

}
