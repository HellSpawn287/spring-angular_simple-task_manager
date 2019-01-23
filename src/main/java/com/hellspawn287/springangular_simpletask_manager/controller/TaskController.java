package com.hellspawn287.springangular_simpletask_manager.controller;

import com.hellspawn287.springangular_simpletask_manager.domain.Task;
import com.hellspawn287.springangular_simpletask_manager.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list(){
        return taskService.list();
    }
}
