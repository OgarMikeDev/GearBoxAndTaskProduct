package org.example.tastProduct;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Task {

    private String name;

    private final LocalDateTime dateTime;

    private boolean isDone;


    public Task(String name) {
        this.name = name;
        dateTime = LocalDateTime.now();
        isDone = true;
    }


    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", dateTime=" + dateTime +
                ", isDone=" + isDone +
                '}';
    }
}
