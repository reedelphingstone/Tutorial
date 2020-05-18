package com.company;

import java.util.Scanner;

public class EvenOddString {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        do {
            System.out.println("How many test cases?");
            n = input.nextInt();
        }
        while (n < 1 || n > 10);
        for (int i = 1; i <= n; i++) {
            System.out.println("What word would you like?");
            String word = input.next();
            Scrabble(word);
        }

    }
    public static void Scrabble (String word){
        for (int i = 0; i < word.length(); i+= 2){
            System.out.print(word.charAt(i));
        }
        System.out.print(" ");
        for (int i = 1; i < word.length(); i+= 2){
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
}
