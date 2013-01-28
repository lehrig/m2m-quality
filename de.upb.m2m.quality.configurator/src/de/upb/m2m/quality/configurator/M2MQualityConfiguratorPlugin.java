package de.upb.m2m.quality.configurator;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;

/**
 * This class activates the M2M Quality measurement configuration plug-in.
 * Besides the standard plug-in activation capabilities it is in charge of
 * loading different M2M language configurations that specify the
 * language-specific aspects for measurements of the respective language itself.
 * Technically, it looks up the language plug-ins that registered to the
 * language extension point of the "languages" plug-in
 * (de.upb.m2m.quality.languages).
 * 
 * @version 0.1
 * @author Kapova et al., Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class M2MQualityConfiguratorPlugin extends Plugin {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger
			.getLogger(M2MQualityConfiguratorPlugin.class);

	/**
	 * Allows a static access to the currently loaded plug-in.
	 */
	private static M2MQualityConfiguratorPlugin plugin;

	/**
	 * The list of language configurations derived from the "languages"
	 * extension point.
	 */
	private static List<AbstractLanguageConfiguration> languageConfiguration;

	/**
	 * This plug-in's plug-in ID.
	 */
	public static final String PLUGIN_ID = "de.upb.m2m.quality.configurator";

	/**
	 * The plug-in ID of the languages plug-in.
	 */
	public static final String LANGUAGE_EP_ID = "de.upb.m2m.quality.languages";

	/**
	 * Stores the version of this plug-in. It represents the version of the
	 * whole M2M Quality Measurement framework. It is derived from the plug-in
	 * version within the MANIFEST.MF file.
	 */
	private static String version = "";

	/**
	 * Default constructor.
	 */
	public M2MQualityConfiguratorPlugin() {
	}

	/**
	 * Besides it's default behavior, sets up the member variables "plugin" and
	 * "version" as well as derives the language configurations.
	 * 
	 * {@inheritDoc}
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		version = plugin.getBundle().getVersion().toString();

		deriveLanguageConfiguration();
	}

	/**
	 * Besides it's default behavior, resets the member variable "plugin".
	 * 
	 * {@inheritDoc}
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the current instance of this plug-in.
	 * 
	 * @return The plug-in instance
	 */
	public static M2MQualityConfiguratorPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns the version of the M2M Quality Measurement framework.
	 * 
	 * @return The version number
	 */
	public static String getVersion() {
		return version;
	}

	/**
	 * Returns the loaded language configurations.
	 * 
	 * @return List of language configurations
	 */
	public static List<AbstractLanguageConfiguration> getLanguageConfiguration() {
		return languageConfiguration;
	}

	/**
	 * Derives the language configurations by looking up registered language
	 * plug-ins in the "language" extension point of the "languages" plug-in.
	 */
	private static void deriveLanguageConfiguration() {
		List<AbstractLanguageConfiguration> langConfigs = new ArrayList<AbstractLanguageConfiguration>();

		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(LANGUAGE_EP_ID);
		try {
			for (IConfigurationElement e : config) {
				LOGGER.debug("Evaluating extension");

				Object o = e.createExecutableExtension("class");
				if (o instanceof AbstractLanguageConfiguration) {
					AbstractLanguageConfiguration langConf = (AbstractLanguageConfiguration) o;
					langConf.setBundle(e.getContributor().getName());
					langConfigs.add(langConf);
				}
			}
		} catch (CoreException ex) {
			LOGGER.error(ex.getMessage());
		}

		languageConfiguration = langConfigs;
	}
}
