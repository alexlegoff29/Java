package com.boc.alexis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EXO_4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        String[] results = new String[numberOfTestCases];

        for (int i = 0; i < numberOfTestCases; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < 4; j++) {
                list.add(sc.nextInt());
            }
            int A = list.get(0);
            int B = list.get(1);
            int C = list.get(2);
            int D = list.get(3);

            if(A<B){
                A = A + C;
                B = B + D;
                if(A>B){
                    //System.out.println("N");
                    results[i] = "N";
                } else if(A==B){
                    //System.out.println("N");
                    results[i] = "N";
                } else {
                    //System.out.println("S");
                    results[i] = "S";
                }
            } else if(A==B) {
                //System.out.println("N");
                results[i] = "N";
            } else{
                A = A + D;
                B = B + C;
                if(A>B){
                    //System.out.println("N");
                    results[i] = "N";
                } else if(A==B){
                    //System.out.println("N");
                    results[i] = "N";
                } else {
                    //System.out.println("S");
                    results[i] = "S";
                }
            }

        }

        System.out.println(Arrays.toString(results));

    }
}
