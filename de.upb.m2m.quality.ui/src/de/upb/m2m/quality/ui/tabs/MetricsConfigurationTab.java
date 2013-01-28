package de.upb.m2m.quality.ui.tabs;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.uka.ipd.sdq.workflow.launchconfig.RunConfigPlugin;
import de.upb.m2m.quality.configurator.M2MQualityConfiguratorPlugin;
import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;
import de.upb.m2m.quality.ui.Constants;


public class MetricsConfigurationTab extends MeasurementTab {
	
	private List<AbstractLanguageConfiguration> languageConfig = M2MQualityConfiguratorPlugin.getLanguageConfiguration();
	
	private Text traceFolderText;
	private Composite traceComposite;
	
	private Text outputFolderText;
	private Composite outputComposite;
	
	private Composite composite;
	
	private ModifyListener modifyListener;
	

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public void createControl(Composite parent) {
		modifyListener = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				MetricsConfigurationTab.this.setDirty(true);
				MetricsConfigurationTab.this.updateLaunchConfigurationDialog();
			}
		};
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2, false));
		setControl(container);


		composite = new Composite(container, SWT.NONE);
		GridLayout grdl = new GridLayout();
		composite.setLayout(grdl);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		
		for(AbstractLanguageConfiguration langConfig : languageConfig)
		{
			createLanguageFileLocationControl(langConfig);
		}

		createOutputLocationControl();
		createTraceFolderLocationControl();
		
	}

	private void createLanguageFileLocationControl(AbstractLanguageConfiguration langConfig) {
		Composite languageComposite = new Composite(composite, SWT.NONE);
		languageComposite.setLayout(new GridLayout(3, false));

		Label lblLanguageScript = new Label(languageComposite, SWT.NONE);
		lblLanguageScript.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		lblLanguageScript.setText(langConfig.getName()+" File:");

		Text languageFileText = new Text(languageComposite, SWT.BORDER);
		languageFileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		languageFileText.addModifyListener(modifyListener);

		Button workspaceButton = new Button(languageComposite, SWT.NONE);
		workspaceButton.setText("Workspace...");
		workspaceButton.addSelectionListener(new WorkspaceButtonSelectionListener(languageFileText, langConfig.getExtensions(), false));

		Button fileSystemButton = new Button(languageComposite, SWT.NONE);
		fileSystemButton.setText("File System...");
		fileSystemButton.addSelectionListener(new FileSystemButtonSelectionAdapter(languageFileText, langConfig.getExtensions()));

		langConfig.setLanguageFileText(languageFileText);
	}	
	
	private void createOutputLocationControl()
	{
		outputComposite = new Composite(composite, SWT.NONE);
		outputComposite.setLayout(new GridLayout(3, false));

		Label lblFile = new Label(outputComposite, SWT.NONE);
		lblFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		lblFile.setText("Output Folder:");

		outputFolderText = new Text(outputComposite, SWT.BORDER);
		outputFolderText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		outputFolderText.addModifyListener(modifyListener);

		Button workspaceButton = new Button(outputComposite, SWT.NONE);
		workspaceButton.setText("Workspace...");
		workspaceButton.addSelectionListener(new WorkspaceButtonSelectionListener(outputFolderText, Constants.XMI_EXTENSION, true));
	}
	
	private void createTraceFolderLocationControl()
	{
		traceComposite = new Composite(composite, SWT.NONE);
		traceComposite.setLayout(new GridLayout(3, false));

		Label lblFile = new Label(traceComposite, SWT.NONE);
		lblFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		lblFile.setText("Trace Folder:");

		traceFolderText = new Text(traceComposite, SWT.BORDER);
		traceFolderText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		traceFolderText.addModifyListener(modifyListener);

		Button workspaceButton = new Button(traceComposite, SWT.NONE);
		workspaceButton.setText("Workspace...");
		workspaceButton.addSelectionListener(new WorkspaceButtonSelectionListener(traceFolderText, Constants.XMI_EXTENSION, true));
	}
	

	@Override
	public String getName() {
		return "General";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// Load all configuration items before accessing the tab GUI elements.
		// The GUI elements invoke the modifyListener, which writes back to the configuration.
		// Thus, access the configuration first.
		String inputLanguageFileTextString = "";
		String traceFolderTextString = "";
		String outputFolderTextString = "";
		
		for(AbstractLanguageConfiguration langConfig : languageConfig)
		{
			try {
				inputLanguageFileTextString = configuration.getAttribute(langConfig.getUiAttributeFileText(), "");
			} catch (CoreException e) {
				RunConfigPlugin.errorLogger(getName(), langConfig.getName()+" File", e.getMessage());
			}
			langConfig.getLanguageFileText().setText(inputLanguageFileTextString);
		}
		
		try {
			traceFolderTextString = configuration.getAttribute(Constants.TRACE_FOLDER, "");
		} catch (CoreException e) {
			RunConfigPlugin.errorLogger(getName(), "Trace Folder", e.getMessage());
		}
		traceFolderText.setText(traceFolderTextString);
		
		try {
			outputFolderTextString = configuration.getAttribute(Constants.OUTPUT_FOLDER, "");
		} catch (CoreException e) {
			RunConfigPlugin.errorLogger(getName(), "Output Folder", e.getMessage());
		}
		outputFolderText.setText(outputFolderTextString);

		composite.layout();		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		for(AbstractLanguageConfiguration langConfig : languageConfig)
		{
			configuration.setAttribute(langConfig.getUiAttributeFileText(), langConfig.getLanguageFileText().getText());
		}
		configuration.setAttribute(Constants.TRACE_FOLDER, traceFolderText.getText());
		configuration.setAttribute(Constants.OUTPUT_FOLDER, outputFolderText.getText());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canSave() {
		return true;
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		
		for(AbstractLanguageConfiguration langConfig : languageConfig)
		{
			if (langConfig.getLanguageFileText().getText().equals("")) {
				setErrorMessage("No "+langConfig.getName()+" file specified.");
				return false;
			}
			if (!validateFilePath(langConfig.getLanguageFileText().getText(), langConfig.getExtensions())) {
				setErrorMessage("Invalid "+langConfig.getName()+" file specified. Specify a "+langConfig.getExtensions()+" file.");
				return false;
			}
		} 
		
		return true;
	}
}
