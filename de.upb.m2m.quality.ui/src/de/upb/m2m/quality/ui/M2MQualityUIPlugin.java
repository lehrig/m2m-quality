package de.upb.m2m.quality.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class M2MQualityUIPlugin extends AbstractUIPlugin {

	private static M2MQualityUIPlugin plugin;
	
	public static final String PLUGIN_ID = "de.upb.m2m.quality.ui"; // old value: edu.kit.ipd.sdq.ginpex.ui
	
	public M2MQualityUIPlugin() {
		
	}
	
	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

	}

	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}


	public static M2MQualityUIPlugin getDefault() {
		return plugin;
	}
}
