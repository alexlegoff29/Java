package com.boc.alexis.devoirs;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Exercice_3 {

    public static void main(String[] args) {
        // Tableau des prénoms
        String[] prenoms = {"Alexis", "BREwen", "Théo", "Theo", "Lucas", "Yann", "yaNn", "Osman", "osmaN"};
        // Map pour stocker les prénoms et les nombre de fois qu'il y a les prénoms
        Map<String, Integer> map = new HashMap<>();

        // Un for pour parcourir le tableau
        for (String prenom : prenoms) {
            prenom = prenom.toLowerCase(); // Met les prénom en minuscules
            prenom = prenom.replaceAll("[éèêë]", "e"); // Remplace les caractères avec accent par sans accent
            prenom = prenom.replaceAll("[àâä]", "a");
            prenom = prenom.replaceAll("[îï]", "i");
            prenom = prenom.replaceAll("[ôö]", "o");
            prenom = prenom.replaceAll("[ûü]", "u");

            // Si le prénom est déjà dans la Map alors on ajoute 1 à sa valeur de base
            if (map.containsKey(prenom)) {
                map.put(prenom, map.get(prenom) + 1);
            } else { // Sinon on ajoute une nouvelle valeur
                map.put(prenom, 1);
            }
        }

        // Pour stocker les nombres des prénoms uniques
        List<Integer> resultat = new ArrayList<>(map.values());
        // Pour stocker les prénoms uniques
        List<String> prenomsUniques = new ArrayList<>(map.keySet());

        // Affichage du tableau de résultats
        System.out.println(resultat);
        System.out.println();

        // Comme le tableau resultat ne correspond pas au résultat demandé : [1, 1, 2, 1, 2, 2]
        // Alors j'ai fais une boucle pour afficher les nombres et les prénoms correspondants
        for (int i = 0; i < resultat.size(); i++) {
            System.out.println(resultat.get(i) + " fois : " + prenomsUniques.get(i));
        }
    }
}
