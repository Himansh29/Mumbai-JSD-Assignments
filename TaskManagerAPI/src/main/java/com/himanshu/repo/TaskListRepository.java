package com.himanshu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.entity.TaskList;

public interface TaskListRepository extends JpaRepository<TaskList, Integer> {

}
