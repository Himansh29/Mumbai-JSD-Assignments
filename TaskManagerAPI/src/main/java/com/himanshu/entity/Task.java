package com.himanshu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "task_details")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long taskId;

	@Column(nullable = false, length = 30)
	private String title;

	@Column(nullable = false, length = 100)
	private String description;

	private boolean isCompleted;

	@ManyToOne
	@JoinColumn(name = "taskListId", referencedColumnName = "taskListId")
	@JsonIgnore
	private TaskList taskList;

	public TaskList getTaskList() {
		return taskList;
	}

	public void setTaskList(TaskList taskList) {
		this.taskList = taskList;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getIsCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Task(long taskId, String title, String description, boolean isCompleted) {
		super();
		this.taskId = taskId;
		this.title = title;
		this.description = description;
		this.isCompleted = isCompleted;
	}

	public Task(String title, String description, boolean isCompleted) {
		super();
		this.title = title;
		this.description = description;
		this.isCompleted = isCompleted;
	}

	public Task() {
		super();
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", title=" + title + ", description=" + description + ", isCompleted="
				+ isCompleted + "]";
	}

}
