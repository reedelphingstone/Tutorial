package com.company;
import java.util.*;

public class CMYKtoRGB {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("please enter a C value");
        double C = console.nextDouble();
        System.out.print("please enter a M value");
        double M = console.nextDouble();
        System.out.print("please enter a Y value");
        double Y = console.nextDouble();
        System.out.print("please enter a K value");
        double K = console.nextDouble();
        System.out.println(C + "  " + M + "  " + Y + "  " + K);
        double white = 1-K;
        int red = (int) (255 * white * (1-C)); //this is type casting from double to int
        int green = (int) (255 * white * (1-M));
        int blue = (int) (255 * white * (1-Y));
        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);

    }}
