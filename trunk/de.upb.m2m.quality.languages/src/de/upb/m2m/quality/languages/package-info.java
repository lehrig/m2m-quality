/**
 * This package specifies all (abstract) language-specific configurations needed
 * for measuring M2M quality metrics. It handles the location of involved
 * metamodels and models, names of languages, lines of code measurements, and
 * transformations between language AST representations and metric models.
 * 
 * This plug-in provides the "Language" extension point (with ID
 * "de.upb.m2m.quality.languages"). Language-specific plug-ins may use the
 * extension point to plug into the M2M Quality Metrics Framework. See the
 * "AbstractLanguageConfiguration" class for more details on this.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
package de.upb.m2m.quality.languages;

