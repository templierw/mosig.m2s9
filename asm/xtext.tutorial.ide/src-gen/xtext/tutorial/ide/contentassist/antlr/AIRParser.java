/*
 * generated by Xtext 2.25.0
 */
package xtext.tutorial.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import xtext.tutorial.ide.contentassist.antlr.internal.InternalAIRParser;
import xtext.tutorial.services.AIRGrammarAccess;

public class AIRParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AIRGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AIRGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives_1(), "rule__Model__Alternatives_1");
			builder.put(grammarAccess.getEnginesAccess().getAlternatives(), "rule__Engines__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getIncludesAccess().getGroup(), "rule__Includes__Group__0");
			builder.put(grammarAccess.getPlaneAccess().getGroup(), "rule__Plane__Group__0");
			builder.put(grammarAccess.getPlaneAccess().getGroup_3_0(), "rule__Plane__Group_3_0__0");
			builder.put(grammarAccess.getPlaneAccess().getGroup_3_1(), "rule__Plane__Group_3_1__0");
			builder.put(grammarAccess.getAirportAccess().getGroup(), "rule__Airport__Group__0");
			builder.put(grammarAccess.getAirportAccess().getGroup_3_0(), "rule__Airport__Group_3_0__0");
			builder.put(grammarAccess.getAirportAccess().getGroup_3_1(), "rule__Airport__Group_3_1__0");
			builder.put(grammarAccess.getAirportAccess().getGroup_3_2(), "rule__Airport__Group_3_2__0");
			builder.put(grammarAccess.getAirlineAccess().getGroup(), "rule__Airline__Group__0");
			builder.put(grammarAccess.getAirlineAccess().getGroup_3_0(), "rule__Airline__Group_3_0__0");
			builder.put(grammarAccess.getAirlineAccess().getGroup_3_1(), "rule__Airline__Group_3_1__0");
			builder.put(grammarAccess.getAirlineAccess().getGroup_3_2(), "rule__Airline__Group_3_2__0");
			builder.put(grammarAccess.getAirlineAccess().getGroup_3_3(), "rule__Airline__Group_3_3__0");
			builder.put(grammarAccess.getAirlineAccess().getGroup_3_4(), "rule__Airline__Group_3_4__0");
			builder.put(grammarAccess.getModelAccess().getIncludesAssignment_0(), "rule__Model__IncludesAssignment_0");
			builder.put(grammarAccess.getModelAccess().getPlanesAssignment_1_0(), "rule__Model__PlanesAssignment_1_0");
			builder.put(grammarAccess.getModelAccess().getAirportsAssignment_1_1(), "rule__Model__AirportsAssignment_1_1");
			builder.put(grammarAccess.getModelAccess().getAirlinesAssignment_2(), "rule__Model__AirlinesAssignment_2");
			builder.put(grammarAccess.getIncludesAccess().getImportURIAssignment_2(), "rule__Includes__ImportURIAssignment_2");
			builder.put(grammarAccess.getPlaneAccess().getNameAssignment_1(), "rule__Plane__NameAssignment_1");
			builder.put(grammarAccess.getPlaneAccess().getPassengersAssignment_3_0_2(), "rule__Plane__PassengersAssignment_3_0_2");
			builder.put(grammarAccess.getPlaneAccess().getMotorisationAssignment_3_1_2(), "rule__Plane__MotorisationAssignment_3_1_2");
			builder.put(grammarAccess.getAirportAccess().getTitleAssignment_1(), "rule__Airport__TitleAssignment_1");
			builder.put(grammarAccess.getAirportAccess().getNameAssignment_3_0_2(), "rule__Airport__NameAssignment_3_0_2");
			builder.put(grammarAccess.getAirportAccess().getCountryAssignment_3_1_2(), "rule__Airport__CountryAssignment_3_1_2");
			builder.put(grammarAccess.getAirportAccess().getRunwaysAssignment_3_2_2(), "rule__Airport__RunwaysAssignment_3_2_2");
			builder.put(grammarAccess.getAirlineAccess().getNameAssignment_1(), "rule__Airline__NameAssignment_1");
			builder.put(grammarAccess.getAirlineAccess().getPlaneAssignment_3_0_2(), "rule__Airline__PlaneAssignment_3_0_2");
			builder.put(grammarAccess.getAirlineAccess().getCompanyAssignment_3_1_2(), "rule__Airline__CompanyAssignment_3_1_2");
			builder.put(grammarAccess.getAirlineAccess().getDepartureAssignment_3_2_2(), "rule__Airline__DepartureAssignment_3_2_2");
			builder.put(grammarAccess.getAirlineAccess().getArrivalAssignment_3_3_2(), "rule__Airline__ArrivalAssignment_3_3_2");
			builder.put(grammarAccess.getAirlineAccess().getDurationAssignment_3_4_2(), "rule__Airline__DurationAssignment_3_4_2");
			builder.put(grammarAccess.getAirlineAccess().getRegularAssignment_3_5(), "rule__Airline__RegularAssignment_3_5");
			builder.put(grammarAccess.getCodeOACIAccess().getNameAssignment(), "rule__CodeOACI__NameAssignment");
			builder.put(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), "rule__Plane__UnorderedGroup_3");
			builder.put(grammarAccess.getAirportAccess().getUnorderedGroup_3(), "rule__Airport__UnorderedGroup_3");
			builder.put(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), "rule__Airline__UnorderedGroup_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AIRGrammarAccess grammarAccess;

	@Override
	protected InternalAIRParser createParser() {
		InternalAIRParser result = new InternalAIRParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AIRGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AIRGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
