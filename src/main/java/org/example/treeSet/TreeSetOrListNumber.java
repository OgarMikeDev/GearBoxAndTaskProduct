package org.example.treeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetOrListNumber {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();


        TreeSet<Integer> treeSetNumber = new TreeSet<>(new ComparatorInteger());


        for (int i = 0; i < 1_000_000; i++) {
            treeSetNumber.add(i);
            listNumber.add(i);
        }


        long startOne = System.currentTimeMillis();
        listNumber.contains(999_999);
        long endOne = System.currentTimeMillis() - startOne;


        long startTwo = System.currentTimeMillis();

        treeSetNumber.contains(999_999);

        System.out.println("Time treeSetNumber has passed: " + (System.currentTimeMillis() - startTwo) + " ms\n" +
                "Time listNumber has passed: " + (endOne));
    }
}
