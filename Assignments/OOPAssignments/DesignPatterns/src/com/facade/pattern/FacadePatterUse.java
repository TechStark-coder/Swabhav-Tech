// Copyright to user asif 2021 
//all rights reserved */
package com.facade.pattern;

public class FacadePatterUse {
	public static void main(String[] args) {
		ProduceDevice produceDevice = new ProduceDevice();
		produceDevice.produceSamsung();
		produceDevice.produceOneplus();
		produceDevice.produceIphone();
	}

}
