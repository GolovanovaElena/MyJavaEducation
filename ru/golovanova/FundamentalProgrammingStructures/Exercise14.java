package ru.golovanova.FundamentalProgrammingStructures;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Enter numbers");
        String str = line.nextLine();
        String[] arr = str.split("\\s");

        int size = arr.length;
        int oneDiagonal = 0;
        int twoDiagonal = 0;

        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Integer.parseInt(arr[j]);
            }
            str = line.nextLine();
            arr = str.split("\\s");
        }

        for (int i = 0; i < size; i++) {
            oneDiagonal += matrix[i][i];
            twoDiagonal += matrix[size - i - 1][size - i - 1];
        }

        if (oneDiagonal != twoDiagonal) {
            System.out.println("It is not magic square");
        } else {
            for (int i = 0; i < size; i++) {
                int row = 0;
                int column = 0;
                for (int j = 0; j < size; j++) {
                    row = row + matrix[i][j];
                    column = column + matrix[j][i];
                }
                if (row !=  column) {
                    System.out.println("It is not magic square");
                    return;
                }
                if (row != oneDiagonal) {
                    System.out.println("It is not magic square");
                    return;
                }
            }
            System.out.println("It is magic square");
        }
    }
}
