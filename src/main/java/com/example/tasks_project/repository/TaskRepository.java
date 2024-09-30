package com.example.tasks_project.repository;

import com.example.tasks_project.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {

    private List<Task> tasks = new ArrayList<>();
    private long idCounter = 1;

    public List<Task> findAll() {
        return tasks;
    }

    public Task findById(Long id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }

    // Save method
    public Task save(Task task) {
        if (task.getId() == null) {
            task.setId(idCounter++);
            tasks.add(task);
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getId().equals(task.getId())) {
                tasks.set(i, task);
                break;
                }
            }
        }
        return task;
    }

    public void delete(Task task) {
        tasks.remove(task);
    }
}
