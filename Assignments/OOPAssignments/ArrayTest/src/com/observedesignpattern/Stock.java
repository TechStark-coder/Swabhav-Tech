// Copyright to user asif 2021 
//all rights reserved */
package com.observedesignpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Stock implements StockListView {
	private List<StatusBar> observers;

	public Stock() {
		observers = new ArrayList<StatusBar>();
	}

	private String name;
	private int price;

	public String getStockName() {
		return name;
	}

	@Override
	public void registerStocks(StatusBar observer) {
		if (observer != null) {
			this.observers.add(observer);
		}
	}

	@Override
	public void notifyStocks() {
		Iterator<StatusBar> it = observers.iterator();
		while (it.hasNext()) {
			StatusBar observer = it.next();
			observer.update(this);
		}
	}

	@Override
	public void removeStocks(StatusBar observer) {
		if (observer != null) {
			this.observers.remove(observer);
		}
	}

	public int getStockPrice() {
		return price;
	}

	public void updateStockPrice(int updatedPrice) {
		this.price = updatedPrice;
		this.notifyStocks();
	}

	public void setName(String stockName) {
		this.name = stockName;
	}
}