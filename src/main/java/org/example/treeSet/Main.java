package org.example.treeSet;

import org.example.tastProductHashSet.Task;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Task> toDoList = new HashSet<>();
        toDoList.add(new Task("feed the horse"));
        toDoList.add(new Task("feed the monkey"));
        toDoList.add(new Task("feed the bear"));
        toDoList.add(new Task("feed the crocodile"));

        for (Task task : toDoList) {
            System.out.println(task);
        }
    }
}
