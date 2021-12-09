package org.mosig.mde.graphdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mosig.mde.graphdsl.services.GraphGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphParser extends AbstractInternalAntlrParser {
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

        public InternalGraphParser(TokenStream input, GraphGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Graph";
       	}

       	@Override
       	protected GraphGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGraph"
    // InternalGraph.g:64:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalGraph.g:64:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalGraph.g:65:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
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
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalGraph.g:71:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Nodes' ( (lv_theNodes_1_0= ruleNode ) )+ )? ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_theNodes_1_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:77:2: ( (otherlv_0= 'Nodes' ( (lv_theNodes_1_0= ruleNode ) )+ )? )
            // InternalGraph.g:78:2: (otherlv_0= 'Nodes' ( (lv_theNodes_1_0= ruleNode ) )+ )?
            {
            // InternalGraph.g:78:2: (otherlv_0= 'Nodes' ( (lv_theNodes_1_0= ruleNode ) )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraph.g:79:3: otherlv_0= 'Nodes' ( (lv_theNodes_1_0= ruleNode ) )+
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getNodesKeyword_0());
                    		
                    // InternalGraph.g:83:3: ( (lv_theNodes_1_0= ruleNode ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGraph.g:84:4: (lv_theNodes_1_0= ruleNode )
                    	    {
                    	    // InternalGraph.g:84:4: (lv_theNodes_1_0= ruleNode )
                    	    // InternalGraph.g:85:5: lv_theNodes_1_0= ruleNode
                    	    {

                    	    					newCompositeNode(grammarAccess.getGraphAccess().getTheNodesNodeParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_4);
                    	    lv_theNodes_1_0=ruleNode();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getGraphRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"theNodes",
                    	    						lv_theNodes_1_0,
                    	    						"org.mosig.mde.graphdsl.Graph.Node");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleNode"
    // InternalGraph.g:106:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalGraph.g:106:45: (iv_ruleNode= ruleNode EOF )
            // InternalGraph.g:107:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalGraph.g:113:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ']' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGraph.g:119:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ']' )? ) )
            // InternalGraph.g:120:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ']' )? )
            {
            // InternalGraph.g:120:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ']' )? )
            // InternalGraph.g:121:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ']' )?
            {
            // InternalGraph.g:121:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGraph.g:122:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGraph.g:122:4: (lv_name_0_0= RULE_ID )
            // InternalGraph.g:123:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGraph.g:139:3: (otherlv_1= '[' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraph.g:140:4: otherlv_1= '[' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalGraph.g:144:4: ( (otherlv_2= RULE_ID ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGraph.g:145:5: (otherlv_2= RULE_ID )
                    	    {
                    	    // InternalGraph.g:145:5: (otherlv_2= RULE_ID )
                    	    // InternalGraph.g:146:6: otherlv_2= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getNodeRule());
                    	    						}
                    	    					
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getNextNodeCrossReference_1_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_3=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleNode"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});

}