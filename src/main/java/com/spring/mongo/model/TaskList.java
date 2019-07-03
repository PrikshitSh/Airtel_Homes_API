package com.spring.mongo.model;

import java.util.List;

public class TaskList {
	private String taskId;
	private String taskType;
	public List<ImpactedAccountList> impactedAccountList;

	public TaskList() {
	}

	public TaskList(String taskId, String taskType) {
		this.taskId = taskId;
		this.taskType = taskType;

	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
}