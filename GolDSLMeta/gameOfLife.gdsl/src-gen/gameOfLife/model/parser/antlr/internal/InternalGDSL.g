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
		otherlv_0='Grid'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getGridKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getCellsCellParserRuleCall_2_0());
				}
				lv_cells_2_0=ruleCell
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"cells",
						lv_cells_2_0,
						"gameOfLife.model.GDSL.Cell");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4='Rules'
		{
			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRulesKeyword_4());
		}
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_6_0());
				}
				lv_rules_6_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"rules",
						lv_rules_6_0,
						"gameOfLife.model.GDSL.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleCell
entryRuleCell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCellRule()); }
	iv_ruleCell=ruleCell
	{ $current=$iv_ruleCell.current; }
	EOF;

// Rule Cell
ruleCell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Cell'
		{
			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getCellKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getCellAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_x_2_0=RULE_INT
				{
					newLeafNode(lv_x_2_0, grammarAccess.getCellAccess().getXINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCellRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getCellAccess().getCommaKeyword_3());
		}
		(
			(
				lv_y_4_0=RULE_INT
				{
					newLeafNode(lv_y_4_0, grammarAccess.getCellAccess().getYINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCellRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getCellAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='state'
		{
			newLeafNode(otherlv_6, grammarAccess.getCellAccess().getStateKeyword_6());
		}
		otherlv_7='='
		{
			newLeafNode(otherlv_7, grammarAccess.getCellAccess().getEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCellAccess().getStateCellStateEnumRuleCall_8_0());
				}
				lv_state_8_0=ruleCellState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCellRule());
					}
					set(
						$current,
						"state",
						lv_state_8_0,
						"gameOfLife.model.GDSL.CellState");
					afterParserOrEnumRuleCall();
				}
			)
		)
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
		otherlv_0='Rule'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='condition'
		{
			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getConditionKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_3_0());
				}
				lv_condition_3_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"condition",
						lv_condition_3_0,
						"gameOfLife.model.GDSL.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='action'
		{
			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getActionKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getActionActionParserRuleCall_5_0());
				}
				lv_action_5_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"action",
						lv_action_5_0,
						"gameOfLife.model.GDSL.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6());
		}
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
		otherlv_0='neighbors'
		{
			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getNeighborsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_1_0());
				}
				lv_operator_1_0=ruleOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"operator",
						lv_operator_1_0,
						"gameOfLife.model.GDSL.Operator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_value_2_0=RULE_INT
				{
					newLeafNode(lv_value_2_0, grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleOperator
entryRuleOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOperatorRule()); }
	iv_ruleOperator=ruleOperator
	{ $current=$iv_ruleOperator.current.getText(); }
	EOF;

// Rule Operator
ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='<'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_0());
		}
		    |
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignKeyword_1());
		}
		    |
		kw='>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_2());
		}
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [String current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current.getText(); }
	EOF;

// Rule Action
ruleAction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='die'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getActionAccess().getDieKeyword_0());
		}
		    |
		kw='live'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getActionAccess().getLiveKeyword_1());
		}
		    |
		kw='becomeAlive'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getActionAccess().getBecomeAliveKeyword_2());
		}
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
			enumLiteral_0='ALIVE'
			{
				$current = grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='DEAD'
			{
				$current = grammarAccess.getCellStateAccess().getDEADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCellStateAccess().getDEADEnumLiteralDeclaration_1());
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
