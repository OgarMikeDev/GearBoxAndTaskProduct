package org.example.tastProduct;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Task> toDoList = new HashSet<>();
        toDoList.add(new Task("feed to the horse"));
        System.out.println(toDoList.contains(new Task("Feed to the horse")));


//        long start = System.currentTimeMillis();
//
//
//        for (int i = 0; i < 1_000_000; i++) {
//            Task task = new Task("Add task " + Math.round(Math.random() * 1000));
//            toDoList.add(task);
//            if (i == 999999) {
//                System.out.println(task.getName());
//            }
//        }
//        System.out.println("Passed time: " + (System.currentTimeMillis() - start) + " millisecond!" + "\nCount task in set: " + toDoList.size()
//        + "\nCount method 'equals': " + Task.getCountEquals());
    }
}