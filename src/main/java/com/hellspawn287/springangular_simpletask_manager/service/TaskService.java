package com.hellspawn287.springangular_simpletask_manager.service;

import com.hellspawn287.springangular_simpletask_manager.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Iterable<Task> list();
}
