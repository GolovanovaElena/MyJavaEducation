package ru.golovanova.FundamentalProgrammingStructures;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Enter an angle");
        int angle= line.nextInt();
        int normalizeAngle = angle % 360;
        if (normalizeAngle< 0) {
            normalizeAngle = normalizeAngle + 360;
        }
        System.out.println("Method 1: " + normalizeAngle);
        normalizeAngle = 0;
        normalizeAngle = Math.floorMod(angle, 360);
        System.out.println("Method 2: " + normalizeAngle);
    }
}
