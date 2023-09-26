package com.himanshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.himanshu.entity.TaskList;
import com.himanshu.service.TaskListService;

@RestController
public class TaskListController {

	@Autowired
	TaskListService taskListService;
	
	@GetMapping("/getTaskList/{id}")
	public ResponseEntity<TaskList> getTaskListById(@PathVariable int id) {
		return new ResponseEntity<TaskList>(taskListService.getTaskListById(id), HttpStatus.OK);
	} 
	
	@GetMapping("/getAllTaskLists")
	public ResponseEntity<List<TaskList>> getAllTask(){
		return new ResponseEntity<> (taskListService.getAllTaskLists(), HttpStatus.OK);
	}
	
	@PostMapping("/addNewTaskList")
	public ResponseEntity<TaskList> addNewTask(@RequestBody TaskList list) {
		return new ResponseEntity<TaskList>(taskListService.createTaskList(list), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteTaskList")
	public ResponseEntity<String> deleteTaskList(@PathVariable int id) {
		taskListService.deleteTaskList(id);
		return new ResponseEntity<>("Task List Deleted Successfully", HttpStatus.OK);
	}
	
	@PutMapping("/updateTaskList/{id}")
	public ResponseEntity<TaskList> updateTaskList(@RequestBody TaskList list, @PathVariable int id) {
		return new ResponseEntity<TaskList>(taskListService.updateTaskList(list, id), HttpStatus.OK);
	}
}
