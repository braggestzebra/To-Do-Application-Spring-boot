package com.app.To.Do.App.services;

import com.app.To.Do.App.model.Task;
import com.app.To.Do.App.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public String createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
//        task.setDescription(description);
//        task.setReminder(reminder);
        task.setCompleted(false);
        taskRepository.save(task);
        return title;
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Task not found with id: " + id));

        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }


}
