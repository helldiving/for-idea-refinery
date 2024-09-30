package com.example.tasks_project.controller;


import com.example.tasks_project.model.Task;
import com.example.tasks_project.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {


    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", "Test Description of Task 1", false));
        tasks.add(new Task("Task 2", "Test Description of Task 2", true));
        return tasks;
    }
}
