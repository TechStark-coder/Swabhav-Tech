/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.isp.violate.test;

import com.monocept.isp.violate.IWorker;
import com.monocept.isp.violate.Manager;
import com.monocept.isp.violate.Robot;

public class IspViolatetest {
	public static void main(String[] args) {
		IWorker m;
		IWorker b;
		m = new Manager();
		b = new Robot();

		atTheWorkStation(m);
		atTheWorkStation(b);
		atTheCafeterial(m);
		atTheCafeterial(b);
	}

	static void atTheWorkStation(IWorker worker){
		System.out.println("at the workstation");
		worker.startWork();
		worker.stopWork();
	}

	static void atTheCafeterial(IWorker worker){
		System.out.println("at the cafetrial");
		worker.startEat();
		worker.stopEat();
	}

}
