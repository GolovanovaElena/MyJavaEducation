package ru.golovanova.FundamentalProgrammingStructures;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = line.nextInt();
        System.out.println("Binary system:"+Integer.toBinaryString(number));
        System.out.println("Octal system:"+Integer.toOctalString(number));
        System.out.println("Hexadecimal system:"+Integer.toHexString(number));
        float reciprocal = (float) (1.0 / number);
        System.out.println("Reciprocal number in hexadecimal system:: " + Float.toHexString(reciprocal));
    }
}
