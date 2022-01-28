// Copyright to user asif 2021 
//all rights reserved */
package com.observedesignpattern;

public class DisplayProducton implements StatusBar {

	@Override
	public void update(Stock stock) {
		System.out.println(
				"Display Producton - The Price of " + stock.getStockName() + " has changed:" + stock.getStockPrice());
	}

}