package edu.dmacc.codedsm.hm14;

public class TaskNumberGenerator {

	@Override
	public String toString() {
		return "TaskNumberGenerator [taskNumber=" + taskNumber + "]";
	}

	int taskNumber;

	public TaskNumberGenerator() {

	}

	public TaskNumberGenerator(int taskNumber) {

		this.taskNumber = taskNumber;
	}

	public int getTaskNumber() {
		return taskNumber;
	}

	private int generateRandomNumber() {
		return 0;
	}

}
