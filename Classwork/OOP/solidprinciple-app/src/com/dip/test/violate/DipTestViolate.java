/**Copyright to customer-app by asif
All rights reserved.
*/
package com.dip.test.violate;

//import dom.div.violate.EmailLogger;
import dom.div.violate.FileLogger;
import dom.div.violate.TaxCalculator;

public class DipTestViolate {
	public static void main(String[] args) {
		TaxCalculator cal = new TaxCalculator(new FileLogger());
		// create class to get windows logger
//		TaxCalculator cal = new TaxCalculator(new WindowsLogger());
		cal.calculateTax(1, 0);
	}

}
