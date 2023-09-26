package com.himanshu.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.entity.TaskList;
import com.himanshu.exception.IdNotFoundException;
import com.himanshu.repo.TaskListRepository;
import com.himanshu.service.TaskListService;

@Service
public class TaskListServiceImple implements TaskListService {
	
	@Autowired
	TaskListRepository taskListRepository;

	@Override
    public TaskList createTaskList(TaskList taskList) {
        return taskListRepository.save(taskList);
    }

    @Override
    public TaskList updateTaskList(TaskList taskList, int id) {
        TaskList existingUser = taskListRepository.findById(id).orElseThrow(()-> new IdNotFoundException("Task List Id not found"));
        existingUser.setName(taskList.getName());
        existingUser.setTasks(taskList.getTasks());
        return taskListRepository.save(existingUser);
    }

    public void deleteTaskList(int taskListId) {
        taskListRepository.deleteById(taskListId);
    }

    public TaskList getTaskListById(int taskListId) {
        return taskListRepository.findById(taskListId).orElse(null);
    }

    @Override
    public List<TaskList> getAllTaskLists() {
        return taskListRepository.findAll();
    }


	

	
}
