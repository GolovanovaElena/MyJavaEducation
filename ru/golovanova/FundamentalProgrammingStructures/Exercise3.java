package ru.golovanova.FundamentalProgrammingStructures;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Enter numbers");
        int one = line.nextInt();
        int two = line.nextInt();
        int three = line.nextInt();


        System.out.println("Method 1:");

        if (one > two) {
            if (one > three) {
                System.out.println("Max number is " + one);
            } else {
                System.out.println("Max number is " + three);
            }

        } else {
            if (two > three) {
                System.out.println("Max number is " + two);
            } else {
                System.out.println("Max number is " + three);
            }
        }

        System.out.println("Method 2:");
        int max = Math.max(one, two);
        max = Math.max(max, three);
        System.out.println("Max number is " + max);
    }

}
