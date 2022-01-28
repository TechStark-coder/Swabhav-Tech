// Copyright to user asif 2021 
//all rights reserved */
package com.observepattern.test;

//import com.observedesignpattern.Apple;
import com.observedesignpattern.DisplayProducton;
import com.observedesignpattern.IBM;
import com.observedesignpattern.Microsoft;
import com.observedesignpattern.MobileMarket;
import com.observedesignpattern.StatusBar;
import com.observedesignpattern.Stock;
import com.observedesignpattern.StockListView;

@SuppressWarnings("unused")
public class ObservePatternTest {
	public static void main(String[] args) {
		StatusBar statusBar = new StatusBar() {
//		StockListView stockListView = new 

		StockListView Stock = new Stock("stock1", 10);
		StatusBar stock2 = new Stock("stock2", 20);
		StatusBar stock3 = new Stock("stock3", 30);

		// The status bar shows the popular stocks
		statusBar.addStock(stock1);
		stockListView.addStock(stock2);

		// The stock view list shows all stocks
		stockListView.addStock(stock1);
		stockListView.addStock(stock2);
		stockListView.addStock(stock3);

		// Causes both statusBar and stockListView to get refreshed
		stock2.setPrice(21);

		// Causes only the stockListView to get refreshed. (statusBar
		// is not watching this stock.)
		stock3.setPrice(9);
		}
	}
}

//		IBM ibm = new IBM();
//		Microsoft microsoft = new Microsoft();
//		Apple apple = new Apple();
//
//		MobileMarket mobile = new MobileMarket();
//		DisplayProducton displayBoard = new DisplayProducton();
//
//		microsoft.registerStocks(mobile);
//		microsoft.registerStocks(displayBoard);
//
//		apple.registerStocks(mobile);
//		apple.registerStocks(displayBoard);
//
//		for (int i = 0; i < 200; i++) {
//			microsoft.updateStockPrice((int) (Math.random() * 100) + 1);
//			apple.updateStockPrice((int) (Math.random() * 100) + 1);
//			ibm.updateStockPrice((int) (Math.random() * 10) + 1);
//		}
