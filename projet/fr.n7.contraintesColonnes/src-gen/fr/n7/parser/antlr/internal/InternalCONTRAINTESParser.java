package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.CONTRAINTESGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCONTRAINTESParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'contrainte'", "'('", "','", "')'", "'{'", "';'", "'}'", "'valeur'", "'<'", "'<='", "'>'", "'>='", "'='", "'et'", "'ou'", "'!'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_FLOAT=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCONTRAINTESParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCONTRAINTESParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCONTRAINTESParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCONTRAINTES.g"; }



     	private CONTRAINTESGrammarAccess grammarAccess;

        public InternalCONTRAINTESParser(TokenStream input, CONTRAINTESGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EnsembleContraintes";
       	}

       	@Override
       	protected CONTRAINTESGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEnsembleContraintes"
    // InternalCONTRAINTES.g:65:1: entryRuleEnsembleContraintes returns [EObject current=null] : iv_ruleEnsembleContraintes= ruleEnsembleContraintes EOF ;
    public final EObject entryRuleEnsembleContraintes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsembleContraintes = null;


        try {
            // InternalCONTRAINTES.g:65:60: (iv_ruleEnsembleContraintes= ruleEnsembleContraintes EOF )
            // InternalCONTRAINTES.g:66:2: iv_ruleEnsembleContraintes= ruleEnsembleContraintes EOF
            {
             newCompositeNode(grammarAccess.getEnsembleContraintesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnsembleContraintes=ruleEnsembleContraintes();

            state._fsp--;

             current =iv_ruleEnsembleContraintes; 
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
    // $ANTLR end "entryRuleEnsembleContraintes"


    // $ANTLR start "ruleEnsembleContraintes"
    // InternalCONTRAINTES.g:72:1: ruleEnsembleContraintes returns [EObject current=null] : ( (lv_contraintes_0_0= ruleContrainte ) )+ ;
    public final EObject ruleEnsembleContraintes() throws RecognitionException {
        EObject current = null;

        EObject lv_contraintes_0_0 = null;



        	enterRule();

        try {
            // InternalCONTRAINTES.g:78:2: ( ( (lv_contraintes_0_0= ruleContrainte ) )+ )
            // InternalCONTRAINTES.g:79:2: ( (lv_contraintes_0_0= ruleContrainte ) )+
            {
            // InternalCONTRAINTES.g:79:2: ( (lv_contraintes_0_0= ruleContrainte ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCONTRAINTES.g:80:3: (lv_contraintes_0_0= ruleContrainte )
            	    {
            	    // InternalCONTRAINTES.g:80:3: (lv_contraintes_0_0= ruleContrainte )
            	    // InternalCONTRAINTES.g:81:4: lv_contraintes_0_0= ruleContrainte
            	    {

            	    				newCompositeNode(grammarAccess.getEnsembleContraintesAccess().getContraintesContrainteParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_contraintes_0_0=ruleContrainte();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getEnsembleContraintesRule());
            	    				}
            	    				add(
            	    					current,
            	    					"contraintes",
            	    					lv_contraintes_0_0,
            	    					"fr.n7.CONTRAINTES.Contrainte");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleEnsembleContraintes"


    // $ANTLR start "entryRuleContrainte"
    // InternalCONTRAINTES.g:101:1: entryRuleContrainte returns [EObject current=null] : iv_ruleContrainte= ruleContrainte EOF ;
    public final EObject entryRuleContrainte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContrainte = null;


        try {
            // InternalCONTRAINTES.g:101:51: (iv_ruleContrainte= ruleContrainte EOF )
            // InternalCONTRAINTES.g:102:2: iv_ruleContrainte= ruleContrainte EOF
            {
             newCompositeNode(grammarAccess.getContrainteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContrainte=ruleContrainte();

            state._fsp--;

             current =iv_ruleContrainte; 
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
    // $ANTLR end "entryRuleContrainte"


    // $ANTLR start "ruleContrainte"
    // InternalCONTRAINTES.g:108:1: ruleContrainte returns [EObject current=null] : (otherlv_0= 'contrainte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_colonnes_3_0= ruleColonne ) ) (otherlv_4= ',' ( (lv_colonnes_5_0= ruleColonne ) ) )* otherlv_6= ')' otherlv_7= '{' ( ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ';' )* otherlv_10= '}' ) ;
    public final EObject ruleContrainte() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_colonnes_3_0 = null;

        EObject lv_colonnes_5_0 = null;

        EObject lv_expression_8_0 = null;



        	enterRule();

        try {
            // InternalCONTRAINTES.g:114:2: ( (otherlv_0= 'contrainte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_colonnes_3_0= ruleColonne ) ) (otherlv_4= ',' ( (lv_colonnes_5_0= ruleColonne ) ) )* otherlv_6= ')' otherlv_7= '{' ( ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ';' )* otherlv_10= '}' ) )
            // InternalCONTRAINTES.g:115:2: (otherlv_0= 'contrainte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_colonnes_3_0= ruleColonne ) ) (otherlv_4= ',' ( (lv_colonnes_5_0= ruleColonne ) ) )* otherlv_6= ')' otherlv_7= '{' ( ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ';' )* otherlv_10= '}' )
            {
            // InternalCONTRAINTES.g:115:2: (otherlv_0= 'contrainte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_colonnes_3_0= ruleColonne ) ) (otherlv_4= ',' ( (lv_colonnes_5_0= ruleColonne ) ) )* otherlv_6= ')' otherlv_7= '{' ( ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ';' )* otherlv_10= '}' )
            // InternalCONTRAINTES.g:116:3: otherlv_0= 'contrainte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_colonnes_3_0= ruleColonne ) ) (otherlv_4= ',' ( (lv_colonnes_5_0= ruleColonne ) ) )* otherlv_6= ')' otherlv_7= '{' ( ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ';' )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContrainteAccess().getContrainteKeyword_0());
            		
            // InternalCONTRAINTES.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCONTRAINTES.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCONTRAINTES.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalCONTRAINTES.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContrainteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContrainteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getContrainteAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCONTRAINTES.g:142:3: ( (lv_colonnes_3_0= ruleColonne ) )
            // InternalCONTRAINTES.g:143:4: (lv_colonnes_3_0= ruleColonne )
            {
            // InternalCONTRAINTES.g:143:4: (lv_colonnes_3_0= ruleColonne )
            // InternalCONTRAINTES.g:144:5: lv_colonnes_3_0= ruleColonne
            {

            					newCompositeNode(grammarAccess.getContrainteAccess().getColonnesColonneParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_colonnes_3_0=ruleColonne();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContrainteRule());
            					}
            					add(
            						current,
            						"colonnes",
            						lv_colonnes_3_0,
            						"fr.n7.CONTRAINTES.Colonne");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCONTRAINTES.g:161:3: (otherlv_4= ',' ( (lv_colonnes_5_0= ruleColonne ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCONTRAINTES.g:162:4: otherlv_4= ',' ( (lv_colonnes_5_0= ruleColonne ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getContrainteAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCONTRAINTES.g:166:4: ( (lv_colonnes_5_0= ruleColonne ) )
            	    // InternalCONTRAINTES.g:167:5: (lv_colonnes_5_0= ruleColonne )
            	    {
            	    // InternalCONTRAINTES.g:167:5: (lv_colonnes_5_0= ruleColonne )
            	    // InternalCONTRAINTES.g:168:6: lv_colonnes_5_0= ruleColonne
            	    {

            	    						newCompositeNode(grammarAccess.getContrainteAccess().getColonnesColonneParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_colonnes_5_0=ruleColonne();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContrainteRule());
            	    						}
            	    						add(
            	    							current,
            	    							"colonnes",
            	    							lv_colonnes_5_0,
            	    							"fr.n7.CONTRAINTES.Colonne");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getContrainteAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getContrainteAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalCONTRAINTES.g:194:3: ( ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||LA3_0==19||LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCONTRAINTES.g:195:4: ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ';'
            	    {
            	    // InternalCONTRAINTES.g:195:4: ( (lv_expression_8_0= ruleExpression ) )
            	    // InternalCONTRAINTES.g:196:5: (lv_expression_8_0= ruleExpression )
            	    {
            	    // InternalCONTRAINTES.g:196:5: (lv_expression_8_0= ruleExpression )
            	    // InternalCONTRAINTES.g:197:6: lv_expression_8_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getContrainteAccess().getExpressionExpressionParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_expression_8_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContrainteRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expression",
            	    							lv_expression_8_0,
            	    							"fr.n7.CONTRAINTES.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_9, grammarAccess.getContrainteAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getContrainteAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleContrainte"


    // $ANTLR start "entryRuleColonne"
    // InternalCONTRAINTES.g:227:1: entryRuleColonne returns [EObject current=null] : iv_ruleColonne= ruleColonne EOF ;
    public final EObject entryRuleColonne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonne = null;


        try {
            // InternalCONTRAINTES.g:227:48: (iv_ruleColonne= ruleColonne EOF )
            // InternalCONTRAINTES.g:228:2: iv_ruleColonne= ruleColonne EOF
            {
             newCompositeNode(grammarAccess.getColonneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonne=ruleColonne();

            state._fsp--;

             current =iv_ruleColonne; 
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
    // $ANTLR end "entryRuleColonne"


    // $ANTLR start "ruleColonne"
    // InternalCONTRAINTES.g:234:1: ruleColonne returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleColonne() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCONTRAINTES.g:240:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCONTRAINTES.g:241:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCONTRAINTES.g:241:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCONTRAINTES.g:242:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCONTRAINTES.g:242:3: (lv_name_0_0= RULE_ID )
            // InternalCONTRAINTES.g:243:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getColonneAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColonneRule());
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
    // $ANTLR end "ruleColonne"


    // $ANTLR start "entryRuleExpression"
    // InternalCONTRAINTES.g:262:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCONTRAINTES.g:262:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCONTRAINTES.g:263:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCONTRAINTES.g:269:1: ruleExpression returns [EObject current=null] : (this_Comparaison_0= ruleComparaison | this_OperationBinaire_1= ruleOperationBinaire | this_OperationUnaire_2= ruleOperationUnaire ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparaison_0 = null;

        EObject this_OperationBinaire_1 = null;

        EObject this_OperationUnaire_2 = null;



        	enterRule();

        try {
            // InternalCONTRAINTES.g:275:2: ( (this_Comparaison_0= ruleComparaison | this_OperationBinaire_1= ruleOperationBinaire | this_OperationUnaire_2= ruleOperationUnaire ) )
            // InternalCONTRAINTES.g:276:2: (this_Comparaison_0= ruleComparaison | this_OperationBinaire_1= ruleOperationBinaire | this_OperationUnaire_2= ruleOperationUnaire )
            {
            // InternalCONTRAINTES.g:276:2: (this_Comparaison_0= ruleComparaison | this_OperationBinaire_1= ruleOperationBinaire | this_OperationUnaire_2= ruleOperationUnaire )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCONTRAINTES.g:277:3: this_Comparaison_0= ruleComparaison
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getComparaisonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comparaison_0=ruleComparaison();

                    state._fsp--;


                    			current = this_Comparaison_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCONTRAINTES.g:286:3: this_OperationBinaire_1= ruleOperationBinaire
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getOperationBinaireParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationBinaire_1=ruleOperationBinaire();

                    state._fsp--;


                    			current = this_OperationBinaire_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCONTRAINTES.g:295:3: this_OperationUnaire_2= ruleOperationUnaire
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getOperationUnaireParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationUnaire_2=ruleOperationUnaire();

                    state._fsp--;


                    			current = this_OperationUnaire_2;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleComparaison"
    // InternalCONTRAINTES.g:307:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalCONTRAINTES.g:307:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalCONTRAINTES.g:308:2: iv_ruleComparaison= ruleComparaison EOF
            {
             newCompositeNode(grammarAccess.getComparaisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparaison=ruleComparaison();

            state._fsp--;

             current =iv_ruleComparaison; 
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
    // $ANTLR end "entryRuleComparaison"


    // $ANTLR start "ruleComparaison"
    // InternalCONTRAINTES.g:314:1: ruleComparaison returns [EObject current=null] : (otherlv_0= 'valeur' ( (lv_comparateur_1_0= ruleComparateurType ) ) ( (lv_constante_2_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleComparaison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_constante_2_0=null;
        Enumerator lv_comparateur_1_0 = null;



        	enterRule();

        try {
            // InternalCONTRAINTES.g:320:2: ( (otherlv_0= 'valeur' ( (lv_comparateur_1_0= ruleComparateurType ) ) ( (lv_constante_2_0= RULE_FLOAT ) ) ) )
            // InternalCONTRAINTES.g:321:2: (otherlv_0= 'valeur' ( (lv_comparateur_1_0= ruleComparateurType ) ) ( (lv_constante_2_0= RULE_FLOAT ) ) )
            {
            // InternalCONTRAINTES.g:321:2: (otherlv_0= 'valeur' ( (lv_comparateur_1_0= ruleComparateurType ) ) ( (lv_constante_2_0= RULE_FLOAT ) ) )
            // InternalCONTRAINTES.g:322:3: otherlv_0= 'valeur' ( (lv_comparateur_1_0= ruleComparateurType ) ) ( (lv_constante_2_0= RULE_FLOAT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getComparaisonAccess().getValeurKeyword_0());
            		
            // InternalCONTRAINTES.g:326:3: ( (lv_comparateur_1_0= ruleComparateurType ) )
            // InternalCONTRAINTES.g:327:4: (lv_comparateur_1_0= ruleComparateurType )
            {
            // InternalCONTRAINTES.g:327:4: (lv_comparateur_1_0= ruleComparateurType )
            // InternalCONTRAINTES.g:328:5: lv_comparateur_1_0= ruleComparateurType
            {

            					newCompositeNode(grammarAccess.getComparaisonAccess().getComparateurComparateurTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_comparateur_1_0=ruleComparateurType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparaisonRule());
            					}
            					set(
            						current,
            						"comparateur",
            						lv_comparateur_1_0,
            						"fr.n7.CONTRAINTES.ComparateurType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCONTRAINTES.g:345:3: ( (lv_constante_2_0= RULE_FLOAT ) )
            // InternalCONTRAINTES.g:346:4: (lv_constante_2_0= RULE_FLOAT )
            {
            // InternalCONTRAINTES.g:346:4: (lv_constante_2_0= RULE_FLOAT )
            // InternalCONTRAINTES.g:347:5: lv_constante_2_0= RULE_FLOAT
            {
            lv_constante_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            					newLeafNode(lv_constante_2_0, grammarAccess.getComparaisonAccess().getConstanteFLOATTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparaisonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"constante",
            						lv_constante_2_0,
            						"fr.n7.CONTRAINTES.FLOAT");
            				

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
    // $ANTLR end "ruleComparaison"


    // $ANTLR start "entryRuleOperationBinaire"
    // InternalCONTRAINTES.g:367:1: entryRuleOperationBinaire returns [EObject current=null] : iv_ruleOperationBinaire= ruleOperationBinaire EOF ;
    public final EObject entryRuleOperationBinaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationBinaire = null;


        try {
            // InternalCONTRAINTES.g:367:57: (iv_ruleOperationBinaire= ruleOperationBinaire EOF )
            // InternalCONTRAINTES.g:368:2: iv_ruleOperationBinaire= ruleOperationBinaire EOF
            {
             newCompositeNode(grammarAccess.getOperationBinaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationBinaire=ruleOperationBinaire();

            state._fsp--;

             current =iv_ruleOperationBinaire; 
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
    // $ANTLR end "entryRuleOperationBinaire"


    // $ANTLR start "ruleOperationBinaire"
    // InternalCONTRAINTES.g:374:1: ruleOperationBinaire returns [EObject current=null] : (otherlv_0= '(' ( (lv_contrainteGauche_1_0= ruleExpression ) ) ( (lv_operande_2_0= ruleOperandeBinaireType ) ) ( (lv_contrainteDroite_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOperationBinaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_contrainteGauche_1_0 = null;

        Enumerator lv_operande_2_0 = null;

        EObject lv_contrainteDroite_3_0 = null;



        	enterRule();

        try {
            // InternalCONTRAINTES.g:380:2: ( (otherlv_0= '(' ( (lv_contrainteGauche_1_0= ruleExpression ) ) ( (lv_operande_2_0= ruleOperandeBinaireType ) ) ( (lv_contrainteDroite_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalCONTRAINTES.g:381:2: (otherlv_0= '(' ( (lv_contrainteGauche_1_0= ruleExpression ) ) ( (lv_operande_2_0= ruleOperandeBinaireType ) ) ( (lv_contrainteDroite_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalCONTRAINTES.g:381:2: (otherlv_0= '(' ( (lv_contrainteGauche_1_0= ruleExpression ) ) ( (lv_operande_2_0= ruleOperandeBinaireType ) ) ( (lv_contrainteDroite_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalCONTRAINTES.g:382:3: otherlv_0= '(' ( (lv_contrainteGauche_1_0= ruleExpression ) ) ( (lv_operande_2_0= ruleOperandeBinaireType ) ) ( (lv_contrainteDroite_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationBinaireAccess().getLeftParenthesisKeyword_0());
            		
            // InternalCONTRAINTES.g:386:3: ( (lv_contrainteGauche_1_0= ruleExpression ) )
            // InternalCONTRAINTES.g:387:4: (lv_contrainteGauche_1_0= ruleExpression )
            {
            // InternalCONTRAINTES.g:387:4: (lv_contrainteGauche_1_0= ruleExpression )
            // InternalCONTRAINTES.g:388:5: lv_contrainteGauche_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOperationBinaireAccess().getContrainteGaucheExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_contrainteGauche_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationBinaireRule());
            					}
            					set(
            						current,
            						"contrainteGauche",
            						lv_contrainteGauche_1_0,
            						"fr.n7.CONTRAINTES.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCONTRAINTES.g:405:3: ( (lv_operande_2_0= ruleOperandeBinaireType ) )
            // InternalCONTRAINTES.g:406:4: (lv_operande_2_0= ruleOperandeBinaireType )
            {
            // InternalCONTRAINTES.g:406:4: (lv_operande_2_0= ruleOperandeBinaireType )
            // InternalCONTRAINTES.g:407:5: lv_operande_2_0= ruleOperandeBinaireType
            {

            					newCompositeNode(grammarAccess.getOperationBinaireAccess().getOperandeOperandeBinaireTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_operande_2_0=ruleOperandeBinaireType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationBinaireRule());
            					}
            					set(
            						current,
            						"operande",
            						lv_operande_2_0,
            						"fr.n7.CONTRAINTES.OperandeBinaireType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCONTRAINTES.g:424:3: ( (lv_contrainteDroite_3_0= ruleExpression ) )
            // InternalCONTRAINTES.g:425:4: (lv_contrainteDroite_3_0= ruleExpression )
            {
            // InternalCONTRAINTES.g:425:4: (lv_contrainteDroite_3_0= ruleExpression )
            // InternalCONTRAINTES.g:426:5: lv_contrainteDroite_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOperationBinaireAccess().getContrainteDroiteExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_contrainteDroite_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationBinaireRule());
            					}
            					set(
            						current,
            						"contrainteDroite",
            						lv_contrainteDroite_3_0,
            						"fr.n7.CONTRAINTES.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationBinaireAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleOperationBinaire"


    // $ANTLR start "entryRuleOperationUnaire"
    // InternalCONTRAINTES.g:451:1: entryRuleOperationUnaire returns [EObject current=null] : iv_ruleOperationUnaire= ruleOperationUnaire EOF ;
    public final EObject entryRuleOperationUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationUnaire = null;


        try {
            // InternalCONTRAINTES.g:451:56: (iv_ruleOperationUnaire= ruleOperationUnaire EOF )
            // InternalCONTRAINTES.g:452:2: iv_ruleOperationUnaire= ruleOperationUnaire EOF
            {
             newCompositeNode(grammarAccess.getOperationUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationUnaire=ruleOperationUnaire();

            state._fsp--;

             current =iv_ruleOperationUnaire; 
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
    // $ANTLR end "entryRuleOperationUnaire"


    // $ANTLR start "ruleOperationUnaire"
    // InternalCONTRAINTES.g:458:1: ruleOperationUnaire returns [EObject current=null] : ( ( (lv_operande_0_0= ruleOperandeUnaireType ) ) otherlv_1= '(' ( (lv_contrainte_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleOperationUnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operande_0_0 = null;

        EObject lv_contrainte_2_0 = null;



        	enterRule();

        try {
            // InternalCONTRAINTES.g:464:2: ( ( ( (lv_operande_0_0= ruleOperandeUnaireType ) ) otherlv_1= '(' ( (lv_contrainte_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalCONTRAINTES.g:465:2: ( ( (lv_operande_0_0= ruleOperandeUnaireType ) ) otherlv_1= '(' ( (lv_contrainte_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalCONTRAINTES.g:465:2: ( ( (lv_operande_0_0= ruleOperandeUnaireType ) ) otherlv_1= '(' ( (lv_contrainte_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalCONTRAINTES.g:466:3: ( (lv_operande_0_0= ruleOperandeUnaireType ) ) otherlv_1= '(' ( (lv_contrainte_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalCONTRAINTES.g:466:3: ( (lv_operande_0_0= ruleOperandeUnaireType ) )
            // InternalCONTRAINTES.g:467:4: (lv_operande_0_0= ruleOperandeUnaireType )
            {
            // InternalCONTRAINTES.g:467:4: (lv_operande_0_0= ruleOperandeUnaireType )
            // InternalCONTRAINTES.g:468:5: lv_operande_0_0= ruleOperandeUnaireType
            {

            					newCompositeNode(grammarAccess.getOperationUnaireAccess().getOperandeOperandeUnaireTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_operande_0_0=ruleOperandeUnaireType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationUnaireRule());
            					}
            					set(
            						current,
            						"operande",
            						lv_operande_0_0,
            						"fr.n7.CONTRAINTES.OperandeUnaireType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationUnaireAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCONTRAINTES.g:489:3: ( (lv_contrainte_2_0= ruleExpression ) )
            // InternalCONTRAINTES.g:490:4: (lv_contrainte_2_0= ruleExpression )
            {
            // InternalCONTRAINTES.g:490:4: (lv_contrainte_2_0= ruleExpression )
            // InternalCONTRAINTES.g:491:5: lv_contrainte_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOperationUnaireAccess().getContrainteExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_contrainte_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationUnaireRule());
            					}
            					set(
            						current,
            						"contrainte",
            						lv_contrainte_2_0,
            						"fr.n7.CONTRAINTES.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationUnaireAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleOperationUnaire"


    // $ANTLR start "ruleComparateurType"
    // InternalCONTRAINTES.g:516:1: ruleComparateurType returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) ) ;
    public final Enumerator ruleComparateurType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCONTRAINTES.g:522:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) ) )
            // InternalCONTRAINTES.g:523:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) )
            {
            // InternalCONTRAINTES.g:523:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCONTRAINTES.g:524:3: (enumLiteral_0= '<' )
                    {
                    // InternalCONTRAINTES.g:524:3: (enumLiteral_0= '<' )
                    // InternalCONTRAINTES.g:525:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getComparateurTypeAccess().getInfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparateurTypeAccess().getInfEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCONTRAINTES.g:532:3: (enumLiteral_1= '<=' )
                    {
                    // InternalCONTRAINTES.g:532:3: (enumLiteral_1= '<=' )
                    // InternalCONTRAINTES.g:533:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getComparateurTypeAccess().getInfegEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparateurTypeAccess().getInfegEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCONTRAINTES.g:540:3: (enumLiteral_2= '>' )
                    {
                    // InternalCONTRAINTES.g:540:3: (enumLiteral_2= '>' )
                    // InternalCONTRAINTES.g:541:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getComparateurTypeAccess().getSupEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparateurTypeAccess().getSupEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCONTRAINTES.g:548:3: (enumLiteral_3= '>=' )
                    {
                    // InternalCONTRAINTES.g:548:3: (enumLiteral_3= '>=' )
                    // InternalCONTRAINTES.g:549:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getComparateurTypeAccess().getSupegEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparateurTypeAccess().getSupegEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCONTRAINTES.g:556:3: (enumLiteral_4= '=' )
                    {
                    // InternalCONTRAINTES.g:556:3: (enumLiteral_4= '=' )
                    // InternalCONTRAINTES.g:557:4: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getComparateurTypeAccess().getEgEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparateurTypeAccess().getEgEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleComparateurType"


    // $ANTLR start "ruleOperandeBinaireType"
    // InternalCONTRAINTES.g:567:1: ruleOperandeBinaireType returns [Enumerator current=null] : ( (enumLiteral_0= 'et' ) | (enumLiteral_1= 'ou' ) ) ;
    public final Enumerator ruleOperandeBinaireType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONTRAINTES.g:573:2: ( ( (enumLiteral_0= 'et' ) | (enumLiteral_1= 'ou' ) ) )
            // InternalCONTRAINTES.g:574:2: ( (enumLiteral_0= 'et' ) | (enumLiteral_1= 'ou' ) )
            {
            // InternalCONTRAINTES.g:574:2: ( (enumLiteral_0= 'et' ) | (enumLiteral_1= 'ou' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCONTRAINTES.g:575:3: (enumLiteral_0= 'et' )
                    {
                    // InternalCONTRAINTES.g:575:3: (enumLiteral_0= 'et' )
                    // InternalCONTRAINTES.g:576:4: enumLiteral_0= 'et'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getOperandeBinaireTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperandeBinaireTypeAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCONTRAINTES.g:583:3: (enumLiteral_1= 'ou' )
                    {
                    // InternalCONTRAINTES.g:583:3: (enumLiteral_1= 'ou' )
                    // InternalCONTRAINTES.g:584:4: enumLiteral_1= 'ou'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getOperandeBinaireTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperandeBinaireTypeAccess().getOrEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleOperandeBinaireType"


    // $ANTLR start "ruleOperandeUnaireType"
    // InternalCONTRAINTES.g:594:1: ruleOperandeUnaireType returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleOperandeUnaireType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCONTRAINTES.g:600:2: ( (enumLiteral_0= '!' ) )
            // InternalCONTRAINTES.g:601:2: (enumLiteral_0= '!' )
            {
            // InternalCONTRAINTES.g:601:2: (enumLiteral_0= '!' )
            // InternalCONTRAINTES.g:602:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

            			current = grammarAccess.getOperandeUnaireTypeAccess().getNonEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOperandeUnaireTypeAccess().getNonEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleOperandeUnaireType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000080C2000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008082000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});

}