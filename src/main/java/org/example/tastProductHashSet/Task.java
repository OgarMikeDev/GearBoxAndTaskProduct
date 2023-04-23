package org.example.tastProductHashSet;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class Task {

    private String name;

    private final LocalDateTime dateTime;

    private boolean isDone;

    private static int countEquals;

    public static int getCountEquals() {
        return countEquals;
    }


    @Override
    public boolean equals(Object o) {
        countEquals++;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return isDone == task.isDone && Objects.equals(name.toLowerCase(), task.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(), isDone);
    }

    public Task(String name) {
        this.name = name;
        dateTime = LocalDateTime.now();
        isDone = true;
    }
}
