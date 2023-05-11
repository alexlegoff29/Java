package com.boc.alexis.devoirs.exercice_1.sources;

public class Chambre {
    private int numeroChambre;
    private TypeChambre typeChambre;
    private boolean disponible;

    public Chambre(int numeroChambre, TypeChambre typeChambre, boolean disponible) {
        this.numeroChambre = numeroChambre;
        this.typeChambre = typeChambre;
        this.disponible = disponible;
    }

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


}

