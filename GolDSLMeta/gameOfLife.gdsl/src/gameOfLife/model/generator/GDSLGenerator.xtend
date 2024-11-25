/*
 * generated by Xtext 2.36.0
 */
package gameOfLife.model.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import gameOfLife.model.gDSL.Model

class GDSLGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val root = resource.allContents.filter(Model).head
        if (root !== null) {
            fsa.generateFile("RulesOfLife.java", RuleGenerator.toText(root))
        }
    }
}