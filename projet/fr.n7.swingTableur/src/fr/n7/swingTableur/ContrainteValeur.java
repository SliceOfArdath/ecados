package fr.n7.swingTableur;

import fr.n7.swingTableur.Contrainte;

public class ContrainteValeur implements Contrainte {
    private float borneMin;

    public float getBorneMin() {
        return borneMin;
    }

    public void setBorneMin(float borneMin) {
        this.borneMin = borneMin;
    }

    private float borneMax;

    public float getBorneMax() {
        return borneMax;
    }

    public void setBorneMax(float borneMax) {
        this.borneMax = borneMax;
    }

    public ContrainteValeur(float borneMin, float borneMax) {
        this.borneMin = borneMin;
        this.borneMax = borneMax;
    }

    public ContrainteValeur() {
        this.borneMin = Float.MIN_VALUE;
        this.borneMax = Float.MAX_VALUE;
    }

    public ContrainteValeur(float borneMin) {
        this.borneMin = borneMin;
        this.borneMax = Float.MAX_VALUE;
    }

    @Override
    public boolean verifier(String cellule) {
        try {
            float rs = Float.parseFloat(cellule);
            return rs >= borneMin && rs <= borneMax;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
