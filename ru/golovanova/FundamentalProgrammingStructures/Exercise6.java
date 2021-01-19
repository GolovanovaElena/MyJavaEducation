package ru.golovanova.FundamentalProgrammingStructures;

import java.util.Scanner;
import java.math.BigInteger;

public class Exercise6 {
        public static void main(String[] args) {
            Scanner line = new Scanner(System.in);
            System.out.println("Enter number");
            int number = line.nextInt();
            BigInteger factorial = new BigInteger("1");
            for (int i = 2; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(factorial);
        }
}
