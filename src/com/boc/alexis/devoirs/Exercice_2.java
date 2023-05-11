package com.boc.alexis.devoirs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercice_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt(); // Lit le nombre test écrit par l'utilisateur -> EX: 3
        sc.nextLine();

        String[] results = new String[numberOfTestCases]; // Stock les résultats

        for (int i = 0; i < numberOfTestCases; i++) {
            String expression = sc.nextLine(); // Lit l'expression écrit par l'utilisateur pour chaque test -> Ex: (a+(b*c))
            List<Character> stack = new ArrayList<>();

            String output = ""; // Chaîne de caractères pour stocker la sortie = ""

            for (char c : expression.toCharArray()) { // Parcour chaque caractère
                if (Character.isLetter(c)) { // Si le caractère est une lettre, on ajoute directement à output
                    output += c;
                } else if ("+-*/^".indexOf(c) != -1) { // Sinon, si le caractère n'est pas une lettre (EX: +, -, *, ...) alors l'ajouter à c (sauf les parenthèses)
                    stack.add(c);
                } else if (c == '(') { // Sinon, si le caractère est une parenthèse ouverte alors l'ajouter à c
                    stack.add(c);
                } else if (c == ')') { // Sinon, si le caractère est une parenthèse fermé alors continuer dans le code

                    for (int j = stack.size()-1; j >= 0; j--) { // Parcour le stack de la fin au début
                        char b = stack.get(j);

                        if (b != '(') { // Si b est une parenthèse ouverte alors ajouter à output le b
                            output += b;
                            stack.remove(j);
                        } else { // Si b est une parenthèse fermé alors enlever la parenthèse et stopper la boucle
                            stack.remove(j);
                            break;
                        }
                    }

                }
            }
            results[i] = output; // Ajouter la sortie au tableau des résultats
        }

        // Afficher les résultats
        System.out.println(Arrays.toString(results));
    }
}
