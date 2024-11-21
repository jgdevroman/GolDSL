/*
 * generated by Xtext 2.37.0
 */
package gameOfLife.model.serializer;

import com.google.inject.Inject;
import gameOfLife.model.gameOfLife.Cell;
import gameOfLife.model.gameOfLife.Condition;
import gameOfLife.model.gameOfLife.GameOfLifePackage;
import gameOfLife.model.gameOfLife.Model;
import gameOfLife.model.gameOfLife.Rule;
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
		if (epackage == GameOfLifePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GameOfLifePackage.CELL:
				sequence_Cell(context, (Cell) semanticObject); 
				return; 
			case GameOfLifePackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case GameOfLifePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case GameOfLifePackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Cell returns Cell
	 *
	 * Constraint:
	 *     (x=INT y=INT state=CellState)
	 * </pre>
	 */
	protected void sequence_Cell(ISerializationContext context, Cell semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GameOfLifePackage.Literals.CELL__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameOfLifePackage.Literals.CELL__X));
			if (transientValues.isValueTransient(semanticObject, GameOfLifePackage.Literals.CELL__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameOfLifePackage.Literals.CELL__Y));
			if (transientValues.isValueTransient(semanticObject, GameOfLifePackage.Literals.CELL__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameOfLifePackage.Literals.CELL__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCellAccess().getXINTTerminalRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getCellAccess().getYINTTerminalRuleCall_4_0(), semanticObject.getY());
		feeder.accept(grammarAccess.getCellAccess().getStateCellStateEnumRuleCall_8_0(), semanticObject.getState());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (operator=Operator value=INT)
	 * </pre>
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GameOfLifePackage.Literals.CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameOfLifePackage.Literals.CONDITION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, GameOfLifePackage.Literals.CONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameOfLifePackage.Literals.CONDITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (cells+=Cell* rules+=Rule*)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (condition=Condition action=Action)
	 * </pre>
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GameOfLifePackage.Literals.RULE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameOfLifePackage.Literals.RULE__CONDITION));
			if (transientValues.isValueTransient(semanticObject, GameOfLifePackage.Literals.RULE__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameOfLifePackage.Literals.RULE__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_3_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getRuleAccess().getActionActionParserRuleCall_5_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
}
