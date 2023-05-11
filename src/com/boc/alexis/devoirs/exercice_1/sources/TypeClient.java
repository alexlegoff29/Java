package com.boc.alexis.devoirs.exercice_1.sources;

public enum TypeClient {
    PARTICULIER(1, "Particulier"),
    ENTREPRISE(2, "Entreprise");

    private final int id;
    private final String nom;

    TypeClient(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public static TypeClient getById(int id) {
        for (TypeClient type : TypeClient.values()) {
            if (type.getId() == id) {
                return type;
            }
        }
        return null;
    }
}

