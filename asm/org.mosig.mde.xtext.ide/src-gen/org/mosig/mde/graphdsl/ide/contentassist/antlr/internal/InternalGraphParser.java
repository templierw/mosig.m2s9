package org.mosig.mde.graphdsl.ide.contentassist.antlr.internal;

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
import org.mosig.mde.graphdsl.services.GraphGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Nodes'", "'['", "']'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalGraphParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGraph.g"; }


    	private GraphGrammarAccess grammarAccess;

    	public void setGrammarAccess(GraphGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGraph"
    // InternalGraph.g:53:1: entryRuleGraph : ruleGraph EOF ;
    public final void entryRuleGraph() throws RecognitionException {
        try {
            // InternalGraph.g:54:1: ( ruleGraph EOF )
            // InternalGraph.g:55:1: ruleGraph EOF
            {
             before(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleGraph();

            state._fsp--;

             after(grammarAccess.getGraphRule()); 
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
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalGraph.g:62:1: ruleGraph : ( ( rule__Graph__Group__0 )? ) ;
    public final void ruleGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:66:2: ( ( ( rule__Graph__Group__0 )? ) )
            // InternalGraph.g:67:2: ( ( rule__Graph__Group__0 )? )
            {
            // InternalGraph.g:67:2: ( ( rule__Graph__Group__0 )? )
            // InternalGraph.g:68:3: ( rule__Graph__Group__0 )?
            {
             before(grammarAccess.getGraphAccess().getGroup()); 
            // InternalGraph.g:69:3: ( rule__Graph__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGraph.g:69:4: rule__Graph__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Graph__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphAccess().getGroup()); 

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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleNode"
    // InternalGraph.g:78:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalGraph.g:79:1: ( ruleNode EOF )
            // InternalGraph.g:80:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalGraph.g:87:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:91:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalGraph.g:92:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalGraph.g:92:2: ( ( rule__Node__Group__0 ) )
            // InternalGraph.g:93:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalGraph.g:94:3: ( rule__Node__Group__0 )
            // InternalGraph.g:94:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "rule__Graph__Group__0"
    // InternalGraph.g:102:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:106:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalGraph.g:107:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Graph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__1();

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
    // $ANTLR end "rule__Graph__Group__0"


    // $ANTLR start "rule__Graph__Group__0__Impl"
    // InternalGraph.g:114:1: rule__Graph__Group__0__Impl : ( 'Nodes' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:118:1: ( ( 'Nodes' ) )
            // InternalGraph.g:119:1: ( 'Nodes' )
            {
            // InternalGraph.g:119:1: ( 'Nodes' )
            // InternalGraph.g:120:2: 'Nodes'
            {
             before(grammarAccess.getGraphAccess().getNodesKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getNodesKeyword_0()); 

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
    // $ANTLR end "rule__Graph__Group__0__Impl"


    // $ANTLR start "rule__Graph__Group__1"
    // InternalGraph.g:129:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:133:1: ( rule__Graph__Group__1__Impl )
            // InternalGraph.g:134:2: rule__Graph__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__1__Impl();

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
    // $ANTLR end "rule__Graph__Group__1"


    // $ANTLR start "rule__Graph__Group__1__Impl"
    // InternalGraph.g:140:1: rule__Graph__Group__1__Impl : ( ( ( rule__Graph__TheNodesAssignment_1 ) ) ( ( rule__Graph__TheNodesAssignment_1 )* ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:144:1: ( ( ( ( rule__Graph__TheNodesAssignment_1 ) ) ( ( rule__Graph__TheNodesAssignment_1 )* ) ) )
            // InternalGraph.g:145:1: ( ( ( rule__Graph__TheNodesAssignment_1 ) ) ( ( rule__Graph__TheNodesAssignment_1 )* ) )
            {
            // InternalGraph.g:145:1: ( ( ( rule__Graph__TheNodesAssignment_1 ) ) ( ( rule__Graph__TheNodesAssignment_1 )* ) )
            // InternalGraph.g:146:2: ( ( rule__Graph__TheNodesAssignment_1 ) ) ( ( rule__Graph__TheNodesAssignment_1 )* )
            {
            // InternalGraph.g:146:2: ( ( rule__Graph__TheNodesAssignment_1 ) )
            // InternalGraph.g:147:3: ( rule__Graph__TheNodesAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getTheNodesAssignment_1()); 
            // InternalGraph.g:148:3: ( rule__Graph__TheNodesAssignment_1 )
            // InternalGraph.g:148:4: rule__Graph__TheNodesAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__Graph__TheNodesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getTheNodesAssignment_1()); 

            }

            // InternalGraph.g:151:2: ( ( rule__Graph__TheNodesAssignment_1 )* )
            // InternalGraph.g:152:3: ( rule__Graph__TheNodesAssignment_1 )*
            {
             before(grammarAccess.getGraphAccess().getTheNodesAssignment_1()); 
            // InternalGraph.g:153:3: ( rule__Graph__TheNodesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGraph.g:153:4: rule__Graph__TheNodesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Graph__TheNodesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getGraphAccess().getTheNodesAssignment_1()); 

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
    // $ANTLR end "rule__Graph__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalGraph.g:163:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:167:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalGraph.g:168:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

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
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalGraph.g:175:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:179:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // InternalGraph.g:180:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // InternalGraph.g:180:1: ( ( rule__Node__NameAssignment_0 ) )
            // InternalGraph.g:181:2: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // InternalGraph.g:182:2: ( rule__Node__NameAssignment_0 )
            // InternalGraph.g:182:3: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalGraph.g:190:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:194:1: ( rule__Node__Group__1__Impl )
            // InternalGraph.g:195:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__1__Impl();

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
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalGraph.g:201:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:205:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // InternalGraph.g:206:1: ( ( rule__Node__Group_1__0 )? )
            {
            // InternalGraph.g:206:1: ( ( rule__Node__Group_1__0 )? )
            // InternalGraph.g:207:2: ( rule__Node__Group_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_1()); 
            // InternalGraph.g:208:2: ( rule__Node__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGraph.g:208:3: rule__Node__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group_1__0"
    // InternalGraph.g:217:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:221:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // InternalGraph.g:222:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Node__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_1__1();

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
    // $ANTLR end "rule__Node__Group_1__0"


    // $ANTLR start "rule__Node__Group_1__0__Impl"
    // InternalGraph.g:229:1: rule__Node__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:233:1: ( ( '[' ) )
            // InternalGraph.g:234:1: ( '[' )
            {
            // InternalGraph.g:234:1: ( '[' )
            // InternalGraph.g:235:2: '['
            {
             before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Node__Group_1__0__Impl"


    // $ANTLR start "rule__Node__Group_1__1"
    // InternalGraph.g:244:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl rule__Node__Group_1__2 ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:248:1: ( rule__Node__Group_1__1__Impl rule__Node__Group_1__2 )
            // InternalGraph.g:249:2: rule__Node__Group_1__1__Impl rule__Node__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Node__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_1__2();

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
    // $ANTLR end "rule__Node__Group_1__1"


    // $ANTLR start "rule__Node__Group_1__1__Impl"
    // InternalGraph.g:256:1: rule__Node__Group_1__1__Impl : ( ( ( rule__Node__NextAssignment_1_1 ) ) ( ( rule__Node__NextAssignment_1_1 )* ) ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:260:1: ( ( ( ( rule__Node__NextAssignment_1_1 ) ) ( ( rule__Node__NextAssignment_1_1 )* ) ) )
            // InternalGraph.g:261:1: ( ( ( rule__Node__NextAssignment_1_1 ) ) ( ( rule__Node__NextAssignment_1_1 )* ) )
            {
            // InternalGraph.g:261:1: ( ( ( rule__Node__NextAssignment_1_1 ) ) ( ( rule__Node__NextAssignment_1_1 )* ) )
            // InternalGraph.g:262:2: ( ( rule__Node__NextAssignment_1_1 ) ) ( ( rule__Node__NextAssignment_1_1 )* )
            {
            // InternalGraph.g:262:2: ( ( rule__Node__NextAssignment_1_1 ) )
            // InternalGraph.g:263:3: ( rule__Node__NextAssignment_1_1 )
            {
             before(grammarAccess.getNodeAccess().getNextAssignment_1_1()); 
            // InternalGraph.g:264:3: ( rule__Node__NextAssignment_1_1 )
            // InternalGraph.g:264:4: rule__Node__NextAssignment_1_1
            {
            pushFollow(FOLLOW_4);
            rule__Node__NextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNextAssignment_1_1()); 

            }

            // InternalGraph.g:267:2: ( ( rule__Node__NextAssignment_1_1 )* )
            // InternalGraph.g:268:3: ( rule__Node__NextAssignment_1_1 )*
            {
             before(grammarAccess.getNodeAccess().getNextAssignment_1_1()); 
            // InternalGraph.g:269:3: ( rule__Node__NextAssignment_1_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGraph.g:269:4: rule__Node__NextAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Node__NextAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getNextAssignment_1_1()); 

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
    // $ANTLR end "rule__Node__Group_1__1__Impl"


    // $ANTLR start "rule__Node__Group_1__2"
    // InternalGraph.g:278:1: rule__Node__Group_1__2 : rule__Node__Group_1__2__Impl ;
    public final void rule__Node__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:282:1: ( rule__Node__Group_1__2__Impl )
            // InternalGraph.g:283:2: rule__Node__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_1__2__Impl();

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
    // $ANTLR end "rule__Node__Group_1__2"


    // $ANTLR start "rule__Node__Group_1__2__Impl"
    // InternalGraph.g:289:1: rule__Node__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Node__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:293:1: ( ( ']' ) )
            // InternalGraph.g:294:1: ( ']' )
            {
            // InternalGraph.g:294:1: ( ']' )
            // InternalGraph.g:295:2: ']'
            {
             before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__Node__Group_1__2__Impl"


    // $ANTLR start "rule__Graph__TheNodesAssignment_1"
    // InternalGraph.g:305:1: rule__Graph__TheNodesAssignment_1 : ( ruleNode ) ;
    public final void rule__Graph__TheNodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:309:1: ( ( ruleNode ) )
            // InternalGraph.g:310:2: ( ruleNode )
            {
            // InternalGraph.g:310:2: ( ruleNode )
            // InternalGraph.g:311:3: ruleNode
            {
             before(grammarAccess.getGraphAccess().getTheNodesNodeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getTheNodesNodeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Graph__TheNodesAssignment_1"


    // $ANTLR start "rule__Node__NameAssignment_0"
    // InternalGraph.g:320:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:324:1: ( ( RULE_ID ) )
            // InternalGraph.g:325:2: ( RULE_ID )
            {
            // InternalGraph.g:325:2: ( RULE_ID )
            // InternalGraph.g:326:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Node__NameAssignment_0"


    // $ANTLR start "rule__Node__NextAssignment_1_1"
    // InternalGraph.g:335:1: rule__Node__NextAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Node__NextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraph.g:339:1: ( ( ( RULE_ID ) ) )
            // InternalGraph.g:340:2: ( ( RULE_ID ) )
            {
            // InternalGraph.g:340:2: ( ( RULE_ID ) )
            // InternalGraph.g:341:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getNextNodeCrossReference_1_1_0()); 
            // InternalGraph.g:342:3: ( RULE_ID )
            // InternalGraph.g:343:4: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNextNodeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNextNodeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getNextNodeCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Node__NextAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}