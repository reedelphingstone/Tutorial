package com.company;

import java.util.Scanner;
import java.util.Random;

public class RandomWalk {
    public static void main(String[] args) {
        int currentX = 0;
        int currentY = 0;
        int ManDistance = 0;
        int steps = 0;

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the distance");
        int r = console.nextInt();
        Random Randy = new Random();


        while (ManDistance != r) {
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

            System.out.println("(" + currentX + "," + currentY + ")");
            steps++;
            ManDistance = Math.abs(currentX) + Math.abs(currentY);

        }
        System.out.println("To get the Manhattan distance of " + r + " you walked " + steps + " steps");
    }
}
