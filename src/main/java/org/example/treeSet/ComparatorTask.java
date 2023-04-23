package org.example.treeSet;

import org.example.tastProductHashSet.Task;

import java.util.Comparator;

public class ComparatorTask implements Comparator<Task> {
    @Override
    public int compare(Task taskOne, Task taskTwo) {
        if (taskOne.getName().compareTo(taskTwo.getName()) == 0) {
            return taskOne.getDateTime().compareTo(taskTwo.getDateTime());
        }
        return taskOne.getName().compareTo(taskTwo.getName());
    }
}
