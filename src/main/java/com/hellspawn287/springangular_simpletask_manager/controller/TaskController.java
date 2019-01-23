package com.hellspawn287.springangular_simpletask_manager.controller;

import com.hellspawn287.springangular_simpletask_manager.domain.Task;
import com.hellspawn287.springangular_simpletask_manager.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list(){
        return taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
