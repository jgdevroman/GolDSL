/*
 * generated by Xtext 2.37.0
 */
grammar InternalGDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package gameOfLife.model.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package gameOfLife.model.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gameOfLife.model.services.GDSLGrammarAccess;

}

@parser::members {

 	private GDSLGrammarAccess grammarAccess;

    public InternalGDSLParser(TokenStream input, GDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected GDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getGridGridParserRuleCall_0_0());
				}
				lv_grid_0_0=ruleGrid
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"grid",
						lv_grid_0_0,
						"gameOfLife.model.GDSL.Grid");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0());
				}
				lv_rules_1_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"rules",
						lv_rules_1_0,
						"gameOfLife.model.GDSL.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleGrid
entryRuleGrid returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGridRule()); }
	iv_ruleGrid=ruleGrid
	{ $current=$iv_ruleGrid.current; }
	EOF;

// Rule Grid
ruleGrid returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='AliveCells:'
		{
			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getAliveCellsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGridAccess().getCoordinatesCoordinateParserRuleCall_1_0());
				}
				lv_coordinates_1_0=ruleCoordinate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGridRule());
					}
					add(
						$current,
						"coordinates",
						lv_coordinates_1_0,
						"gameOfLife.model.GDSL.Coordinate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getGridAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGridAccess().getCoordinatesCoordinateParserRuleCall_2_1_0());
					}
					lv_coordinates_3_0=ruleCoordinate
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGridRule());
						}
						add(
							$current,
							"coordinates",
							lv_coordinates_3_0,
							"gameOfLife.model.GDSL.Coordinate");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCoordinate
entryRuleCoordinate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinateRule()); }
	iv_ruleCoordinate=ruleCoordinate
	{ $current=$iv_ruleCoordinate.current; }
	EOF;

// Rule Coordinate
ruleCoordinate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_start_1_0=RULE_INT
				{
					newLeafNode(lv_start_1_0, grammarAccess.getCoordinateAccess().getStartINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinateRule());
					}
					setWithLastConsumed(
						$current,
						"start",
						lv_start_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinateAccess().getCommaKeyword_2());
		}
		(
			(
				lv_end_3_0=RULE_INT
				{
					newLeafNode(lv_end_3_0, grammarAccess.getCoordinateAccess().getEndINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinateRule());
					}
					setWithLastConsumed(
						$current,
						"end",
						lv_end_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Rule:'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
		}
		otherlv_1='if'
		{
			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getIfKeyword_1());
		}
		otherlv_2='cell'
		{
			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getCellKeyword_2());
		}
		otherlv_3='is'
		{
			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getIsKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getStateCellStateEnumRuleCall_4_0());
				}
				lv_state_4_0=ruleCellState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"state",
						lv_state_4_0,
						"gameOfLife.model.GDSL.CellState");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='and'
			{
				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAndKeyword_5_0());
			}
			otherlv_6='neighbor'
			{
				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getNeighborKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_2_0());
					}
					lv_condition_7_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_7_0,
							"gameOfLife.model.GDSL.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8='then'
		{
			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getThenKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_7_0());
				}
				lv_action_9_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"action",
						lv_action_9_0,
						"gameOfLife.model.GDSL.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getOperatorRelationalOperatorEnumRuleCall_0_0());
				}
				lv_operator_0_0=ruleRelationalOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"operator",
						lv_operator_0_0,
						"gameOfLife.model.GDSL.RelationalOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Rule CellState
ruleCellState returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='alive'
			{
				$current = grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='dead'
			{
				$current = grammarAccess.getCellStateAccess().getDEADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCellStateAccess().getDEADEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule RelationalOperator
ruleRelationalOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='>'
			{
				$current = grammarAccess.getRelationalOperatorAccess().getGREATER_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getGREATER_THANEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='<'
			{
				$current = grammarAccess.getRelationalOperatorAccess().getLESS_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getLESS_THANEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='='
			{
				$current = grammarAccess.getRelationalOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getEQUALEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Action
ruleAction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='survive'
			{
				$current = grammarAccess.getActionAccess().getSURVIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getSURVIVEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='becomeAlive'
			{
				$current = grammarAccess.getActionAccess().getBECOME_ALIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getBECOME_ALIVEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='die'
			{
				$current = grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
