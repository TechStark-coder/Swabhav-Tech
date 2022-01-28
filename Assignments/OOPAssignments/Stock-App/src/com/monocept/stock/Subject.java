// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.stock;

public interface Subject {
	public void addStock(Observer stock);
	public void removeStock(Observer stock);
	public void notifyStock();

}
