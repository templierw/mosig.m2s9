package mosig.asmae.acceleo.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mosig.asmae.acceleo.services.FormGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormParser extends AbstractInternalAntlrParser {
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

        public InternalFormParser(TokenStream input, FormGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected FormGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalForm.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalForm.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalForm.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalForm.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_lesQuestions_2_0= ruleQuestion ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_lesQuestions_2_0 = null;



        	enterRule();

        try {
            // InternalForm.g:77:2: ( (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_lesQuestions_2_0= ruleQuestion ) )* ) )
            // InternalForm.g:78:2: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_lesQuestions_2_0= ruleQuestion ) )* )
            {
            // InternalForm.g:78:2: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_lesQuestions_2_0= ruleQuestion ) )* )
            // InternalForm.g:79:3: otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_lesQuestions_2_0= ruleQuestion ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getQuestionnaireKeyword_0());
            		
            // InternalForm.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalForm.g:84:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalForm.g:84:4: (lv_name_1_0= RULE_STRING )
            // InternalForm.g:85:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalForm.g:101:3: ( (lv_lesQuestions_2_0= ruleQuestion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalForm.g:102:4: (lv_lesQuestions_2_0= ruleQuestion )
            	    {
            	    // InternalForm.g:102:4: (lv_lesQuestions_2_0= ruleQuestion )
            	    // InternalForm.g:103:5: lv_lesQuestions_2_0= ruleQuestion
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getLesQuestionsQuestionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_lesQuestions_2_0=ruleQuestion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lesQuestions",
            	    						lv_lesQuestions_2_0,
            	    						"mosig.asmae.acceleo.Form.Question");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleQuestion"
    // InternalForm.g:124:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalForm.g:124:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalForm.g:125:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalForm.g:131:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_kindOf_2_0= ruleKind ) ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        EObject lv_kindOf_2_0 = null;



        	enterRule();

        try {
            // InternalForm.g:137:2: ( (otherlv_0= 'Question' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_kindOf_2_0= ruleKind ) ) ) )
            // InternalForm.g:138:2: (otherlv_0= 'Question' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_kindOf_2_0= ruleKind ) ) )
            {
            // InternalForm.g:138:2: (otherlv_0= 'Question' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_kindOf_2_0= ruleKind ) ) )
            // InternalForm.g:139:3: otherlv_0= 'Question' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_kindOf_2_0= ruleKind ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            // InternalForm.g:143:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalForm.g:144:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalForm.g:144:4: (lv_label_1_0= RULE_STRING )
            // InternalForm.g:145:5: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_label_1_0, grammarAccess.getQuestionAccess().getLabelSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalForm.g:161:3: ( (lv_kindOf_2_0= ruleKind ) )
            // InternalForm.g:162:4: (lv_kindOf_2_0= ruleKind )
            {
            // InternalForm.g:162:4: (lv_kindOf_2_0= ruleKind )
            // InternalForm.g:163:5: lv_kindOf_2_0= ruleKind
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getKindOfKindParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_kindOf_2_0=ruleKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"kindOf",
            						lv_kindOf_2_0,
            						"mosig.asmae.acceleo.Form.Kind");
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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleKind"
    // InternalForm.g:184:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // InternalForm.g:184:45: (iv_ruleKind= ruleKind EOF )
            // InternalForm.g:185:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind; 
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
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // InternalForm.g:191:1: ruleKind returns [EObject current=null] : (this_input_0= ruleinput | this_choice_1= rulechoice | this_option_2= ruleoption ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        EObject this_input_0 = null;

        EObject this_choice_1 = null;

        EObject this_option_2 = null;



        	enterRule();

        try {
            // InternalForm.g:197:2: ( (this_input_0= ruleinput | this_choice_1= rulechoice | this_option_2= ruleoption ) )
            // InternalForm.g:198:2: (this_input_0= ruleinput | this_choice_1= rulechoice | this_option_2= ruleoption )
            {
            // InternalForm.g:198:2: (this_input_0= ruleinput | this_choice_1= rulechoice | this_option_2= ruleoption )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt2=2;
                    }
                    break;
                case 14:
                    {
                    alt2=3;
                    }
                    break;
                case EOF:
                case 12:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalForm.g:199:3: this_input_0= ruleinput
                    {

                    			newCompositeNode(grammarAccess.getKindAccess().getInputParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_input_0=ruleinput();

                    state._fsp--;


                    			current = this_input_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalForm.g:208:3: this_choice_1= rulechoice
                    {

                    			newCompositeNode(grammarAccess.getKindAccess().getChoiceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_choice_1=rulechoice();

                    state._fsp--;


                    			current = this_choice_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalForm.g:217:3: this_option_2= ruleoption
                    {

                    			newCompositeNode(grammarAccess.getKindAccess().getOptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_option_2=ruleoption();

                    state._fsp--;


                    			current = this_option_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleinput"
    // InternalForm.g:229:1: entryRuleinput returns [EObject current=null] : iv_ruleinput= ruleinput EOF ;
    public final EObject entryRuleinput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinput = null;


        try {
            // InternalForm.g:229:46: (iv_ruleinput= ruleinput EOF )
            // InternalForm.g:230:2: iv_ruleinput= ruleinput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleinput=ruleinput();

            state._fsp--;

             current =iv_ruleinput; 
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
    // $ANTLR end "entryRuleinput"


    // $ANTLR start "ruleinput"
    // InternalForm.g:236:1: ruleinput returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleinput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalForm.g:242:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalForm.g:243:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalForm.g:243:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalForm.g:244:3: (lv_name_0_0= RULE_ID )
            {
            // InternalForm.g:244:3: (lv_name_0_0= RULE_ID )
            // InternalForm.g:245:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInputRule());
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
    // $ANTLR end "ruleinput"


    // $ANTLR start "entryRulechoice"
    // InternalForm.g:264:1: entryRulechoice returns [EObject current=null] : iv_rulechoice= rulechoice EOF ;
    public final EObject entryRulechoice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechoice = null;


        try {
            // InternalForm.g:264:47: (iv_rulechoice= rulechoice EOF )
            // InternalForm.g:265:2: iv_rulechoice= rulechoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulechoice=rulechoice();

            state._fsp--;

             current =iv_rulechoice; 
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
    // $ANTLR end "entryRulechoice"


    // $ANTLR start "rulechoice"
    // InternalForm.g:271:1: rulechoice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lesChoix_1_0= rulecheck ) )+ ) ;
    public final EObject rulechoice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_lesChoix_1_0 = null;



        	enterRule();

        try {
            // InternalForm.g:277:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lesChoix_1_0= rulecheck ) )+ ) )
            // InternalForm.g:278:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lesChoix_1_0= rulecheck ) )+ )
            {
            // InternalForm.g:278:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lesChoix_1_0= rulecheck ) )+ )
            // InternalForm.g:279:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_lesChoix_1_0= rulecheck ) )+
            {
            // InternalForm.g:279:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalForm.g:280:4: (lv_name_0_0= RULE_ID )
            {
            // InternalForm.g:280:4: (lv_name_0_0= RULE_ID )
            // InternalForm.g:281:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalForm.g:297:3: ( (lv_lesChoix_1_0= rulecheck ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalForm.g:298:4: (lv_lesChoix_1_0= rulecheck )
            	    {
            	    // InternalForm.g:298:4: (lv_lesChoix_1_0= rulecheck )
            	    // InternalForm.g:299:5: lv_lesChoix_1_0= rulecheck
            	    {

            	    					newCompositeNode(grammarAccess.getChoiceAccess().getLesChoixCheckParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_lesChoix_1_0=rulecheck();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lesChoix",
            	    						lv_lesChoix_1_0,
            	    						"mosig.asmae.acceleo.Form.check");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "rulechoice"


    // $ANTLR start "entryRulecheck"
    // InternalForm.g:320:1: entryRulecheck returns [EObject current=null] : iv_rulecheck= rulecheck EOF ;
    public final EObject entryRulecheck() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecheck = null;


        try {
            // InternalForm.g:320:46: (iv_rulecheck= rulecheck EOF )
            // InternalForm.g:321:2: iv_rulecheck= rulecheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecheck=rulecheck();

            state._fsp--;

             current =iv_rulecheck; 
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
    // $ANTLR end "entryRulecheck"


    // $ANTLR start "rulecheck"
    // InternalForm.g:327:1: rulecheck returns [EObject current=null] : (otherlv_0= '[]' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulecheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalForm.g:333:2: ( (otherlv_0= '[]' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalForm.g:334:2: (otherlv_0= '[]' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalForm.g:334:2: (otherlv_0= '[]' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalForm.g:335:3: otherlv_0= '[]' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getLeftSquareBracketRightSquareBracketKeyword_0());
            		
            // InternalForm.g:339:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalForm.g:340:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalForm.g:340:4: (lv_label_1_0= RULE_STRING )
            // InternalForm.g:341:5: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_label_1_0, grammarAccess.getCheckAccess().getLabelSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalForm.g:357:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalForm.g:358:4: (lv_name_2_0= RULE_ID )
            {
            // InternalForm.g:358:4: (lv_name_2_0= RULE_ID )
            // InternalForm.g:359:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCheckAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulecheck"


    // $ANTLR start "entryRuleoption"
    // InternalForm.g:379:1: entryRuleoption returns [EObject current=null] : iv_ruleoption= ruleoption EOF ;
    public final EObject entryRuleoption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoption = null;


        try {
            // InternalForm.g:379:47: (iv_ruleoption= ruleoption EOF )
            // InternalForm.g:380:2: iv_ruleoption= ruleoption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoption=ruleoption();

            state._fsp--;

             current =iv_ruleoption; 
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
    // $ANTLR end "entryRuleoption"


    // $ANTLR start "ruleoption"
    // InternalForm.g:386:1: ruleoption returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lesOptions_1_0= ruleradio ) )+ ) ;
    public final EObject ruleoption() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_lesOptions_1_0 = null;



        	enterRule();

        try {
            // InternalForm.g:392:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lesOptions_1_0= ruleradio ) )+ ) )
            // InternalForm.g:393:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lesOptions_1_0= ruleradio ) )+ )
            {
            // InternalForm.g:393:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lesOptions_1_0= ruleradio ) )+ )
            // InternalForm.g:394:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_lesOptions_1_0= ruleradio ) )+
            {
            // InternalForm.g:394:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalForm.g:395:4: (lv_name_0_0= RULE_ID )
            {
            // InternalForm.g:395:4: (lv_name_0_0= RULE_ID )
            // InternalForm.g:396:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalForm.g:412:3: ( (lv_lesOptions_1_0= ruleradio ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalForm.g:413:4: (lv_lesOptions_1_0= ruleradio )
            	    {
            	    // InternalForm.g:413:4: (lv_lesOptions_1_0= ruleradio )
            	    // InternalForm.g:414:5: lv_lesOptions_1_0= ruleradio
            	    {

            	    					newCompositeNode(grammarAccess.getOptionAccess().getLesOptionsRadioParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_lesOptions_1_0=ruleradio();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lesOptions",
            	    						lv_lesOptions_1_0,
            	    						"mosig.asmae.acceleo.Form.radio");
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
    // $ANTLR end "ruleoption"


    // $ANTLR start "entryRuleradio"
    // InternalForm.g:435:1: entryRuleradio returns [EObject current=null] : iv_ruleradio= ruleradio EOF ;
    public final EObject entryRuleradio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleradio = null;


        try {
            // InternalForm.g:435:46: (iv_ruleradio= ruleradio EOF )
            // InternalForm.g:436:2: iv_ruleradio= ruleradio EOF
            {
             newCompositeNode(grammarAccess.getRadioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleradio=ruleradio();

            state._fsp--;

             current =iv_ruleradio; 
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
    // $ANTLR end "entryRuleradio"


    // $ANTLR start "ruleradio"
    // InternalForm.g:442:1: ruleradio returns [EObject current=null] : (otherlv_0= '()' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleradio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalForm.g:448:2: ( (otherlv_0= '()' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalForm.g:449:2: (otherlv_0= '()' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalForm.g:449:2: (otherlv_0= '()' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalForm.g:450:3: otherlv_0= '()' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRadioAccess().getLeftParenthesisRightParenthesisKeyword_0());
            		
            // InternalForm.g:454:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalForm.g:455:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalForm.g:455:4: (lv_label_1_0= RULE_STRING )
            // InternalForm.g:456:5: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_label_1_0, grammarAccess.getRadioAccess().getLabelSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRadioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalForm.g:472:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalForm.g:473:4: (lv_name_2_0= RULE_ID )
            {
            // InternalForm.g:473:4: (lv_name_2_0= RULE_ID )
            // InternalForm.g:474:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRadioAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRadioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleradio"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});

}