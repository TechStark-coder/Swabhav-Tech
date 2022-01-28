/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.srp.sol;

public class FixedDepositt {

	private int accno;
	private String name;
	private double principalamount;
	private int duration;
	private IFestivalRatePolicy festival;

	public FixedDepositt(int accno, String name, double principalamount, int duration, IFestivalRatePolicy festival) {
		this.accno = accno;
		this.name = name;
		this.principalamount = principalamount;
		this.duration = duration;
		this.festival = festival;
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getPrincipalamount() {
		return principalamount;
	}

	public int getDuration() {
		return duration;
	}

	public double calculateSimpleInterest() {
		return this.principalamount * this.duration * festival.calcuateRate();
	}
}
