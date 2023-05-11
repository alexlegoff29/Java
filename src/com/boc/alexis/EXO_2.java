package com.boc.alexis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EXO_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        int[] results_1 = new int[numberOfTestCases];
        int[] results_2 = new int[numberOfTestCases];
        String[] final_results = new String[numberOfTestCases];

        for (int i = 0; i < numberOfTestCases; i++) {
            int numberOfTodoList = sc.nextInt();
            List<Integer> todoListAlice = new ArrayList<>();
            List<Integer> todoListBob = new ArrayList<>();

            for (int j = 0; j < numberOfTodoList; j++) {
                todoListAlice.add(sc.nextInt());
                results_1[i] = todoListAlice.stream().mapToInt(Integer::intValue).sum();
                todoListBob.add(sc.nextInt());
                results_2[i] = todoListBob.stream().mapToInt(Integer::intValue).sum();
            }
            //System.out.println(Arrays.toString(results_1));
            //System.out.println(Arrays.toString(results_2));

            if(results_1[i] < results_2[i]){
                //System.out.println("Alice"); // Alice gagne
                final_results[i] = "Alice";
            } else if(results_1[i] == results_2[i]){
                //System.out.println("Draw"); // Égalité
                final_results[i] = "Draw";
            } else {
                //System.out.println("Bob"); // Bob gagne
                final_results[i] = "Bob";
            }
        }
        System.out.println(Arrays.toString(final_results));
    }
}
