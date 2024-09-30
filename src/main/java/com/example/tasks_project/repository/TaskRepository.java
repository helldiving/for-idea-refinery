package com.example.tasks_project.repository;

import com.example.tasks_project.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {

    private List<Task> tasks = new ArrayList<>();

    public List<Task> findAll() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }





}
