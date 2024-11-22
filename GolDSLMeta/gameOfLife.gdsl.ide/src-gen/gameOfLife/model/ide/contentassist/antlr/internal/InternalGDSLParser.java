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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'alive'", "'dead'", "'>'", "'<'", "'='", "'survive'", "'becomeAlive'", "'die'", "'Grid'", "':'", "'-'", "'Rule:'", "'if'", "'cell'", "'is'", "'then'", "'and'", "'neighbor'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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



    // $ANTLR start "entryRuleModel"
    // InternalGDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGDSL.g:54:1: ( ruleModel EOF )
            // InternalGDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalGDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalGDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalGDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalGDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalGDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGrid"
    // InternalGDSL.g:78:1: entryRuleGrid : ruleGrid EOF ;
    public final void entryRuleGrid() throws RecognitionException {
        try {
            // InternalGDSL.g:79:1: ( ruleGrid EOF )
            // InternalGDSL.g:80:1: ruleGrid EOF
            {
             before(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGridRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGDSL.g:87:1: ruleGrid : ( ( rule__Grid__Group__0 ) ) ;
    public final void ruleGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:91:2: ( ( ( rule__Grid__Group__0 ) ) )
            // InternalGDSL.g:92:2: ( ( rule__Grid__Group__0 ) )
            {
            // InternalGDSL.g:92:2: ( ( rule__Grid__Group__0 ) )
            // InternalGDSL.g:93:3: ( rule__Grid__Group__0 )
            {
             before(grammarAccess.getGridAccess().getGroup()); 
            // InternalGDSL.g:94:3: ( rule__Grid__Group__0 )
            // InternalGDSL.g:94:4: rule__Grid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleRange"
    // InternalGDSL.g:103:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalGDSL.g:104:1: ( ruleRange EOF )
            // InternalGDSL.g:105:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalGDSL.g:112:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:116:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalGDSL.g:117:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalGDSL.g:117:2: ( ( rule__Range__Group__0 ) )
            // InternalGDSL.g:118:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalGDSL.g:119:3: ( rule__Range__Group__0 )
            // InternalGDSL.g:119:4: rule__Range__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleRule"
    // InternalGDSL.g:128:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalGDSL.g:129:1: ( ruleRule EOF )
            // InternalGDSL.g:130:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGDSL.g:137:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:141:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalGDSL.g:142:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalGDSL.g:142:2: ( ( rule__Rule__Group__0 ) )
            // InternalGDSL.g:143:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalGDSL.g:144:3: ( rule__Rule__Group__0 )
            // InternalGDSL.g:144:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // InternalGDSL.g:153:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGDSL.g:154:1: ( ruleCondition EOF )
            // InternalGDSL.g:155:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGDSL.g:162:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:166:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGDSL.g:167:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGDSL.g:167:2: ( ( rule__Condition__Group__0 ) )
            // InternalGDSL.g:168:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGDSL.g:169:3: ( rule__Condition__Group__0 )
            // InternalGDSL.g:169:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "ruleCellState"
    // InternalGDSL.g:178:1: ruleCellState : ( ( rule__CellState__Alternatives ) ) ;
    public final void ruleCellState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:182:1: ( ( ( rule__CellState__Alternatives ) ) )
            // InternalGDSL.g:183:2: ( ( rule__CellState__Alternatives ) )
            {
            // InternalGDSL.g:183:2: ( ( rule__CellState__Alternatives ) )
            // InternalGDSL.g:184:3: ( rule__CellState__Alternatives )
            {
             before(grammarAccess.getCellStateAccess().getAlternatives()); 
            // InternalGDSL.g:185:3: ( rule__CellState__Alternatives )
            // InternalGDSL.g:185:4: rule__CellState__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CellState__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellState"


    // $ANTLR start "ruleRelationalOperator"
    // InternalGDSL.g:194:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:198:1: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalGDSL.g:199:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalGDSL.g:199:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalGDSL.g:200:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalGDSL.g:201:3: ( rule__RelationalOperator__Alternatives )
            // InternalGDSL.g:201:4: rule__RelationalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleAction"
    // InternalGDSL.g:210:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:214:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalGDSL.g:215:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalGDSL.g:215:2: ( ( rule__Action__Alternatives ) )
            // InternalGDSL.g:216:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalGDSL.g:217:3: ( rule__Action__Alternatives )
            // InternalGDSL.g:217:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__CellState__Alternatives"
    // InternalGDSL.g:225:1: rule__CellState__Alternatives : ( ( ( 'alive' ) ) | ( ( 'dead' ) ) );
    public final void rule__CellState__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:229:1: ( ( ( 'alive' ) ) | ( ( 'dead' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGDSL.g:230:2: ( ( 'alive' ) )
                    {
                    // InternalGDSL.g:230:2: ( ( 'alive' ) )
                    // InternalGDSL.g:231:3: ( 'alive' )
                    {
                     before(grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0()); 
                    // InternalGDSL.g:232:3: ( 'alive' )
                    // InternalGDSL.g:232:4: 'alive'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCellStateAccess().getALIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:236:2: ( ( 'dead' ) )
                    {
                    // InternalGDSL.g:236:2: ( ( 'dead' ) )
                    // InternalGDSL.g:237:3: ( 'dead' )
                    {
                     before(grammarAccess.getCellStateAccess().getDEADEnumLiteralDeclaration_1()); 
                    // InternalGDSL.g:238:3: ( 'dead' )
                    // InternalGDSL.g:238:4: 'dead'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCellStateAccess().getDEADEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Alternatives"


    // $ANTLR start "rule__RelationalOperator__Alternatives"
    // InternalGDSL.g:246:1: rule__RelationalOperator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:250:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGDSL.g:251:2: ( ( '>' ) )
                    {
                    // InternalGDSL.g:251:2: ( ( '>' ) )
                    // InternalGDSL.g:252:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGREATER_THANEnumLiteralDeclaration_0()); 
                    // InternalGDSL.g:253:3: ( '>' )
                    // InternalGDSL.g:253:4: '>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGREATER_THANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:257:2: ( ( '<' ) )
                    {
                    // InternalGDSL.g:257:2: ( ( '<' ) )
                    // InternalGDSL.g:258:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLESS_THANEnumLiteralDeclaration_1()); 
                    // InternalGDSL.g:259:3: ( '<' )
                    // InternalGDSL.g:259:4: '<'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getLESS_THANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGDSL.g:263:2: ( ( '=' ) )
                    {
                    // InternalGDSL.g:263:2: ( ( '=' ) )
                    // InternalGDSL.g:264:3: ( '=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalGDSL.g:265:3: ( '=' )
                    // InternalGDSL.g:265:4: '='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalOperator__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalGDSL.g:273:1: rule__Action__Alternatives : ( ( ( 'survive' ) ) | ( ( 'becomeAlive' ) ) | ( ( 'die' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:277:1: ( ( ( 'survive' ) ) | ( ( 'becomeAlive' ) ) | ( ( 'die' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
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
                    // InternalGDSL.g:278:2: ( ( 'survive' ) )
                    {
                    // InternalGDSL.g:278:2: ( ( 'survive' ) )
                    // InternalGDSL.g:279:3: ( 'survive' )
                    {
                     before(grammarAccess.getActionAccess().getSURVIVEEnumLiteralDeclaration_0()); 
                    // InternalGDSL.g:280:3: ( 'survive' )
                    // InternalGDSL.g:280:4: 'survive'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getSURVIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:284:2: ( ( 'becomeAlive' ) )
                    {
                    // InternalGDSL.g:284:2: ( ( 'becomeAlive' ) )
                    // InternalGDSL.g:285:3: ( 'becomeAlive' )
                    {
                     before(grammarAccess.getActionAccess().getBECOME_ALIVEEnumLiteralDeclaration_1()); 
                    // InternalGDSL.g:286:3: ( 'becomeAlive' )
                    // InternalGDSL.g:286:4: 'becomeAlive'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getBECOME_ALIVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGDSL.g:290:2: ( ( 'die' ) )
                    {
                    // InternalGDSL.g:290:2: ( ( 'die' ) )
                    // InternalGDSL.g:291:3: ( 'die' )
                    {
                     before(grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_2()); 
                    // InternalGDSL.g:292:3: ( 'die' )
                    // InternalGDSL.g:292:4: 'die'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalGDSL.g:300:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:304:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGDSL.g:305:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalGDSL.g:312:1: rule__Model__Group__0__Impl : ( ( rule__Model__GridAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:316:1: ( ( ( rule__Model__GridAssignment_0 )? ) )
            // InternalGDSL.g:317:1: ( ( rule__Model__GridAssignment_0 )? )
            {
            // InternalGDSL.g:317:1: ( ( rule__Model__GridAssignment_0 )? )
            // InternalGDSL.g:318:2: ( rule__Model__GridAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getGridAssignment_0()); 
            // InternalGDSL.g:319:2: ( rule__Model__GridAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGDSL.g:319:3: rule__Model__GridAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__GridAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGridAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalGDSL.g:327:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:331:1: ( rule__Model__Group__1__Impl )
            // InternalGDSL.g:332:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalGDSL.g:338:1: rule__Model__Group__1__Impl : ( ( rule__Model__RulesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:342:1: ( ( ( rule__Model__RulesAssignment_1 )* ) )
            // InternalGDSL.g:343:1: ( ( rule__Model__RulesAssignment_1 )* )
            {
            // InternalGDSL.g:343:1: ( ( rule__Model__RulesAssignment_1 )* )
            // InternalGDSL.g:344:2: ( rule__Model__RulesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getRulesAssignment_1()); 
            // InternalGDSL.g:345:2: ( rule__Model__RulesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGDSL.g:345:3: rule__Model__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__0"
    // InternalGDSL.g:354:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:358:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalGDSL.g:359:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Grid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0"


    // $ANTLR start "rule__Grid__Group__0__Impl"
    // InternalGDSL.g:366:1: rule__Grid__Group__0__Impl : ( 'Grid' ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:370:1: ( ( 'Grid' ) )
            // InternalGDSL.g:371:1: ( 'Grid' )
            {
            // InternalGDSL.g:371:1: ( 'Grid' )
            // InternalGDSL.g:372:2: 'Grid'
            {
             before(grammarAccess.getGridAccess().getGridKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getGridKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0__Impl"


    // $ANTLR start "rule__Grid__Group__1"
    // InternalGDSL.g:381:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:385:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalGDSL.g:386:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Grid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1"


    // $ANTLR start "rule__Grid__Group__1__Impl"
    // InternalGDSL.g:393:1: rule__Grid__Group__1__Impl : ( ( rule__Grid__RangesAssignment_1 ) ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:397:1: ( ( ( rule__Grid__RangesAssignment_1 ) ) )
            // InternalGDSL.g:398:1: ( ( rule__Grid__RangesAssignment_1 ) )
            {
            // InternalGDSL.g:398:1: ( ( rule__Grid__RangesAssignment_1 ) )
            // InternalGDSL.g:399:2: ( rule__Grid__RangesAssignment_1 )
            {
             before(grammarAccess.getGridAccess().getRangesAssignment_1()); 
            // InternalGDSL.g:400:2: ( rule__Grid__RangesAssignment_1 )
            // InternalGDSL.g:400:3: rule__Grid__RangesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Grid__RangesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getRangesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__2"
    // InternalGDSL.g:408:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:412:1: ( rule__Grid__Group__2__Impl )
            // InternalGDSL.g:413:2: rule__Grid__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2"


    // $ANTLR start "rule__Grid__Group__2__Impl"
    // InternalGDSL.g:419:1: rule__Grid__Group__2__Impl : ( ( rule__Grid__Group_2__0 )* ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:423:1: ( ( ( rule__Grid__Group_2__0 )* ) )
            // InternalGDSL.g:424:1: ( ( rule__Grid__Group_2__0 )* )
            {
            // InternalGDSL.g:424:1: ( ( rule__Grid__Group_2__0 )* )
            // InternalGDSL.g:425:2: ( rule__Grid__Group_2__0 )*
            {
             before(grammarAccess.getGridAccess().getGroup_2()); 
            // InternalGDSL.g:426:2: ( rule__Grid__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGDSL.g:426:3: rule__Grid__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Grid__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGridAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2__Impl"


    // $ANTLR start "rule__Grid__Group_2__0"
    // InternalGDSL.g:435:1: rule__Grid__Group_2__0 : rule__Grid__Group_2__0__Impl rule__Grid__Group_2__1 ;
    public final void rule__Grid__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:439:1: ( rule__Grid__Group_2__0__Impl rule__Grid__Group_2__1 )
            // InternalGDSL.g:440:2: rule__Grid__Group_2__0__Impl rule__Grid__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Grid__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group_2__0"


    // $ANTLR start "rule__Grid__Group_2__0__Impl"
    // InternalGDSL.g:447:1: rule__Grid__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Grid__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:451:1: ( ( ':' ) )
            // InternalGDSL.g:452:1: ( ':' )
            {
            // InternalGDSL.g:452:1: ( ':' )
            // InternalGDSL.g:453:2: ':'
            {
             before(grammarAccess.getGridAccess().getColonKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group_2__0__Impl"


    // $ANTLR start "rule__Grid__Group_2__1"
    // InternalGDSL.g:462:1: rule__Grid__Group_2__1 : rule__Grid__Group_2__1__Impl ;
    public final void rule__Grid__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:466:1: ( rule__Grid__Group_2__1__Impl )
            // InternalGDSL.g:467:2: rule__Grid__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group_2__1"


    // $ANTLR start "rule__Grid__Group_2__1__Impl"
    // InternalGDSL.g:473:1: rule__Grid__Group_2__1__Impl : ( ( rule__Grid__RangesAssignment_2_1 ) ) ;
    public final void rule__Grid__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:477:1: ( ( ( rule__Grid__RangesAssignment_2_1 ) ) )
            // InternalGDSL.g:478:1: ( ( rule__Grid__RangesAssignment_2_1 ) )
            {
            // InternalGDSL.g:478:1: ( ( rule__Grid__RangesAssignment_2_1 ) )
            // InternalGDSL.g:479:2: ( rule__Grid__RangesAssignment_2_1 )
            {
             before(grammarAccess.getGridAccess().getRangesAssignment_2_1()); 
            // InternalGDSL.g:480:2: ( rule__Grid__RangesAssignment_2_1 )
            // InternalGDSL.g:480:3: rule__Grid__RangesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Grid__RangesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getRangesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group_2__1__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalGDSL.g:489:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:493:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalGDSL.g:494:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalGDSL.g:501:1: rule__Range__Group__0__Impl : ( ( rule__Range__StartAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:505:1: ( ( ( rule__Range__StartAssignment_0 ) ) )
            // InternalGDSL.g:506:1: ( ( rule__Range__StartAssignment_0 ) )
            {
            // InternalGDSL.g:506:1: ( ( rule__Range__StartAssignment_0 ) )
            // InternalGDSL.g:507:2: ( rule__Range__StartAssignment_0 )
            {
             before(grammarAccess.getRangeAccess().getStartAssignment_0()); 
            // InternalGDSL.g:508:2: ( rule__Range__StartAssignment_0 )
            // InternalGDSL.g:508:3: rule__Range__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Range__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalGDSL.g:516:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:520:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalGDSL.g:521:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalGDSL.g:528:1: rule__Range__Group__1__Impl : ( '-' ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:532:1: ( ( '-' ) )
            // InternalGDSL.g:533:1: ( '-' )
            {
            // InternalGDSL.g:533:1: ( '-' )
            // InternalGDSL.g:534:2: '-'
            {
             before(grammarAccess.getRangeAccess().getHyphenMinusKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalGDSL.g:543:1: rule__Range__Group__2 : rule__Range__Group__2__Impl ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:547:1: ( rule__Range__Group__2__Impl )
            // InternalGDSL.g:548:2: rule__Range__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalGDSL.g:554:1: rule__Range__Group__2__Impl : ( ( rule__Range__EndAssignment_2 ) ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:558:1: ( ( ( rule__Range__EndAssignment_2 ) ) )
            // InternalGDSL.g:559:1: ( ( rule__Range__EndAssignment_2 ) )
            {
            // InternalGDSL.g:559:1: ( ( rule__Range__EndAssignment_2 ) )
            // InternalGDSL.g:560:2: ( rule__Range__EndAssignment_2 )
            {
             before(grammarAccess.getRangeAccess().getEndAssignment_2()); 
            // InternalGDSL.g:561:2: ( rule__Range__EndAssignment_2 )
            // InternalGDSL.g:561:3: rule__Range__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Range__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalGDSL.g:570:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:574:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGDSL.g:575:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalGDSL.g:582:1: rule__Rule__Group__0__Impl : ( 'Rule:' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:586:1: ( ( 'Rule:' ) )
            // InternalGDSL.g:587:1: ( 'Rule:' )
            {
            // InternalGDSL.g:587:1: ( 'Rule:' )
            // InternalGDSL.g:588:2: 'Rule:'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalGDSL.g:597:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:601:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGDSL.g:602:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalGDSL.g:609:1: rule__Rule__Group__1__Impl : ( 'if' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:613:1: ( ( 'if' ) )
            // InternalGDSL.g:614:1: ( 'if' )
            {
            // InternalGDSL.g:614:1: ( 'if' )
            // InternalGDSL.g:615:2: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalGDSL.g:624:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:628:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalGDSL.g:629:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalGDSL.g:636:1: rule__Rule__Group__2__Impl : ( 'cell' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:640:1: ( ( 'cell' ) )
            // InternalGDSL.g:641:1: ( 'cell' )
            {
            // InternalGDSL.g:641:1: ( 'cell' )
            // InternalGDSL.g:642:2: 'cell'
            {
             before(grammarAccess.getRuleAccess().getCellKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCellKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalGDSL.g:651:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:655:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalGDSL.g:656:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalGDSL.g:663:1: rule__Rule__Group__3__Impl : ( 'is' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:667:1: ( ( 'is' ) )
            // InternalGDSL.g:668:1: ( 'is' )
            {
            // InternalGDSL.g:668:1: ( 'is' )
            // InternalGDSL.g:669:2: 'is'
            {
             before(grammarAccess.getRuleAccess().getIsKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalGDSL.g:678:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:682:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalGDSL.g:683:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalGDSL.g:690:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__StateAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:694:1: ( ( ( rule__Rule__StateAssignment_4 ) ) )
            // InternalGDSL.g:695:1: ( ( rule__Rule__StateAssignment_4 ) )
            {
            // InternalGDSL.g:695:1: ( ( rule__Rule__StateAssignment_4 ) )
            // InternalGDSL.g:696:2: ( rule__Rule__StateAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getStateAssignment_4()); 
            // InternalGDSL.g:697:2: ( rule__Rule__StateAssignment_4 )
            // InternalGDSL.g:697:3: rule__Rule__StateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__StateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalGDSL.g:705:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:709:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalGDSL.g:710:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalGDSL.g:717:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:721:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // InternalGDSL.g:722:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // InternalGDSL.g:722:1: ( ( rule__Rule__Group_5__0 )? )
            // InternalGDSL.g:723:2: ( rule__Rule__Group_5__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_5()); 
            // InternalGDSL.g:724:2: ( rule__Rule__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGDSL.g:724:3: rule__Rule__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalGDSL.g:732:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:736:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalGDSL.g:737:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalGDSL.g:744:1: rule__Rule__Group__6__Impl : ( 'then' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:748:1: ( ( 'then' ) )
            // InternalGDSL.g:749:1: ( 'then' )
            {
            // InternalGDSL.g:749:1: ( 'then' )
            // InternalGDSL.g:750:2: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getThenKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalGDSL.g:759:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:763:1: ( rule__Rule__Group__7__Impl )
            // InternalGDSL.g:764:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalGDSL.g:770:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__ActionAssignment_7 ) ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:774:1: ( ( ( rule__Rule__ActionAssignment_7 ) ) )
            // InternalGDSL.g:775:1: ( ( rule__Rule__ActionAssignment_7 ) )
            {
            // InternalGDSL.g:775:1: ( ( rule__Rule__ActionAssignment_7 ) )
            // InternalGDSL.g:776:2: ( rule__Rule__ActionAssignment_7 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_7()); 
            // InternalGDSL.g:777:2: ( rule__Rule__ActionAssignment_7 )
            // InternalGDSL.g:777:3: rule__Rule__ActionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group_5__0"
    // InternalGDSL.g:786:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:790:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalGDSL.g:791:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__0"


    // $ANTLR start "rule__Rule__Group_5__0__Impl"
    // InternalGDSL.g:798:1: rule__Rule__Group_5__0__Impl : ( 'and' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:802:1: ( ( 'and' ) )
            // InternalGDSL.g:803:1: ( 'and' )
            {
            // InternalGDSL.g:803:1: ( 'and' )
            // InternalGDSL.g:804:2: 'and'
            {
             before(grammarAccess.getRuleAccess().getAndKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAndKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__0__Impl"


    // $ANTLR start "rule__Rule__Group_5__1"
    // InternalGDSL.g:813:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:817:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // InternalGDSL.g:818:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__1"


    // $ANTLR start "rule__Rule__Group_5__1__Impl"
    // InternalGDSL.g:825:1: rule__Rule__Group_5__1__Impl : ( 'neighbor' ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:829:1: ( ( 'neighbor' ) )
            // InternalGDSL.g:830:1: ( 'neighbor' )
            {
            // InternalGDSL.g:830:1: ( 'neighbor' )
            // InternalGDSL.g:831:2: 'neighbor'
            {
             before(grammarAccess.getRuleAccess().getNeighborKeyword_5_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNeighborKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group_5__2"
    // InternalGDSL.g:840:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:844:1: ( rule__Rule__Group_5__2__Impl )
            // InternalGDSL.g:845:2: rule__Rule__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__2"


    // $ANTLR start "rule__Rule__Group_5__2__Impl"
    // InternalGDSL.g:851:1: rule__Rule__Group_5__2__Impl : ( ( rule__Rule__ConditionAssignment_5_2 ) ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:855:1: ( ( ( rule__Rule__ConditionAssignment_5_2 ) ) )
            // InternalGDSL.g:856:1: ( ( rule__Rule__ConditionAssignment_5_2 ) )
            {
            // InternalGDSL.g:856:1: ( ( rule__Rule__ConditionAssignment_5_2 ) )
            // InternalGDSL.g:857:2: ( rule__Rule__ConditionAssignment_5_2 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_5_2()); 
            // InternalGDSL.g:858:2: ( rule__Rule__ConditionAssignment_5_2 )
            // InternalGDSL.g:858:3: rule__Rule__ConditionAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGDSL.g:867:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:871:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGDSL.g:872:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGDSL.g:879:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__OperatorAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:883:1: ( ( ( rule__Condition__OperatorAssignment_0 ) ) )
            // InternalGDSL.g:884:1: ( ( rule__Condition__OperatorAssignment_0 ) )
            {
            // InternalGDSL.g:884:1: ( ( rule__Condition__OperatorAssignment_0 ) )
            // InternalGDSL.g:885:2: ( rule__Condition__OperatorAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_0()); 
            // InternalGDSL.g:886:2: ( rule__Condition__OperatorAssignment_0 )
            // InternalGDSL.g:886:3: rule__Condition__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGDSL.g:894:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:898:1: ( rule__Condition__Group__1__Impl )
            // InternalGDSL.g:899:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGDSL.g:905:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ValueAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:909:1: ( ( ( rule__Condition__ValueAssignment_1 ) ) )
            // InternalGDSL.g:910:1: ( ( rule__Condition__ValueAssignment_1 ) )
            {
            // InternalGDSL.g:910:1: ( ( rule__Condition__ValueAssignment_1 ) )
            // InternalGDSL.g:911:2: ( rule__Condition__ValueAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_1()); 
            // InternalGDSL.g:912:2: ( rule__Condition__ValueAssignment_1 )
            // InternalGDSL.g:912:3: rule__Condition__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Model__GridAssignment_0"
    // InternalGDSL.g:921:1: rule__Model__GridAssignment_0 : ( ruleGrid ) ;
    public final void rule__Model__GridAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:925:1: ( ( ruleGrid ) )
            // InternalGDSL.g:926:2: ( ruleGrid )
            {
            // InternalGDSL.g:926:2: ( ruleGrid )
            // InternalGDSL.g:927:3: ruleGrid
            {
             before(grammarAccess.getModelAccess().getGridGridParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGridGridParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GridAssignment_0"


    // $ANTLR start "rule__Model__RulesAssignment_1"
    // InternalGDSL.g:936:1: rule__Model__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__Model__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:940:1: ( ( ruleRule ) )
            // InternalGDSL.g:941:2: ( ruleRule )
            {
            // InternalGDSL.g:941:2: ( ruleRule )
            // InternalGDSL.g:942:3: ruleRule
            {
             before(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RulesAssignment_1"


    // $ANTLR start "rule__Grid__RangesAssignment_1"
    // InternalGDSL.g:951:1: rule__Grid__RangesAssignment_1 : ( ruleRange ) ;
    public final void rule__Grid__RangesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:955:1: ( ( ruleRange ) )
            // InternalGDSL.g:956:2: ( ruleRange )
            {
            // InternalGDSL.g:956:2: ( ruleRange )
            // InternalGDSL.g:957:3: ruleRange
            {
             before(grammarAccess.getGridAccess().getRangesRangeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getGridAccess().getRangesRangeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__RangesAssignment_1"


    // $ANTLR start "rule__Grid__RangesAssignment_2_1"
    // InternalGDSL.g:966:1: rule__Grid__RangesAssignment_2_1 : ( ruleRange ) ;
    public final void rule__Grid__RangesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:970:1: ( ( ruleRange ) )
            // InternalGDSL.g:971:2: ( ruleRange )
            {
            // InternalGDSL.g:971:2: ( ruleRange )
            // InternalGDSL.g:972:3: ruleRange
            {
             before(grammarAccess.getGridAccess().getRangesRangeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getGridAccess().getRangesRangeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__RangesAssignment_2_1"


    // $ANTLR start "rule__Range__StartAssignment_0"
    // InternalGDSL.g:981:1: rule__Range__StartAssignment_0 : ( RULE_INT ) ;
    public final void rule__Range__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:985:1: ( ( RULE_INT ) )
            // InternalGDSL.g:986:2: ( RULE_INT )
            {
            // InternalGDSL.g:986:2: ( RULE_INT )
            // InternalGDSL.g:987:3: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getStartINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getStartINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__StartAssignment_0"


    // $ANTLR start "rule__Range__EndAssignment_2"
    // InternalGDSL.g:996:1: rule__Range__EndAssignment_2 : ( RULE_INT ) ;
    public final void rule__Range__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:1000:1: ( ( RULE_INT ) )
            // InternalGDSL.g:1001:2: ( RULE_INT )
            {
            // InternalGDSL.g:1001:2: ( RULE_INT )
            // InternalGDSL.g:1002:3: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getEndINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getEndINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__EndAssignment_2"


    // $ANTLR start "rule__Rule__StateAssignment_4"
    // InternalGDSL.g:1011:1: rule__Rule__StateAssignment_4 : ( ruleCellState ) ;
    public final void rule__Rule__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:1015:1: ( ( ruleCellState ) )
            // InternalGDSL.g:1016:2: ( ruleCellState )
            {
            // InternalGDSL.g:1016:2: ( ruleCellState )
            // InternalGDSL.g:1017:3: ruleCellState
            {
             before(grammarAccess.getRuleAccess().getStateCellStateEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getStateCellStateEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__StateAssignment_4"


    // $ANTLR start "rule__Rule__ConditionAssignment_5_2"
    // InternalGDSL.g:1026:1: rule__Rule__ConditionAssignment_5_2 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:1030:1: ( ( ruleCondition ) )
            // InternalGDSL.g:1031:2: ( ruleCondition )
            {
            // InternalGDSL.g:1031:2: ( ruleCondition )
            // InternalGDSL.g:1032:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_5_2"


    // $ANTLR start "rule__Rule__ActionAssignment_7"
    // InternalGDSL.g:1041:1: rule__Rule__ActionAssignment_7 : ( ruleAction ) ;
    public final void rule__Rule__ActionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:1045:1: ( ( ruleAction ) )
            // InternalGDSL.g:1046:2: ( ruleAction )
            {
            // InternalGDSL.g:1046:2: ( ruleAction )
            // InternalGDSL.g:1047:3: ruleAction
            {
             before(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionAssignment_7"


    // $ANTLR start "rule__Condition__OperatorAssignment_0"
    // InternalGDSL.g:1056:1: rule__Condition__OperatorAssignment_0 : ( ruleRelationalOperator ) ;
    public final void rule__Condition__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:1060:1: ( ( ruleRelationalOperator ) )
            // InternalGDSL.g:1061:2: ( ruleRelationalOperator )
            {
            // InternalGDSL.g:1061:2: ( ruleRelationalOperator )
            // InternalGDSL.g:1062:3: ruleRelationalOperator
            {
             before(grammarAccess.getConditionAccess().getOperatorRelationalOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperatorRelationalOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__OperatorAssignment_0"


    // $ANTLR start "rule__Condition__ValueAssignment_1"
    // InternalGDSL.g:1071:1: rule__Condition__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Condition__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:1075:1: ( ( RULE_INT ) )
            // InternalGDSL.g:1076:2: ( RULE_INT )
            {
            // InternalGDSL.g:1076:2: ( RULE_INT )
            // InternalGDSL.g:1077:3: RULE_INT
            {
             before(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000E000L});

}