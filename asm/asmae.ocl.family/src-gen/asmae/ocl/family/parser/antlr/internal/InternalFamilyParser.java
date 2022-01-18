package asmae.ocl.family.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import asmae.ocl.family.services.FamilyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFamilyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Family'", "'{'", "'Father'", "'Mother'", "'Sons'", "'Daughters'", "'}'"
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

        public InternalFamilyParser(TokenStream input, FamilyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FamilyModel";
       	}

       	@Override
       	protected FamilyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFamilyModel"
    // InternalFamily.g:64:1: entryRuleFamilyModel returns [EObject current=null] : iv_ruleFamilyModel= ruleFamilyModel EOF ;
    public final EObject entryRuleFamilyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFamilyModel = null;


        try {
            // InternalFamily.g:64:52: (iv_ruleFamilyModel= ruleFamilyModel EOF )
            // InternalFamily.g:65:2: iv_ruleFamilyModel= ruleFamilyModel EOF
            {
             newCompositeNode(grammarAccess.getFamilyModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFamilyModel=ruleFamilyModel();

            state._fsp--;

             current =iv_ruleFamilyModel; 
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
    // $ANTLR end "entryRuleFamilyModel"


    // $ANTLR start "ruleFamilyModel"
    // InternalFamily.g:71:1: ruleFamilyModel returns [EObject current=null] : ( (lv_families_0_0= ruleFamily ) )* ;
    public final EObject ruleFamilyModel() throws RecognitionException {
        EObject current = null;

        EObject lv_families_0_0 = null;



        	enterRule();

        try {
            // InternalFamily.g:77:2: ( ( (lv_families_0_0= ruleFamily ) )* )
            // InternalFamily.g:78:2: ( (lv_families_0_0= ruleFamily ) )*
            {
            // InternalFamily.g:78:2: ( (lv_families_0_0= ruleFamily ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFamily.g:79:3: (lv_families_0_0= ruleFamily )
            	    {
            	    // InternalFamily.g:79:3: (lv_families_0_0= ruleFamily )
            	    // InternalFamily.g:80:4: lv_families_0_0= ruleFamily
            	    {

            	    				newCompositeNode(grammarAccess.getFamilyModelAccess().getFamiliesFamilyParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_families_0_0=ruleFamily();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getFamilyModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"families",
            	    					lv_families_0_0,
            	    					"asmae.ocl.family.Family.Family");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleFamilyModel"


    // $ANTLR start "entryRuleFamily"
    // InternalFamily.g:100:1: entryRuleFamily returns [EObject current=null] : iv_ruleFamily= ruleFamily EOF ;
    public final EObject entryRuleFamily() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFamily = null;


        try {
            // InternalFamily.g:100:47: (iv_ruleFamily= ruleFamily EOF )
            // InternalFamily.g:101:2: iv_ruleFamily= ruleFamily EOF
            {
             newCompositeNode(grammarAccess.getFamilyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFamily=ruleFamily();

            state._fsp--;

             current =iv_ruleFamily; 
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
    // $ANTLR end "entryRuleFamily"


    // $ANTLR start "ruleFamily"
    // InternalFamily.g:107:1: ruleFamily returns [EObject current=null] : (otherlv_0= 'Family' ( (lv_lastName_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Father' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Mother' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'Sons' ( (lv_sons_8_0= ruleMember ) )+ )? (otherlv_9= 'Daughters' ( (lv_daughters_10_0= ruleMember ) )+ )? otherlv_11= '}' ) ;
    public final EObject ruleFamily() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lastName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_sons_8_0 = null;

        EObject lv_daughters_10_0 = null;



        	enterRule();

        try {
            // InternalFamily.g:113:2: ( (otherlv_0= 'Family' ( (lv_lastName_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Father' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Mother' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'Sons' ( (lv_sons_8_0= ruleMember ) )+ )? (otherlv_9= 'Daughters' ( (lv_daughters_10_0= ruleMember ) )+ )? otherlv_11= '}' ) )
            // InternalFamily.g:114:2: (otherlv_0= 'Family' ( (lv_lastName_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Father' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Mother' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'Sons' ( (lv_sons_8_0= ruleMember ) )+ )? (otherlv_9= 'Daughters' ( (lv_daughters_10_0= ruleMember ) )+ )? otherlv_11= '}' )
            {
            // InternalFamily.g:114:2: (otherlv_0= 'Family' ( (lv_lastName_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Father' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Mother' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'Sons' ( (lv_sons_8_0= ruleMember ) )+ )? (otherlv_9= 'Daughters' ( (lv_daughters_10_0= ruleMember ) )+ )? otherlv_11= '}' )
            // InternalFamily.g:115:3: otherlv_0= 'Family' ( (lv_lastName_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Father' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Mother' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'Sons' ( (lv_sons_8_0= ruleMember ) )+ )? (otherlv_9= 'Daughters' ( (lv_daughters_10_0= ruleMember ) )+ )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFamilyAccess().getFamilyKeyword_0());
            		
            // InternalFamily.g:119:3: ( (lv_lastName_1_0= RULE_ID ) )
            // InternalFamily.g:120:4: (lv_lastName_1_0= RULE_ID )
            {
            // InternalFamily.g:120:4: (lv_lastName_1_0= RULE_ID )
            // InternalFamily.g:121:5: lv_lastName_1_0= RULE_ID
            {
            lv_lastName_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_lastName_1_0, grammarAccess.getFamilyAccess().getLastNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamilyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lastName",
            						lv_lastName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFamily.g:141:3: (otherlv_3= 'Father' ( (otherlv_4= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFamily.g:142:4: otherlv_3= 'Father' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getFamilyAccess().getFatherKeyword_3_0());
                    			
                    // InternalFamily.g:146:4: ( (otherlv_4= RULE_ID ) )
                    // InternalFamily.g:147:5: (otherlv_4= RULE_ID )
                    {
                    // InternalFamily.g:147:5: (otherlv_4= RULE_ID )
                    // InternalFamily.g:148:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFamilyRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getFamilyAccess().getFatherMemberCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFamily.g:160:3: (otherlv_5= 'Mother' ( (otherlv_6= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFamily.g:161:4: otherlv_5= 'Mother' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getFamilyAccess().getMotherKeyword_4_0());
                    			
                    // InternalFamily.g:165:4: ( (otherlv_6= RULE_ID ) )
                    // InternalFamily.g:166:5: (otherlv_6= RULE_ID )
                    {
                    // InternalFamily.g:166:5: (otherlv_6= RULE_ID )
                    // InternalFamily.g:167:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFamilyRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_6, grammarAccess.getFamilyAccess().getMotherMemberCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFamily.g:179:3: (otherlv_7= 'Sons' ( (lv_sons_8_0= ruleMember ) )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFamily.g:180:4: otherlv_7= 'Sons' ( (lv_sons_8_0= ruleMember ) )+
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getFamilyAccess().getSonsKeyword_5_0());
                    			
                    // InternalFamily.g:184:4: ( (lv_sons_8_0= ruleMember ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalFamily.g:185:5: (lv_sons_8_0= ruleMember )
                    	    {
                    	    // InternalFamily.g:185:5: (lv_sons_8_0= ruleMember )
                    	    // InternalFamily.g:186:6: lv_sons_8_0= ruleMember
                    	    {

                    	    						newCompositeNode(grammarAccess.getFamilyAccess().getSonsMemberParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_sons_8_0=ruleMember();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFamilyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sons",
                    	    							lv_sons_8_0,
                    	    							"asmae.ocl.family.Family.Member");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }

            // InternalFamily.g:204:3: (otherlv_9= 'Daughters' ( (lv_daughters_10_0= ruleMember ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFamily.g:205:4: otherlv_9= 'Daughters' ( (lv_daughters_10_0= ruleMember ) )+
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getFamilyAccess().getDaughtersKeyword_6_0());
                    			
                    // InternalFamily.g:209:4: ( (lv_daughters_10_0= ruleMember ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalFamily.g:210:5: (lv_daughters_10_0= ruleMember )
                    	    {
                    	    // InternalFamily.g:210:5: (lv_daughters_10_0= ruleMember )
                    	    // InternalFamily.g:211:6: lv_daughters_10_0= ruleMember
                    	    {

                    	    						newCompositeNode(grammarAccess.getFamilyAccess().getDaughtersMemberParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_daughters_10_0=ruleMember();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFamilyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"daughters",
                    	    							lv_daughters_10_0,
                    	    							"asmae.ocl.family.Family.Member");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFamily"


    // $ANTLR start "entryRuleMember"
    // InternalFamily.g:237:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalFamily.g:237:47: (iv_ruleMember= ruleMember EOF )
            // InternalFamily.g:238:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalFamily.g:244:1: ruleMember returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalFamily.g:250:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalFamily.g:251:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalFamily.g:251:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalFamily.g:252:3: (lv_name_0_0= RULE_ID )
            {
            // InternalFamily.g:252:3: (lv_name_0_0= RULE_ID )
            // InternalFamily.g:253:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMemberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleMember"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020010L});

}