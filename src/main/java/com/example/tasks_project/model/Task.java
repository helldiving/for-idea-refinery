package com.example.tasks_project.model;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

public class Task {
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
        if (completed) {
            this.completedDate = new Date();
        }
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

}

