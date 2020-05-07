package com.company;

import java.util.Random;
import java.util.Scanner;

public class AvgRandWalk {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the distance");
        double r = console.nextDouble();
        System.out.println("Please enter the number of trials");
        double trial= console.nextDouble();
        double totalSteps= 0;
        double averageSteps;

        Random Randy = new Random();

        double currentX = 0;
        double currentY = 0;
        double Distance = 0;
        double steps = 0;

        for(int i = 1; i <= trial; i ++) {

            while (Distance != r) {
                int dir = Randy.nextInt(4);
                switch (dir)
                {
                    case 0:
                        currentY++;
                        break;
                    case 1:
                        currentX--;
                        break;
                    case 2:
                        currentY--;
                        break;
                    case 3:
                        currentX++;
                        break;
                }

                steps++;
                Distance = Math.abs(currentX) + Math.abs(currentY);

            }

            totalSteps += steps;
        }

        System.out.println(totalSteps);
        averageSteps = (totalSteps / trial);

        System.out.println("Average number of steps = " + averageSteps);

    }

}

