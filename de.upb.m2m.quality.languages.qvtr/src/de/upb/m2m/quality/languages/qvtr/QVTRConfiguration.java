package de.upb.m2m.quality.languages.qvtr;

import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;
import de.upb.m2m.quality.parser.ILanguageParser;

/**
 * A QVT-R-specific implementation of the AbstractLanguageConfiguration.
 * Includes all information needed by the M2M Quality Metric Framework to
 * measure QVT-R transformation metrics.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class QVTRConfiguration extends AbstractLanguageConfiguration {
	/**
	 * A QVT-R-specific parser allowing to create a QVT-R AST model.
	 */
	private QVTRParser parser = new QVTRParser();

	/**
	 * Default Constructor.
	 */
	public QVTRConfiguration() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return "QVT-R";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getUiAttributeFileText() {
		return "qvtrFile";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getExtensions() {
		return new String[] { "*.qvt" };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getLanguageMetaModels() {
		return new String[] { "/metamodel/SemanticsQvt.ecore",
				"/metamodel/SemanticsOcl.ecore" };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getLanguageMetricsMetaModels() {
		return new String[] { "/metamodel/QVTMetrics.ecore" };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getLanguageToMetricsTransformations() {
		return new String[] { "/script/metrics.qvt" };
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
		return SUPPORTED_TRANSFORMATION_JOBS.QVTR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getOneLineCommentStrings() {
		return new String[] { "//", "--" };
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
