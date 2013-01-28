/**
 * Implements the general work flow of the M2M Quality framework. The work flow
 * first parses each language of interest to create a language-specific AST 
 * model and transforms it to a quality metrics model. It is started by the M2M
 * Quality UI plug-in (de.upb.m2m.quality.ui).
 * 
 * The work flow consists of several jobs which are included within this
 * package. The main job is implemented in the "M2MQualityCompositeJob" class.
 * This class implements the work flow as described above. Therefore, the class
 * structures the distinct parts of the work flow into several subjobs and
 * sets up the correct execution order of the jobs. The subjobs are implemented
 * within the remaining classes of this package.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
package de.upb.m2m.quality.configurator.jobs;

