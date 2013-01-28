package de.upb.m2m.quality.languages;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;

/**
 * This class implements different lines of code (LOC) metric measurements for a
 * given file. The file is identified by its URI. Furthermore, it respects the
 * language-specific comment style via an abstract language configuration.
 * 
 * Currently, the following LOC metrics are supported: (1) Lines of code (LOC),
 * i.e., simply counting all lines of the file, (2) Source lines of code (SLOC),
 * i.e., the number of lines that are no comment and not blank (3) Blank lines
 * of code (BLOC), i.e., the number of lines that equal "\n" and are not within
 * a comment, and (4) Comment lines of code (CLOC), i.e., the number of lines
 * only consisting of a language-specific comment
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class LinesOfCode {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(LinesOfCode.class);

	/**
	 * Lines of codes (LOC).
	 */
	private int loc = 0;

	/**
	 * Source lines of codes (SLOC).
	 */
	private int sloc = 0;

	/**
	 * Blank lines of codes (BLOC).
	 */
	private int bloc = 0;

	/**
	 * Comment lines of codes (CLOC).
	 */
	private int cloc = 0;

	/**
	 * Creates the lines of code for a given file and language configuration.
	 * The LinesOfCode object is stored within the language configuration for
	 * further usage.
	 * 
	 * @param fileURI
	 *            The file to measure lines of code metrics for
	 * @param langConf
	 *            The language file including language-specific comment-styles
	 */
	public LinesOfCode(URI fileURI, AbstractLanguageConfiguration langConf) {
		File file = new File(fileURI.toFileString());
		try {
			parseFile(file, langConf);
		} catch (FileNotFoundException e) {
			LOGGER.error("File '" + file
					+ "' for measuring lines of code not found!");
		}
		AbstractLanguageConfiguration.setLinesOfCode(this);
	}

	/**
	 * Parses the given file for measuring the different LOC metrics. The method
	 * takes language-specific comment-styles into account.
	 * 
	 * @param file
	 *            The file to be parsed
	 * @param langConf
	 *            LanguageConfiguration for receiving language-specific
	 *            comment-style
	 * @throws FileNotFoundException
	 *             If the file does not exist
	 */
	private void parseFile(File file, AbstractLanguageConfiguration langConf)
			throws FileNotFoundException {
		Scanner input = new Scanner(file);
		boolean isMultiLineCommentActive = false;

		String[] oneLineStrings = langConf.getOneLineCommentStrings();
		String[] openingStrings = langConf.getMultiLineCommentOpeningStrings();
		String[] closingStrings = langConf.getMultiLineCommentClosingStrings();

		while (input.hasNext()) {
			loc++;

			String line = input.nextLine();
			line = line.trim();

			if (isMultiLineCommentActive) {
				cloc++;

				// gets the comment closed?
				for (String closingString : closingStrings) {
					if (line.contains(closingString)) {
						isMultiLineCommentActive = false;
					}
				}
			} else if (line.length() == 0) {
				bloc++;
			} else {
				boolean handled = false;

				// is it a whole one-line comment line?
				for (String oneLineString : oneLineStrings) {
					if (line.startsWith(oneLineString)) {
						cloc++;
						handled = true;
						break;
					}
				}

				// otherwise, does a multi-line comment start?
				if (!handled) {
					for (String openingString : openingStrings) {
						if (line.startsWith(openingString)) {
							cloc++;
							isMultiLineCommentActive = true;
							break;
						} else if (line.contains(openingString)) {
							sloc++;
							isMultiLineCommentActive = true;
						} else {
							sloc++;
						}
					}
				}
			} // else
		} // while
	}

	/**
	 * Returns the lines of code (LOC).
	 * 
	 * @return The LOC
	 */
	public int getLOC() {
		return loc;
	}

	/**
	 * Returns the source lines of codes (SLOC).
	 * 
	 * @return The SLOC
	 */
	public int getSLOC() {
		return sloc;
	}

	/**
	 * Returns the blank lines of codes (BLOC).
	 * 
	 * @return The BLOC
	 */
	public int getBLOC() {
		return bloc;
	}

	/**
	 * Returns the comment lines of codes (CLOC).
	 * 
	 * @return The CLOC
	 */
	public int getCLOC() {
		return cloc;
	}

}
