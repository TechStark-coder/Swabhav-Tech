/**Copyright to customer-app by asif
All rights reserved.
*/
package dom.div.violate;

public class TaxCalculator {
	private ErrorLogTypee logType;

	public TaxCalculator(ErrorLogTypee logType) {
		this.logType = logType;
	}

	public double calculateTax(int amt, int rate) {
		double result = 0;
		try {
			result = amt / rate;
		} catch (Exception e) {
			logType.log();

		}
//		/double result = 0;
		return result;
	}

}
