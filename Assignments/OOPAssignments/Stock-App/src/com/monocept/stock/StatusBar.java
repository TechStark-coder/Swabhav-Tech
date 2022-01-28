// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.stock;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Subject, Observer {
	private List<Observer> stocks = new ArrayList<>();
	private String stockName;
	private String stockPrice;

	public String getStockName() {
		return stockName;
	}

	public String getStockPrice() {
		return stockPrice;
	}

	public void stockPriceChanged() {
		notifyStock();
	}

	@Override
	public void addStock(Observer stock) {
		stocks.add(stock);
	}

	@Override
	public void removeStock(Observer stock) {
		stocks.remove(stock);
	}

	@Override
	public void notifyStock() {
		stocks.forEach(stocks -> stocks.update(stockName, stockPrice));
	}

	public void setNewStockPrice(String stockName, String stockPrice) {
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		stockPriceChanged();
	}

	@Override
	public void update(String stockName, String stockPrice) {
		// TODO Auto-generated method stub
		
	}

}
