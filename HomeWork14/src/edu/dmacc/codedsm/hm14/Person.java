package edu.dmacc.codedsm.hm14;

public class Person {

	@Override
	public String toString() {
		return "Person [name=" + name + ", emailAddress=" + emailAddress
				+ ", task=" + task + "]";
	}

	private String name;
	private String emailAddress;

	// Constructors
	public Person(String name, String emailAddress) {

		this.name = name;
		this.emailAddress = emailAddress;
	}

	public Person() {

	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	// method

	public String printReport() {
		return "report";
	}

	Task task = new Task();

}
