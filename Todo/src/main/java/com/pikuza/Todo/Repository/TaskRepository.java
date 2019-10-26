package com.pikuza.Todo.repository;

import com.pikuza.Todo.Dom.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
