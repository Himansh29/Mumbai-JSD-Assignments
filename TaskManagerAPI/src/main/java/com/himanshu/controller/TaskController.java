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

import com.himanshu.entity.Task;
import com.himanshu.service.TaskService;

import jakarta.validation.Valid;

@RestController
public class TaskController {
	@Autowired
	TaskService service;
	
	@PostMapping("/task")
	public ResponseEntity<Task> saveTask(@Valid @RequestBody Task task){
		return new ResponseEntity<Task>(service.addTask(task), HttpStatus.CREATED);
	}
	
	@GetMapping("/getTask/{id}")
	public ResponseEntity<Task> getTask(@PathVariable long id) {
		return new ResponseEntity<Task>(service.getTaskDetails(id), HttpStatus.OK);
	}
	
	@GetMapping("/getAllTasks")
	public ResponseEntity<List<Task>> getAllTaskDetails(){
		return new ResponseEntity<>(service.getAllTaskDetails(), HttpStatus.OK);
	}
	
	@PutMapping("updateTask/{id}")
	public ResponseEntity<Task> updateTaskDetails(@Valid @RequestBody Task task,@PathVariable long id) {
		return new ResponseEntity<Task>(service.updateTaskDetails(task, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTask(@PathVariable long id) {
		service.deleteTask(id);
		return new ResponseEntity<String>("Task Deleted Successfully", HttpStatus.OK);
	}
}
