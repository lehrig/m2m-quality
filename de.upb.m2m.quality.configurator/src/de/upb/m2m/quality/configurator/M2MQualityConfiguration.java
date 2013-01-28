package de.upb.m2m.quality.configurator;

import java.util.List;

import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;
import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;

/**
 * Stores the configurations made within a M2M Quality eclipse launch
 * configuration plus a list of language configurations describing
 * language-specific properties important for executing measurements for the
 * respective language itself. Therefore, the class specifies a central point
 * for accessing all information important for a measurement run.
 * 
 * Technically, the measurement run is implemented via several work flow jobs.
 * By extending AbstractWorkflowBasedRunConfiguration, this class can provide
 * the workflow with the configurations it needs to access.
 * 
 * @version 0.1
 * @author Kapova et al., Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class M2MQualityConfiguration extends
		AbstractWorkflowBasedRunConfiguration {
	/**
	 * Path where the metric measurements are stored. The measurements have the
	 * form of a metrics metamodel model instance.
	 */
	private String outputMetricsPath = null;

	/**
	 * The path where traces are stored. Traces may be created when transforming
	 * from a language AST model to a metrics model.
	 */
	private String traceFilePath = null;

	/**
	 * Stores the list of language-specific configurations.
	 */
	private List<AbstractLanguageConfiguration> languageConfigs = null;

	/**
	 * Constructor for creating a configuration. It also loads the
	 * language-specific configurations.
	 */
	public M2MQualityConfiguration() {
		super();
		languageConfigs = M2MQualityConfiguratorPlugin
				.getLanguageConfiguration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getErrorMessage() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setDefaults() {
	}

	/**
	 * Returns the loaded language configurations.
	 * 
	 * @return List of language configurations
	 */
	public List<AbstractLanguageConfiguration> getLanguageConfigurations() {
		return languageConfigs;
	}

	/**
	 * Returns the path where the metric measurements are stored. The
	 * measurements have the form of a metrics metamodel model instance.
	 * 
	 * @return The output metrics path
	 */
	public String getOutputMetricsPath() {
		return outputMetricsPath;
	}

	/**
	 * Sets the path where the metric measurements are stored. The measurements
	 * have the form of a metrics metamodel model instance.
	 * 
	 * @param outputMetricsPath
	 *            The output metrics path
	 */
	public void setOutputMetricsPath(String outputMetricsPath) {
		this.outputMetricsPath = outputMetricsPath;
	}

	/**
	 * Returns the path where traces are stored. Traces may be created when
	 * transforming from a language AST model to a metrics model.
	 * 
	 * @return The trace file path
	 */
	public String getTraceFilePath() {
		return traceFilePath;
	}

	/**
	 * Returns the path where the metric measurements are stored. The
	 * measurements have the form of a metrics metamodel model instance.
	 * 
	 * @param traceFilePath
	 *            The output metrics path
	 */
	public void setTraceFilePath(String traceFilePath) {
		this.traceFilePath = traceFilePath;
	}
}
