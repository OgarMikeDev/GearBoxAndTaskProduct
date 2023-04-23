package org.example.treeSet;

import org.example.tastProductHashSet.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        TreeSet<Task> toDoList = new TreeSet<>(new ComparatorTask());

        toDoList.add(new Task("feed the horse"));

        toDoList.add(new Task("comb the monkey"));

        toDoList.add(new Task("pat the bear"));

        toDoList.add(new Task("look the crocodile"));


        System.out.println(toDoList.subSet(new Task("feed the horse"), new Task("pat the bear")) + "\n");

        for (Task task : toDoList) {
            System.out.println(task);
        }
    }
}
