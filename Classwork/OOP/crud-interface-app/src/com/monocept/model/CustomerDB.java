/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public abstract class CustomerDB implements IDataAccess {

	@Override
	public void create() {
		System.out.println("table created!");
	}

	@Override
	public void read() {
		System.out.println("record read!");
	}

}
