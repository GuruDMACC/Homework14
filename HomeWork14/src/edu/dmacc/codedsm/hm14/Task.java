package edu.dmacc.codedsm.hm14;

public class Task {

	private int priorityOfTask;
	private String typeOfTask;
	private String plannedEndDate;
	private String assignedTo;
	private String ownerOfTask;
	private String subjectOfTask;
	private int taskNumber;
	private String status;

	// Constructors

	public Task(int priorityOfTask, String typeOfTask, String plannedEndDate,
			String assignedTo, String ownerOfTask, String subjectOfTask,
			int taskNumber) {

		this.priorityOfTask = priorityOfTask;
		this.typeOfTask = typeOfTask;
		this.plannedEndDate = plannedEndDate;
		this.assignedTo = assignedTo;
		this.ownerOfTask = ownerOfTask;
		this.subjectOfTask = subjectOfTask;
		this.taskNumber = taskNumber;
	}

	public Task() {

	}

	// Getters & Setters

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPriorityOfTask() {
		return priorityOfTask;
	}

	public void setPriorityOfTask(int priorityOfTask) {
		this.priorityOfTask = priorityOfTask;
	}

	public String getTypeOfTask() {
		return typeOfTask;
	}

	public void setTypeOfTask(String typeOfTask) {
		this.typeOfTask = typeOfTask;
	}

	public String getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(String plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getOwnerOfTask() {
		return ownerOfTask;
	}

	public void setOwnerOfTask(String ownerOfTask) {
		this.ownerOfTask = ownerOfTask;
	}

	public String getSubjectOfTask() {
		return subjectOfTask;
	}

	public void setSubjectOfTask(String subjectOfTask) {
		this.subjectOfTask = subjectOfTask;
	}

	public int getTaskNumber() {
		return taskNumber;
	}

	public void setTaskNumber(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	@Override
	public String toString() {
		return "Task [priorityOfTask=" + priorityOfTask + ", typeOfTask="
				+ typeOfTask + ", plannedEndDate=" + plannedEndDate
				+ ", assignedTo=" + assignedTo + ", ownerOfTask=" + ownerOfTask
				+ ", subjectOfTask=" + subjectOfTask + ", taskNumber="
				+ taskNumber + ", status=" + status + "]";
	}

	// Assign Task

	public boolean assignTask(int taskNumber, String assignedTo) {
		return false;

	}

	// mark Complete

	public boolean markComplete(int taskNumber, String assignedTo) {
		return false;

	}

	// Create New Task

	public int newTask(int priorityOfTask, String typeOfTask,
			String plannedEndDate, String assignedTo, String ownerOfTask,
			String subjectOfTask) {
		return 0;

	}

	// System Health
	private String systemHealthCheck() {
		return "report";

	}
	
	
}
