package com.example.tasks_project.model;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

public class Task {
    private String title;
    private String description;
    private boolean completed;
    private Date createDate;
    private Date completedDate; // email said 'completed' but changed to 'completedDate'

    public Task() {
        this.createDate = new Date();
    }
    public Task(String title, String description, boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.createDate = new Date();
        if (completed) {
            this.completedDate = new Date();
        }
    }


}

