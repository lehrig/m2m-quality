package de.upb.m2m.quality.ui.tabs;

/**
 * BlackboardListener Interface. Listens for changes in the configuration, which is relevant for multiple tabs
 *
 */
public interface BlackboardListener {
	
	public enum CAUSE_OF_CHANGE {
		FEATURE_MODEL,
		USE_MEASUREMENT_SCRIPT
	};

	void blackboardChanged(CAUSE_OF_CHANGE causeOfChange);

}
