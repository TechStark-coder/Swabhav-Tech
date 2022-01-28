/**Copyright to customer-app by asif
All rights reserved.
*/
package com.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem {

	private String name;
	@SuppressWarnings("unused")
	private List<IStorageItem> children;

	private ArrayList<IStorageItem> Child = new ArrayList<IStorageItem>();

	@Override
	public void display() {
		System.out.println(name);
		for (IStorageItem c : Child) {
			c.display();
//			System.out.println(c);
//			c.display();
		}
	}

	public Folder(String name) {
		this.name = name;
	}

	public void addChild(IStorageItem child) {
		Child.add(child);
	}

}
