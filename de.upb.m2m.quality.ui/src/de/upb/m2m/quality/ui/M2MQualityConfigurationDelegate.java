package de.upb.m2m.quality.ui;

import java.util.ArrayList;


import org.apache.log4j.Level;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;

import de.uka.ipd.sdq.workflow.Blackboard;
import de.uka.ipd.sdq.workflow.IJob;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedLaunchConfigurationDelegate;
import de.uka.ipd.sdq.workflow.logging.console.LoggerAppenderStruct;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.ui.UIBasedWorkflow;
import de.upb.m2m.quality.configurator.M2MQualityConfiguration;
import de.upb.m2m.quality.configurator.jobs.M2MQualityCompositeJob;
import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;


public class M2MQualityConfigurationDelegate extends
		AbstractWorkflowBasedLaunchConfigurationDelegate<M2MQualityConfiguration, UIBasedWorkflow<Blackboard<String>>> {

	private static final String LOG_PATTERN = "%-5p: %m\n";

	@Override
	protected IJob createWorkflowJob(M2MQualityConfiguration config, ILaunch launch) throws CoreException {
		
		M2MQualityCompositeJob metricsJob = new M2MQualityCompositeJob(config);
		metricsJob.setBlackboard(new MDSDBlackboard());
		
		return metricsJob;
	}

	@Override
	protected M2MQualityConfiguration deriveConfiguration(ILaunchConfiguration configuration, String mode) throws CoreException {
		M2MQualityConfiguration config = new M2MQualityConfiguration();
		
		for(AbstractLanguageConfiguration langConf : config.getLanguageConfigurations())
		{
			langConf.setInputFilePath(configuration.getAttribute(langConf.getUiAttributeFileText(), ""));
		}
		
		config.setTraceFilePath(configuration.getAttribute(Constants.TRACE_FOLDER, ""));
		config.setOutputMetricsPath(configuration.getAttribute(Constants.OUTPUT_FOLDER, ""));
		
		return config;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedLaunchConfigurationDelegate
	 * #setupLogging(org.apache.log4j.Level)
	 */
	@Override
	protected ArrayList<LoggerAppenderStruct> setupLogging(Level logLevel) throws CoreException {

		ArrayList<LoggerAppenderStruct> loggerList = new ArrayList<LoggerAppenderStruct>();

		loggerList.add(setupLogger("de.uka.ipd.sdq.workflow", Level.INFO, LOG_PATTERN));
		
		loggerList.add(setupLogger("de.upb.m2m.quality", Level.INFO, LOG_PATTERN));
		
		
		return loggerList;
	}

}
