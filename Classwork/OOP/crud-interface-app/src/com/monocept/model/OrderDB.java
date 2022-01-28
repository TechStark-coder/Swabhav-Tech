/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class OrderDB implements IDataAccess {
	
	public void delete() {
		System.out.println("record deleted");
	}

	@Override
	public void create() {
		System.out.println("record created");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("record read");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("record updated");
	}

}
