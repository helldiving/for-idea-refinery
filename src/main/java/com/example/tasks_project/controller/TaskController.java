package com.example.tasks_project.controller;


import com.example.tasks_project.model.Task;
import com.example.tasks_project.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {


    @Autowired
    private TaskRepository taskRepository;

    // GET - all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // GET - a task by id
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
       Task task = taskRepository.findById(id);
       if (task == null) {
           throw new RuntimeException("Task not found");
       }
       return task;
    }

    // POST - create new task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    // PUT - update an existing task
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        Task task = taskRepository.findById(id);
        if (task == null) {
            throw new RuntimeException("Task not found");
        }
            task.setTitle(taskDetails.getTitle());
            task.setDescription(taskDetails.getDescription());
            task.setCompleted(taskDetails.isCompleted());
            return taskRepository.save(task);
    }

// DELETE - delete task
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        Task task = taskRepository.findById(id);
        if (task == null) {
            throw new RuntimeException("Task not found");
        }
        taskRepository.delete(task);
    }

}
