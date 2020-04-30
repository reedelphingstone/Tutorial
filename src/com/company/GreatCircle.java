package com.company;

import java.util.Scanner;

public class GreatCircle {
    public static final double RAD = 6371.0;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("please enter a x1 and y1 values");
        double x1 = Math.toRadians(console.nextDouble());
        double y1 = Math.toRadians(console.nextDouble());
        System.out.print("please enter a x2 and y2 values");
        double x2 = Math.toRadians(console.nextDouble());
        double y2 = Math.toRadians(console.nextDouble());
        calculateDistance(x1,x2,y1,y2);
    }
    public static void calculateDistance(double x1, double x2, double y1, double y2)
    {
        double diffx = (x2-x1)/2;
        double diffy = (y2-y1)/2;
        double insideSqrt = Math.pow(Math.sin(diffx),2) + Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin(diffy),2);
        double distance = 2*RAD*Math.asin(Math.sqrt(insideSqrt));
        System.out.printf("Distance:  %-10.2f:  ", distance);
    }

}
