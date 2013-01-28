package de.upb.m2m.quality.languages.java;

import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;

import de.upb.m2m.quality.parser.ILanguageParser;

/**
 * Provides the means to parse Java files to a Java AST model. The class builds
 * on functionality provided by the MoDisco Java Discoverer Framework.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class JavaParser implements ILanguageParser {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(JavaParser.class);

	/**
	 * Hard-coded reference to the case studies package.
	 * 
	 * TODO This may be altered to something more generic in future versions.
	 * For this, the respective package may be derived from the Java input
	 * file's package.
	 */
	private static final String DE_UPB_M2M_QUALITY_CASESTUDIES = "de.upb.m2m.quality.casestudies";

	/**
	 * Hard-coded reference to the case studies package.
	 * 
	 * TODO This may be altered to something more generic in future versions.
	 * For this, the respective package may be derived from the Java input
	 * file's package.
	 */
	private static final String[] DE_UPB_M2M_QUALITY_CASESTUDIES_PACKAGE = new String[] {
			"de", "upb", "m2m", "quality", "casestudies", "javaemf" };

	/**
	 * Stores the location of the IJavaProject to be parsed.
	 */
	private IJavaProject javaProject;

	/**
	 * Default constructor.
	 */
	public JavaParser() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addMetaModel(EPackage mmodel) {
		// not needed
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collection<EPackage> getMetaModels() {
		// not needed
		return null;
	}

	/**
	 * Prepares the parsing of the Java file by deriving a IJavaProject from the
	 * given transformationURI. The IJavaProject is required by the MoDisco Java
	 * Discoverer Framework which is actually utilized for the parsing. The
	 * parsing itself is deferred to the "save" method. The reason for this is
	 * that the MoDisco Framework also needs the "xmiURI" to execute the
	 * parsing.
	 * <p>
	 * TODO The division into "parse" and "save" seems to make things
	 * unnecessarily complex. Future work may join these two methods after
	 * evaluating this. This requires, in particular, to take also the other
	 * language plug-ins into account.
	 * <p>
	 * Furthermore, the class sets up some blackbox configurations that will
	 * allow a QVT-O transformation to receive parsed packages and classes. The
	 * parsing itself is deferred to the "save" method.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void parse(URI transformationURI) {
		// TODO Remove hard-coded project reference
		// "de.upb.m2m.quality.casestudies" to something generic ;)
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(DE_UPB_M2M_QUALITY_CASESTUDIES);
		try {
			if (project.hasNature(JavaCore.NATURE_ID)) {
				javaProject = JavaCore.create(project);
			} else {
				LOGGER.error("Selected Java file needs to be within a Java "
						+ "Project (Project with a Java Nature)!");
			}
		} catch (CoreException e) {
			LOGGER.error("Selected Java file needs to be within an existing "
					+ "and opened project!");
		}

		// set up black box library to support receiving of package and class
		MetricsBlackboxLibrary.setPackageSequence(Arrays
				.asList(DE_UPB_M2M_QUALITY_CASESTUDIES_PACKAGE));
		URI className = transformationURI.trimFileExtension();
		MetricsBlackboxLibrary.setClassName(className.lastSegment().toString());
	}

	/**
	 * Executes the actual parsing and saves the AST to the XMI file at
	 * "xmiURI". The MoDisco Java Discover Framework is utilized for achieving
	 * this. In particular, the created AST will conform to MoDisco's Java
	 * metamodel.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void save(URI xmiURI, Resource resource) {
		// discover java project
		// see MoDisco User Guide - "Technologies/Java/Java discoverer/Developer
		// Documentation", e.g., at:
		// http://help.eclipse.org/juno/topic/org.eclipse.modisco.java.doc/
		// mediawiki/java_discoverer/plugin_dev.html?cp=30_1_0_1_1
		DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
		discoverer.setTargetURI(URI.createFileURI(xmiURI.toString()));
		discoverer.setSerializeTarget(true);

		try {
			discoverer.discoverElement(javaProject, new NullProgressMonitor());
		} catch (DiscoveryException e) {
			LOGGER.error("Could not discover Java project " + javaProject);
			return;
		}

		LOGGER.info("Saved " + xmiURI);
	}

}
