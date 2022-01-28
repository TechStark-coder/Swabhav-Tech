/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.ocp.violation;

public class FixedDeposit {

	private int accno;
	private String name;
	private double principalamount;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(int accno, String name, double principalamount, int duration, FestivalType festival) {
		super();
		this.accno = accno;
		this.name = name;
		this.principalamount = principalamount;
		this.duration = duration;
		this.festival = festival;
	}

	public float calcuateRate() {
		if (festival.NORMAL != null)
			return (float) (principalamount *= 7);
		return calcuateRate();
	}

	public double calculateSimpleInterest() {
		return accno;

	}

}
