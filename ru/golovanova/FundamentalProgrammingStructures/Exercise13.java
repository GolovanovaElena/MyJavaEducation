package ru.golovanova.FundamentalProgrammingStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise13 {
    public static void main(String[] args) {
        List<Integer> all = new ArrayList(49);
        for (int i=1; i<50; i++) {
            all.add(i);
        }

        int[] combination = new int[6];
        for (int i=0; i<6; i++) {
            int index = (int) (Math.random() * all.size());
            combination[i] = all.get(index);
            all.remove(index);
        }
        Arrays.sort(combination);
        System.out.println("Lottery combination: "+Arrays.toString(combination));
    }
}