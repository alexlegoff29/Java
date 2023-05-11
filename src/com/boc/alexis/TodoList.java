package com.boc.alexis;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TodoList {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        int[] results = new int[numberOfTestCases];

        for (int i = 0; i < numberOfTestCases; i++) {
            int numberOfTodoList = sc.nextInt();
            List<Integer> todoListDifficultyRatings = new ArrayList<>();

            for (int j = 0; j < numberOfTodoList; j++) {
                todoListDifficultyRatings.add(sc.nextInt());
            }
            int numberOfTodoListToDelete = getNumberOfTodoListToDelete(todoListDifficultyRatings);
            results[i] = numberOfTodoListToDelete;
        }
        System.out.println(Arrays.toString(results));
    }

    static int getNumberOfTodoListToDelete(List<Integer> todoListDifficultyRatings){
        int numberOfTodoListToDelete = 0;
        for(int i = 0; i<todoListDifficultyRatings.size(); i++){
            if(todoListDifficultyRatings.get(i) >= 1000){
                numberOfTodoListToDelete++;
            }
        }
        return numberOfTodoListToDelete;
    }
}
