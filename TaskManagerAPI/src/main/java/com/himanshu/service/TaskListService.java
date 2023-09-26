package com.himanshu.service;

import java.util.List;

import com.himanshu.entity.TaskList;

public interface TaskListService {

	TaskList createTaskList(TaskList taskList);

    TaskList updateTaskList(TaskList taskList, int id);

    void deleteTaskList(int taskListId);

    TaskList getTaskListById(int taskListId);

    List<TaskList> getAllTaskLists();	 
}
