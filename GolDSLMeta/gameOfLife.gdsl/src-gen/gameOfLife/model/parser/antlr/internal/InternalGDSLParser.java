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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Grid'", "'{'", "'}'", "'Rules'", "'Cell'", "'('", "','", "')'", "'state'", "'='", "'Rule'", "'condition'", "'action'", "'neighbors'", "'<'", "'>'", "'die'", "'live'", "'becomeAlive'", "'ALIVE'", "'DEAD'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGDSL.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalGDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalGDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGDSL.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Grid' otherlv_1= '{' ( (lv_cells_2_0= ruleCell ) )* otherlv_3= '}' otherlv_4= 'Rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_cells_2_0 = null;

        EObject lv_rules_6_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:78:2: ( (otherlv_0= 'Grid' otherlv_1= '{' ( (lv_cells_2_0= ruleCell ) )* otherlv_3= '}' otherlv_4= 'Rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) )
            // InternalGDSL.g:79:2: (otherlv_0= 'Grid' otherlv_1= '{' ( (lv_cells_2_0= ruleCell ) )* otherlv_3= '}' otherlv_4= 'Rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' )
            {
            // InternalGDSL.g:79:2: (otherlv_0= 'Grid' otherlv_1= '{' ( (lv_cells_2_0= ruleCell ) )* otherlv_3= '}' otherlv_4= 'Rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' )
            // InternalGDSL.g:80:3: otherlv_0= 'Grid' otherlv_1= '{' ( (lv_cells_2_0= ruleCell ) )* otherlv_3= '}' otherlv_4= 'Rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getGridKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGDSL.g:88:3: ( (lv_cells_2_0= ruleCell ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGDSL.g:89:4: (lv_cells_2_0= ruleCell )
            	    {
            	    // InternalGDSL.g:89:4: (lv_cells_2_0= ruleCell )
            	    // InternalGDSL.g:90:5: lv_cells_2_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getCellsCellParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_cells_2_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_2_0,
            	    						"gameOfLife.model.GDSL.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRulesKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGDSL.g:119:3: ( (lv_rules_6_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGDSL.g:120:4: (lv_rules_6_0= ruleRule )
            	    {
            	    // InternalGDSL.g:120:4: (lv_rules_6_0= ruleRule )
            	    // InternalGDSL.g:121:5: lv_rules_6_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_rules_6_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_6_0,
            	    						"gameOfLife.model.GDSL.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCell"
    // InternalGDSL.g:146:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalGDSL.g:146:45: (iv_ruleCell= ruleCell EOF )
            // InternalGDSL.g:147:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGDSL.g:153:1: ruleCell returns [EObject current=null] : (otherlv_0= 'Cell' otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= 'state' otherlv_7= '=' ( (lv_state_8_0= ruleCellState ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_state_8_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:159:2: ( (otherlv_0= 'Cell' otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= 'state' otherlv_7= '=' ( (lv_state_8_0= ruleCellState ) ) ) )
            // InternalGDSL.g:160:2: (otherlv_0= 'Cell' otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= 'state' otherlv_7= '=' ( (lv_state_8_0= ruleCellState ) ) )
            {
            // InternalGDSL.g:160:2: (otherlv_0= 'Cell' otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= 'state' otherlv_7= '=' ( (lv_state_8_0= ruleCellState ) ) )
            // InternalGDSL.g:161:3: otherlv_0= 'Cell' otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= 'state' otherlv_7= '=' ( (lv_state_8_0= ruleCellState ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getCellKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCellAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGDSL.g:169:3: ( (lv_x_2_0= RULE_INT ) )
            // InternalGDSL.g:170:4: (lv_x_2_0= RULE_INT )
            {
            // InternalGDSL.g:170:4: (lv_x_2_0= RULE_INT )
            // InternalGDSL.g:171:5: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_x_2_0, grammarAccess.getCellAccess().getXINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCellAccess().getCommaKeyword_3());
            		
            // InternalGDSL.g:191:3: ( (lv_y_4_0= RULE_INT ) )
            // InternalGDSL.g:192:4: (lv_y_4_0= RULE_INT )
            {
            // InternalGDSL.g:192:4: (lv_y_4_0= RULE_INT )
            // InternalGDSL.g:193:5: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_y_4_0, grammarAccess.getCellAccess().getYINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getCellAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getCellAccess().getStateKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getCellAccess().getEqualsSignKeyword_7());
            		
            // InternalGDSL.g:221:3: ( (lv_state_8_0= ruleCellState ) )
            // InternalGDSL.g:222:4: (lv_state_8_0= ruleCellState )
            {
            // InternalGDSL.g:222:4: (lv_state_8_0= ruleCellState )
            // InternalGDSL.g:223:5: lv_state_8_0= ruleCellState
            {

            					newCompositeNode(grammarAccess.getCellAccess().getStateCellStateEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_8_0=ruleCellState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_8_0,
            						"gameOfLife.model.GDSL.CellState");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleRule"
    // InternalGDSL.g:244:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGDSL.g:244:45: (iv_ruleRule= ruleRule EOF )
            // InternalGDSL.g:245:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGDSL.g:251:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'action' ( (lv_action_5_0= ruleAction ) ) otherlv_6= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_3_0 = null;

        AntlrDatatypeRuleToken lv_action_5_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:257:2: ( (otherlv_0= 'Rule' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'action' ( (lv_action_5_0= ruleAction ) ) otherlv_6= '}' ) )
            // InternalGDSL.g:258:2: (otherlv_0= 'Rule' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'action' ( (lv_action_5_0= ruleAction ) ) otherlv_6= '}' )
            {
            // InternalGDSL.g:258:2: (otherlv_0= 'Rule' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'action' ( (lv_action_5_0= ruleAction ) ) otherlv_6= '}' )
            // InternalGDSL.g:259:3: otherlv_0= 'Rule' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'action' ( (lv_action_5_0= ruleAction ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getConditionKeyword_2());
            		
            // InternalGDSL.g:271:3: ( (lv_condition_3_0= ruleCondition ) )
            // InternalGDSL.g:272:4: (lv_condition_3_0= ruleCondition )
            {
            // InternalGDSL.g:272:4: (lv_condition_3_0= ruleCondition )
            // InternalGDSL.g:273:5: lv_condition_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"gameOfLife.model.GDSL.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getActionKeyword_4());
            		
            // InternalGDSL.g:294:3: ( (lv_action_5_0= ruleAction ) )
            // InternalGDSL.g:295:4: (lv_action_5_0= ruleAction )
            {
            // InternalGDSL.g:295:4: (lv_action_5_0= ruleAction )
            // InternalGDSL.g:296:5: lv_action_5_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getActionActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_action_5_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_5_0,
            						"gameOfLife.model.GDSL.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // InternalGDSL.g:321:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGDSL.g:321:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGDSL.g:322:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGDSL.g:328:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'neighbors' ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:334:2: ( (otherlv_0= 'neighbors' ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalGDSL.g:335:2: (otherlv_0= 'neighbors' ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalGDSL.g:335:2: (otherlv_0= 'neighbors' ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalGDSL.g:336:3: otherlv_0= 'neighbors' ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getNeighborsKeyword_0());
            		
            // InternalGDSL.g:340:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalGDSL.g:341:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalGDSL.g:341:4: (lv_operator_1_0= ruleOperator )
            // InternalGDSL.g:342:5: lv_operator_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"gameOfLife.model.GDSL.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGDSL.g:359:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalGDSL.g:360:4: (lv_value_2_0= RULE_INT )
            {
            // InternalGDSL.g:360:4: (lv_value_2_0= RULE_INT )
            // InternalGDSL.g:361:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOperator"
    // InternalGDSL.g:381:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGDSL.g:381:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGDSL.g:382:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalGDSL.g:388:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '=' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGDSL.g:394:2: ( (kw= '<' | kw= '=' | kw= '>' ) )
            // InternalGDSL.g:395:2: (kw= '<' | kw= '=' | kw= '>' )
            {
            // InternalGDSL.g:395:2: (kw= '<' | kw= '=' | kw= '>' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGDSL.g:396:3: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGDSL.g:402:3: kw= '='
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGDSL.g:408:3: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleAction"
    // InternalGDSL.g:417:1: entryRuleAction returns [String current=null] : iv_ruleAction= ruleAction EOF ;
    public final String entryRuleAction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAction = null;


        try {
            // InternalGDSL.g:417:46: (iv_ruleAction= ruleAction EOF )
            // InternalGDSL.g:418:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGDSL.g:424:1: ruleAction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'die' | kw= 'live' | kw= 'becomeAlive' ) ;
    public final AntlrDatatypeRuleToken ruleAction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGDSL.g:430:2: ( (kw= 'die' | kw= 'live' | kw= 'becomeAlive' ) )
            // InternalGDSL.g:431:2: (kw= 'die' | kw= 'live' | kw= 'becomeAlive' )
            {
            // InternalGDSL.g:431:2: (kw= 'die' | kw= 'live' | kw= 'becomeAlive' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGDSL.g:432:3: kw= 'die'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionAccess().getDieKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGDSL.g:438:3: kw= 'live'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionAccess().getLiveKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGDSL.g:444:3: kw= 'becomeAlive'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionAccess().getBecomeAliveKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleCellState"
    // InternalGDSL.g:453:1: ruleCellState returns [Enumerator current=null] : ( (enumLiteral_0= 'ALIVE' ) | (enumLiteral_1= 'DEAD' ) ) ;
    public final Enumerator ruleCellState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGDSL.g:459:2: ( ( (enumLiteral_0= 'ALIVE' ) | (enumLiteral_1= 'DEAD' ) ) )
            // InternalGDSL.g:460:2: ( (enumLiteral_0= 'ALIVE' ) | (enumLiteral_1= 'DEAD' ) )
            {
            // InternalGDSL.g:460:2: ( (enumLiteral_0= 'ALIVE' ) | (enumLiteral_1= 'DEAD' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGDSL.g:461:3: (enumLiteral_0= 'ALIVE' )
                    {
                    // InternalGDSL.g:461:3: (enumLiteral_0= 'ALIVE' )
                    // InternalGDSL.g:462:4: enumLiteral_0= 'ALIVE'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:469:3: (enumLiteral_1= 'DEAD' )
                    {
                    // InternalGDSL.g:469:3: (enumLiteral_1= 'DEAD' )
                    // InternalGDSL.g:470:4: enumLiteral_1= 'DEAD'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getCellStateAccess().getDEADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCellStateAccess().getDEADEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006100000L});

}