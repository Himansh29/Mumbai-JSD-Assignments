package com.himanshu.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.entity.Task;
import com.himanshu.exception.IdNotFoundException;
import com.himanshu.repo.TaskRepository;
import com.himanshu.service.TaskService;

@Service
public class TaskServiceImple implements TaskService {
	
	@Autowired
	TaskRepository repository;
	
	@Override
	public Task addTask(Task task) {
		return repository.save(task);
	}

	@Override
	public Task getTaskDetails(long id) {
		return repository.findById(id).orElseThrow(()-> new IdNotFoundException("Task Id is not present"));
	}

	@Override
	public Task updateTaskDetails(Task task, long id) {
		Task existingTask = repository.findById(id). orElseThrow(()-> new IdNotFoundException("Task Id is not present"));
		existingTask.setDescription(task.getDescription());
		existingTask.setCompleted(task.getIsCompleted());
		existingTask.setTaskList(task.getTaskList());;
		return repository.save(existingTask);
	}

	@Override
	public void deleteTask(long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Task> getAllTaskDetails() {
		return repository.findAll();
	}

}
