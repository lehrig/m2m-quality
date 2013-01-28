package de.upb.m2m.quality.languages.qvtr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.oslo.ocl20.semantics.bridge.Classifier;
import org.oslo.ocl20.semantics.bridge.Environment;
import org.oslo.ocl20.syntax.ast.qvt.DomainAS;
import org.oslo.ocl20.syntax.ast.qvt.ObjectTemplateAS;
import org.oslo.ocl20.syntax.ast.qvt.TopLevelAS;
import org.oslo.ocl20.syntax.ast.qvt.impl.TransformationASImpl;

import uk.ac.kent.cs.kmf.util.ConsoleLog;
import uk.ac.kent.cs.kmf.util.ILog;
import de.ikv.emf.qvt.EMFQvtProcessorImpl;
import de.ikv.medini.qvt.QVTProcessorConsts;
import de.ikv.medini.qvt.QvtEvaluatorImpl;
import de.ikv.medini.qvt.QvtSemanticAnalyserVisitorImpl;
import de.ikv.medini.qvt.model.qvtrelation.DomainPattern;
import de.ikv.medini.qvt.model.qvtrelation.RelationDomain;
import de.ikv.medini.qvt.model.qvtrelation.RelationalTransformation;
import de.ikv.medini.qvt.model.qvttemplate.ObjectTemplateExp;
import de.ikv.medini.qvt.model.qvttemplate.TemplateExp;
import de.upb.m2m.quality.parser.ILanguageParser;

/**
 * Provides the means to parse QVT-R files to a QVT-R-O AST model. The class
 * builds on functionality provided by the MediniQVT framework.
 * 
 * @version 0.1
 * @author Kapova et al., Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class QVTRParser implements ILanguageParser {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(QVTRParser.class);

	/**
	 * Holds the logger for QVT-R transformations.
	 */
	private ILog qvtrLogger;

	/**
	 * Allows to parse QVT-R scripts.
	 */
	private EMFQvtProcessorImpl processor;

	/**
	 * Holds a parsed QVT-R transformation object.
	 */
	private TransformationASImpl trans;

	/**
	 * Constructor initializing QVT-R logger and processor.
	 */
	public QVTRParser() {
		this.qvtrLogger = new ConsoleLog();
		this.processor = new EMFQvtProcessorImpl(this.qvtrLogger);
		this.processor.setProperty(QVTProcessorConsts.PROP_DEBUG, "true");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addMetaModel(EPackage mmodel) {
		processor.addMetaModel(mmodel);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collection<EPackage> getMetaModels() {
		Collection<EPackage> metaModels = new HashSet<EPackage>();
		for (Object mm : processor.getMetaModels()) {
			if (mm instanceof EPackage) {
				metaModels.add((EPackage) mm);
			}
		}
		return metaModels;
	}

	/**
	 * Parses the given transformation (via transformationURI) using MediniQVT's
	 * EMFQvtProcessorImpl class.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void parse(URI transformationURI) {
		String inName = transformationURI.toFileString();
		File inFile = new File(inName);

		if (!inFile.exists()) {
			LOGGER.warn("File not found! " + inName);
			return;
		}

		Reader transformationFileReader = null;
		try {
			transformationFileReader = new FileReader(inFile);
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
			return;
		}

		TopLevelAS as = processor
				.parseQvt(transformationFileReader, qvtrLogger);
		EList<?> transformations = as.getTransformations();
		this.trans = (TransformationASImpl) transformations.get(0);
	}

	/**
	 * Saves the result of the parsing (a QVT-R AST) to the XMI file at
	 * "xmiURI". For this, MediniQVT's "QvtSemanticAnalyserVisitorImpl" class is
	 * utilized to build up the whole AST.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void save(URI uri, Resource resource) {

		final Map<ObjectTemplateExp, Classifier> classMap = new HashMap<ObjectTemplateExp, Classifier>();

		QvtSemanticAnalyserVisitorImpl visitor = new QvtSemanticAnalyserVisitorImpl(
				processor) {

			/**
			 * {@inheritDoc}
			 */
			@Override
			public Object visit(DomainAS host, Object data) {
				Object o = super.visit(host, data);
				if (o instanceof RelationDomain) {
					RelationDomain relDom = (RelationDomain) o;
					DomainPattern pattern = relDom.getPattern();
					if (pattern != null) {
						TemplateExp exp = pattern.getTemplateExpression();
						if (exp instanceof ObjectTemplateExp) {
							ObjectTemplateExp objExp = (ObjectTemplateExp) exp;
							Classifier typeValue = objExp.getType();
							if (typeValue != null) {
								// Classifier disClazz =
								// processor.getBridgeFactory().buildClassifier(typeValue.getDelegate());
								classMap.put(objExp, typeValue);
								objExp.setRefferedClass(typeValue);
							}

						}
					}
				}
				return o;
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public Object visit(ObjectTemplateAS host, Object data) {
				Object o = super.visit(host, data);
				if (o instanceof ObjectTemplateExp) {
					ObjectTemplateExp exp = ((ObjectTemplateExp) o);
					Classifier typeValue = exp.getType();
					classMap.put(exp, typeValue);
					exp.setRefferedClass(typeValue);

				}
				return o;
			}

		};
		// BridgeFactoryImpl bfac = new BridgeFactoryImpl();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put(QvtEvaluatorImpl.QVT_LOG_PROPERTY_NAME, qvtrLogger);

		Environment env = this.processor.environment();

		// Sets parent of argument "env"
		new WrappedEnvironment(env);

		data.put(QvtEvaluatorImpl.QVT_RUNTIME_ENVIRONMENT_PROPERTY_NAME, env);
		data.put("templateToDomainMap", new HashMap<String, Object>());

		RelationalTransformation relTrans = (RelationalTransformation) visitor
				.visit(trans, data);

		resource.getContents().add(relTrans);
		resource.getContents().addAll(classMap.values());
		for (Classifier c : classMap.values()) {
			if (c.getDelegate() instanceof EObject) {
				resource.getContents().add((EObject) c.getDelegate());
			}
			
			for (Object operation : c.eCrossReferences()) {
				if (operation instanceof EObject) {
					resource.getContents().add((EObject) operation);
				}
			}
		}

		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMIResourceImpl.OPTION_PROCESS_DANGLING_HREF,
				XMIResourceImpl.OPTION_PROCESS_DANGLING_HREF_DISCARD);
		options.put(XMIResourceImpl.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		try {
			resource.save(options);
			LOGGER.info("Saved " + uri);
		} catch (IOException e) {
			LOGGER.error("IOException while saving " + uri.toString() + ":\n"
					+ e);
		}
	}
}
