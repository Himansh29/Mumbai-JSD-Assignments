package com.himanshu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
