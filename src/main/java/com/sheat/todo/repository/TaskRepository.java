package com.sheat.todo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sheat.todo.entity.Task;
public interface TaskRepository extends JpaRepository<Task, Long> {
}
