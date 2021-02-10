package ru.golovanova.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Double> myLinkedList = new MyLinkedList<>();
        List<Double> ExampleLinkedList = new LinkedList<>();
        List<Double> ExampleArrayList = new ArrayList<>();
        Set<Double> ExampleHashSet = new HashSet<>();
        Set<Double> ExampleLinkedHashSet = new LinkedHashSet<>();
        Set<Double> ExampleTreeSet = new TreeSet<>();
        Map<Integer, Double> ExampleHashMap = new HashMap<>();
        Map<Integer, Double> ExampleLinkedHashMap = new LinkedHashMap<>();
        Map<Integer, Double> ExampleTreeMap = new TreeMap<>();

        int flag = 0;
        while (flag != 98765) {
            double i = Math.random() * 10000;
            myLinkedList.add(i);
            ExampleLinkedList.add(i);
            ExampleArrayList.add(i);
            ExampleHashSet.add(i);
            ExampleLinkedHashSet.add(i);
            ExampleTreeSet.add(i);
            ExampleHashMap.put(flag, i);
            ExampleLinkedHashMap.put(flag, i);
            ExampleTreeMap.put(flag, i);
            flag++;
        }

        long start = 0;


        System.out.println("ArrayList and LinkedList\n");
        {
            System.out.println("ADD TO END");
            start = System.nanoTime();
            myLinkedList.add(33.5);
            System.out.println("MyLinkedList: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleArrayList.add(33.5);
            System.out.println("ArrayList: " + (System.nanoTime() - start) + "\n");

            System.out.println("ADD TO START");
            start = System.nanoTime();
            myLinkedList.add(0, 33.5);
            System.out.println("MyLinkedList: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleArrayList.add(0, 33.5);
            System.out.println("ArrayList: " + (System.nanoTime() - start) + "\n");

            System.out.println("ADD TO MIDDLE");
            start = System.nanoTime();
            myLinkedList.add(44657, 33.5);
            System.out.println("myLinkedList: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleArrayList.add(44657, 33.5);
            System.out.println("arrayList: " + (System.nanoTime() - start) + "\n");

            System.out.println("GET");
            start = System.nanoTime();
            myLinkedList.get(3326);
            System.out.println("myLinkedList: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleArrayList.get(3326);
            System.out.println("arrayList: " + (System.nanoTime() - start) + "\n");

            System.out.println("REMOVE");
            start = System.nanoTime();
            myLinkedList.remove(22300);
            System.out.println("myLinkedList: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleArrayList.remove(22300);
            System.out.println("arrayList: " + (System.nanoTime() - start) + "\n");


            System.out.println("SET");
            start = System.nanoTime();
            myLinkedList.set(94520, 22.3);
            System.out.println("myLinkedList: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleArrayList.set(94520, 22.3);
            System.out.println("arrayList: " + (System.nanoTime() - start) + "\n");

            System.out.println("INDEX OF");
            start = System.nanoTime();
            myLinkedList.indexOf(22.3);
            System.out.println("myLinkedList: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleArrayList.indexOf(22.3);
            System.out.println("arrayList: " + (System.nanoTime() - start) + "\n");

        }


        System.out.println("HashSet, LinkedHashSet, TreeSet\n");
        {
            System.out.println("ADD TO END");
            start = System.nanoTime();
            ExampleHashSet.add(33.5);
            System.out.println("HashSet: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleLinkedHashSet.add(33.5);
            System.out.println("LinkedHashSet: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleTreeSet.add(33.5);
            System.out.println("TreeSet: " + (System.nanoTime() - start) + "\n");


            System.out.println("REMOVE");
            start = System.nanoTime();
            ExampleHashSet.remove(22300);
            System.out.println("HashSet: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleLinkedHashSet.remove(22300);
            System.out.println("LinkedHashSet: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleTreeSet.add(33.5);
            System.out.println("TreeSet: " + (System.nanoTime() - start) + "\n");

        }


        System.out.println("HashMap, LinkedHashMap, TreeMap\n");
        {
            System.out.println("PUT");
            start = System.nanoTime();
            ExampleHashMap.put(98765, 33.5);
            System.out.println("HashMap: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleLinkedHashMap.put(98765, 33.5);
            System.out.println("LinkedHashMap: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleTreeMap.put(98765, 33.5);
            System.out.println("TreeMap: " + (System.nanoTime() - start) + "\n");

            System.out.println("GET");
            start = System.nanoTime();
            ExampleHashMap.get(3326);
            System.out.println("HashMap: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleLinkedHashMap.get(3326);
            System.out.println("LinkedHashMap: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleTreeMap.get(3326);
            System.out.println("TreeMap: " + (System.nanoTime() - start) + "\n");

            System.out.println("REMOVE");
            start = System.nanoTime();
            ExampleHashMap.remove(22300);
            System.out.println("HashMap: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleLinkedHashMap.remove(22300);
            System.out.println("LinkedHashMap: " + (System.nanoTime() - start));
            start = System.nanoTime();
            ExampleTreeMap.get(3326);
            System.out.println("TreeMap: " + (System.nanoTime() - start) + "\n");

        }
    }
}