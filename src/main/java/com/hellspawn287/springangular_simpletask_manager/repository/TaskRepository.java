package com.hellspawn287.springangular_simpletask_manager.repository;

import com.hellspawn287.springangular_simpletask_manager.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {


}
