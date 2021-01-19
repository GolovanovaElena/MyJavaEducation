package ru.golovanova.FundamentalProgrammingStructures;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Enter numbers");
        int oneNumber = Integer.parseUnsignedInt(line.next());
        int twoNumber = Integer.parseUnsignedInt(line.next());
        int sum = oneNumber+twoNumber;
        System.out.println("Sum:" + sum);
        int difference = Math.abs(oneNumber - twoNumber);
        System.out.println("Difference:" + difference);
        int product = oneNumber * twoNumber;
        System.out.println("Product:" + product);
        double quotient = (double) oneNumber/ (double) twoNumber;
        System.out.println("Quotient:" + quotient);
        int intQuotient = oneNumber/ twoNumber;
        System.out.println("Integer Quotient:" + intQuotient);
        int remainder= oneNumber % twoNumber;
        System.out.println("Remainder:" + remainder);
    }
}
