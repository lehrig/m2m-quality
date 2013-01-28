package de.upb.m2m.quality.languages.qvtr;

import java.util.Iterator;
import java.util.List;

import org.oslo.ocl20.semantics.bridge.Environment;
import org.oslo.ocl20.semantics.bridge.ModelElement;
import org.oslo.ocl20.semantics.bridge.Operation;
import org.oslo.ocl20.semantics.bridge.impl.EnvironmentImpl;
import org.oslo.ocl20.semantics.factories.TypeFactory;

/**
 * Allows to set an instance of this class as parent of a given environment. The
 * class is used by the QVTRParser class to enable AST creation of QVT-R
 * scripts.
 * 
 * @version 0.1
 * @author Kapova et al., Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class WrappedEnvironment extends EnvironmentImpl {
	/**
	 * The environment to be wrapped.
	 */
	private Environment wrappedEnv;

	/**
	 * Constructor setting the parent of the given environment to the newly
	 * created instance of this class.
	 * 
	 * @param wrappedEnv
	 *            The environment to be wrapped
	 */
	public WrappedEnvironment(Environment wrappedEnv) {
		this.wrappedEnv = wrappedEnv;
		wrappedEnv.setParent(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelElement lookupPathName(@SuppressWarnings("rawtypes") List names) {

		ModelElement elem = super.lookupPathName(names);

		if (elem == null) {
			TypeFactory tf = wrappedEnv.getProcessor().getTypeFactory();
			elem = tf.buildOclAnyType();

			@SuppressWarnings("unchecked")
			Iterator<String> iter = ((List<String>) names).iterator();
			if (iter.hasNext()) {
				String className = iter.next();
				while (iter.hasNext()) {
					className += "::" + iter.next();
				}

				elem.setName(className);
				wrappedEnv.addElement(className, elem, false);
			}

		}

		return elem;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Operation lookupPathName(@SuppressWarnings("rawtypes") List names,
			@SuppressWarnings("rawtypes") List types) {
		return wrappedEnv.lookupPathName(names, types);
	}

}
