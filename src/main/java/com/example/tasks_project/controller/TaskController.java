package com.example.tasks_project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping("/tasks")
    public String getAllTasks() {
        return "Returns all tasks";
    }
}

// List/ArrayList of Tasks^