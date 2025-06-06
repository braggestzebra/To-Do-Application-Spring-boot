package com.app.To.Do.App.repository;

import com.app.To.Do.App.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
