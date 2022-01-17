package org.mosig.lab4.myfamily.ide.contentassist.antlr.internal;

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
import org.mosig.lab4.myfamily.services.FamilyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFamilyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Family'", "'{'", "'}'", "'Father'", "'Mother'", "'Sons'", "'Daughters'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFamilyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFamilyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFamilyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFamily.g"; }


    	private FamilyGrammarAccess grammarAccess;

    	public void setGrammarAccess(FamilyGrammarAccess grammarAccess) {
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
    // InternalFamily.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalFamily.g:54:1: ( ruleModel EOF )
            // InternalFamily.g:55:1: ruleModel EOF
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
    // InternalFamily.g:62:1: ruleModel : ( ( rule__Model__FamiliesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:66:2: ( ( ( rule__Model__FamiliesAssignment )* ) )
            // InternalFamily.g:67:2: ( ( rule__Model__FamiliesAssignment )* )
            {
            // InternalFamily.g:67:2: ( ( rule__Model__FamiliesAssignment )* )
            // InternalFamily.g:68:3: ( rule__Model__FamiliesAssignment )*
            {
             before(grammarAccess.getModelAccess().getFamiliesAssignment()); 
            // InternalFamily.g:69:3: ( rule__Model__FamiliesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFamily.g:69:4: rule__Model__FamiliesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__FamiliesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFamiliesAssignment()); 

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


    // $ANTLR start "entryRuleFamily"
    // InternalFamily.g:78:1: entryRuleFamily : ruleFamily EOF ;
    public final void entryRuleFamily() throws RecognitionException {
        try {
            // InternalFamily.g:79:1: ( ruleFamily EOF )
            // InternalFamily.g:80:1: ruleFamily EOF
            {
             before(grammarAccess.getFamilyRule()); 
            pushFollow(FOLLOW_1);
            ruleFamily();

            state._fsp--;

             after(grammarAccess.getFamilyRule()); 
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
    // $ANTLR end "entryRuleFamily"


    // $ANTLR start "ruleFamily"
    // InternalFamily.g:87:1: ruleFamily : ( ( rule__Family__Group__0 ) ) ;
    public final void ruleFamily() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:91:2: ( ( ( rule__Family__Group__0 ) ) )
            // InternalFamily.g:92:2: ( ( rule__Family__Group__0 ) )
            {
            // InternalFamily.g:92:2: ( ( rule__Family__Group__0 ) )
            // InternalFamily.g:93:3: ( rule__Family__Group__0 )
            {
             before(grammarAccess.getFamilyAccess().getGroup()); 
            // InternalFamily.g:94:3: ( rule__Family__Group__0 )
            // InternalFamily.g:94:4: rule__Family__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Family__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFamilyAccess().getGroup()); 

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
    // $ANTLR end "ruleFamily"


    // $ANTLR start "entryRuleMember"
    // InternalFamily.g:103:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalFamily.g:104:1: ( ruleMember EOF )
            // InternalFamily.g:105:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalFamily.g:112:1: ruleMember : ( ( rule__Member__NameAssignment ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:116:2: ( ( ( rule__Member__NameAssignment ) ) )
            // InternalFamily.g:117:2: ( ( rule__Member__NameAssignment ) )
            {
            // InternalFamily.g:117:2: ( ( rule__Member__NameAssignment ) )
            // InternalFamily.g:118:3: ( rule__Member__NameAssignment )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment()); 
            // InternalFamily.g:119:3: ( rule__Member__NameAssignment )
            // InternalFamily.g:119:4: rule__Member__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Member__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "rule__Family__Group__0"
    // InternalFamily.g:127:1: rule__Family__Group__0 : rule__Family__Group__0__Impl rule__Family__Group__1 ;
    public final void rule__Family__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:131:1: ( rule__Family__Group__0__Impl rule__Family__Group__1 )
            // InternalFamily.g:132:2: rule__Family__Group__0__Impl rule__Family__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Family__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__1();

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
    // $ANTLR end "rule__Family__Group__0"


    // $ANTLR start "rule__Family__Group__0__Impl"
    // InternalFamily.g:139:1: rule__Family__Group__0__Impl : ( 'Family' ) ;
    public final void rule__Family__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:143:1: ( ( 'Family' ) )
            // InternalFamily.g:144:1: ( 'Family' )
            {
            // InternalFamily.g:144:1: ( 'Family' )
            // InternalFamily.g:145:2: 'Family'
            {
             before(grammarAccess.getFamilyAccess().getFamilyKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getFamilyKeyword_0()); 

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
    // $ANTLR end "rule__Family__Group__0__Impl"


    // $ANTLR start "rule__Family__Group__1"
    // InternalFamily.g:154:1: rule__Family__Group__1 : rule__Family__Group__1__Impl rule__Family__Group__2 ;
    public final void rule__Family__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:158:1: ( rule__Family__Group__1__Impl rule__Family__Group__2 )
            // InternalFamily.g:159:2: rule__Family__Group__1__Impl rule__Family__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Family__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__2();

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
    // $ANTLR end "rule__Family__Group__1"


    // $ANTLR start "rule__Family__Group__1__Impl"
    // InternalFamily.g:166:1: rule__Family__Group__1__Impl : ( ( rule__Family__SurnameAssignment_1 ) ) ;
    public final void rule__Family__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:170:1: ( ( ( rule__Family__SurnameAssignment_1 ) ) )
            // InternalFamily.g:171:1: ( ( rule__Family__SurnameAssignment_1 ) )
            {
            // InternalFamily.g:171:1: ( ( rule__Family__SurnameAssignment_1 ) )
            // InternalFamily.g:172:2: ( rule__Family__SurnameAssignment_1 )
            {
             before(grammarAccess.getFamilyAccess().getSurnameAssignment_1()); 
            // InternalFamily.g:173:2: ( rule__Family__SurnameAssignment_1 )
            // InternalFamily.g:173:3: rule__Family__SurnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Family__SurnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFamilyAccess().getSurnameAssignment_1()); 

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
    // $ANTLR end "rule__Family__Group__1__Impl"


    // $ANTLR start "rule__Family__Group__2"
    // InternalFamily.g:181:1: rule__Family__Group__2 : rule__Family__Group__2__Impl rule__Family__Group__3 ;
    public final void rule__Family__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:185:1: ( rule__Family__Group__2__Impl rule__Family__Group__3 )
            // InternalFamily.g:186:2: rule__Family__Group__2__Impl rule__Family__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Family__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__3();

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
    // $ANTLR end "rule__Family__Group__2"


    // $ANTLR start "rule__Family__Group__2__Impl"
    // InternalFamily.g:193:1: rule__Family__Group__2__Impl : ( '{' ) ;
    public final void rule__Family__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:197:1: ( ( '{' ) )
            // InternalFamily.g:198:1: ( '{' )
            {
            // InternalFamily.g:198:1: ( '{' )
            // InternalFamily.g:199:2: '{'
            {
             before(grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Family__Group__2__Impl"


    // $ANTLR start "rule__Family__Group__3"
    // InternalFamily.g:208:1: rule__Family__Group__3 : rule__Family__Group__3__Impl rule__Family__Group__4 ;
    public final void rule__Family__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:212:1: ( rule__Family__Group__3__Impl rule__Family__Group__4 )
            // InternalFamily.g:213:2: rule__Family__Group__3__Impl rule__Family__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Family__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__4();

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
    // $ANTLR end "rule__Family__Group__3"


    // $ANTLR start "rule__Family__Group__3__Impl"
    // InternalFamily.g:220:1: rule__Family__Group__3__Impl : ( ( rule__Family__Group_3__0 )? ) ;
    public final void rule__Family__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:224:1: ( ( ( rule__Family__Group_3__0 )? ) )
            // InternalFamily.g:225:1: ( ( rule__Family__Group_3__0 )? )
            {
            // InternalFamily.g:225:1: ( ( rule__Family__Group_3__0 )? )
            // InternalFamily.g:226:2: ( rule__Family__Group_3__0 )?
            {
             before(grammarAccess.getFamilyAccess().getGroup_3()); 
            // InternalFamily.g:227:2: ( rule__Family__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFamily.g:227:3: rule__Family__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Family__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFamilyAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Family__Group__3__Impl"


    // $ANTLR start "rule__Family__Group__4"
    // InternalFamily.g:235:1: rule__Family__Group__4 : rule__Family__Group__4__Impl rule__Family__Group__5 ;
    public final void rule__Family__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:239:1: ( rule__Family__Group__4__Impl rule__Family__Group__5 )
            // InternalFamily.g:240:2: rule__Family__Group__4__Impl rule__Family__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Family__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__5();

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
    // $ANTLR end "rule__Family__Group__4"


    // $ANTLR start "rule__Family__Group__4__Impl"
    // InternalFamily.g:247:1: rule__Family__Group__4__Impl : ( ( rule__Family__Group_4__0 )? ) ;
    public final void rule__Family__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:251:1: ( ( ( rule__Family__Group_4__0 )? ) )
            // InternalFamily.g:252:1: ( ( rule__Family__Group_4__0 )? )
            {
            // InternalFamily.g:252:1: ( ( rule__Family__Group_4__0 )? )
            // InternalFamily.g:253:2: ( rule__Family__Group_4__0 )?
            {
             before(grammarAccess.getFamilyAccess().getGroup_4()); 
            // InternalFamily.g:254:2: ( rule__Family__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFamily.g:254:3: rule__Family__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Family__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFamilyAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Family__Group__4__Impl"


    // $ANTLR start "rule__Family__Group__5"
    // InternalFamily.g:262:1: rule__Family__Group__5 : rule__Family__Group__5__Impl rule__Family__Group__6 ;
    public final void rule__Family__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:266:1: ( rule__Family__Group__5__Impl rule__Family__Group__6 )
            // InternalFamily.g:267:2: rule__Family__Group__5__Impl rule__Family__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Family__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__6();

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
    // $ANTLR end "rule__Family__Group__5"


    // $ANTLR start "rule__Family__Group__5__Impl"
    // InternalFamily.g:274:1: rule__Family__Group__5__Impl : ( ( rule__Family__Group_5__0 )? ) ;
    public final void rule__Family__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:278:1: ( ( ( rule__Family__Group_5__0 )? ) )
            // InternalFamily.g:279:1: ( ( rule__Family__Group_5__0 )? )
            {
            // InternalFamily.g:279:1: ( ( rule__Family__Group_5__0 )? )
            // InternalFamily.g:280:2: ( rule__Family__Group_5__0 )?
            {
             before(grammarAccess.getFamilyAccess().getGroup_5()); 
            // InternalFamily.g:281:2: ( rule__Family__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFamily.g:281:3: rule__Family__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Family__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFamilyAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Family__Group__5__Impl"


    // $ANTLR start "rule__Family__Group__6"
    // InternalFamily.g:289:1: rule__Family__Group__6 : rule__Family__Group__6__Impl rule__Family__Group__7 ;
    public final void rule__Family__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:293:1: ( rule__Family__Group__6__Impl rule__Family__Group__7 )
            // InternalFamily.g:294:2: rule__Family__Group__6__Impl rule__Family__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Family__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__7();

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
    // $ANTLR end "rule__Family__Group__6"


    // $ANTLR start "rule__Family__Group__6__Impl"
    // InternalFamily.g:301:1: rule__Family__Group__6__Impl : ( ( rule__Family__Group_6__0 )? ) ;
    public final void rule__Family__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:305:1: ( ( ( rule__Family__Group_6__0 )? ) )
            // InternalFamily.g:306:1: ( ( rule__Family__Group_6__0 )? )
            {
            // InternalFamily.g:306:1: ( ( rule__Family__Group_6__0 )? )
            // InternalFamily.g:307:2: ( rule__Family__Group_6__0 )?
            {
             before(grammarAccess.getFamilyAccess().getGroup_6()); 
            // InternalFamily.g:308:2: ( rule__Family__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFamily.g:308:3: rule__Family__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Family__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFamilyAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Family__Group__6__Impl"


    // $ANTLR start "rule__Family__Group__7"
    // InternalFamily.g:316:1: rule__Family__Group__7 : rule__Family__Group__7__Impl ;
    public final void rule__Family__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:320:1: ( rule__Family__Group__7__Impl )
            // InternalFamily.g:321:2: rule__Family__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Family__Group__7__Impl();

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
    // $ANTLR end "rule__Family__Group__7"


    // $ANTLR start "rule__Family__Group__7__Impl"
    // InternalFamily.g:327:1: rule__Family__Group__7__Impl : ( '}' ) ;
    public final void rule__Family__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:331:1: ( ( '}' ) )
            // InternalFamily.g:332:1: ( '}' )
            {
            // InternalFamily.g:332:1: ( '}' )
            // InternalFamily.g:333:2: '}'
            {
             before(grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Family__Group__7__Impl"


    // $ANTLR start "rule__Family__Group_3__0"
    // InternalFamily.g:343:1: rule__Family__Group_3__0 : rule__Family__Group_3__0__Impl rule__Family__Group_3__1 ;
    public final void rule__Family__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:347:1: ( rule__Family__Group_3__0__Impl rule__Family__Group_3__1 )
            // InternalFamily.g:348:2: rule__Family__Group_3__0__Impl rule__Family__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Family__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group_3__1();

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
    // $ANTLR end "rule__Family__Group_3__0"


    // $ANTLR start "rule__Family__Group_3__0__Impl"
    // InternalFamily.g:355:1: rule__Family__Group_3__0__Impl : ( 'Father' ) ;
    public final void rule__Family__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:359:1: ( ( 'Father' ) )
            // InternalFamily.g:360:1: ( 'Father' )
            {
            // InternalFamily.g:360:1: ( 'Father' )
            // InternalFamily.g:361:2: 'Father'
            {
             before(grammarAccess.getFamilyAccess().getFatherKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getFatherKeyword_3_0()); 

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
    // $ANTLR end "rule__Family__Group_3__0__Impl"


    // $ANTLR start "rule__Family__Group_3__1"
    // InternalFamily.g:370:1: rule__Family__Group_3__1 : rule__Family__Group_3__1__Impl ;
    public final void rule__Family__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:374:1: ( rule__Family__Group_3__1__Impl )
            // InternalFamily.g:375:2: rule__Family__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Family__Group_3__1__Impl();

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
    // $ANTLR end "rule__Family__Group_3__1"


    // $ANTLR start "rule__Family__Group_3__1__Impl"
    // InternalFamily.g:381:1: rule__Family__Group_3__1__Impl : ( ( rule__Family__FAssignment_3_1 ) ) ;
    public final void rule__Family__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:385:1: ( ( ( rule__Family__FAssignment_3_1 ) ) )
            // InternalFamily.g:386:1: ( ( rule__Family__FAssignment_3_1 ) )
            {
            // InternalFamily.g:386:1: ( ( rule__Family__FAssignment_3_1 ) )
            // InternalFamily.g:387:2: ( rule__Family__FAssignment_3_1 )
            {
             before(grammarAccess.getFamilyAccess().getFAssignment_3_1()); 
            // InternalFamily.g:388:2: ( rule__Family__FAssignment_3_1 )
            // InternalFamily.g:388:3: rule__Family__FAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Family__FAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFamilyAccess().getFAssignment_3_1()); 

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
    // $ANTLR end "rule__Family__Group_3__1__Impl"


    // $ANTLR start "rule__Family__Group_4__0"
    // InternalFamily.g:397:1: rule__Family__Group_4__0 : rule__Family__Group_4__0__Impl rule__Family__Group_4__1 ;
    public final void rule__Family__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:401:1: ( rule__Family__Group_4__0__Impl rule__Family__Group_4__1 )
            // InternalFamily.g:402:2: rule__Family__Group_4__0__Impl rule__Family__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Family__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group_4__1();

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
    // $ANTLR end "rule__Family__Group_4__0"


    // $ANTLR start "rule__Family__Group_4__0__Impl"
    // InternalFamily.g:409:1: rule__Family__Group_4__0__Impl : ( 'Mother' ) ;
    public final void rule__Family__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:413:1: ( ( 'Mother' ) )
            // InternalFamily.g:414:1: ( 'Mother' )
            {
            // InternalFamily.g:414:1: ( 'Mother' )
            // InternalFamily.g:415:2: 'Mother'
            {
             before(grammarAccess.getFamilyAccess().getMotherKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getMotherKeyword_4_0()); 

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
    // $ANTLR end "rule__Family__Group_4__0__Impl"


    // $ANTLR start "rule__Family__Group_4__1"
    // InternalFamily.g:424:1: rule__Family__Group_4__1 : rule__Family__Group_4__1__Impl ;
    public final void rule__Family__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:428:1: ( rule__Family__Group_4__1__Impl )
            // InternalFamily.g:429:2: rule__Family__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Family__Group_4__1__Impl();

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
    // $ANTLR end "rule__Family__Group_4__1"


    // $ANTLR start "rule__Family__Group_4__1__Impl"
    // InternalFamily.g:435:1: rule__Family__Group_4__1__Impl : ( ( rule__Family__MAssignment_4_1 ) ) ;
    public final void rule__Family__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:439:1: ( ( ( rule__Family__MAssignment_4_1 ) ) )
            // InternalFamily.g:440:1: ( ( rule__Family__MAssignment_4_1 ) )
            {
            // InternalFamily.g:440:1: ( ( rule__Family__MAssignment_4_1 ) )
            // InternalFamily.g:441:2: ( rule__Family__MAssignment_4_1 )
            {
             before(grammarAccess.getFamilyAccess().getMAssignment_4_1()); 
            // InternalFamily.g:442:2: ( rule__Family__MAssignment_4_1 )
            // InternalFamily.g:442:3: rule__Family__MAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Family__MAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFamilyAccess().getMAssignment_4_1()); 

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
    // $ANTLR end "rule__Family__Group_4__1__Impl"


    // $ANTLR start "rule__Family__Group_5__0"
    // InternalFamily.g:451:1: rule__Family__Group_5__0 : rule__Family__Group_5__0__Impl rule__Family__Group_5__1 ;
    public final void rule__Family__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:455:1: ( rule__Family__Group_5__0__Impl rule__Family__Group_5__1 )
            // InternalFamily.g:456:2: rule__Family__Group_5__0__Impl rule__Family__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Family__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group_5__1();

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
    // $ANTLR end "rule__Family__Group_5__0"


    // $ANTLR start "rule__Family__Group_5__0__Impl"
    // InternalFamily.g:463:1: rule__Family__Group_5__0__Impl : ( 'Sons' ) ;
    public final void rule__Family__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:467:1: ( ( 'Sons' ) )
            // InternalFamily.g:468:1: ( 'Sons' )
            {
            // InternalFamily.g:468:1: ( 'Sons' )
            // InternalFamily.g:469:2: 'Sons'
            {
             before(grammarAccess.getFamilyAccess().getSonsKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getSonsKeyword_5_0()); 

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
    // $ANTLR end "rule__Family__Group_5__0__Impl"


    // $ANTLR start "rule__Family__Group_5__1"
    // InternalFamily.g:478:1: rule__Family__Group_5__1 : rule__Family__Group_5__1__Impl ;
    public final void rule__Family__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:482:1: ( rule__Family__Group_5__1__Impl )
            // InternalFamily.g:483:2: rule__Family__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Family__Group_5__1__Impl();

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
    // $ANTLR end "rule__Family__Group_5__1"


    // $ANTLR start "rule__Family__Group_5__1__Impl"
    // InternalFamily.g:489:1: rule__Family__Group_5__1__Impl : ( ( ( rule__Family__SAssignment_5_1 ) ) ( ( rule__Family__SAssignment_5_1 )* ) ) ;
    public final void rule__Family__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:493:1: ( ( ( ( rule__Family__SAssignment_5_1 ) ) ( ( rule__Family__SAssignment_5_1 )* ) ) )
            // InternalFamily.g:494:1: ( ( ( rule__Family__SAssignment_5_1 ) ) ( ( rule__Family__SAssignment_5_1 )* ) )
            {
            // InternalFamily.g:494:1: ( ( ( rule__Family__SAssignment_5_1 ) ) ( ( rule__Family__SAssignment_5_1 )* ) )
            // InternalFamily.g:495:2: ( ( rule__Family__SAssignment_5_1 ) ) ( ( rule__Family__SAssignment_5_1 )* )
            {
            // InternalFamily.g:495:2: ( ( rule__Family__SAssignment_5_1 ) )
            // InternalFamily.g:496:3: ( rule__Family__SAssignment_5_1 )
            {
             before(grammarAccess.getFamilyAccess().getSAssignment_5_1()); 
            // InternalFamily.g:497:3: ( rule__Family__SAssignment_5_1 )
            // InternalFamily.g:497:4: rule__Family__SAssignment_5_1
            {
            pushFollow(FOLLOW_7);
            rule__Family__SAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFamilyAccess().getSAssignment_5_1()); 

            }

            // InternalFamily.g:500:2: ( ( rule__Family__SAssignment_5_1 )* )
            // InternalFamily.g:501:3: ( rule__Family__SAssignment_5_1 )*
            {
             before(grammarAccess.getFamilyAccess().getSAssignment_5_1()); 
            // InternalFamily.g:502:3: ( rule__Family__SAssignment_5_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFamily.g:502:4: rule__Family__SAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Family__SAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFamilyAccess().getSAssignment_5_1()); 

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
    // $ANTLR end "rule__Family__Group_5__1__Impl"


    // $ANTLR start "rule__Family__Group_6__0"
    // InternalFamily.g:512:1: rule__Family__Group_6__0 : rule__Family__Group_6__0__Impl rule__Family__Group_6__1 ;
    public final void rule__Family__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:516:1: ( rule__Family__Group_6__0__Impl rule__Family__Group_6__1 )
            // InternalFamily.g:517:2: rule__Family__Group_6__0__Impl rule__Family__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Family__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group_6__1();

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
    // $ANTLR end "rule__Family__Group_6__0"


    // $ANTLR start "rule__Family__Group_6__0__Impl"
    // InternalFamily.g:524:1: rule__Family__Group_6__0__Impl : ( 'Daughters' ) ;
    public final void rule__Family__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:528:1: ( ( 'Daughters' ) )
            // InternalFamily.g:529:1: ( 'Daughters' )
            {
            // InternalFamily.g:529:1: ( 'Daughters' )
            // InternalFamily.g:530:2: 'Daughters'
            {
             before(grammarAccess.getFamilyAccess().getDaughtersKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getDaughtersKeyword_6_0()); 

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
    // $ANTLR end "rule__Family__Group_6__0__Impl"


    // $ANTLR start "rule__Family__Group_6__1"
    // InternalFamily.g:539:1: rule__Family__Group_6__1 : rule__Family__Group_6__1__Impl ;
    public final void rule__Family__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:543:1: ( rule__Family__Group_6__1__Impl )
            // InternalFamily.g:544:2: rule__Family__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Family__Group_6__1__Impl();

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
    // $ANTLR end "rule__Family__Group_6__1"


    // $ANTLR start "rule__Family__Group_6__1__Impl"
    // InternalFamily.g:550:1: rule__Family__Group_6__1__Impl : ( ( ( rule__Family__DAssignment_6_1 ) ) ( ( rule__Family__DAssignment_6_1 )* ) ) ;
    public final void rule__Family__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:554:1: ( ( ( ( rule__Family__DAssignment_6_1 ) ) ( ( rule__Family__DAssignment_6_1 )* ) ) )
            // InternalFamily.g:555:1: ( ( ( rule__Family__DAssignment_6_1 ) ) ( ( rule__Family__DAssignment_6_1 )* ) )
            {
            // InternalFamily.g:555:1: ( ( ( rule__Family__DAssignment_6_1 ) ) ( ( rule__Family__DAssignment_6_1 )* ) )
            // InternalFamily.g:556:2: ( ( rule__Family__DAssignment_6_1 ) ) ( ( rule__Family__DAssignment_6_1 )* )
            {
            // InternalFamily.g:556:2: ( ( rule__Family__DAssignment_6_1 ) )
            // InternalFamily.g:557:3: ( rule__Family__DAssignment_6_1 )
            {
             before(grammarAccess.getFamilyAccess().getDAssignment_6_1()); 
            // InternalFamily.g:558:3: ( rule__Family__DAssignment_6_1 )
            // InternalFamily.g:558:4: rule__Family__DAssignment_6_1
            {
            pushFollow(FOLLOW_7);
            rule__Family__DAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFamilyAccess().getDAssignment_6_1()); 

            }

            // InternalFamily.g:561:2: ( ( rule__Family__DAssignment_6_1 )* )
            // InternalFamily.g:562:3: ( rule__Family__DAssignment_6_1 )*
            {
             before(grammarAccess.getFamilyAccess().getDAssignment_6_1()); 
            // InternalFamily.g:563:3: ( rule__Family__DAssignment_6_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFamily.g:563:4: rule__Family__DAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Family__DAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFamilyAccess().getDAssignment_6_1()); 

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
    // $ANTLR end "rule__Family__Group_6__1__Impl"


    // $ANTLR start "rule__Model__FamiliesAssignment"
    // InternalFamily.g:573:1: rule__Model__FamiliesAssignment : ( ruleFamily ) ;
    public final void rule__Model__FamiliesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:577:1: ( ( ruleFamily ) )
            // InternalFamily.g:578:2: ( ruleFamily )
            {
            // InternalFamily.g:578:2: ( ruleFamily )
            // InternalFamily.g:579:3: ruleFamily
            {
             before(grammarAccess.getModelAccess().getFamiliesFamilyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFamily();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFamiliesFamilyParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__FamiliesAssignment"


    // $ANTLR start "rule__Family__SurnameAssignment_1"
    // InternalFamily.g:588:1: rule__Family__SurnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Family__SurnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:592:1: ( ( RULE_ID ) )
            // InternalFamily.g:593:2: ( RULE_ID )
            {
            // InternalFamily.g:593:2: ( RULE_ID )
            // InternalFamily.g:594:3: RULE_ID
            {
             before(grammarAccess.getFamilyAccess().getSurnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getSurnameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Family__SurnameAssignment_1"


    // $ANTLR start "rule__Family__FAssignment_3_1"
    // InternalFamily.g:603:1: rule__Family__FAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Family__FAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:607:1: ( ( ( RULE_ID ) ) )
            // InternalFamily.g:608:2: ( ( RULE_ID ) )
            {
            // InternalFamily.g:608:2: ( ( RULE_ID ) )
            // InternalFamily.g:609:3: ( RULE_ID )
            {
             before(grammarAccess.getFamilyAccess().getFMemberCrossReference_3_1_0()); 
            // InternalFamily.g:610:3: ( RULE_ID )
            // InternalFamily.g:611:4: RULE_ID
            {
             before(grammarAccess.getFamilyAccess().getFMemberIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getFMemberIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFamilyAccess().getFMemberCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Family__FAssignment_3_1"


    // $ANTLR start "rule__Family__MAssignment_4_1"
    // InternalFamily.g:622:1: rule__Family__MAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Family__MAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:626:1: ( ( ( RULE_ID ) ) )
            // InternalFamily.g:627:2: ( ( RULE_ID ) )
            {
            // InternalFamily.g:627:2: ( ( RULE_ID ) )
            // InternalFamily.g:628:3: ( RULE_ID )
            {
             before(grammarAccess.getFamilyAccess().getMMemberCrossReference_4_1_0()); 
            // InternalFamily.g:629:3: ( RULE_ID )
            // InternalFamily.g:630:4: RULE_ID
            {
             before(grammarAccess.getFamilyAccess().getMMemberIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getMMemberIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFamilyAccess().getMMemberCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Family__MAssignment_4_1"


    // $ANTLR start "rule__Family__SAssignment_5_1"
    // InternalFamily.g:641:1: rule__Family__SAssignment_5_1 : ( ruleMember ) ;
    public final void rule__Family__SAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:645:1: ( ( ruleMember ) )
            // InternalFamily.g:646:2: ( ruleMember )
            {
            // InternalFamily.g:646:2: ( ruleMember )
            // InternalFamily.g:647:3: ruleMember
            {
             before(grammarAccess.getFamilyAccess().getSMemberParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getFamilyAccess().getSMemberParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Family__SAssignment_5_1"


    // $ANTLR start "rule__Family__DAssignment_6_1"
    // InternalFamily.g:656:1: rule__Family__DAssignment_6_1 : ( ruleMember ) ;
    public final void rule__Family__DAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:660:1: ( ( ruleMember ) )
            // InternalFamily.g:661:2: ( ruleMember )
            {
            // InternalFamily.g:661:2: ( ruleMember )
            // InternalFamily.g:662:3: ruleMember
            {
             before(grammarAccess.getFamilyAccess().getDMemberParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getFamilyAccess().getDMemberParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Family__DAssignment_6_1"


    // $ANTLR start "rule__Member__NameAssignment"
    // InternalFamily.g:671:1: rule__Member__NameAssignment : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:675:1: ( ( RULE_ID ) )
            // InternalFamily.g:676:2: ( RULE_ID )
            {
            // InternalFamily.g:676:2: ( RULE_ID )
            // InternalFamily.g:677:3: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Member__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});

}