package com.company;

import java.util.Scanner;

public class BandMatrix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the size of the matrix");
        int width = console.nextInt();
        System.out.println("Please enter the size of the step");
        int step = console.nextInt();


        for(int row = 0; row < width; row++) {
            for(int trig1 = 0; trig1 < row - step; trig1++) {
                System.out.print("0");
            }
            for(int s = 0; s<= step + row; s++){
                System.out.print("*");
            }

            for(int trig2 = 1; trig2 < width - row - step; trig2++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
