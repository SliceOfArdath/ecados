/*
 * generated by Xtext 2.23.0
 */
package fr.n7.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CONTRAINTESGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class EnsembleContraintesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.EnsembleContraintes");
		private final Assignment cContraintesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContraintesContrainteParserRuleCall_0 = (RuleCall)cContraintesAssignment.eContents().get(0);
		
		//EnsembleContraintes:
		//	contraintes+=Contrainte+;
		@Override public ParserRule getRule() { return rule; }
		
		//contraintes+=Contrainte+
		public Assignment getContraintesAssignment() { return cContraintesAssignment; }
		
		//Contrainte
		public RuleCall getContraintesContrainteParserRuleCall_0() { return cContraintesContrainteParserRuleCall_0; }
	}
	public class ContrainteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.Contrainte");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContrainteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cColonnesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cColonnesColonneParserRuleCall_3_0 = (RuleCall)cColonnesAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cColonnesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cColonnesColonneParserRuleCall_4_1_0 = (RuleCall)cColonnesAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Assignment cExpressionAssignment_7_0 = (Assignment)cGroup_7.eContents().get(0);
		private final RuleCall cExpressionExpressionParserRuleCall_7_0_0 = (RuleCall)cExpressionAssignment_7_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Contrainte:
		//	'contrainte' name=ID '(' colonnes+=Colonne (',' colonnes+=Colonne)* ')' '{' (expression+=Expression ';')*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'contrainte' name=ID '(' colonnes+=Colonne (',' colonnes+=Colonne)* ')' '{' (expression+=Expression ';')* '}'
		public Group getGroup() { return cGroup; }
		
		//'contrainte'
		public Keyword getContrainteKeyword_0() { return cContrainteKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//colonnes+=Colonne
		public Assignment getColonnesAssignment_3() { return cColonnesAssignment_3; }
		
		//Colonne
		public RuleCall getColonnesColonneParserRuleCall_3_0() { return cColonnesColonneParserRuleCall_3_0; }
		
		//(',' colonnes+=Colonne)*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//colonnes+=Colonne
		public Assignment getColonnesAssignment_4_1() { return cColonnesAssignment_4_1; }
		
		//Colonne
		public RuleCall getColonnesColonneParserRuleCall_4_1_0() { return cColonnesColonneParserRuleCall_4_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//(expression+=Expression ';')*
		public Group getGroup_7() { return cGroup_7; }
		
		//expression+=Expression
		public Assignment getExpressionAssignment_7_0() { return cExpressionAssignment_7_0; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_7_0_0() { return cExpressionExpressionParserRuleCall_7_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7_1() { return cSemicolonKeyword_7_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class ColonneElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.Colonne");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Colonne:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cComparaisonParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOperationBinaireParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cOperationUnaireParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Expression:
		//	Comparaison | OperationBinaire | OperationUnaire;
		@Override public ParserRule getRule() { return rule; }
		
		//Comparaison | OperationBinaire | OperationUnaire
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Comparaison
		public RuleCall getComparaisonParserRuleCall_0() { return cComparaisonParserRuleCall_0; }
		
		//OperationBinaire
		public RuleCall getOperationBinaireParserRuleCall_1() { return cOperationBinaireParserRuleCall_1; }
		
		//OperationUnaire
		public RuleCall getOperationUnaireParserRuleCall_2() { return cOperationUnaireParserRuleCall_2; }
	}
	public class ComparaisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.Comparaison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cValeurKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComparateurAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cComparateurComparateurTypeEnumRuleCall_1_0 = (RuleCall)cComparateurAssignment_1.eContents().get(0);
		private final Assignment cConstanteAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConstanteFLOATTerminalRuleCall_2_0 = (RuleCall)cConstanteAssignment_2.eContents().get(0);
		
		//Comparaison:
		//	'valeur' comparateur=ComparateurType constante=FLOAT;
		@Override public ParserRule getRule() { return rule; }
		
		//'valeur' comparateur=ComparateurType constante=FLOAT
		public Group getGroup() { return cGroup; }
		
		//'valeur'
		public Keyword getValeurKeyword_0() { return cValeurKeyword_0; }
		
		//comparateur=ComparateurType
		public Assignment getComparateurAssignment_1() { return cComparateurAssignment_1; }
		
		//ComparateurType
		public RuleCall getComparateurComparateurTypeEnumRuleCall_1_0() { return cComparateurComparateurTypeEnumRuleCall_1_0; }
		
		//constante=FLOAT
		public Assignment getConstanteAssignment_2() { return cConstanteAssignment_2; }
		
		//FLOAT
		public RuleCall getConstanteFLOATTerminalRuleCall_2_0() { return cConstanteFLOATTerminalRuleCall_2_0; }
	}
	public class OperationBinaireElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.OperationBinaire");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cContrainteGaucheAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cContrainteGaucheExpressionParserRuleCall_1_0 = (RuleCall)cContrainteGaucheAssignment_1.eContents().get(0);
		private final Assignment cOperandeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOperandeOperandeBinaireTypeEnumRuleCall_2_0 = (RuleCall)cOperandeAssignment_2.eContents().get(0);
		private final Assignment cContrainteDroiteAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContrainteDroiteExpressionParserRuleCall_3_0 = (RuleCall)cContrainteDroiteAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//OperationBinaire:
		//	'(' contrainteGauche=Expression operande=OperandeBinaireType contrainteDroite=Expression ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' contrainteGauche=Expression operande=OperandeBinaireType contrainteDroite=Expression ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//contrainteGauche=Expression
		public Assignment getContrainteGaucheAssignment_1() { return cContrainteGaucheAssignment_1; }
		
		//Expression
		public RuleCall getContrainteGaucheExpressionParserRuleCall_1_0() { return cContrainteGaucheExpressionParserRuleCall_1_0; }
		
		//operande=OperandeBinaireType
		public Assignment getOperandeAssignment_2() { return cOperandeAssignment_2; }
		
		//OperandeBinaireType
		public RuleCall getOperandeOperandeBinaireTypeEnumRuleCall_2_0() { return cOperandeOperandeBinaireTypeEnumRuleCall_2_0; }
		
		//contrainteDroite=Expression
		public Assignment getContrainteDroiteAssignment_3() { return cContrainteDroiteAssignment_3; }
		
		//Expression
		public RuleCall getContrainteDroiteExpressionParserRuleCall_3_0() { return cContrainteDroiteExpressionParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class OperationUnaireElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.OperationUnaire");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOperandeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOperandeOperandeUnaireTypeEnumRuleCall_0_0 = (RuleCall)cOperandeAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContrainteAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContrainteExpressionParserRuleCall_2_0 = (RuleCall)cContrainteAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//OperationUnaire:
		//	operande=OperandeUnaireType '(' contrainte=Expression ')';
		@Override public ParserRule getRule() { return rule; }
		
		//operande=OperandeUnaireType '(' contrainte=Expression ')'
		public Group getGroup() { return cGroup; }
		
		//operande=OperandeUnaireType
		public Assignment getOperandeAssignment_0() { return cOperandeAssignment_0; }
		
		//OperandeUnaireType
		public RuleCall getOperandeOperandeUnaireTypeEnumRuleCall_0_0() { return cOperandeOperandeUnaireTypeEnumRuleCall_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//contrainte=Expression
		public Assignment getContrainteAssignment_2() { return cContrainteAssignment_2; }
		
		//Expression
		public RuleCall getContrainteExpressionParserRuleCall_2_0() { return cContrainteExpressionParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	
	public class ComparateurTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.ComparateurType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cInfEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cInfLessThanSignKeyword_0_0 = (Keyword)cInfEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cInfegEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cInfegLessThanSignEqualsSignKeyword_1_0 = (Keyword)cInfegEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSupEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSupGreaterThanSignKeyword_2_0 = (Keyword)cSupEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cSupegEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cSupegGreaterThanSignEqualsSignKeyword_3_0 = (Keyword)cSupegEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cEgEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cEgEqualsSignKeyword_4_0 = (Keyword)cEgEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum ComparateurType:
		//	inf='<'
		//	| infeg='<='
		//	| sup='>'
		//	| supeg='>='
		//	| eg='=';
		public EnumRule getRule() { return rule; }
		
		//inf='<' | infeg='<=' | sup='>' | supeg='>=' | eg='='
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//inf='<'
		public EnumLiteralDeclaration getInfEnumLiteralDeclaration_0() { return cInfEnumLiteralDeclaration_0; }
		
		//'<'
		public Keyword getInfLessThanSignKeyword_0_0() { return cInfLessThanSignKeyword_0_0; }
		
		//infeg='<='
		public EnumLiteralDeclaration getInfegEnumLiteralDeclaration_1() { return cInfegEnumLiteralDeclaration_1; }
		
		//'<='
		public Keyword getInfegLessThanSignEqualsSignKeyword_1_0() { return cInfegLessThanSignEqualsSignKeyword_1_0; }
		
		//sup='>'
		public EnumLiteralDeclaration getSupEnumLiteralDeclaration_2() { return cSupEnumLiteralDeclaration_2; }
		
		//'>'
		public Keyword getSupGreaterThanSignKeyword_2_0() { return cSupGreaterThanSignKeyword_2_0; }
		
		//supeg='>='
		public EnumLiteralDeclaration getSupegEnumLiteralDeclaration_3() { return cSupegEnumLiteralDeclaration_3; }
		
		//'>='
		public Keyword getSupegGreaterThanSignEqualsSignKeyword_3_0() { return cSupegGreaterThanSignEqualsSignKeyword_3_0; }
		
		//eg='='
		public EnumLiteralDeclaration getEgEnumLiteralDeclaration_4() { return cEgEnumLiteralDeclaration_4; }
		
		//'='
		public Keyword getEgEqualsSignKeyword_4_0() { return cEgEqualsSignKeyword_4_0; }
	}
	public class OperandeBinaireTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.OperandeBinaireType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAndEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAndEtKeyword_0_0 = (Keyword)cAndEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOrEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cOrOuKeyword_1_0 = (Keyword)cOrEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum OperandeBinaireType:
		//	and='et'
		//	| or='ou';
		public EnumRule getRule() { return rule; }
		
		//and='et' | or='ou'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//and='et'
		public EnumLiteralDeclaration getAndEnumLiteralDeclaration_0() { return cAndEnumLiteralDeclaration_0; }
		
		//'et'
		public Keyword getAndEtKeyword_0_0() { return cAndEtKeyword_0_0; }
		
		//or='ou'
		public EnumLiteralDeclaration getOrEnumLiteralDeclaration_1() { return cOrEnumLiteralDeclaration_1; }
		
		//'ou'
		public Keyword getOrOuKeyword_1_0() { return cOrOuKeyword_1_0; }
	}
	public class OperandeUnaireTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.OperandeUnaireType");
		private final EnumLiteralDeclaration cNonEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cNonExclamationMarkKeyword_0 = (Keyword)cNonEnumLiteralDeclaration.eContents().get(0);
		
		//enum OperandeUnaireType:
		//	non='!';
		public EnumRule getRule() { return rule; }
		
		//non='!'
		public EnumLiteralDeclaration getNonEnumLiteralDeclaration() { return cNonEnumLiteralDeclaration; }
		
		//'!'
		public Keyword getNonExclamationMarkKeyword_0() { return cNonExclamationMarkKeyword_0; }
	}
	
	private final EnsembleContraintesElements pEnsembleContraintes;
	private final ContrainteElements pContrainte;
	private final ColonneElements pColonne;
	private final ExpressionElements pExpression;
	private final ComparaisonElements pComparaison;
	private final ComparateurTypeElements eComparateurType;
	private final TerminalRule tFLOAT;
	private final OperationBinaireElements pOperationBinaire;
	private final OperandeBinaireTypeElements eOperandeBinaireType;
	private final OperationUnaireElements pOperationUnaire;
	private final OperandeUnaireTypeElements eOperandeUnaireType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CONTRAINTESGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEnsembleContraintes = new EnsembleContraintesElements();
		this.pContrainte = new ContrainteElements();
		this.pColonne = new ColonneElements();
		this.pExpression = new ExpressionElements();
		this.pComparaison = new ComparaisonElements();
		this.eComparateurType = new ComparateurTypeElements();
		this.tFLOAT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.CONTRAINTES.FLOAT");
		this.pOperationBinaire = new OperationBinaireElements();
		this.eOperandeBinaireType = new OperandeBinaireTypeElements();
		this.pOperationUnaire = new OperationUnaireElements();
		this.eOperandeUnaireType = new OperandeUnaireTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.n7.CONTRAINTES".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//EnsembleContraintes:
	//	contraintes+=Contrainte+;
	public EnsembleContraintesElements getEnsembleContraintesAccess() {
		return pEnsembleContraintes;
	}
	
	public ParserRule getEnsembleContraintesRule() {
		return getEnsembleContraintesAccess().getRule();
	}
	
	//Contrainte:
	//	'contrainte' name=ID '(' colonnes+=Colonne (',' colonnes+=Colonne)* ')' '{' (expression+=Expression ';')*
	//	'}';
	public ContrainteElements getContrainteAccess() {
		return pContrainte;
	}
	
	public ParserRule getContrainteRule() {
		return getContrainteAccess().getRule();
	}
	
	//Colonne:
	//	name=ID;
	public ColonneElements getColonneAccess() {
		return pColonne;
	}
	
	public ParserRule getColonneRule() {
		return getColonneAccess().getRule();
	}
	
	//Expression:
	//	Comparaison | OperationBinaire | OperationUnaire;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Comparaison:
	//	'valeur' comparateur=ComparateurType constante=FLOAT;
	public ComparaisonElements getComparaisonAccess() {
		return pComparaison;
	}
	
	public ParserRule getComparaisonRule() {
		return getComparaisonAccess().getRule();
	}
	
	//enum ComparateurType:
	//	inf='<'
	//	| infeg='<='
	//	| sup='>'
	//	| supeg='>='
	//	| eg='=';
	public ComparateurTypeElements getComparateurTypeAccess() {
		return eComparateurType;
	}
	
	public EnumRule getComparateurTypeRule() {
		return getComparateurTypeAccess().getRule();
	}
	
	//terminal FLOAT returns ecore::EFloat:
	//	('-' | '+')? INT ('.' INT)?;
	public TerminalRule getFLOATRule() {
		return tFLOAT;
	}
	
	//OperationBinaire:
	//	'(' contrainteGauche=Expression operande=OperandeBinaireType contrainteDroite=Expression ')';
	public OperationBinaireElements getOperationBinaireAccess() {
		return pOperationBinaire;
	}
	
	public ParserRule getOperationBinaireRule() {
		return getOperationBinaireAccess().getRule();
	}
	
	//enum OperandeBinaireType:
	//	and='et'
	//	| or='ou';
	public OperandeBinaireTypeElements getOperandeBinaireTypeAccess() {
		return eOperandeBinaireType;
	}
	
	public EnumRule getOperandeBinaireTypeRule() {
		return getOperandeBinaireTypeAccess().getRule();
	}
	
	//OperationUnaire:
	//	operande=OperandeUnaireType '(' contrainte=Expression ')';
	public OperationUnaireElements getOperationUnaireAccess() {
		return pOperationUnaire;
	}
	
	public ParserRule getOperationUnaireRule() {
		return getOperationUnaireAccess().getRule();
	}
	
	//enum OperandeUnaireType:
	//	non='!';
	public OperandeUnaireTypeElements getOperandeUnaireTypeAccess() {
		return eOperandeUnaireType;
	}
	
	public EnumRule getOperandeUnaireTypeRule() {
		return getOperandeUnaireTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
