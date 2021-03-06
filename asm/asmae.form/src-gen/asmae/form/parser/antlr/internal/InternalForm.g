/*
 * generated by Xtext 2.25.0
 */
grammar InternalForm;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package asmae.form.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package asmae.form.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import asmae.form.services.FormGrammarAccess;

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Questionnaire'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getQuestionnaireKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getLesQuestionsQuestionParserRuleCall_2_0());
				}
				lv_lesQuestions_2_0=ruleQuestion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"lesQuestions",
						lv_lesQuestions_2_0,
						"asmae.form.Form.Question");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	iv_ruleQuestion=ruleQuestion
	{ $current=$iv_ruleQuestion.current; }
	EOF;

// Rule Question
ruleQuestion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Question'
		{
			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
		}
		(
			(
				lv_label_1_0=RULE_STRING
				{
					newLeafNode(lv_label_1_0, grammarAccess.getQuestionAccess().getLabelSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQuestionRule());
					}
					setWithLastConsumed(
						$current,
						"label",
						lv_label_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getQuestionAccess().getKindOfKindParserRuleCall_2_0());
				}
				lv_kindOf_2_0=ruleKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuestionRule());
					}
					set(
						$current,
						"kindOf",
						lv_kindOf_2_0,
						"asmae.form.Form.Kind");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleKind
entryRuleKind returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKindRule()); }
	iv_ruleKind=ruleKind
	{ $current=$iv_ruleKind.current; }
	EOF;

// Rule Kind
ruleKind returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getKindAccess().getInputParserRuleCall_0());
		}
		this_input_0=ruleinput
		{
			$current = $this_input_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getKindAccess().getChoiceParserRuleCall_1());
		}
		this_choice_1=rulechoice
		{
			$current = $this_choice_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getKindAccess().getOptionParserRuleCall_2());
		}
		this_option_2=ruleoption
		{
			$current = $this_option_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleinput
entryRuleinput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleinput=ruleinput
	{ $current=$iv_ruleinput.current; }
	EOF;

// Rule input
ruleinput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getInputRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRulechoice
entryRulechoice returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChoiceRule()); }
	iv_rulechoice=rulechoice
	{ $current=$iv_rulechoice.current; }
	EOF;

// Rule choice
rulechoice returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChoiceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getChoiceAccess().getLesChoixCheckParserRuleCall_1_0());
				}
				lv_lesChoix_1_0=rulecheck
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChoiceRule());
					}
					add(
						$current,
						"lesChoix",
						lv_lesChoix_1_0,
						"asmae.form.Form.check");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRulecheck
entryRulecheck returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCheckRule()); }
	iv_rulecheck=rulecheck
	{ $current=$iv_rulecheck.current; }
	EOF;

// Rule check
rulecheck returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[]'
		{
			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getLeftSquareBracketRightSquareBracketKeyword_0());
		}
		(
			(
				lv_label_1_0=RULE_STRING
				{
					newLeafNode(lv_label_1_0, grammarAccess.getCheckAccess().getLabelSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCheckRule());
					}
					setWithLastConsumed(
						$current,
						"label",
						lv_label_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getCheckAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCheckRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleoption
entryRuleoption returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptionRule()); }
	iv_ruleoption=ruleoption
	{ $current=$iv_ruleoption.current; }
	EOF;

// Rule option
ruleoption returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOptionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionAccess().getLesOptionsRadioParserRuleCall_1_0());
				}
				lv_lesOptions_1_0=ruleradio
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionRule());
					}
					add(
						$current,
						"lesOptions",
						lv_lesOptions_1_0,
						"asmae.form.Form.radio");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleradio
entryRuleradio returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRadioRule()); }
	iv_ruleradio=ruleradio
	{ $current=$iv_ruleradio.current; }
	EOF;

// Rule radio
ruleradio returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='()'
		{
			newLeafNode(otherlv_0, grammarAccess.getRadioAccess().getLeftParenthesisRightParenthesisKeyword_0());
		}
		(
			(
				lv_label_1_0=RULE_STRING
				{
					newLeafNode(lv_label_1_0, grammarAccess.getRadioAccess().getLabelSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRadioRule());
					}
					setWithLastConsumed(
						$current,
						"label",
						lv_label_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getRadioAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRadioRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
