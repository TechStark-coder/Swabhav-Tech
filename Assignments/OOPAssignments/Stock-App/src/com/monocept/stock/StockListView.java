// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.stock;

public class StockListView implements Observer, DisplayElement {

	private final Subject subject;
	private String stockName;
	private String stockPrice;

	public StockListView(Subject subject, String stockName, int stockPrice) {
		super();
		this.subject = subject;
		this.subject.addStock(this);
//		this.stockName = stockName;
//		this.stockPrice = stockPrice;
	}

	@Override
	public void Display() {
		System.out.println("Stock name - " + stockName + " " + "Stock price - " + stockPrice);

	}

	@Override
	public void update(String stockName, String stockPrice) {
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		Display();

	}
}
