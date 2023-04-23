package org.example.tastProductHashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Task> toDoList = new HashSet<>();
        Task taskOne = new Task("");
        Task taskTwo = new Task("Feed to the horse");
        

        System.out.println(taskTwo instanceof Task);
    }
}