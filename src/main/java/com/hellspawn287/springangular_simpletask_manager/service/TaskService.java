package com.hellspawn287.springangular_simpletask_manager.service;

import com.hellspawn287.springangular_simpletask_manager.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
