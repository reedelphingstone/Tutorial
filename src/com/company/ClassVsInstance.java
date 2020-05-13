package com.company;

import java.util.Scanner;

public class ClassVsInstance {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many years are passing?");
        int years = console.nextInt();
        System.out.println("What is the initial age of this person?");
        int initialAge = console.nextInt();
        if (initialAge < 0) {
            initialAge = 0;
            System.out.println("Age invalid. Setting age to zero.");
        }
        if (initialAge >= 0 && initialAge < 13){
            System.out.println("You are young.");
        }
        if (initialAge >= 13 && initialAge < 18){
            System.out.println("You are a teenager.");
        }
        if(initialAge >= 18){
            System.out.println("You are old");
        }

        int futureAge = initialAge + years;

        if (futureAge >= 0 && futureAge < 13){
            System.out.println("In " + years + " years, you will be young.");
        }
        if (futureAge >= 13 && futureAge < 18){
            System.out.println("In " + years + " years, you will be a teenager.");
        }
        if(futureAge >= 18){
            System.out.println("In " + years + " years, you will be old.");
        }


    }
}
