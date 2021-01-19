package ru.golovanova.FundamentalProgrammingStructures;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Enter string");
        String str = line.next();
        for (int i = 0; i <= str.length() ; i++)
            for (int j = i + 1; j <= str.length() ; j++)
                System.out.println(str.substring(i, j));
    }
}
