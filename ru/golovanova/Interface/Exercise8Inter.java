package ru.golovanova.Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise8Inter {
    public void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == false)
                Collections.shuffle(strings);
        }
    }
}
