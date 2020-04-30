package com.company;
import java.util.*;
public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("please enter a number");
        int number = console.nextInt();
        System.out.print("please enter an exponent");
        int exponent = console.nextInt();
        System.out.println(number + "  " + exponent);
        double sum = 0;
        for(int i = 1;i<=number;i++){
            sum = sum + 1/(Math.pow(i, exponent));}
        System.out.println(sum);
    }}
