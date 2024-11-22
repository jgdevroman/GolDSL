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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AliveCells:'", "':'", "'('", "','", "')'", "'Rule:'", "'if'", "'cell'", "'is'", "'and'", "'neighbor'", "'then'", "'alive'", "'dead'", "'>'", "'<'", "'='", "'survive'", "'becomeAlive'", "'die'"
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
    // InternalGDSL.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_grid_0_0= ruleGrid ) )? ( (lv_rules_1_0= ruleRule ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_grid_0_0 = null;

        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:78:2: ( ( ( (lv_grid_0_0= ruleGrid ) )? ( (lv_rules_1_0= ruleRule ) )* ) )
            // InternalGDSL.g:79:2: ( ( (lv_grid_0_0= ruleGrid ) )? ( (lv_rules_1_0= ruleRule ) )* )
            {
            // InternalGDSL.g:79:2: ( ( (lv_grid_0_0= ruleGrid ) )? ( (lv_rules_1_0= ruleRule ) )* )
            // InternalGDSL.g:80:3: ( (lv_grid_0_0= ruleGrid ) )? ( (lv_rules_1_0= ruleRule ) )*
            {
            // InternalGDSL.g:80:3: ( (lv_grid_0_0= ruleGrid ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGDSL.g:81:4: (lv_grid_0_0= ruleGrid )
                    {
                    // InternalGDSL.g:81:4: (lv_grid_0_0= ruleGrid )
                    // InternalGDSL.g:82:5: lv_grid_0_0= ruleGrid
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getGridGridParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_grid_0_0=ruleGrid();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"grid",
                    						lv_grid_0_0,
                    						"gameOfLife.model.GDSL.Grid");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGDSL.g:99:3: ( (lv_rules_1_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGDSL.g:100:4: (lv_rules_1_0= ruleRule )
            	    {
            	    // InternalGDSL.g:100:4: (lv_rules_1_0= ruleRule )
            	    // InternalGDSL.g:101:5: lv_rules_1_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_1_0,
            	    						"gameOfLife.model.GDSL.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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


    // $ANTLR start "entryRuleGrid"
    // InternalGDSL.g:122:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalGDSL.g:122:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalGDSL.g:123:2: iv_ruleGrid= ruleGrid EOF
            {
             newCompositeNode(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrid=ruleGrid();

            state._fsp--;

             current =iv_ruleGrid; 
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
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGDSL.g:129:1: ruleGrid returns [EObject current=null] : (otherlv_0= 'AliveCells:' ( (lv_coordinates_1_0= ruleCoordinate ) ) (otherlv_2= ':' ( (lv_coordinates_3_0= ruleCoordinate ) ) )* ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_coordinates_1_0 = null;

        EObject lv_coordinates_3_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:135:2: ( (otherlv_0= 'AliveCells:' ( (lv_coordinates_1_0= ruleCoordinate ) ) (otherlv_2= ':' ( (lv_coordinates_3_0= ruleCoordinate ) ) )* ) )
            // InternalGDSL.g:136:2: (otherlv_0= 'AliveCells:' ( (lv_coordinates_1_0= ruleCoordinate ) ) (otherlv_2= ':' ( (lv_coordinates_3_0= ruleCoordinate ) ) )* )
            {
            // InternalGDSL.g:136:2: (otherlv_0= 'AliveCells:' ( (lv_coordinates_1_0= ruleCoordinate ) ) (otherlv_2= ':' ( (lv_coordinates_3_0= ruleCoordinate ) ) )* )
            // InternalGDSL.g:137:3: otherlv_0= 'AliveCells:' ( (lv_coordinates_1_0= ruleCoordinate ) ) (otherlv_2= ':' ( (lv_coordinates_3_0= ruleCoordinate ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getAliveCellsKeyword_0());
            		
            // InternalGDSL.g:141:3: ( (lv_coordinates_1_0= ruleCoordinate ) )
            // InternalGDSL.g:142:4: (lv_coordinates_1_0= ruleCoordinate )
            {
            // InternalGDSL.g:142:4: (lv_coordinates_1_0= ruleCoordinate )
            // InternalGDSL.g:143:5: lv_coordinates_1_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getGridAccess().getCoordinatesCoordinateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_coordinates_1_0=ruleCoordinate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGridRule());
            					}
            					add(
            						current,
            						"coordinates",
            						lv_coordinates_1_0,
            						"gameOfLife.model.GDSL.Coordinate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGDSL.g:160:3: (otherlv_2= ':' ( (lv_coordinates_3_0= ruleCoordinate ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGDSL.g:161:4: otherlv_2= ':' ( (lv_coordinates_3_0= ruleCoordinate ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getGridAccess().getColonKeyword_2_0());
            	    			
            	    // InternalGDSL.g:165:4: ( (lv_coordinates_3_0= ruleCoordinate ) )
            	    // InternalGDSL.g:166:5: (lv_coordinates_3_0= ruleCoordinate )
            	    {
            	    // InternalGDSL.g:166:5: (lv_coordinates_3_0= ruleCoordinate )
            	    // InternalGDSL.g:167:6: lv_coordinates_3_0= ruleCoordinate
            	    {

            	    						newCompositeNode(grammarAccess.getGridAccess().getCoordinatesCoordinateParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_coordinates_3_0=ruleCoordinate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGridRule());
            	    						}
            	    						add(
            	    							current,
            	    							"coordinates",
            	    							lv_coordinates_3_0,
            	    							"gameOfLife.model.GDSL.Coordinate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleCoordinate"
    // InternalGDSL.g:189:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalGDSL.g:189:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalGDSL.g:190:2: iv_ruleCoordinate= ruleCoordinate EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinate=ruleCoordinate();

            state._fsp--;

             current =iv_ruleCoordinate; 
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
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalGDSL.g:196:1: ruleCoordinate returns [EObject current=null] : (otherlv_0= '(' ( (lv_start_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_end_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_start_1_0=null;
        Token otherlv_2=null;
        Token lv_end_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGDSL.g:202:2: ( (otherlv_0= '(' ( (lv_start_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_end_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalGDSL.g:203:2: (otherlv_0= '(' ( (lv_start_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_end_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalGDSL.g:203:2: (otherlv_0= '(' ( (lv_start_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_end_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalGDSL.g:204:3: otherlv_0= '(' ( (lv_start_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_end_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGDSL.g:208:3: ( (lv_start_1_0= RULE_INT ) )
            // InternalGDSL.g:209:4: (lv_start_1_0= RULE_INT )
            {
            // InternalGDSL.g:209:4: (lv_start_1_0= RULE_INT )
            // InternalGDSL.g:210:5: lv_start_1_0= RULE_INT
            {
            lv_start_1_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_start_1_0, grammarAccess.getCoordinateAccess().getStartINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinateAccess().getCommaKeyword_2());
            		
            // InternalGDSL.g:230:3: ( (lv_end_3_0= RULE_INT ) )
            // InternalGDSL.g:231:4: (lv_end_3_0= RULE_INT )
            {
            // InternalGDSL.g:231:4: (lv_end_3_0= RULE_INT )
            // InternalGDSL.g:232:5: lv_end_3_0= RULE_INT
            {
            lv_end_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_end_3_0, grammarAccess.getCoordinateAccess().getEndINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleRule"
    // InternalGDSL.g:256:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGDSL.g:256:45: (iv_ruleRule= ruleRule EOF )
            // InternalGDSL.g:257:2: iv_ruleRule= ruleRule EOF
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
    // InternalGDSL.g:263:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule:' otherlv_1= 'if' otherlv_2= 'cell' otherlv_3= 'is' ( (lv_state_4_0= ruleCellState ) ) (otherlv_5= 'and' otherlv_6= 'neighbor' ( (lv_condition_7_0= ruleCondition ) ) )? otherlv_8= 'then' ( (lv_action_9_0= ruleAction ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_state_4_0 = null;

        EObject lv_condition_7_0 = null;

        Enumerator lv_action_9_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:269:2: ( (otherlv_0= 'Rule:' otherlv_1= 'if' otherlv_2= 'cell' otherlv_3= 'is' ( (lv_state_4_0= ruleCellState ) ) (otherlv_5= 'and' otherlv_6= 'neighbor' ( (lv_condition_7_0= ruleCondition ) ) )? otherlv_8= 'then' ( (lv_action_9_0= ruleAction ) ) ) )
            // InternalGDSL.g:270:2: (otherlv_0= 'Rule:' otherlv_1= 'if' otherlv_2= 'cell' otherlv_3= 'is' ( (lv_state_4_0= ruleCellState ) ) (otherlv_5= 'and' otherlv_6= 'neighbor' ( (lv_condition_7_0= ruleCondition ) ) )? otherlv_8= 'then' ( (lv_action_9_0= ruleAction ) ) )
            {
            // InternalGDSL.g:270:2: (otherlv_0= 'Rule:' otherlv_1= 'if' otherlv_2= 'cell' otherlv_3= 'is' ( (lv_state_4_0= ruleCellState ) ) (otherlv_5= 'and' otherlv_6= 'neighbor' ( (lv_condition_7_0= ruleCondition ) ) )? otherlv_8= 'then' ( (lv_action_9_0= ruleAction ) ) )
            // InternalGDSL.g:271:3: otherlv_0= 'Rule:' otherlv_1= 'if' otherlv_2= 'cell' otherlv_3= 'is' ( (lv_state_4_0= ruleCellState ) ) (otherlv_5= 'and' otherlv_6= 'neighbor' ( (lv_condition_7_0= ruleCondition ) ) )? otherlv_8= 'then' ( (lv_action_9_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getCellKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getIsKeyword_3());
            		
            // InternalGDSL.g:287:3: ( (lv_state_4_0= ruleCellState ) )
            // InternalGDSL.g:288:4: (lv_state_4_0= ruleCellState )
            {
            // InternalGDSL.g:288:4: (lv_state_4_0= ruleCellState )
            // InternalGDSL.g:289:5: lv_state_4_0= ruleCellState
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStateCellStateEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_state_4_0=ruleCellState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_4_0,
            						"gameOfLife.model.GDSL.CellState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGDSL.g:306:3: (otherlv_5= 'and' otherlv_6= 'neighbor' ( (lv_condition_7_0= ruleCondition ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGDSL.g:307:4: otherlv_5= 'and' otherlv_6= 'neighbor' ( (lv_condition_7_0= ruleCondition ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAndKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getNeighborKeyword_5_1());
                    			
                    // InternalGDSL.g:315:4: ( (lv_condition_7_0= ruleCondition ) )
                    // InternalGDSL.g:316:5: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalGDSL.g:316:5: (lv_condition_7_0= ruleCondition )
                    // InternalGDSL.g:317:6: lv_condition_7_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_condition_7_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_7_0,
                    							"gameOfLife.model.GDSL.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getThenKeyword_6());
            		
            // InternalGDSL.g:339:3: ( (lv_action_9_0= ruleAction ) )
            // InternalGDSL.g:340:4: (lv_action_9_0= ruleAction )
            {
            // InternalGDSL.g:340:4: (lv_action_9_0= ruleAction )
            // InternalGDSL.g:341:5: lv_action_9_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_9_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_9_0,
            						"gameOfLife.model.GDSL.Action");
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // InternalGDSL.g:362:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGDSL.g:362:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGDSL.g:363:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGDSL.g:369:1: ruleCondition returns [EObject current=null] : ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:375:2: ( ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalGDSL.g:376:2: ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalGDSL.g:376:2: ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_value_1_0= RULE_INT ) ) )
            // InternalGDSL.g:377:3: ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalGDSL.g:377:3: ( (lv_operator_0_0= ruleRelationalOperator ) )
            // InternalGDSL.g:378:4: (lv_operator_0_0= ruleRelationalOperator )
            {
            // InternalGDSL.g:378:4: (lv_operator_0_0= ruleRelationalOperator )
            // InternalGDSL.g:379:5: lv_operator_0_0= ruleRelationalOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorRelationalOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_operator_0_0=ruleRelationalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"gameOfLife.model.GDSL.RelationalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGDSL.g:396:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalGDSL.g:397:4: (lv_value_1_0= RULE_INT )
            {
            // InternalGDSL.g:397:4: (lv_value_1_0= RULE_INT )
            // InternalGDSL.g:398:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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


    // $ANTLR start "ruleCellState"
    // InternalGDSL.g:418:1: ruleCellState returns [Enumerator current=null] : ( (enumLiteral_0= 'alive' ) | (enumLiteral_1= 'dead' ) ) ;
    public final Enumerator ruleCellState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGDSL.g:424:2: ( ( (enumLiteral_0= 'alive' ) | (enumLiteral_1= 'dead' ) ) )
            // InternalGDSL.g:425:2: ( (enumLiteral_0= 'alive' ) | (enumLiteral_1= 'dead' ) )
            {
            // InternalGDSL.g:425:2: ( (enumLiteral_0= 'alive' ) | (enumLiteral_1= 'dead' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGDSL.g:426:3: (enumLiteral_0= 'alive' )
                    {
                    // InternalGDSL.g:426:3: (enumLiteral_0= 'alive' )
                    // InternalGDSL.g:427:4: enumLiteral_0= 'alive'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:434:3: (enumLiteral_1= 'dead' )
                    {
                    // InternalGDSL.g:434:3: (enumLiteral_1= 'dead' )
                    // InternalGDSL.g:435:4: enumLiteral_1= 'dead'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "ruleRelationalOperator"
    // InternalGDSL.g:445:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGDSL.g:451:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) ) )
            // InternalGDSL.g:452:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) )
            {
            // InternalGDSL.g:452:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGDSL.g:453:3: (enumLiteral_0= '>' )
                    {
                    // InternalGDSL.g:453:3: (enumLiteral_0= '>' )
                    // InternalGDSL.g:454:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getGREATER_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getGREATER_THANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:461:3: (enumLiteral_1= '<' )
                    {
                    // InternalGDSL.g:461:3: (enumLiteral_1= '<' )
                    // InternalGDSL.g:462:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getLESS_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getLESS_THANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGDSL.g:469:3: (enumLiteral_2= '=' )
                    {
                    // InternalGDSL.g:469:3: (enumLiteral_2= '=' )
                    // InternalGDSL.g:470:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getEQUALEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleAction"
    // InternalGDSL.g:480:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'survive' ) | (enumLiteral_1= 'becomeAlive' ) | (enumLiteral_2= 'die' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGDSL.g:486:2: ( ( (enumLiteral_0= 'survive' ) | (enumLiteral_1= 'becomeAlive' ) | (enumLiteral_2= 'die' ) ) )
            // InternalGDSL.g:487:2: ( (enumLiteral_0= 'survive' ) | (enumLiteral_1= 'becomeAlive' ) | (enumLiteral_2= 'die' ) )
            {
            // InternalGDSL.g:487:2: ( (enumLiteral_0= 'survive' ) | (enumLiteral_1= 'becomeAlive' ) | (enumLiteral_2= 'die' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGDSL.g:488:3: (enumLiteral_0= 'survive' )
                    {
                    // InternalGDSL.g:488:3: (enumLiteral_0= 'survive' )
                    // InternalGDSL.g:489:4: enumLiteral_0= 'survive'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getSURVIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getSURVIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:496:3: (enumLiteral_1= 'becomeAlive' )
                    {
                    // InternalGDSL.g:496:3: (enumLiteral_1= 'becomeAlive' )
                    // InternalGDSL.g:497:4: enumLiteral_1= 'becomeAlive'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getBECOME_ALIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getBECOME_ALIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGDSL.g:504:3: (enumLiteral_2= 'die' )
                    {
                    // InternalGDSL.g:504:3: (enumLiteral_2= 'die' )
                    // InternalGDSL.g:505:4: enumLiteral_2= 'die'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000070000000L});

}