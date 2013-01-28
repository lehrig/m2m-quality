package de.upb.m2m.quality.configurator.jobs.utils;

import org.apache.log4j.Logger;
import org.eclipse.m2m.qvt.oml.util.Log;

/**
 * A simple implementation of QVT-O's logger interface. Basically sets up the
 * QVT-O logger such that the logger of the M2M Quality framework is applied.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class QVTOLogger implements Log {
	/**
	 * The Apache logger to be connected to the QVT-O engine.
	 */
	private final Logger logger;

	/**
	 * Constructor setting up the logger to be used.
	 * 
	 * @param logger
	 *            The logger to be connected to the QVT-O engine
	 */
	public QVTOLogger(Logger logger) {
		this.logger = logger;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void log(String message) {
		this.log(1, message, null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void log(int level, String message) {
		this.log(level, message, null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void log(String message, Object param) {
		this.log(1, message, param);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void log(int level, String message, Object param) {
		String paramToString = param == null ? "" : " <" + param + ">";
		logger.info(message + paramToString);
	}

}
