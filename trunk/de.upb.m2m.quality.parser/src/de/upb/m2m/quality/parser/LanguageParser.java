package de.upb.m2m.quality.parser;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * Provides a set of methods to execute a language-specific parsing. For this,
 * an instance of this class has to be provided with a language-specific parser,
 * i.e., by a class instance for which its class implements the ILanguageParser
 * interface. This class basically delegates to this interface and extends its
 * functionality by some helper methods.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class LanguageParser {
	/**
	 * The concrete, language-specific parser to be used.
	 */
	private ILanguageParser parser;

	/**
	 * Constructor setting the concrete, language-specific parser.
	 * 
	 * @param concreteParser
	 *            Concrete, language-specific parser to be used
	 */
	public LanguageParser(ILanguageParser concreteParser) {
		this.parser = concreteParser;
	}

	/**
	 * Adds the given list of metamodels to the concrete parser.
	 * 
	 * @param metamodels
	 *            List of metamodels
	 */
	public void addMetamodels(List<EPackage> metamodels) {
		for (EPackage mmodel : metamodels) {
			parser.addMetaModel(mmodel);
		}
	}

	/**
	 * Executes the parsing process by parsing the given transformation file to
	 * an AST representation.
	 * 
	 * @param transformationURI
	 *            The URI to the transformation file to be parsed
	 */
	public void parse(URI transformationURI) {
		parser.parse(transformationURI);
	}

	/**
	 * Saves the parsing result to the provided URI. The URI typically points to
	 * an XMI file. The parsing result should be a language-specific AST.
	 * 
	 * @param uri
	 *            The URI where the AST may be stored
	 */
	public void save(URI uri) {
		ResourceSet rs = new ResourceSetImpl();
		save(uri, rs);
	}

	/**
	 * Saves the parsing result to the provided URI and/or Resource. The URI
	 * typically points to an XMI file. The parsing result should be a
	 * language-specific AST.
	 * 
	 * @param uri
	 *            The URI where the AST may be stored
	 * @param rs
	 *            The Resource where the AST may be stored
	 */
	public void save(URI uri, ResourceSet rs) {
		URI fileURI = URI.createFileURI(uri.toString());
		Resource resource = rs.createResource(fileURI);
		parser.save(uri, resource);
	}
}
