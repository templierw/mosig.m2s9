/*
 * generated by Xtext 2.25.0
 */
package mosig.asmae.acceleo.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FormAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("mosig/asmae/acceleo/parser/antlr/internal/InternalForm.tokens");
	}
}
