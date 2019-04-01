package edu.dmacc.codedsm.hm14;

public class Repository {

	protected boolean insertRoutine(){
		return false;
	}
	
	protected boolean updateRoutine(){
		return false;
	}
	
	protected boolean deletetRoutine(){
		return false;
	}

	@Override
	public String toString() {
		return "Repository [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Repository() {
		
	}
	
}
