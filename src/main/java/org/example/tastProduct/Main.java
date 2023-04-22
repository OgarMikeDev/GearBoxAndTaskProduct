package org.example.tastProduct;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Task> toDoList = new HashSet<>();
        toDoList.add(new Task("Milk"));
        toDoList.add(new Task("Cheese"));
        toDoList.add(new Task("Meet"));
        toDoList.add(new Task("Cheese"));
        toDoList.add(new Task("Milk"));


        for (Task task : toDoList) {
            System.out.println(task);
        }
    }
}