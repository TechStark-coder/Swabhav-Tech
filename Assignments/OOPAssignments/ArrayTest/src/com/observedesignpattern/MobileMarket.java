// Copyright to user asif 2021 
//all rights reserved */
package com.observedesignpattern;

public class MobileMarket implements StatusBar {

	@Override
	public void update(Stock stock) {
		System.out.println("Mobile Market - The Price of " + stock.getStockName() + " has changed to :" + stock.getStockPrice());
	}

}