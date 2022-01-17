/*
 * generated by Xtext 2.25.0
 */
package mosig.asmae.acceleo.parser.antlr;

import com.google.inject.Inject;
import mosig.asmae.acceleo.parser.antlr.internal.InternalFormParser;
import mosig.asmae.acceleo.services.FormGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class FormParser extends AbstractAntlrParser {

	@Inject
	private FormGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFormParser createParser(XtextTokenStream stream) {
		return new InternalFormParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public FormGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FormGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}