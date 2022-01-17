package mosig.asmae.acceleo.ide.contentassist.antlr.internal;

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
import mosig.asmae.acceleo.services.FormGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Questionnaire'", "'Question'", "'[]'", "'()'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFormParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFormParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFormParser.tokenNames; }
    public String getGrammarFileName() { return "InternalForm.g"; }


    	private FormGrammarAccess grammarAccess;

    	public void setGrammarAccess(FormGrammarAccess grammarAccess) {
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
    // InternalForm.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalForm.g:54:1: ( ruleModel EOF )
            // InternalForm.g:55:1: ruleModel EOF
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
    // InternalForm.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalForm.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalForm.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalForm.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalForm.g:69:3: ( rule__Model__Group__0 )
            // InternalForm.g:69:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleQuestion"
    // InternalForm.g:78:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalForm.g:79:1: ( ruleQuestion EOF )
            // InternalForm.g:80:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalForm.g:87:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:91:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalForm.g:92:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalForm.g:92:2: ( ( rule__Question__Group__0 ) )
            // InternalForm.g:93:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalForm.g:94:3: ( rule__Question__Group__0 )
            // InternalForm.g:94:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleKind"
    // InternalForm.g:103:1: entryRuleKind : ruleKind EOF ;
    public final void entryRuleKind() throws RecognitionException {
        try {
            // InternalForm.g:104:1: ( ruleKind EOF )
            // InternalForm.g:105:1: ruleKind EOF
            {
             before(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_1);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getKindRule()); 
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
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // InternalForm.g:112:1: ruleKind : ( ( rule__Kind__Alternatives ) ) ;
    public final void ruleKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:116:2: ( ( ( rule__Kind__Alternatives ) ) )
            // InternalForm.g:117:2: ( ( rule__Kind__Alternatives ) )
            {
            // InternalForm.g:117:2: ( ( rule__Kind__Alternatives ) )
            // InternalForm.g:118:3: ( rule__Kind__Alternatives )
            {
             before(grammarAccess.getKindAccess().getAlternatives()); 
            // InternalForm.g:119:3: ( rule__Kind__Alternatives )
            // InternalForm.g:119:4: rule__Kind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleinput"
    // InternalForm.g:128:1: entryRuleinput : ruleinput EOF ;
    public final void entryRuleinput() throws RecognitionException {
        try {
            // InternalForm.g:129:1: ( ruleinput EOF )
            // InternalForm.g:130:1: ruleinput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleinput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleinput"


    // $ANTLR start "ruleinput"
    // InternalForm.g:137:1: ruleinput : ( ( rule__Input__NameAssignment ) ) ;
    public final void ruleinput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:141:2: ( ( ( rule__Input__NameAssignment ) ) )
            // InternalForm.g:142:2: ( ( rule__Input__NameAssignment ) )
            {
            // InternalForm.g:142:2: ( ( rule__Input__NameAssignment ) )
            // InternalForm.g:143:3: ( rule__Input__NameAssignment )
            {
             before(grammarAccess.getInputAccess().getNameAssignment()); 
            // InternalForm.g:144:3: ( rule__Input__NameAssignment )
            // InternalForm.g:144:4: rule__Input__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Input__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleinput"


    // $ANTLR start "entryRulechoice"
    // InternalForm.g:153:1: entryRulechoice : rulechoice EOF ;
    public final void entryRulechoice() throws RecognitionException {
        try {
            // InternalForm.g:154:1: ( rulechoice EOF )
            // InternalForm.g:155:1: rulechoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            rulechoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
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
    // $ANTLR end "entryRulechoice"


    // $ANTLR start "rulechoice"
    // InternalForm.g:162:1: rulechoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void rulechoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:166:2: ( ( ( rule__Choice__Group__0 ) ) )
            // InternalForm.g:167:2: ( ( rule__Choice__Group__0 ) )
            {
            // InternalForm.g:167:2: ( ( rule__Choice__Group__0 ) )
            // InternalForm.g:168:3: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // InternalForm.g:169:3: ( rule__Choice__Group__0 )
            // InternalForm.g:169:4: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

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
    // $ANTLR end "rulechoice"


    // $ANTLR start "entryRulecheck"
    // InternalForm.g:178:1: entryRulecheck : rulecheck EOF ;
    public final void entryRulecheck() throws RecognitionException {
        try {
            // InternalForm.g:179:1: ( rulecheck EOF )
            // InternalForm.g:180:1: rulecheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            rulecheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
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
    // $ANTLR end "entryRulecheck"


    // $ANTLR start "rulecheck"
    // InternalForm.g:187:1: rulecheck : ( ( rule__Check__Group__0 ) ) ;
    public final void rulecheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:191:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalForm.g:192:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalForm.g:192:2: ( ( rule__Check__Group__0 ) )
            // InternalForm.g:193:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalForm.g:194:3: ( rule__Check__Group__0 )
            // InternalForm.g:194:4: rule__Check__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

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
    // $ANTLR end "rulecheck"


    // $ANTLR start "entryRuleoption"
    // InternalForm.g:203:1: entryRuleoption : ruleoption EOF ;
    public final void entryRuleoption() throws RecognitionException {
        try {
            // InternalForm.g:204:1: ( ruleoption EOF )
            // InternalForm.g:205:1: ruleoption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleoption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
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
    // $ANTLR end "entryRuleoption"


    // $ANTLR start "ruleoption"
    // InternalForm.g:212:1: ruleoption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleoption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:216:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalForm.g:217:2: ( ( rule__Option__Group__0 ) )
            {
            // InternalForm.g:217:2: ( ( rule__Option__Group__0 ) )
            // InternalForm.g:218:3: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalForm.g:219:3: ( rule__Option__Group__0 )
            // InternalForm.g:219:4: rule__Option__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleoption"


    // $ANTLR start "entryRuleradio"
    // InternalForm.g:228:1: entryRuleradio : ruleradio EOF ;
    public final void entryRuleradio() throws RecognitionException {
        try {
            // InternalForm.g:229:1: ( ruleradio EOF )
            // InternalForm.g:230:1: ruleradio EOF
            {
             before(grammarAccess.getRadioRule()); 
            pushFollow(FOLLOW_1);
            ruleradio();

            state._fsp--;

             after(grammarAccess.getRadioRule()); 
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
    // $ANTLR end "entryRuleradio"


    // $ANTLR start "ruleradio"
    // InternalForm.g:237:1: ruleradio : ( ( rule__Radio__Group__0 ) ) ;
    public final void ruleradio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:241:2: ( ( ( rule__Radio__Group__0 ) ) )
            // InternalForm.g:242:2: ( ( rule__Radio__Group__0 ) )
            {
            // InternalForm.g:242:2: ( ( rule__Radio__Group__0 ) )
            // InternalForm.g:243:3: ( rule__Radio__Group__0 )
            {
             before(grammarAccess.getRadioAccess().getGroup()); 
            // InternalForm.g:244:3: ( rule__Radio__Group__0 )
            // InternalForm.g:244:4: rule__Radio__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Radio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadioAccess().getGroup()); 

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
    // $ANTLR end "ruleradio"


    // $ANTLR start "rule__Kind__Alternatives"
    // InternalForm.g:252:1: rule__Kind__Alternatives : ( ( ruleinput ) | ( rulechoice ) | ( ruleoption ) );
    public final void rule__Kind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:256:1: ( ( ruleinput ) | ( rulechoice ) | ( ruleoption ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                    {
                    alt1=3;
                    }
                    break;
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalForm.g:257:2: ( ruleinput )
                    {
                    // InternalForm.g:257:2: ( ruleinput )
                    // InternalForm.g:258:3: ruleinput
                    {
                     before(grammarAccess.getKindAccess().getInputParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleinput();

                    state._fsp--;

                     after(grammarAccess.getKindAccess().getInputParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalForm.g:263:2: ( rulechoice )
                    {
                    // InternalForm.g:263:2: ( rulechoice )
                    // InternalForm.g:264:3: rulechoice
                    {
                     before(grammarAccess.getKindAccess().getChoiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulechoice();

                    state._fsp--;

                     after(grammarAccess.getKindAccess().getChoiceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalForm.g:269:2: ( ruleoption )
                    {
                    // InternalForm.g:269:2: ( ruleoption )
                    // InternalForm.g:270:3: ruleoption
                    {
                     before(grammarAccess.getKindAccess().getOptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleoption();

                    state._fsp--;

                     after(grammarAccess.getKindAccess().getOptionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Kind__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalForm.g:279:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:283:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalForm.g:284:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalForm.g:291:1: rule__Model__Group__0__Impl : ( 'Questionnaire' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:295:1: ( ( 'Questionnaire' ) )
            // InternalForm.g:296:1: ( 'Questionnaire' )
            {
            // InternalForm.g:296:1: ( 'Questionnaire' )
            // InternalForm.g:297:2: 'Questionnaire'
            {
             before(grammarAccess.getModelAccess().getQuestionnaireKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getQuestionnaireKeyword_0()); 

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
    // InternalForm.g:306:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:310:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalForm.g:311:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // InternalForm.g:318:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:322:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalForm.g:323:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalForm.g:323:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalForm.g:324:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalForm.g:325:2: ( rule__Model__NameAssignment_1 )
            // InternalForm.g:325:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Model__Group__2"
    // InternalForm.g:333:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:337:1: ( rule__Model__Group__2__Impl )
            // InternalForm.g:338:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalForm.g:344:1: rule__Model__Group__2__Impl : ( ( rule__Model__LesQuestionsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:348:1: ( ( ( rule__Model__LesQuestionsAssignment_2 )* ) )
            // InternalForm.g:349:1: ( ( rule__Model__LesQuestionsAssignment_2 )* )
            {
            // InternalForm.g:349:1: ( ( rule__Model__LesQuestionsAssignment_2 )* )
            // InternalForm.g:350:2: ( rule__Model__LesQuestionsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getLesQuestionsAssignment_2()); 
            // InternalForm.g:351:2: ( rule__Model__LesQuestionsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalForm.g:351:3: rule__Model__LesQuestionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__LesQuestionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLesQuestionsAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalForm.g:360:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:364:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalForm.g:365:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

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
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalForm.g:372:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:376:1: ( ( 'Question' ) )
            // InternalForm.g:377:1: ( 'Question' )
            {
            // InternalForm.g:377:1: ( 'Question' )
            // InternalForm.g:378:2: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

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
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalForm.g:387:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:391:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalForm.g:392:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

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
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalForm.g:399:1: rule__Question__Group__1__Impl : ( ( rule__Question__LabelAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:403:1: ( ( ( rule__Question__LabelAssignment_1 ) ) )
            // InternalForm.g:404:1: ( ( rule__Question__LabelAssignment_1 ) )
            {
            // InternalForm.g:404:1: ( ( rule__Question__LabelAssignment_1 ) )
            // InternalForm.g:405:2: ( rule__Question__LabelAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getLabelAssignment_1()); 
            // InternalForm.g:406:2: ( rule__Question__LabelAssignment_1 )
            // InternalForm.g:406:3: rule__Question__LabelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getLabelAssignment_1()); 

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
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalForm.g:414:1: rule__Question__Group__2 : rule__Question__Group__2__Impl ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:418:1: ( rule__Question__Group__2__Impl )
            // InternalForm.g:419:2: rule__Question__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__2__Impl();

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
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalForm.g:425:1: rule__Question__Group__2__Impl : ( ( rule__Question__KindOfAssignment_2 ) ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:429:1: ( ( ( rule__Question__KindOfAssignment_2 ) ) )
            // InternalForm.g:430:1: ( ( rule__Question__KindOfAssignment_2 ) )
            {
            // InternalForm.g:430:1: ( ( rule__Question__KindOfAssignment_2 ) )
            // InternalForm.g:431:2: ( rule__Question__KindOfAssignment_2 )
            {
             before(grammarAccess.getQuestionAccess().getKindOfAssignment_2()); 
            // InternalForm.g:432:2: ( rule__Question__KindOfAssignment_2 )
            // InternalForm.g:432:3: rule__Question__KindOfAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Question__KindOfAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getKindOfAssignment_2()); 

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
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // InternalForm.g:441:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:445:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalForm.g:446:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__1();

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
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // InternalForm.g:453:1: rule__Choice__Group__0__Impl : ( ( rule__Choice__NameAssignment_0 ) ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:457:1: ( ( ( rule__Choice__NameAssignment_0 ) ) )
            // InternalForm.g:458:1: ( ( rule__Choice__NameAssignment_0 ) )
            {
            // InternalForm.g:458:1: ( ( rule__Choice__NameAssignment_0 ) )
            // InternalForm.g:459:2: ( rule__Choice__NameAssignment_0 )
            {
             before(grammarAccess.getChoiceAccess().getNameAssignment_0()); 
            // InternalForm.g:460:2: ( rule__Choice__NameAssignment_0 )
            // InternalForm.g:460:3: rule__Choice__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Choice__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // InternalForm.g:468:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:472:1: ( rule__Choice__Group__1__Impl )
            // InternalForm.g:473:2: rule__Choice__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__1__Impl();

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
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // InternalForm.g:479:1: rule__Choice__Group__1__Impl : ( ( ( rule__Choice__LesChoixAssignment_1 ) ) ( ( rule__Choice__LesChoixAssignment_1 )* ) ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:483:1: ( ( ( ( rule__Choice__LesChoixAssignment_1 ) ) ( ( rule__Choice__LesChoixAssignment_1 )* ) ) )
            // InternalForm.g:484:1: ( ( ( rule__Choice__LesChoixAssignment_1 ) ) ( ( rule__Choice__LesChoixAssignment_1 )* ) )
            {
            // InternalForm.g:484:1: ( ( ( rule__Choice__LesChoixAssignment_1 ) ) ( ( rule__Choice__LesChoixAssignment_1 )* ) )
            // InternalForm.g:485:2: ( ( rule__Choice__LesChoixAssignment_1 ) ) ( ( rule__Choice__LesChoixAssignment_1 )* )
            {
            // InternalForm.g:485:2: ( ( rule__Choice__LesChoixAssignment_1 ) )
            // InternalForm.g:486:3: ( rule__Choice__LesChoixAssignment_1 )
            {
             before(grammarAccess.getChoiceAccess().getLesChoixAssignment_1()); 
            // InternalForm.g:487:3: ( rule__Choice__LesChoixAssignment_1 )
            // InternalForm.g:487:4: rule__Choice__LesChoixAssignment_1
            {
            pushFollow(FOLLOW_8);
            rule__Choice__LesChoixAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getLesChoixAssignment_1()); 

            }

            // InternalForm.g:490:2: ( ( rule__Choice__LesChoixAssignment_1 )* )
            // InternalForm.g:491:3: ( rule__Choice__LesChoixAssignment_1 )*
            {
             before(grammarAccess.getChoiceAccess().getLesChoixAssignment_1()); 
            // InternalForm.g:492:3: ( rule__Choice__LesChoixAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalForm.g:492:4: rule__Choice__LesChoixAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Choice__LesChoixAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getChoiceAccess().getLesChoixAssignment_1()); 

            }


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
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // InternalForm.g:502:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:506:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalForm.g:507:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__1();

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
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // InternalForm.g:514:1: rule__Check__Group__0__Impl : ( '[]' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:518:1: ( ( '[]' ) )
            // InternalForm.g:519:1: ( '[]' )
            {
            // InternalForm.g:519:1: ( '[]' )
            // InternalForm.g:520:2: '[]'
            {
             before(grammarAccess.getCheckAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // InternalForm.g:529:1: rule__Check__Group__1 : rule__Check__Group__1__Impl rule__Check__Group__2 ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:533:1: ( rule__Check__Group__1__Impl rule__Check__Group__2 )
            // InternalForm.g:534:2: rule__Check__Group__1__Impl rule__Check__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Check__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__2();

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
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // InternalForm.g:541:1: rule__Check__Group__1__Impl : ( ( rule__Check__LabelAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:545:1: ( ( ( rule__Check__LabelAssignment_1 ) ) )
            // InternalForm.g:546:1: ( ( rule__Check__LabelAssignment_1 ) )
            {
            // InternalForm.g:546:1: ( ( rule__Check__LabelAssignment_1 ) )
            // InternalForm.g:547:2: ( rule__Check__LabelAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getLabelAssignment_1()); 
            // InternalForm.g:548:2: ( rule__Check__LabelAssignment_1 )
            // InternalForm.g:548:3: rule__Check__LabelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getLabelAssignment_1()); 

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
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__Check__Group__2"
    // InternalForm.g:556:1: rule__Check__Group__2 : rule__Check__Group__2__Impl ;
    public final void rule__Check__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:560:1: ( rule__Check__Group__2__Impl )
            // InternalForm.g:561:2: rule__Check__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__2__Impl();

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
    // $ANTLR end "rule__Check__Group__2"


    // $ANTLR start "rule__Check__Group__2__Impl"
    // InternalForm.g:567:1: rule__Check__Group__2__Impl : ( ( rule__Check__NameAssignment_2 ) ) ;
    public final void rule__Check__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:571:1: ( ( ( rule__Check__NameAssignment_2 ) ) )
            // InternalForm.g:572:1: ( ( rule__Check__NameAssignment_2 ) )
            {
            // InternalForm.g:572:1: ( ( rule__Check__NameAssignment_2 ) )
            // InternalForm.g:573:2: ( rule__Check__NameAssignment_2 )
            {
             before(grammarAccess.getCheckAccess().getNameAssignment_2()); 
            // InternalForm.g:574:2: ( rule__Check__NameAssignment_2 )
            // InternalForm.g:574:3: rule__Check__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Check__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Check__Group__2__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // InternalForm.g:583:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:587:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalForm.g:588:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__1();

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
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // InternalForm.g:595:1: rule__Option__Group__0__Impl : ( ( rule__Option__NameAssignment_0 ) ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:599:1: ( ( ( rule__Option__NameAssignment_0 ) ) )
            // InternalForm.g:600:1: ( ( rule__Option__NameAssignment_0 ) )
            {
            // InternalForm.g:600:1: ( ( rule__Option__NameAssignment_0 ) )
            // InternalForm.g:601:2: ( rule__Option__NameAssignment_0 )
            {
             before(grammarAccess.getOptionAccess().getNameAssignment_0()); 
            // InternalForm.g:602:2: ( rule__Option__NameAssignment_0 )
            // InternalForm.g:602:3: rule__Option__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Option__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // InternalForm.g:610:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:614:1: ( rule__Option__Group__1__Impl )
            // InternalForm.g:615:2: rule__Option__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__1__Impl();

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
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // InternalForm.g:621:1: rule__Option__Group__1__Impl : ( ( ( rule__Option__LesOptionsAssignment_1 ) ) ( ( rule__Option__LesOptionsAssignment_1 )* ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:625:1: ( ( ( ( rule__Option__LesOptionsAssignment_1 ) ) ( ( rule__Option__LesOptionsAssignment_1 )* ) ) )
            // InternalForm.g:626:1: ( ( ( rule__Option__LesOptionsAssignment_1 ) ) ( ( rule__Option__LesOptionsAssignment_1 )* ) )
            {
            // InternalForm.g:626:1: ( ( ( rule__Option__LesOptionsAssignment_1 ) ) ( ( rule__Option__LesOptionsAssignment_1 )* ) )
            // InternalForm.g:627:2: ( ( rule__Option__LesOptionsAssignment_1 ) ) ( ( rule__Option__LesOptionsAssignment_1 )* )
            {
            // InternalForm.g:627:2: ( ( rule__Option__LesOptionsAssignment_1 ) )
            // InternalForm.g:628:3: ( rule__Option__LesOptionsAssignment_1 )
            {
             before(grammarAccess.getOptionAccess().getLesOptionsAssignment_1()); 
            // InternalForm.g:629:3: ( rule__Option__LesOptionsAssignment_1 )
            // InternalForm.g:629:4: rule__Option__LesOptionsAssignment_1
            {
            pushFollow(FOLLOW_10);
            rule__Option__LesOptionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getLesOptionsAssignment_1()); 

            }

            // InternalForm.g:632:2: ( ( rule__Option__LesOptionsAssignment_1 )* )
            // InternalForm.g:633:3: ( rule__Option__LesOptionsAssignment_1 )*
            {
             before(grammarAccess.getOptionAccess().getLesOptionsAssignment_1()); 
            // InternalForm.g:634:3: ( rule__Option__LesOptionsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalForm.g:634:4: rule__Option__LesOptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Option__LesOptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getOptionAccess().getLesOptionsAssignment_1()); 

            }


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
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Radio__Group__0"
    // InternalForm.g:644:1: rule__Radio__Group__0 : rule__Radio__Group__0__Impl rule__Radio__Group__1 ;
    public final void rule__Radio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:648:1: ( rule__Radio__Group__0__Impl rule__Radio__Group__1 )
            // InternalForm.g:649:2: rule__Radio__Group__0__Impl rule__Radio__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Radio__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radio__Group__1();

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
    // $ANTLR end "rule__Radio__Group__0"


    // $ANTLR start "rule__Radio__Group__0__Impl"
    // InternalForm.g:656:1: rule__Radio__Group__0__Impl : ( '()' ) ;
    public final void rule__Radio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:660:1: ( ( '()' ) )
            // InternalForm.g:661:1: ( '()' )
            {
            // InternalForm.g:661:1: ( '()' )
            // InternalForm.g:662:2: '()'
            {
             before(grammarAccess.getRadioAccess().getLeftParenthesisRightParenthesisKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRadioAccess().getLeftParenthesisRightParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Radio__Group__0__Impl"


    // $ANTLR start "rule__Radio__Group__1"
    // InternalForm.g:671:1: rule__Radio__Group__1 : rule__Radio__Group__1__Impl rule__Radio__Group__2 ;
    public final void rule__Radio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:675:1: ( rule__Radio__Group__1__Impl rule__Radio__Group__2 )
            // InternalForm.g:676:2: rule__Radio__Group__1__Impl rule__Radio__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Radio__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radio__Group__2();

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
    // $ANTLR end "rule__Radio__Group__1"


    // $ANTLR start "rule__Radio__Group__1__Impl"
    // InternalForm.g:683:1: rule__Radio__Group__1__Impl : ( ( rule__Radio__LabelAssignment_1 ) ) ;
    public final void rule__Radio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:687:1: ( ( ( rule__Radio__LabelAssignment_1 ) ) )
            // InternalForm.g:688:1: ( ( rule__Radio__LabelAssignment_1 ) )
            {
            // InternalForm.g:688:1: ( ( rule__Radio__LabelAssignment_1 ) )
            // InternalForm.g:689:2: ( rule__Radio__LabelAssignment_1 )
            {
             before(grammarAccess.getRadioAccess().getLabelAssignment_1()); 
            // InternalForm.g:690:2: ( rule__Radio__LabelAssignment_1 )
            // InternalForm.g:690:3: rule__Radio__LabelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Radio__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRadioAccess().getLabelAssignment_1()); 

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
    // $ANTLR end "rule__Radio__Group__1__Impl"


    // $ANTLR start "rule__Radio__Group__2"
    // InternalForm.g:698:1: rule__Radio__Group__2 : rule__Radio__Group__2__Impl ;
    public final void rule__Radio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:702:1: ( rule__Radio__Group__2__Impl )
            // InternalForm.g:703:2: rule__Radio__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Radio__Group__2__Impl();

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
    // $ANTLR end "rule__Radio__Group__2"


    // $ANTLR start "rule__Radio__Group__2__Impl"
    // InternalForm.g:709:1: rule__Radio__Group__2__Impl : ( ( rule__Radio__NameAssignment_2 ) ) ;
    public final void rule__Radio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:713:1: ( ( ( rule__Radio__NameAssignment_2 ) ) )
            // InternalForm.g:714:1: ( ( rule__Radio__NameAssignment_2 ) )
            {
            // InternalForm.g:714:1: ( ( rule__Radio__NameAssignment_2 ) )
            // InternalForm.g:715:2: ( rule__Radio__NameAssignment_2 )
            {
             before(grammarAccess.getRadioAccess().getNameAssignment_2()); 
            // InternalForm.g:716:2: ( rule__Radio__NameAssignment_2 )
            // InternalForm.g:716:3: rule__Radio__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Radio__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRadioAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Radio__Group__2__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalForm.g:725:1: rule__Model__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:729:1: ( ( RULE_STRING ) )
            // InternalForm.g:730:2: ( RULE_STRING )
            {
            // InternalForm.g:730:2: ( RULE_STRING )
            // InternalForm.g:731:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__LesQuestionsAssignment_2"
    // InternalForm.g:740:1: rule__Model__LesQuestionsAssignment_2 : ( ruleQuestion ) ;
    public final void rule__Model__LesQuestionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:744:1: ( ( ruleQuestion ) )
            // InternalForm.g:745:2: ( ruleQuestion )
            {
            // InternalForm.g:745:2: ( ruleQuestion )
            // InternalForm.g:746:3: ruleQuestion
            {
             before(grammarAccess.getModelAccess().getLesQuestionsQuestionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLesQuestionsQuestionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__LesQuestionsAssignment_2"


    // $ANTLR start "rule__Question__LabelAssignment_1"
    // InternalForm.g:755:1: rule__Question__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Question__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:759:1: ( ( RULE_STRING ) )
            // InternalForm.g:760:2: ( RULE_STRING )
            {
            // InternalForm.g:760:2: ( RULE_STRING )
            // InternalForm.g:761:3: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLabelSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Question__LabelAssignment_1"


    // $ANTLR start "rule__Question__KindOfAssignment_2"
    // InternalForm.g:770:1: rule__Question__KindOfAssignment_2 : ( ruleKind ) ;
    public final void rule__Question__KindOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:774:1: ( ( ruleKind ) )
            // InternalForm.g:775:2: ( ruleKind )
            {
            // InternalForm.g:775:2: ( ruleKind )
            // InternalForm.g:776:3: ruleKind
            {
             before(grammarAccess.getQuestionAccess().getKindOfKindParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getKindOfKindParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Question__KindOfAssignment_2"


    // $ANTLR start "rule__Input__NameAssignment"
    // InternalForm.g:785:1: rule__Input__NameAssignment : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:789:1: ( ( RULE_ID ) )
            // InternalForm.g:790:2: ( RULE_ID )
            {
            // InternalForm.g:790:2: ( RULE_ID )
            // InternalForm.g:791:3: RULE_ID
            {
             before(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Input__NameAssignment"


    // $ANTLR start "rule__Choice__NameAssignment_0"
    // InternalForm.g:800:1: rule__Choice__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Choice__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:804:1: ( ( RULE_ID ) )
            // InternalForm.g:805:2: ( RULE_ID )
            {
            // InternalForm.g:805:2: ( RULE_ID )
            // InternalForm.g:806:3: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Choice__NameAssignment_0"


    // $ANTLR start "rule__Choice__LesChoixAssignment_1"
    // InternalForm.g:815:1: rule__Choice__LesChoixAssignment_1 : ( rulecheck ) ;
    public final void rule__Choice__LesChoixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:819:1: ( ( rulecheck ) )
            // InternalForm.g:820:2: ( rulecheck )
            {
            // InternalForm.g:820:2: ( rulecheck )
            // InternalForm.g:821:3: rulecheck
            {
             before(grammarAccess.getChoiceAccess().getLesChoixCheckParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulecheck();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getLesChoixCheckParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Choice__LesChoixAssignment_1"


    // $ANTLR start "rule__Check__LabelAssignment_1"
    // InternalForm.g:830:1: rule__Check__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Check__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:834:1: ( ( RULE_STRING ) )
            // InternalForm.g:835:2: ( RULE_STRING )
            {
            // InternalForm.g:835:2: ( RULE_STRING )
            // InternalForm.g:836:3: RULE_STRING
            {
             before(grammarAccess.getCheckAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getLabelSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Check__LabelAssignment_1"


    // $ANTLR start "rule__Check__NameAssignment_2"
    // InternalForm.g:845:1: rule__Check__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Check__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:849:1: ( ( RULE_ID ) )
            // InternalForm.g:850:2: ( RULE_ID )
            {
            // InternalForm.g:850:2: ( RULE_ID )
            // InternalForm.g:851:3: RULE_ID
            {
             before(grammarAccess.getCheckAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Check__NameAssignment_2"


    // $ANTLR start "rule__Option__NameAssignment_0"
    // InternalForm.g:860:1: rule__Option__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Option__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:864:1: ( ( RULE_ID ) )
            // InternalForm.g:865:2: ( RULE_ID )
            {
            // InternalForm.g:865:2: ( RULE_ID )
            // InternalForm.g:866:3: RULE_ID
            {
             before(grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Option__NameAssignment_0"


    // $ANTLR start "rule__Option__LesOptionsAssignment_1"
    // InternalForm.g:875:1: rule__Option__LesOptionsAssignment_1 : ( ruleradio ) ;
    public final void rule__Option__LesOptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:879:1: ( ( ruleradio ) )
            // InternalForm.g:880:2: ( ruleradio )
            {
            // InternalForm.g:880:2: ( ruleradio )
            // InternalForm.g:881:3: ruleradio
            {
             before(grammarAccess.getOptionAccess().getLesOptionsRadioParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleradio();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getLesOptionsRadioParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Option__LesOptionsAssignment_1"


    // $ANTLR start "rule__Radio__LabelAssignment_1"
    // InternalForm.g:890:1: rule__Radio__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Radio__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:894:1: ( ( RULE_STRING ) )
            // InternalForm.g:895:2: ( RULE_STRING )
            {
            // InternalForm.g:895:2: ( RULE_STRING )
            // InternalForm.g:896:3: RULE_STRING
            {
             before(grammarAccess.getRadioAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRadioAccess().getLabelSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Radio__LabelAssignment_1"


    // $ANTLR start "rule__Radio__NameAssignment_2"
    // InternalForm.g:905:1: rule__Radio__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Radio__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalForm.g:909:1: ( ( RULE_ID ) )
            // InternalForm.g:910:2: ( RULE_ID )
            {
            // InternalForm.g:910:2: ( RULE_ID )
            // InternalForm.g:911:3: RULE_ID
            {
             before(grammarAccess.getRadioAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRadioAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Radio__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});

}