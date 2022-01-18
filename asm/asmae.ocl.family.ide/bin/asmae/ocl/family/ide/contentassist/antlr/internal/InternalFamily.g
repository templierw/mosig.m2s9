/*
 * generated by Xtext 2.25.0
 */
grammar InternalFamily;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package asmae.ocl.family.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package asmae.ocl.family.ide.contentassist.antlr.internal;

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
import asmae.ocl.family.services.FamilyGrammarAccess;

}
@parser::members {
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
}

// Entry rule entryRuleFamilyModel
entryRuleFamilyModel
:
{ before(grammarAccess.getFamilyModelRule()); }
	 ruleFamilyModel
{ after(grammarAccess.getFamilyModelRule()); } 
	 EOF 
;

// Rule FamilyModel
ruleFamilyModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFamilyModelAccess().getFamiliesAssignment()); }
		(rule__FamilyModel__FamiliesAssignment)*
		{ after(grammarAccess.getFamilyModelAccess().getFamiliesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFamily
entryRuleFamily
:
{ before(grammarAccess.getFamilyRule()); }
	 ruleFamily
{ after(grammarAccess.getFamilyRule()); } 
	 EOF 
;

// Rule Family
ruleFamily 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFamilyAccess().getGroup()); }
		(rule__Family__Group__0)
		{ after(grammarAccess.getFamilyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMember
entryRuleMember
:
{ before(grammarAccess.getMemberRule()); }
	 ruleMember
{ after(grammarAccess.getMemberRule()); } 
	 EOF 
;

// Rule Member
ruleMember 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberAccess().getNameAssignment()); }
		(rule__Member__NameAssignment)
		{ after(grammarAccess.getMemberAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group__0__Impl
	rule__Family__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getFamilyKeyword_0()); }
	'Family'
	{ after(grammarAccess.getFamilyAccess().getFamilyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group__1__Impl
	rule__Family__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getLastNameAssignment_1()); }
	(rule__Family__LastNameAssignment_1)
	{ after(grammarAccess.getFamilyAccess().getLastNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group__2__Impl
	rule__Family__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group__3__Impl
	rule__Family__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getGroup_3()); }
	(rule__Family__Group_3__0)?
	{ after(grammarAccess.getFamilyAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group__4__Impl
	rule__Family__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getGroup_4()); }
	(rule__Family__Group_4__0)?
	{ after(grammarAccess.getFamilyAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group__5__Impl
	rule__Family__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getGroup_5()); }
	(rule__Family__Group_5__0)?
	{ after(grammarAccess.getFamilyAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group__6__Impl
	rule__Family__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getGroup_6()); }
	(rule__Family__Group_6__0)?
	{ after(grammarAccess.getFamilyAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Family__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group_3__0__Impl
	rule__Family__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getFatherKeyword_3_0()); }
	'Father'
	{ after(grammarAccess.getFamilyAccess().getFatherKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getFatherAssignment_3_1()); }
	(rule__Family__FatherAssignment_3_1)
	{ after(grammarAccess.getFamilyAccess().getFatherAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Family__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group_4__0__Impl
	rule__Family__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getMotherKeyword_4_0()); }
	'Mother'
	{ after(grammarAccess.getFamilyAccess().getMotherKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getMotherAssignment_4_1()); }
	(rule__Family__MotherAssignment_4_1)
	{ after(grammarAccess.getFamilyAccess().getMotherAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Family__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group_5__0__Impl
	rule__Family__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getSonsKeyword_5_0()); }
	'Sons'
	{ after(grammarAccess.getFamilyAccess().getSonsKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getFamilyAccess().getSonsAssignment_5_1()); }
		(rule__Family__SonsAssignment_5_1)
		{ after(grammarAccess.getFamilyAccess().getSonsAssignment_5_1()); }
	)
	(
		{ before(grammarAccess.getFamilyAccess().getSonsAssignment_5_1()); }
		(rule__Family__SonsAssignment_5_1)*
		{ after(grammarAccess.getFamilyAccess().getSonsAssignment_5_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Family__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group_6__0__Impl
	rule__Family__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getDaughtersKeyword_6_0()); }
	'Daughters'
	{ after(grammarAccess.getFamilyAccess().getDaughtersKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getFamilyAccess().getDaughtersAssignment_6_1()); }
		(rule__Family__DaughtersAssignment_6_1)
		{ after(grammarAccess.getFamilyAccess().getDaughtersAssignment_6_1()); }
	)
	(
		{ before(grammarAccess.getFamilyAccess().getDaughtersAssignment_6_1()); }
		(rule__Family__DaughtersAssignment_6_1)*
		{ after(grammarAccess.getFamilyAccess().getDaughtersAssignment_6_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FamilyModel__FamiliesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFamilyModelAccess().getFamiliesFamilyParserRuleCall_0()); }
		ruleFamily
		{ after(grammarAccess.getFamilyModelAccess().getFamiliesFamilyParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__LastNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFamilyAccess().getLastNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFamilyAccess().getLastNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__FatherAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFamilyAccess().getFatherMemberCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getFamilyAccess().getFatherMemberIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFamilyAccess().getFatherMemberIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getFamilyAccess().getFatherMemberCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__MotherAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFamilyAccess().getMotherMemberCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getFamilyAccess().getMotherMemberIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFamilyAccess().getMotherMemberIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getFamilyAccess().getMotherMemberCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__SonsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFamilyAccess().getSonsMemberParserRuleCall_5_1_0()); }
		ruleMember
		{ after(grammarAccess.getFamilyAccess().getSonsMemberParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__DaughtersAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFamilyAccess().getDaughtersMemberParserRuleCall_6_1_0()); }
		ruleMember
		{ after(grammarAccess.getFamilyAccess().getDaughtersMemberParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0()); }
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
