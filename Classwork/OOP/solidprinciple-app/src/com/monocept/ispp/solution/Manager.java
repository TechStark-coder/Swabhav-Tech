/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.ispp.solution;

public class Manager implements IWorkableEatable {

	@Override
	public void startWork() {
		System.out.println("manager started working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("manager stoppd working");
		
	}

	@Override
	public void startEat() {
		System.out.println("manager started eat");
				
	}

	@Override
	public void stopEat() {
		System.out.println("mananger stops eating");
		
		
	}

}
