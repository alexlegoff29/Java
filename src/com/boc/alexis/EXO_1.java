package com.boc.alexis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EXO_1 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        String[] results = new String[numberOfTestCases];

        for (int i = 0; i < numberOfTestCases; i++) {
            List<Integer> todoListDifficultyRatings = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                todoListDifficultyRatings.add(sc.nextInt());
            }
            int x = todoListDifficultyRatings.get(0);
            int y = todoListDifficultyRatings.get(1);
            int a = todoListDifficultyRatings.get(2);

            if(a>=x && a<y){
                results[i] = "Yes";
            } else {
                results[i] = "NO";
            }
        }
        System.out.println(Arrays.toString(results));
    }

}

