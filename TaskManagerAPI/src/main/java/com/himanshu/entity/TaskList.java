package com.himanshu.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class TaskList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int taskListId;
	@Column(nullable = false, length = 50)
	private String name;
	@OneToMany(mappedBy = "taskList", cascade = CascadeType.ALL)
	private List<Task> tasks;
}
