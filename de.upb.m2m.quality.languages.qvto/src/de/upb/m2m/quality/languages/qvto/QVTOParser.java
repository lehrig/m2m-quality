package de.upb.m2m.quality.languages.qvto;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.internal.qvt.oml.InternalTransformationExecutor;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledUnit;
import org.eclipse.m2m.internal.qvt.oml.compiler.ExeXMISerializer;
import org.eclipse.m2m.internal.qvt.oml.emf.util.urimap.MappingContainer;
import org.eclipse.m2m.internal.qvt.oml.emf.util.urimap.MetamodelURIMappingHelper;
import org.eclipse.m2m.internal.qvt.oml.emf.util.urimap.URIMapping;

import de.upb.m2m.quality.parser.ILanguageParser;

/**
 * Provides the means to parse QVT-O files to a QVT-O AST model. The class
 * builds on functionality provided by the QVT Operational (engine) framework.
 * As this functionality has not made it to the public APIs yet, this class
 * relies on internal classes of the QVT Operational framework. In particular,
 * this is the reason for some restriction warnings (suppressed below). Once the
 * AST serialization makes it to the public APIs, this class should be revised.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
@SuppressWarnings("restriction")
public class QVTOParser implements ILanguageParser {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(QVTOParser.class);

	/**
	 * Hard-coded reference to the case studies package.
	 * 
	 * TODO This may be altered to something more generic in future versions.
	 * For this, the respective package may be derived from the Java input
	 * file's package.
	 */
	private static final String DE_UPB_M2M_QUALITY_CASESTUDIES = "de.upb.m2m.quality.casestudies";

	/**
	 * Holds the transformation file's URI.
	 */
	private URI transformationURI;

	/**
	 * Holds the result of QVT Operational's parsing execution.
	 */
	private CompiledUnit unit;

	/**
	 * Holds the required metamodels for the QVT-O transformation.
	 */
	private Registry registry;

	/**
	 * Default Constructor.
	 */
	public QVTOParser() {
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
	 * Parses the given transformation (via transformationURI) using QVT
	 * Operational's InternalTransformationExecutor class. For this, the
	 * required metamodels are loaded first. The metamodels are loaded by
	 * looking them up from QVT Operational's metamodel mapping registry.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void parse(URI transformationURI) {
		this.transformationURI = URI
				.createFileURI(transformationURI.toString());

		// load metamodels from QVT Operational's metamodel mapping registry
		// (project specific)
		registry = new EPackageRegistryImpl(EPackage.Registry.INSTANCE);
		// TODO Remove hard-coded project reference
		// "de.upb.m2m.quality.casestudies" to something generic ;)
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(DE_UPB_M2M_QUALITY_CASESTUDIES);
		try {
			MappingContainer uriMap = MetamodelURIMappingHelper
					.loadMappings(project);
			for (URIMapping mapping : uriMap.getMapping()) {
				ResourceSet rs = new ResourceSetImpl();
				EPackage modelPackage = (EPackage) rs
						.getResource(URI.createURI(mapping.getTargetURI()),
								true).getContents().get(0);
				registry.put(modelPackage.getNsURI(), modelPackage);
			}
		} catch (IOException e) {
			LOGGER.error("Unable to load models from QVT Operational's metamodel mapping registry!");
		}

		// Load qvto transformation from file.
		// That transformation can import other transformation files.
		InternalTransformationExecutor executor = new InternalTransformationExecutor(
				this.transformationURI, registry);
		Diagnostic diag = executor.loadTransformation();
		if (diag.getSeverity() == Diagnostic.ERROR
				|| diag.getSeverity() == Diagnostic.CANCEL) {
			LOGGER.error(diag);
			return;
		}

		// Obtain transformation object.
		// Note that we receive abstract type 'Module' since actual object type
		// is an instance of 'OperationalTransformation' or 'Library'
		this.unit = executor.getUnit();
	}

	/**
	 * Saves the result of the parsing (a QVT-O AST) to the XMI file at
	 * "xmiURI". For this, QVT Operational's "ExeXMISerializer" class is
	 * utilized.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void save(URI xmiURI, Resource resource) {
		// Change NS URIs to work with relative path
		// see http://www.eclipse.org/forums/index.php/t/368664/
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(DE_UPB_M2M_QUALITY_CASESTUDIES);
		try {
			MappingContainer uriMap = MetamodelURIMappingHelper
					.loadMappings(project);
			for (URIMapping mapping : uriMap.getMapping()) {
				Object value = registry.get(mapping.getSourceURI());
				if (value instanceof EPackage) {
					EPackage pck = (EPackage) value;
					pck.setNsURI(mapping.getTargetURI());
				}
			}
		} catch (IOException e) {
			LOGGER.error("Unable to load models from QVT Operational's metamodel mapping registry!");
		}

		// Save compiled transformation
		try {
			ExeXMISerializer.saveUnitXMI(new CompiledUnit[] { this.unit },
					registry);
			// don't forget about imported transformations/libraries
			for (CompiledUnit importUnit : this.unit.getCompiledImports()) {
				ExeXMISerializer.saveUnitXMI(new CompiledUnit[] { importUnit },
						registry);
			}
		} catch (IOException e) {
			LOGGER.error("Parser error: could not save with ExeXMISerializer!");
		}
		URI xmiQvtoURI = ExeXMISerializer.toXMIUnitURI(transformationURI);

		// move compiled "qvtox" file to target location
		File source = new File(xmiQvtoURI.toFileString());
		File target = new File(xmiURI.toFileString());
		if (target.exists()) {
			target.delete();
		}
		try {
			FileUtils.moveFile(source, target);
			LOGGER.info("Saved " + target.toString());
		} catch (IOException e) {
			LOGGER.error("Unable to move " + source.toString() + " to "
					+ target.toString() + ":\n" + e);
		}
	}
}
