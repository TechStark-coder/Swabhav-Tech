/**Copyright to customer-app by asif
All rights reserved.
*/
package hat.model;

public class Hat {

	private String ShortName;
	private String LongName;
	private double basePrice;
	private final double GST = 8;

	public Hat(String shortName, String longName, double basePrice) {
		super();
		ShortName = shortName;
		LongName = longName;
		this.basePrice = basePrice;
	}

	public String getShortName() {
		return ShortName;
	}

	public String getLongName() {
		return LongName;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public double getGST() {
		return GST;
	}

	public void calculateGST() {
		this.basePrice =+ (basePrice / 100) * 8;
	}

}
