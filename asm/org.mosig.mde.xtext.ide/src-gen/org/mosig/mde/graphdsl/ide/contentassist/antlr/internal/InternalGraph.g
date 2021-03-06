/*
 * generated by Xtext 2.25.0
 */
grammar InternalGraph;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.mosig.mde.graphdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleGraph
entryRuleGraph
:
{ before(grammarAccess.getGraphRule()); }
	 ruleGraph
{ after(grammarAccess.getGraphRule()); } 
	 EOF 
;

// Rule Graph
ruleGraph 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGraphAccess().getGroup()); }
		(rule__Graph__Group__0)?
		{ after(grammarAccess.getGraphAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNode
entryRuleNode
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNodeAccess().getGroup()); }
		(rule__Node__Group__0)
		{ after(grammarAccess.getNodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Graph__Group__0__Impl
	rule__Graph__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphAccess().getNodesKeyword_0()); }
	'Nodes'
	{ after(grammarAccess.getGraphAccess().getNodesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Graph__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGraphAccess().getTheNodesAssignment_1()); }
		(rule__Graph__TheNodesAssignment_1)
		{ after(grammarAccess.getGraphAccess().getTheNodesAssignment_1()); }
	)
	(
		{ before(grammarAccess.getGraphAccess().getTheNodesAssignment_1()); }
		(rule__Graph__TheNodesAssignment_1)*
		{ after(grammarAccess.getGraphAccess().getTheNodesAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__0__Impl
	rule__Node__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getNameAssignment_0()); }
	(rule__Node__NameAssignment_0)
	{ after(grammarAccess.getNodeAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getGroup_1()); }
	(rule__Node__Group_1__0)?
	{ after(grammarAccess.getNodeAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1__0__Impl
	rule__Node__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0()); }
	'['
	{ after(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1__1__Impl
	rule__Node__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNodeAccess().getNextAssignment_1_1()); }
		(rule__Node__NextAssignment_1_1)
		{ after(grammarAccess.getNodeAccess().getNextAssignment_1_1()); }
	)
	(
		{ before(grammarAccess.getNodeAccess().getNextAssignment_1_1()); }
		(rule__Node__NextAssignment_1_1)*
		{ after(grammarAccess.getNodeAccess().getNextAssignment_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_2()); }
	']'
	{ after(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Graph__TheNodesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGraphAccess().getTheNodesNodeParserRuleCall_1_0()); }
		ruleNode
		{ after(grammarAccess.getGraphAccess().getTheNodesNodeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__NextAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getNextNodeCrossReference_1_1_0()); }
		(
			{ before(grammarAccess.getNodeAccess().getNextNodeIDTerminalRuleCall_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getNodeAccess().getNextNodeIDTerminalRuleCall_1_1_0_1()); }
		)
		{ after(grammarAccess.getNodeAccess().getNextNodeCrossReference_1_1_0()); }
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
