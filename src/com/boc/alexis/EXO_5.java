package com.boc.alexis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EXO_5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        String[] results = new String[numberOfTestCases];

        for (int i = 0; i < numberOfTestCases; i++) {
            List<Integer> list = new ArrayList<>();
            int X = sc.nextInt();


            for (int j = 0; j < 1; j++) {
                System.out.println(X);
                int V = list.get(0);
                for (int k = 0; k < list.toArray().length; k++) {
                    System.out.println(list.get(0));
                }
            }

        }
    }
}
