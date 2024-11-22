/*
 * generated by Xtext 2.37.0
 */
grammar InternalGDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package gameOfLife.model.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package gameOfLife.model.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import gameOfLife.model.services.GDSLGrammarAccess;

}
@parser::members {
	private GDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(GDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGrid
entryRuleGrid
:
{ before(grammarAccess.getGridRule()); }
	 ruleGrid
{ after(grammarAccess.getGridRule()); } 
	 EOF 
;

// Rule Grid
ruleGrid 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGridAccess().getGroup()); }
		(rule__Grid__Group__0)
		{ after(grammarAccess.getGridAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinate
entryRuleCoordinate
:
{ before(grammarAccess.getCoordinateRule()); }
	 ruleCoordinate
{ after(grammarAccess.getCoordinateRule()); } 
	 EOF 
;

// Rule Coordinate
ruleCoordinate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinateAccess().getGroup()); }
		(rule__Coordinate__Group__0)
		{ after(grammarAccess.getCoordinateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRule
entryRuleRule
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleAccess().getGroup()); }
		(rule__Rule__Group__0)
		{ after(grammarAccess.getRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCondition
entryRuleCondition
:
{ before(grammarAccess.getConditionRule()); }
	 ruleCondition
{ after(grammarAccess.getConditionRule()); } 
	 EOF 
;

// Rule Condition
ruleCondition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionAccess().getGroup()); }
		(rule__Condition__Group__0)
		{ after(grammarAccess.getConditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule CellState
ruleCellState
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellStateAccess().getAlternatives()); }
		(rule__CellState__Alternatives)
		{ after(grammarAccess.getCellStateAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule RelationalOperator
ruleRelationalOperator
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); }
		(rule__RelationalOperator__Alternatives)
		{ after(grammarAccess.getRelationalOperatorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Action
ruleAction
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getAlternatives()); }
		(rule__Action__Alternatives)
		{ after(grammarAccess.getActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CellState__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0()); }
		('alive')
		{ after(grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getCellStateAccess().getDEADEnumLiteralDeclaration_1()); }
		('dead')
		{ after(grammarAccess.getCellStateAccess().getDEADEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalOperator__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getGREATER_THANEnumLiteralDeclaration_0()); }
		('>')
		{ after(grammarAccess.getRelationalOperatorAccess().getGREATER_THANEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getLESS_THANEnumLiteralDeclaration_1()); }
		('<')
		{ after(grammarAccess.getRelationalOperatorAccess().getLESS_THANEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getEQUALEnumLiteralDeclaration_2()); }
		('=')
		{ after(grammarAccess.getRelationalOperatorAccess().getEQUALEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getSURVIVEEnumLiteralDeclaration_0()); }
		('survive')
		{ after(grammarAccess.getActionAccess().getSURVIVEEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getBECOME_ALIVEEnumLiteralDeclaration_1()); }
		('becomeAlive')
		{ after(grammarAccess.getActionAccess().getBECOME_ALIVEEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_2()); }
		('die')
		{ after(grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getGridAssignment_0()); }
	(rule__Model__GridAssignment_0)?
	{ after(grammarAccess.getModelAccess().getGridAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getRulesAssignment_1()); }
	(rule__Model__RulesAssignment_1)*
	{ after(grammarAccess.getModelAccess().getRulesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grid__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group__0__Impl
	rule__Grid__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getAliveCellsKeyword_0()); }
	'AliveCells:'
	{ after(grammarAccess.getGridAccess().getAliveCellsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group__1__Impl
	rule__Grid__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getCoordinatesAssignment_1()); }
	(rule__Grid__CoordinatesAssignment_1)
	{ after(grammarAccess.getGridAccess().getCoordinatesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getGroup_2()); }
	(rule__Grid__Group_2__0)*
	{ after(grammarAccess.getGridAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grid__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group_2__0__Impl
	rule__Grid__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getColonKeyword_2_0()); }
	':'
	{ after(grammarAccess.getGridAccess().getColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getCoordinatesAssignment_2_1()); }
	(rule__Grid__CoordinatesAssignment_2_1)
	{ after(grammarAccess.getGridAccess().getCoordinatesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Coordinate__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Coordinate__Group__0__Impl
	rule__Coordinate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Coordinate__Group__1__Impl
	rule__Coordinate__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateAccess().getStartAssignment_1()); }
	(rule__Coordinate__StartAssignment_1)
	{ after(grammarAccess.getCoordinateAccess().getStartAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Coordinate__Group__2__Impl
	rule__Coordinate__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateAccess().getCommaKeyword_2()); }
	','
	{ after(grammarAccess.getCoordinateAccess().getCommaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Coordinate__Group__3__Impl
	rule__Coordinate__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateAccess().getEndAssignment_3()); }
	(rule__Coordinate__EndAssignment_3)
	{ after(grammarAccess.getCoordinateAccess().getEndAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Coordinate__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getRuleKeyword_0()); }
	'Rule:'
	{ after(grammarAccess.getRuleAccess().getRuleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getIfKeyword_1()); }
	'if'
	{ after(grammarAccess.getRuleAccess().getIfKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__2__Impl
	rule__Rule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getCellKeyword_2()); }
	'cell'
	{ after(grammarAccess.getRuleAccess().getCellKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__3__Impl
	rule__Rule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getIsKeyword_3()); }
	'is'
	{ after(grammarAccess.getRuleAccess().getIsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__4__Impl
	rule__Rule__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getStateAssignment_4()); }
	(rule__Rule__StateAssignment_4)
	{ after(grammarAccess.getRuleAccess().getStateAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__5__Impl
	rule__Rule__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getGroup_5()); }
	(rule__Rule__Group_5__0)?
	{ after(grammarAccess.getRuleAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__6__Impl
	rule__Rule__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getThenKeyword_6()); }
	'then'
	{ after(grammarAccess.getRuleAccess().getThenKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getActionAssignment_7()); }
	(rule__Rule__ActionAssignment_7)
	{ after(grammarAccess.getRuleAccess().getActionAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group_5__0__Impl
	rule__Rule__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getAndKeyword_5_0()); }
	'and'
	{ after(grammarAccess.getRuleAccess().getAndKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group_5__1__Impl
	rule__Rule__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getNeighborKeyword_5_1()); }
	'neighbor'
	{ after(grammarAccess.getRuleAccess().getNeighborKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getConditionAssignment_5_2()); }
	(rule__Rule__ConditionAssignment_5_2)
	{ after(grammarAccess.getRuleAccess().getConditionAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__0__Impl
	rule__Condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getOperatorAssignment_0()); }
	(rule__Condition__OperatorAssignment_0)
	{ after(grammarAccess.getConditionAccess().getOperatorAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getValueAssignment_1()); }
	(rule__Condition__ValueAssignment_1)
	{ after(grammarAccess.getConditionAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__GridAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getGridGridParserRuleCall_0_0()); }
		ruleGrid
		{ after(grammarAccess.getModelAccess().getGridGridParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__RulesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0()); }
		ruleRule
		{ after(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__CoordinatesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGridAccess().getCoordinatesCoordinateParserRuleCall_1_0()); }
		ruleCoordinate
		{ after(grammarAccess.getGridAccess().getCoordinatesCoordinateParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__CoordinatesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGridAccess().getCoordinatesCoordinateParserRuleCall_2_1_0()); }
		ruleCoordinate
		{ after(grammarAccess.getGridAccess().getCoordinatesCoordinateParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__StartAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinateAccess().getStartINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getCoordinateAccess().getStartINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Coordinate__EndAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinateAccess().getEndINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getCoordinateAccess().getEndINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__StateAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getStateCellStateEnumRuleCall_4_0()); }
		ruleCellState
		{ after(grammarAccess.getRuleAccess().getStateCellStateEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__ConditionAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_2_0()); }
		ruleCondition
		{ after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__ActionAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_7_0()); }
		ruleAction
		{ after(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__OperatorAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getOperatorRelationalOperatorEnumRuleCall_0_0()); }
		ruleRelationalOperator
		{ after(grammarAccess.getConditionAccess().getOperatorRelationalOperatorEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
