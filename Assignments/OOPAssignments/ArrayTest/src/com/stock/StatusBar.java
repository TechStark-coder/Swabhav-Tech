// Copyright to user asif 2021 
//all rights reserved */
package com.stock;

import java.util.ArrayList;

public class StatusBar implements IStocks {
	ArrayList<Stock> display = new ArrayList<Stock>();

	@Override
	public void addStock(Stock s) {
		display.add(s);
	}

	public void showPopularStocks() {
		for (Stock s : display) {
			System.out.println(s);
		}
	}

}
