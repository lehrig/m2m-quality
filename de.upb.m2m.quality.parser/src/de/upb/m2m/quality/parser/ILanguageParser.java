package de.upb.m2m.quality.parser;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * An interface specifying the methods a language-specific parser has to provide
 * in order to be used by the M2M Quality Framework. The main task of a parser
 * is to create an AST representation of a given transformation input script.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public interface ILanguageParser {
	/**
	 * Allows to add metamodels to a parser. Parsers may need language metamodel
	 * information to execute successful.
	 * 
	 * @param mmodel
	 *            A metamodel to be added to the parser
	 */
	public void addMetaModel(EPackage mmodel);

	/**
	 * Returns the list of metamodels currently used by a parser.
	 * 
	 * @return List of metamodels
	 */
	public Collection<EPackage> getMetaModels();

	/**
	 * Executes the parsing process by parsing the given transformation file to
	 * an AST representation.
	 * 
	 * @param transformationURI
	 *            The URI to the transformation file to be parsed
	 */
	public void parse(URI transformationURI);

	/**
	 * Saves the parsing result to the provided URI and/or Resource. The URI
	 * typically points to an XMI file. The parsing result should be a
	 * language-specific AST.
	 * 
	 * @param uri
	 *            The URI where the AST may be stored
	 * @param resource
	 *            The Resource where the AST may be stored
	 */
	public void save(URI uri, Resource resource);
}
