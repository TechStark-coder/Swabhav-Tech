package com.monocept.model;
import java.util.Date;

public class Task {

	//variable name suggestions
	private String name;
	private Date deadLine;
	private String employee;
	private boolean isDone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//create get and set methods for the DeadLine and Employee 
	//similar to how get and set Name are created
	//pay attention to how teh datatype of the variables are declared 
 

	@Override
	public String toString() {
		return "Task name = " + name + " , employee = " + employee + " , deadline = " + deadLine + ", Done = " + isDone;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public void setDeadLine(Date d) {
		// TODO Auto-generated method stub
		
	}

	public void setEmployee(String empname) {
		// TODO Auto-generated method stub
		
	}

	

}
