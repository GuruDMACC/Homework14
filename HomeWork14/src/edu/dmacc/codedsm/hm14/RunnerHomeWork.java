package edu.dmacc.codedsm.hm14;

public class RunnerHomeWork {

	public static void main(String[] args) {
		
		Repository repo = new Repository();
		Person person = new Person();
		Task task = new Task();
		TaskNumberGenerator taskgen = new TaskNumberGenerator();
		
		
		System.out.println(repo.toString());
		System.out.println(person.toString());
		System.out.println(task.toString());
		System.out.println(taskgen.toString());
		
		
		

	}

}
