package com.company;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = console.nextInt();

        if(num % 2 != 0 || num >= 6 && num <= 20)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }
}