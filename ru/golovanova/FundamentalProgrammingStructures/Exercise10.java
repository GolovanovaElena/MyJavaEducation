package ru.golovanova.FundamentalProgrammingStructures;

public class Exercise10 {
    public static void main(String[] args) {
        String alph = "0123456789abcdefghijklmnopqrstuvwxyz";
        long randomNumber = (long) (Math.random() * Long.MAX_VALUE);
        System.out.println("Random number is " + randomNumber);
        while (randomNumber > 36){
            int remainder = (int)(randomNumber%36);
            System.out.print((char)(alph.charAt(remainder)));
            randomNumber = randomNumber / 36;
        }
    }
}
