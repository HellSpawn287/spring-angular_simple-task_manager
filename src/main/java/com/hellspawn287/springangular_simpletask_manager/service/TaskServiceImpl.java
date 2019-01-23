package com.hellspawn287.springangular_simpletask_manager.service;

import com.hellspawn287.springangular_simpletask_manager.domain.Task;
import com.hellspawn287.springangular_simpletask_manager.repository.TaskRepository;

public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }


}
