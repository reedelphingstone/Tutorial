package com.company;


import java.util.Scanner;

public class Factorial {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Factorial of what number?");
        int n = input.nextInt();
        System.out.println(factorial(n));

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
}

