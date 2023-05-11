package com.boc.alexis.devoirs.exercice_1.sources;

public enum TypeChambre {
    SIMPLE(1, "Simple", 50, 1),
    DOUBLE(2, "Double", 80, 2),
    SUITE(3, "Suite", 150, 4);

    private final int id;
    private final String nom;
    private final double prix;
    private final int capacite;

    TypeChambre(int id, String nom, double prix, int capacite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.capacite = capacite;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getCapacite() {
        return capacite;
    }

    public static TypeChambre getById(int id) {
        for (TypeChambre type : TypeChambre.values()) {
            if (type.getId() == id) {
                return type;
            }
        }
        return null;
    }
}

