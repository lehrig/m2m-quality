package de.upb.m2m.quality.ui.tabs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.navigator.ResourcePatternFilter;

public abstract class MeasurementTab extends AbstractLaunchConfigurationTab {
	
	
	protected class FileSystemButtonSelectionAdapter extends SelectionAdapter {

		private Text field;
		private String[] extensions;

		public FileSystemButtonSelectionAdapter(Text field, String[] fileExtension) {
			this.field = field;
			this.extensions = fileExtension;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse
		 * .swt.events.SelectionEvent)
		 */
		public void widgetSelected(SelectionEvent e) {
			setOpenFileDialogResultToTextField(this.field, this.extensions);
			setDirty(true);
			updateLaunchConfigurationDialog();
		}
	}
	
	/** Button SelectionListener - call a WorkspaceResourceDialog */
	protected class WorkspaceButtonSelectionListener extends SelectionAdapter {

		private Text field;
		private String extension;
		private String message = null;
		boolean selectFolder = false;
		
		public WorkspaceButtonSelectionListener(Text field, String message, boolean selectFolder) {
			this.field = field;
			this.message = message;
			this.selectFolder = selectFolder;
		}

		public WorkspaceButtonSelectionListener(Text field, String[] extensions, boolean selectFolder) {
			this.field = field;
			this.extension = getExtensionFromArray(extensions);
			this.selectFolder = selectFolder;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse
		 * .swt.events.SelectionEvent)
		 */
		@Override
		public void widgetSelected(SelectionEvent e) {
			if (this.selectFolder == true) {
				setOpenFolderDialogResultToTextField(this.field, this.message);
			} else {
				setOpenFileDialogResultToTextField(this.field, this.extension, this.message);
			}
			setDirty(true);
			updateLaunchConfigurationDialog();
		}
	}

	protected boolean validateFilePath(String filePath, String[] extensions) {
		if (filePath.equals(""))
			return false;
		String extension = getExtensionFromArray(extensions).replace("*", "");
		if (filePath.contains(extension))
			return true;
		return false;
	}

	private String getExtensionFromArray(String[] array) {
		return array[0];
	}

	/**
	 * Overloading of setOpenFileDialogResultToTextField because of different
	 * extensions types.
	 * 
	 * @param textField
	 * @param EXTENSION
	 */
	private void setOpenFileDialogResultToTextField(Text textField, final String EXTENSION, String message) {
		String resultOpenFileDialog = openResourceDialogFile(EXTENSION, message);
		if (!resultOpenFileDialog.equals("")) {
			textField.setText(resultOpenFileDialog);
		}
		// Otherwise the default value of textField would not be changed.
	}
	
	/**
	 * 
	 * @param textField
	 * @param EXTENSION
	 */
	private void setOpenFolderDialogResultToTextField(Text textField, String message) {
		String resultOpenFileDialog = openResourceDialogFolder(message);
		if (!resultOpenFileDialog.equals("")) {
			textField.setText(resultOpenFileDialog);
		}
		// Otherwise the default value of textField would not be changed.
	}

	/**
	 * Get the result from the openFileDialog. If the result is "" then this
	 * method do not change the default value of the textField.
	 * 
	 * @param textField
	 *            The Text-Field Control which contains the result of
	 */
	private void setOpenFileDialogResultToTextField(Text textField, final String[] EXTENSION) {
		String resultOpenFileDialog = openFileDialog(EXTENSION);
		if (!resultOpenFileDialog.equals("")) {
			textField.setText(resultOpenFileDialog);
		}
		// Otherwise the default value of textField would not be changed.
	}

	/**
	 * The function calls the FileDialog and gives back absolute path on the
	 * file as String
	 * 
	 * @param extensions
	 *            which the dialog will use to filter the files it shows to the
	 *            argument
	 * @return absolute path to a file
	 */
	private String openFileDialog(String[] extensions) {
		String filename = "";

		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
		dialog.setFilterExtensions(extensions);
		dialog.setText("Select model file");

		if (dialog.open() != null) {
			String root = dialog.getFilterPath() + File.separatorChar;
			filename = root + dialog.getFileName();
		}

		return filename;
	}

	/**
	 * The function calls the ContainerSelectionDialog and gives back relative
	 * to the workspace
	 * 
	 * @return relative path to file in workspace
	 */
	private String openResourceDialogFile(String extension, String message) {

		/** Filter from the redundant files. */
		List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
		ResourcePatternFilter filter = new ResourcePatternFilter();
		filter.setPatterns(new String[] { "*diagram", "*.settings", "*.project" });
		filters.add(filter);

		/** create the dialog message */
		if (message == null) {
			message = "Select a file (" + extension + ").";
		}

		IFile file = null;

		IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, message, false, null, filters);

		if (files.length != 0)
			file = files[0];
		if (file != null)
			return file.getLocation().toOSString();

		return "";
	}
	
	/**
	 * The function calls the ContainerSelectionDialog and gives back relative
	 * to the workspace
	 * 
	 * @return relative path to file in workspace
	 */
	private String openResourceDialogFolder(String message) {

		/** Filter from the redundant files. */
		List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
		ResourcePatternFilter filter = new ResourcePatternFilter();
		filter.setPatterns(new String[] { "*diagram", "*.settings", "*.project" });
		filters.add(filter);

		IContainer directory = null;

		IContainer[] dirs = WorkspaceResourceDialog.openFolderSelection(getShell(), null, message, false, null, null);

		if (dirs.length != 0) {
			directory = dirs[0];
		}
		if (directory != null) {
			return directory.getLocation().toOSString();
		}

		return "";
	}

}
