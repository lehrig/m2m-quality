package de.upb.m2m.quality.languages.java;

import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;
import de.upb.m2m.quality.parser.ILanguageParser;

/**
 * A Java-specific implementation of the AbstractLanguageConfiguration. Includes
 * all information needed by the M2M Quality Metric Framework to measure Java
 * transformation metrics.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class JavaConfiguration extends AbstractLanguageConfiguration {
	/**
	 * A Java-specific parser allowing to create a Java AST model.
	 */
	private JavaParser parser = new JavaParser();

	/**
	 * Default Constructor.
	 */
	public JavaConfiguration() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return "Java";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getUiAttributeFileText() {
		return "javaFile";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getExtensions() {
		return new String[] { "*.java" };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getLanguageMetaModels() {
		return new String[] {};
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getLanguageMetricsMetaModels() {
		return new String[] { "/metamodel/QualityMetrics.ecore" };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getLanguageToMetricsTransformations() {
		return new String[] { "/script/Java2Metrics.qvto" };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ILanguageParser getParser() {
		return parser;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SUPPORTED_TRANSFORMATION_JOBS getTransformationJobType() {
		return SUPPORTED_TRANSFORMATION_JOBS.QVTO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getOneLineCommentStrings() {
		return new String[] { "//" };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getMultiLineCommentOpeningStrings() {
		return new String[] { "/*" };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getMultiLineCommentClosingStrings() {
		return new String[] { "*/" };
	}
}
