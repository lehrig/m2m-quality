package de.upb.m2m.quality.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import de.uka.ipd.sdq.workflow.launchconfig.tabs.DebugEnabledCommonTab;
import de.upb.m2m.quality.ui.tabs.MetricsConfigurationTab;

public class M2MQualityTabGroup extends AbstractLaunchConfigurationTabGroup {
	
	
	public M2MQualityTabGroup() {

	}

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[]{
				new MetricsConfigurationTab(),
				new DebugEnabledCommonTab()});
		
	}

}
