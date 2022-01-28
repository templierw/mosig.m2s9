/*
 * generated by Xtext 2.25.0
 */
grammar InternalForm;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package mosig.asmae.acceleo.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQuestion
entryRuleQuestion
:
{ before(grammarAccess.getQuestionRule()); }
	 ruleQuestion
{ after(grammarAccess.getQuestionRule()); } 
	 EOF 
;

// Rule Question
ruleQuestion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQuestionAccess().getGroup()); }
		(rule__Question__Group__0)
		{ after(grammarAccess.getQuestionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKind
entryRuleKind
:
{ before(grammarAccess.getKindRule()); }
	 ruleKind
{ after(grammarAccess.getKindRule()); } 
	 EOF 
;

// Rule Kind
ruleKind 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKindAccess().getAlternatives()); }
		(rule__Kind__Alternatives)
		{ after(grammarAccess.getKindAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleinput
entryRuleinput
:
{ before(grammarAccess.getInputRule()); }
	 ruleinput
{ after(grammarAccess.getInputRule()); } 
	 EOF 
;

// Rule input
ruleinput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputAccess().getNameAssignment()); }
		(rule__Input__NameAssignment)
		{ after(grammarAccess.getInputAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulechoice
entryRulechoice
:
{ before(grammarAccess.getChoiceRule()); }
	 rulechoice
{ after(grammarAccess.getChoiceRule()); } 
	 EOF 
;

// Rule choice
rulechoice 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChoiceAccess().getGroup()); }
		(rule__Choice__Group__0)
		{ after(grammarAccess.getChoiceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulecheck
entryRulecheck
:
{ before(grammarAccess.getCheckRule()); }
	 rulecheck
{ after(grammarAccess.getCheckRule()); } 
	 EOF 
;

// Rule check
rulecheck 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCheckAccess().getGroup()); }
		(rule__Check__Group__0)
		{ after(grammarAccess.getCheckAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleoption
entryRuleoption
:
{ before(grammarAccess.getOptionRule()); }
	 ruleoption
{ after(grammarAccess.getOptionRule()); } 
	 EOF 
;

// Rule option
ruleoption 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOptionAccess().getGroup()); }
		(rule__Option__Group__0)
		{ after(grammarAccess.getOptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleradio
entryRuleradio
:
{ before(grammarAccess.getRadioRule()); }
	 ruleradio
{ after(grammarAccess.getRadioRule()); } 
	 EOF 
;

// Rule radio
ruleradio 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRadioAccess().getGroup()); }
		(rule__Radio__Group__0)
		{ after(grammarAccess.getRadioAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Kind__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKindAccess().getInputParserRuleCall_0()); }
		ruleinput
		{ after(grammarAccess.getKindAccess().getInputParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getKindAccess().getChoiceParserRuleCall_1()); }
		rulechoice
		{ after(grammarAccess.getKindAccess().getChoiceParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getKindAccess().getOptionParserRuleCall_2()); }
		ruleoption
		{ after(grammarAccess.getKindAccess().getOptionParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getQuestionnaireKeyword_0()); }
	'Questionnaire'
	{ after(grammarAccess.getModelAccess().getQuestionnaireKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNameAssignment_1()); }
	(rule__Model__NameAssignment_1)
	{ after(grammarAccess.getModelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getLesQuestionsAssignment_2()); }
	(rule__Model__LesQuestionsAssignment_2)*
	{ after(grammarAccess.getModelAccess().getLesQuestionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__0__Impl
	rule__Question__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); }
	'Question'
	{ after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__1__Impl
	rule__Question__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getLabelAssignment_1()); }
	(rule__Question__LabelAssignment_1)
	{ after(grammarAccess.getQuestionAccess().getLabelAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getKindOfAssignment_2()); }
	(rule__Question__KindOfAssignment_2)
	{ after(grammarAccess.getQuestionAccess().getKindOfAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Choice__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choice__Group__0__Impl
	rule__Choice__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoiceAccess().getNameAssignment_0()); }
	(rule__Choice__NameAssignment_0)
	{ after(grammarAccess.getChoiceAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choice__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getChoiceAccess().getLesChoixAssignment_1()); }
		(rule__Choice__LesChoixAssignment_1)
		{ after(grammarAccess.getChoiceAccess().getLesChoixAssignment_1()); }
	)
	(
		{ before(grammarAccess.getChoiceAccess().getLesChoixAssignment_1()); }
		(rule__Choice__LesChoixAssignment_1)*
		{ after(grammarAccess.getChoiceAccess().getLesChoixAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Check__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Check__Group__0__Impl
	rule__Check__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Check__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheckAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); }
	'[]'
	{ after(grammarAccess.getCheckAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Check__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Check__Group__1__Impl
	rule__Check__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Check__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheckAccess().getLabelAssignment_1()); }
	(rule__Check__LabelAssignment_1)
	{ after(grammarAccess.getCheckAccess().getLabelAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Check__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Check__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Check__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheckAccess().getNameAssignment_2()); }
	(rule__Check__NameAssignment_2)
	{ after(grammarAccess.getCheckAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Option__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Option__Group__0__Impl
	rule__Option__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Option__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionAccess().getNameAssignment_0()); }
	(rule__Option__NameAssignment_0)
	{ after(grammarAccess.getOptionAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Option__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Option__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Option__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getOptionAccess().getLesOptionsAssignment_1()); }
		(rule__Option__LesOptionsAssignment_1)
		{ after(grammarAccess.getOptionAccess().getLesOptionsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getOptionAccess().getLesOptionsAssignment_1()); }
		(rule__Option__LesOptionsAssignment_1)*
		{ after(grammarAccess.getOptionAccess().getLesOptionsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Radio__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Radio__Group__0__Impl
	rule__Radio__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Radio__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRadioAccess().getLeftParenthesisRightParenthesisKeyword_0()); }
	'()'
	{ after(grammarAccess.getRadioAccess().getLeftParenthesisRightParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Radio__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Radio__Group__1__Impl
	rule__Radio__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Radio__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRadioAccess().getLabelAssignment_1()); }
	(rule__Radio__LabelAssignment_1)
	{ after(grammarAccess.getRadioAccess().getLabelAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Radio__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Radio__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Radio__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRadioAccess().getNameAssignment_2()); }
	(rule__Radio__NameAssignment_2)
	{ after(grammarAccess.getRadioAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__LesQuestionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getLesQuestionsQuestionParserRuleCall_2_0()); }
		ruleQuestion
		{ after(grammarAccess.getModelAccess().getLesQuestionsQuestionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__LabelAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getLabelSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getQuestionAccess().getLabelSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__KindOfAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getKindOfKindParserRuleCall_2_0()); }
		ruleKind
		{ after(grammarAccess.getQuestionAccess().getKindOfKindParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__LesChoixAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoiceAccess().getLesChoixCheckParserRuleCall_1_0()); }
		rulecheck
		{ after(grammarAccess.getChoiceAccess().getLesChoixCheckParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Check__LabelAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCheckAccess().getLabelSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getCheckAccess().getLabelSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Check__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCheckAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getCheckAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Option__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Option__LesOptionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionAccess().getLesOptionsRadioParserRuleCall_1_0()); }
		ruleradio
		{ after(grammarAccess.getOptionAccess().getLesOptionsRadioParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Radio__LabelAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRadioAccess().getLabelSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getRadioAccess().getLabelSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Radio__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRadioAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getRadioAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;