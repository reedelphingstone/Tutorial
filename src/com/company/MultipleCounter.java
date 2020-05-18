package com.company;

import java.util.Scanner;

public class MultipleCounter {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        while( n < 2 || n > 20){
            System.out.println("What number would you like?");
            n = scanner.nextInt();
        }

        for (int i = 1; i <=10; i++){
            System.out.println( n + " x " + i + " = " + n*i);
        }

    }
}
