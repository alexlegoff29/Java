package com.boc.alexis.devoirs;

import java.util.Scanner;

public class Exercice_4 {
    public static void main(String[] args) {
        String[] prenoms = {"Alexis", "BREwen", "Théo", "Theo", "Lucas", "Yann", "yaNn", "Osman", "osmaN"}; // Tableau des prénoms

        Scanner sc = new Scanner(System.in);
        int nbCaracteres = sc.nextInt(); // Lit le nombre de caractères que l'utilisateur souhaite

        // Appelle la méthode "dernierPrenom" pour récupérer le dernier prénom correspondant au nombre renté par l'utilisateur
        String dernierPrenom = dernierPrenom(nbCaracteres, prenoms);

        System.out.println("Le dernier prénom avec " + nbCaracteres + " caractères est : " + dernierPrenom); // Affiche le résultat
    }

    public static String dernierPrenom(int nbCaracteres, String[] prenoms) {
        String resultat = null; // Initialiser résultat

        for (int i = prenoms.length - 1; i >= 0; i--) { // Parcourt le tableau de la fin vers le début
            if (prenoms[i].length() == nbCaracteres) { // Si le prénom a le nombre de caractères demandé
                resultat = prenoms[i]; // Alors enregistre le prénom dans résultat
                break;
            }
        }

        return resultat; // Retourne le dernier prénom correspondant ou null si aucun prénom ne correspond
    }
}