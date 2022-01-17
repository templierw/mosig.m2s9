/*
 * generated by Xtext 2.25.0
 */
grammar InternalFamily;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.mosig.lab4.myfamily.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.mosig.lab4.myfamily.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mosig.lab4.myfamily.services.FamilyGrammarAccess;

}

@parser::members {

 	private FamilyGrammarAccess grammarAccess;

    public InternalFamilyParser(TokenStream input, FamilyGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected FamilyGrammarAccess getGrammarAccess() {
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
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getFamiliesFamilyParserRuleCall_0());
			}
			lv_families_0_0=ruleFamily
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"families",
					lv_families_0_0,
					"org.mosig.lab4.myfamily.Family.Family");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleFamily
entryRuleFamily returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFamilyRule()); }
	iv_ruleFamily=ruleFamily
	{ $current=$iv_ruleFamily.current; }
	EOF;

// Rule Family
ruleFamily returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Family'
		{
			newLeafNode(otherlv_0, grammarAccess.getFamilyAccess().getFamilyKeyword_0());
		}
		(
			(
				lv_surname_1_0=RULE_ID
				{
					newLeafNode(lv_surname_1_0, grammarAccess.getFamilyAccess().getSurnameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFamilyRule());
					}
					setWithLastConsumed(
						$current,
						"surname",
						lv_surname_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='Father'
			{
				newLeafNode(otherlv_3, grammarAccess.getFamilyAccess().getFatherKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFamilyRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getFamilyAccess().getFMemberCrossReference_3_1_0());
					}
				)
			)
		)?
		(
			otherlv_5='Mother'
			{
				newLeafNode(otherlv_5, grammarAccess.getFamilyAccess().getMotherKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFamilyRule());
						}
					}
					otherlv_6=RULE_ID
					{
						newLeafNode(otherlv_6, grammarAccess.getFamilyAccess().getMMemberCrossReference_4_1_0());
					}
				)
			)
		)?
		(
			otherlv_7='Sons'
			{
				newLeafNode(otherlv_7, grammarAccess.getFamilyAccess().getSonsKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFamilyAccess().getSMemberParserRuleCall_5_1_0());
					}
					lv_s_8_0=ruleMember
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFamilyRule());
						}
						add(
							$current,
							"s",
							lv_s_8_0,
							"org.mosig.lab4.myfamily.Family.Member");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		(
			otherlv_9='Daughters'
			{
				newLeafNode(otherlv_9, grammarAccess.getFamilyAccess().getDaughtersKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFamilyAccess().getDMemberParserRuleCall_6_1_0());
					}
					lv_d_10_0=ruleMember
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFamilyRule());
						}
						add(
							$current,
							"d",
							lv_d_10_0,
							"org.mosig.lab4.myfamily.Family.Member");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleMember
entryRuleMember returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberRule()); }
	iv_ruleMember=ruleMember
	{ $current=$iv_ruleMember.current; }
	EOF;

// Rule Member
ruleMember returns [EObject current=null]
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
				newLeafNode(lv_name_0_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getMemberRule());
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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
