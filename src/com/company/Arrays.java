package com.company;

import java.util.*;

public class Arrays {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many values in the array?");
        int n = input.nextInt();
        int array[] = new int [n];
        System.out.println("Enter " + n + " values for the array");
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        int x;
        int start = 0;
        int end = n - 1;

        while(start < end) {
            x = array[start];
            array[start] = array[end];
            array[end] = x;

            start++;
            end--;
        }

        for (int j = 0; j < n; j++){
            System.out.print(array[j]);
        }

    }
}
