package fr.n7.swingTableur;

public interface Contrainte {
    boolean verifier(String cellule);

    public final static int FORMAT_INT = 1;
    public final static int FORMAT_FLOAT = 2;
    public final static int FORMAT_STRING = 3;
    public final static int FORMAT_WORD = 4;

}
