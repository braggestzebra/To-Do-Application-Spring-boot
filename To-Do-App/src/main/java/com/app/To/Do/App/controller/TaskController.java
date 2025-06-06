package com.app.To.Do.App.controller;

import org.springframework.ui.Model;
import com.app.To.Do.App.model.Task;
import com.app.To.Do.App.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "tasks";
    }
    @PostMapping
   public String createTask(@RequestParam String title
//                            @RequestParam String description,
//                            @RequestParam String reminder
                            ){
//        LocalDate reminderDate = LocalDate.parse(reminder);
        taskService.createTask(title);
//                , description, reminderDate
                  return "redirect:/tasks";
  }
  @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return "redirect:/tasks";
  }
  @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id){
        taskService.toggleTask(id);
        return "redirect:/tasks";
  }
}
