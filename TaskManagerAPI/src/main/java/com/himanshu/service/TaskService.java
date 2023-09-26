package com.himanshu.service;

import java.util.List;

import com.himanshu.entity.Task;

public interface TaskService {
	
	public Task addTask(Task task);
	public Task getTaskDetails(long id);
	public List<Task> getAllTaskDetails();
	public Task updateTaskDetails(Task task, long id);
	public void deleteTask(long id);
}
