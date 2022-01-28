/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.test;

import com.monocept.model.CustomerDB;
import com.monocept.model.DepartmentDB;
import com.monocept.model.IDataAccess;
import com.monocept.model.OrderDB;

public class PolymorphismTest {
	public static void main(String[] args) {

//		GoldCustomerDB obj = new GoldCustomerDB();
		doDBOperations(new OrderDB());
		doDBOperations(new DepartmentDB());

	}

//	private static void doDBOperations(OrderDB orderDB) {
//		// TODO Auto-generated method stub
//		
//	}

	private static void doDBOperations(IDataAccess obj) {
		System.out.println("Doing multiple db operations here ...");
		System.out.println();
		obj.create();
		obj.read();
		obj.update();
		obj.delete();

	}

}
