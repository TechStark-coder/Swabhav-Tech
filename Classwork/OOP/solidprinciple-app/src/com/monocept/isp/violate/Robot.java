/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.isp.violate;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub

	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robots dont eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robots dont eat");

	}

}
