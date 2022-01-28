// Copyright to user asif 2021 
//all rights reserved */
package com.observedesignpattern;

public interface StockListView {

	public void registerStocks(StatusBar observer);

	public void displayStocks();

	public void notifyStocks();

	public void removeStocks(StatusBar observer);

}
