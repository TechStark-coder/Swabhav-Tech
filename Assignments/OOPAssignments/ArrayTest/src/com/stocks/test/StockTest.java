// Copyright to user asif 2021 
//all rights reserved */
package com.stocks.test;

import com.stock.StatusBar;
import com.stock.Stock;
import com.stock.StockListView;

public class StockTest {
	public static void main(String[] args) {
		StatusBar statusBar = new StatusBar();
		StockListView stockListView = new StockListView();

		Stock stock1 = new Stock("stock1", 10);
		Stock stock2 = new Stock("stock2", 20);
		Stock stock3 = new Stock("stock3", 30);

		statusBar.addStock(stock1);
		statusBar.addStock(stock2);

		stockListView.addStock(stock1);
		stockListView.addStock(stock2);
		stockListView.addStock(stock3);

		stock1.setPrice(100);

		stock2.setPrice(21);

		stock3.setPrice(9);
		System.out.println("stock 1 price chnaged to" + stock1.getPrice());
		System.out.println("stock 2 price " + stock2.getPrice());
		System.out.println("stock 3 price " + stock3.getPrice());
		System.out.println(stock1.getPrice());
		System.out.println();

	}

}
