package com.company;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("please enter a value for Side 1");
        double Side1 = console.nextDouble();
        System.out.print("please enter a value for Side 2");
        double Side2 = console.nextDouble();
        System.out.print("please enter a value for Side 3");
        double Side3 = console.nextDouble();
        double SIDE1 = Side1 * Side1;
        double SIDE2 = Side2 * Side2;
        double SIDE3 = Side3 * Side3;
        if (SIDE1 + SIDE2 == SIDE3 || SIDE2 + SIDE3 == SIDE1 || SIDE1 + SIDE3 == SIDE2) {
            System.out.println("right triangle");

        }
        else if (Side1 + Side2 >= Side3 && Side2 + Side3 >= Side1 && Side1 + Side3 >= Side2){
            System.out.println("this is a triangle");

        }
        else
        {
            System.err.println("this is not a triangle");
        }

    }
}

