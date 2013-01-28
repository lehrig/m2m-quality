package de.upb.m2m.quality.languages;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.widgets.Text;

import de.uka.ipd.sdq.workflow.mdsd.emf.qvtr.jobs.QVTRTransformationJobConfiguration;
import de.uka.ipd.sdq.workflow.mdsd.emf.qvto.QVTOTransformationJobConfiguration;
import de.upb.m2m.quality.parser.ILanguageParser;

/**
 * An abstract class specifying all language-specific configurations needed for
 * measuring M2M quality metrics. It handles the location of involved metamodels
 * and models, names of languages, lines of code measurements, and
 * transformations between language AST representations and metric models.
 * <p>
 * This class can be extended via language-specific plug-ins. For this, this
 * plug-in provides the "Language" extension point (with ID
 * "de.upb.m2m.quality.languages"). Language-specific plug-ins just have to
 * provide implementations for the abstract methods within this class.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public abstract class AbstractLanguageConfiguration {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger
			.getLogger(AbstractLanguageConfiguration.class);

	/**
	 * Blackboard partition ID for source models.
	 */
	private static final String SOURCE_MODELS_PARTITION_ID = "de.upb.m2m.quality.partition.source";

	/**
	 * Blackboard partition ID for metric models.
	 */
	private static final String METRICS_MODELS_PARTITION_ID = "de.upb.m2m.quality.partition.metrics";

	/**
	 * Enumeration of supported transformation languages for transforming from
	 * any (!) language's AST to any metrics model.
	 */
	public static enum SUPPORTED_TRANSFORMATION_JOBS {
		/**
		 * QVT Relational (QVT-R).
		 */
		QVTR,

		/**
		 * QVT Operational (QVT-O).
		 */
		QVTO
	};

	/**
	 * Stores the location of the file to be parsed to an AST.
	 */
	private String inputFilePath;

	/**
	 * The text to be displayed in the UI asking for the inputFilePath.
	 */
	private Text languageFileText;

	/**
	 * String of the language-specific bundle including metamodels and
	 * transformation scripts to be loaded.
	 */
	private String bundleName;

	/**
	 * Holds the QVT-R transformtion job responsible for transforming from a
	 * language AST model to a quality metrics model.
	 */
	private QVTRTransformationJobConfiguration qvtrTrafoJobConfiguration;

	/**
	 * Holds the QVT-O transformtion job responsible for transforming from a
	 * language AST model to a quality metrics model.
	 */
	private QVTOTransformationJobConfiguration qvtoTrafoJobConfiguration;

	/**
	 * Holds the lines of code metrics object allowing to query different lines
	 * of code metrics for the file at inputFilePath.
	 */
	private static LinesOfCode linesOfCode;

	/**
	 * Default Constructor.
	 */
	public AbstractLanguageConfiguration() {
	}

	/**
	 * Returns the name of the provided M2M language.
	 * <p>
	 * Example: "QVT-R".
	 * 
	 * @return M2M language name
	 */
	public abstract String getName();

	/**
	 * Returns the language-specific name of the UI element asking for the input
	 * transformation script.
	 * <p>
	 * Example: "qvtrFile".
	 * 
	 * @return The UI element name
	 */
	public abstract String getUiAttributeFileText();

	/**
	 * Returns the language-specific extension names of the UI element filtering
	 * for the given extensions when selecting an input transformation script.
	 * <p>
	 * Example: {"*.qvt"}.
	 * 
	 * @return An array of possible language extension names
	 */
	public abstract String[] getExtensions();

	/**
	 * Returns the language-specific set of metamodels modeling the language.
	 * <p>
	 * Example: {"/metamodel/SemanticsQvt.ecore",
	 * "/metamodel/SemanticsOcl.ecore"}
	 * 
	 * @return An array of required metamodels for modeling the language
	 */
	public abstract String[] getLanguageMetaModels();

	/**
	 * Returns the (not necessary langua-specific) set of quality metric
	 * metamodels to which the language-specific AST will be mapped.
	 * <p>
	 * Example: {"/metamodel/QVTMetrics.ecore"}.
	 * 
	 * @return An array of required quality metric metamodels
	 */
	public abstract String[] getLanguageMetricsMetaModels();

	/**
	 * Returns language-specific paths to the transformation scripts that map
	 * from a languages' AST model to the quality metrics model.
	 * <p>
	 * Note: Currently, only exactly _one_ transformation script is supported.
	 * <p>
	 * Example: {"/scripts/metrics.qvt"}.
	 * 
	 * @return An array of transformation scripts
	 */
	public abstract String[] getLanguageToMetricsTransformations();

	/**
	 * Provides a language-specific parser.
	 * 
	 * @return The language-specific parser
	 */
	public abstract ILanguageParser getParser();

	/**
	 * The type of transformation job which transforms from language to metrics
	 * model.
	 * <p>
	 * Example: SUPPORTED_TRANSFORMATION_JOBS.QVTR
	 * 
	 * @return The type of the transformation job
	 */
	public abstract SUPPORTED_TRANSFORMATION_JOBS getTransformationJobType();

	/**
	 * Language-specific set of comment clauses only holding for one line.
	 * <p>
	 * Example: {"//"}
	 * 
	 * @return Set of possible comment clauses
	 */
	public abstract String[] getOneLineCommentStrings();

	/**
	 * Language-specific set of comment opening clauses holding for multiple
	 * lines.
	 * <p>
	 * Example: {"/*"}
	 * 
	 * @return Set of possible comment clauses
	 */
	public abstract String[] getMultiLineCommentOpeningStrings();

	/**
	 * Language-specific set of comment closing clauses ending a multi-line
	 * comment.
	 * <p>
	 * Example: {"*\/"}
	 * 
	 * @return Set of possible comment clauses
	 */
	public abstract String[] getMultiLineCommentClosingStrings();

	/**
	 * Returns the location of the file to be parsed to an AST.
	 * 
	 * @return The file location
	 */
	public final String getInputFilePath() {
		return this.inputFilePath;
	}

	/**
	 * Returns the text to be displayed in the UI asking for the inputFilePath.
	 * 
	 * @return The text to be displayed
	 */
	public final Text getLanguageFileText() {
		return languageFileText;
	}

	/**
	 * Sets the location of the file to be parsed to an AST.
	 * 
	 * @param inputFilePath
	 *            The location of the file
	 */
	public final void setInputFilePath(final String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}

	/**
	 * Sets the text to be displayed in the UI asking for the inputFilePath.
	 * 
	 * @param languageFileText
	 *            The text to be displayed
	 */
	public final void setLanguageFileText(Text languageFileText) {
		this.languageFileText = languageFileText;
	}

	/**
	 * Returns an URI list of language metamodels returned by the
	 * getLanguageMetaModels() method.
	 * 
	 * @return The URI list of language meta models
	 */
	public final List<URI> getLanguageMetaModelsURI() {
		return createURIsFromStrings(getLanguageMetaModels());
	}

	/**
	 * Returns an URI list of language metrics metamodels returned by the
	 * getLanguageMetricsMetaModels() method.
	 * 
	 * @return The URI list of language metrics meta models
	 */
	public final List<URI> getLanguageMetricsMetaModelsURI() {
		return createURIsFromStrings(getLanguageMetricsMetaModels());
	}

	/**
	 * Returns an URI list of language AST to metric model transformations
	 * returned by the getLanguageToMetricsTransformations() method.
	 * 
	 * @return The URI list of language AST to metric model transformations
	 */
	public final List<URI> getLanguageToMetricsTransformationsURI() {
		return createURIsFromStrings(getLanguageToMetricsTransformations());
	}

	/**
	 * Returns the language-specific bundle which includes includes the
	 * metamodels and transformation scripts to be loaded.
	 * 
	 * @return The bundle name
	 */
	private final String getBundleName() {
		return this.bundleName;
	}

	/**
	 * Sets the language-specific bundle which includes includes the metamodels
	 * and transformation scripts to be loaded.
	 * 
	 * @param bundleName
	 *            The bundle name
	 */
	public final void setBundle(String bundleName) {
		this.bundleName = bundleName;
	}

	/**
	 * Creates for each given path an URI.
	 * 
	 * @param paths
	 *            Set of paths as String array
	 * @return List of URIs derived from the given paths
	 */
	private final List<URI> createURIsFromStrings(String[] paths) {
		List<URI> uris = new ArrayList<URI>();
		for (String mm : paths) {
			try {
				URI uri = URI.createURI(Platform.getBundle(getBundleName())
						.getEntry(mm).toURI().toString());
				uris.add(uri);
			} catch (URISyntaxException e) {
				LOGGER.error("Metamodel " + mm + " could not be loaded!");
			}
		}
		return uris;
	}

	/**
	 * Returns the blackboard partition ID for source models.
	 * 
	 * @return The source model partition ID
	 */
	public String getLanguageModelPartitionId() {
		return SOURCE_MODELS_PARTITION_ID + "." + getName();
	}

	/**
	 * Returns the blackboard partition ID for metric models.
	 * 
	 * @return The metric model partition ID
	 */
	public String getLanguageMetricsModelPartitionId() {
		return METRICS_MODELS_PARTITION_ID + "." + getName();
	}

	/**
	 * Sets the QVT-R transformtion job responsible for transforming from a
	 * language AST model to a quality metrics model.
	 * 
	 * @param trafoJobConfiguration
	 *            The QVT-R transformation job
	 */
	public void setQVTRTrafoJobConfiguration(
			QVTRTransformationJobConfiguration trafoJobConfiguration) {
		this.qvtrTrafoJobConfiguration = trafoJobConfiguration;
	}

	/**
	 * Returns the QVT-R transformtion job responsible for transforming from a
	 * language AST model to a quality metrics model.
	 * 
	 * @return The QVT-R transformation job
	 */
	public QVTRTransformationJobConfiguration getQVTRTrafoJobConfiguration() {
		return qvtrTrafoJobConfiguration;
	}

	/**
	 * Sets the QVT-O transformtion job responsible for transforming from a
	 * language AST model to a quality metrics model.
	 * 
	 * @param trafoJobConfiguration
	 *            The QVT-O transformation job
	 */
	public void setQVTOTrafoJobConfiguration(
			QVTOTransformationJobConfiguration trafoJobConfiguration) {
		this.qvtoTrafoJobConfiguration = trafoJobConfiguration;
	}

	/**
	 * Returns the QVT-O transformtion job responsible for transforming from a
	 * language AST model to a quality metrics model.
	 * 
	 * @return The QVT-O transformation job
	 */
	public QVTOTransformationJobConfiguration getQVTOTrafoJobConfiguration() {
		return qvtoTrafoJobConfiguration;
	}

	/**
	 * Returns the URI of the language-specific AST for a given output path.
	 * 
	 * @param outputPath
	 *            The path where the AST lies
	 * @return An URI for the AST file
	 */
	public URI getASTInputURI(String outputPath) {
		String transformationPathString = getInputFilePath();
		URI transformationURI = URI.createURI(transformationPathString);
		String xmiPathString = outputPath + File.separator + getName()
				+ "-AST-" + transformationURI.lastSegment() + ".xmi";
		return URI.createURI(xmiPathString);
	}

	/**
	 * Sets the lines of code metrics object allowing to query different lines
	 * of code metrics for the file at specifies via the inputFilePath member
	 * variable.
	 * 
	 * @param locs
	 *            The lines of code object
	 */
	public static void setLinesOfCode(LinesOfCode locs) {
		linesOfCode = locs;
	}

	/**
	 * Returns the lines of code metrics object allowing to query different
	 * lines of code metrics for the file at specifies via the inputFilePath
	 * member variable.
	 * 
	 * @return The lines of code object
	 */
	public static LinesOfCode getLinesOfCode() {
		return linesOfCode;
	}
}
