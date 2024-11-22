/*
 * generated by Xtext 2.37.0
 */
package gameOfLife.model.serializer;

import com.google.inject.Inject;
import gameOfLife.model.gDSL.Condition;
import gameOfLife.model.gDSL.GDSLPackage;
import gameOfLife.model.gDSL.Grid;
import gameOfLife.model.gDSL.Model;
import gameOfLife.model.gDSL.Range;
import gameOfLife.model.gDSL.Rule;
import gameOfLife.model.services.GDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GDSLPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case GDSLPackage.GRID:
				sequence_Grid(context, (Grid) semanticObject); 
				return; 
			case GDSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case GDSLPackage.RANGE:
				sequence_Range(context, (Range) semanticObject); 
				return; 
			case GDSLPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (operator=RelationalOperator value=INT)
	 * </pre>
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GDSLPackage.Literals.CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GDSLPackage.Literals.CONDITION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, GDSLPackage.Literals.CONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GDSLPackage.Literals.CONDITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getOperatorRelationalOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Grid returns Grid
	 *
	 * Constraint:
	 *     (ranges+=Range ranges+=Range*)
	 * </pre>
	 */
	protected void sequence_Grid(ISerializationContext context, Grid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     ((grid=Grid rules+=Rule+) | rules+=Rule+)?
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Range returns Range
	 *
	 * Constraint:
	 *     (start=INT end=INT)
	 * </pre>
	 */
	protected void sequence_Range(ISerializationContext context, Range semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GDSLPackage.Literals.RANGE__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GDSLPackage.Literals.RANGE__START));
			if (transientValues.isValueTransient(semanticObject, GDSLPackage.Literals.RANGE__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GDSLPackage.Literals.RANGE__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRangeAccess().getStartINTTerminalRuleCall_0_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getRangeAccess().getEndINTTerminalRuleCall_2_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (state=CellState condition=Condition? action=Action)
	 * </pre>
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
