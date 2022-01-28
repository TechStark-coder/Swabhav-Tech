// Copyright to user asif 2021 
//all rights reserved */
package com.facade.pattern;

public class ProduceDevice {
	private FlagshipSmartphone Samsung;
	private FlagshipSmartphone Oneplus;
	private FlagshipSmartphone iPhone;

	public ProduceDevice() {
		Samsung = new Samsung();
		Oneplus = new Oneplus();
		iPhone = new IPhone();
	}

	public void produceSamsung() {
		Samsung.displayUpcomingLaunch();
	}

	public void produceOneplus() {
		Oneplus.displayUpcomingLaunch();
	}

	public void produceIphone() {
		iPhone.displayUpcomingLaunch();
	}

}
