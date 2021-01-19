package ru.golovanova.FundamentalProgrammingStructures;

public class Exercise5 {
    public static void main(String[] args) {
        double number = 20000000000.0;
        System.out.println("Enter" + number);
        int intNumber = (int) number;
        System.out.println("After " + intNumber);
        if (Integer.MAX_VALUE==intNumber)
            System.out.println("It is a correct");
        else System.out.println("error");
    }
}
