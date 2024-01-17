package fr.n7.swingTableur;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContrainteType implements Contrainte {
    private int formatExpected;

    public ContrainteType(int formatExpected) {
        this.formatExpected = formatExpected;
    }

    @Override
    public boolean verifier(String cellule) {
        switch (formatExpected) {
            case Contrainte.FORMAT_INT:
                return verifierExpressionReguliere(cellule, "-?\\d+");
            case Contrainte.FORMAT_FLOAT:
                return verifierExpressionReguliere(cellule, "-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?");
            case Contrainte.FORMAT_STRING:
                // Aucune contrainte pour les chaînes de caractères
                return true;
            default:
                return false;
        }
    }

    private boolean verifierExpressionReguliere(String valeur, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(valeur);
        return matcher.matches();
    }
}
