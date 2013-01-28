package de.upb.m2m.quality.languages.qvto;

import de.upb.m2m.quality.languages.AbstractLanguageConfiguration;
import de.upb.m2m.quality.parser.ILanguageParser;

/**
 * A QVT-O-specific implementation of the AbstractLanguageConfiguration.
 * Includes all information needed by the M2M Quality Metric Framework to
 * measure QVT-O transformation metrics.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class QVTOConfiguration extends AbstractLanguageConfiguration {
	/**
	 * A QVT-O-specific parser allowing to create a QVT-O AST model.
	 */
	private QVTOParser parser = new QVTOParser();

	/**
	 * Default Constructor.
	 */
	public QVTOConfiguration() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return "QVT-O";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getUiAttributeFileText() {
		return "qvtoFile";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getExtensions() {
		return new String[] { "*.qvto" };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getLanguageMetaModels() {
		return new String[] {}; // resolved via QVT Operational's Metamodel
								// Registry
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
		return new String[] { "/script/QVTo2Metrics.qvto" };
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
