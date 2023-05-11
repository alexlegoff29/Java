package com.boc.alexis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EXO_3 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        String[] results = new String[numberOfTestCases];

        for (int i = 0; i < numberOfTestCases; i++) {
            List<Integer> todoListDifficultyRatings = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                todoListDifficultyRatings.add(sc.nextInt());
            }
            int N = todoListDifficultyRatings.get(0);
            int X = todoListDifficultyRatings.get(1);

            if(N>X){
                results[i] = "N superieur";
            } else {
                results[i] = "X superieur";
            }
        }
        //System.out.println(Arrays.toString(results));
    }
}
