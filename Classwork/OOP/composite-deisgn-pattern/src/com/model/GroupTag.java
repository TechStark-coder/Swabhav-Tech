/**Copyright to customer-app by asif
All rights reserved.
*/
package com.model;

import java.util.ArrayList;
import java.util.List;

public class GroupTag implements IStorageItem {
	String name;
	@SuppressWarnings("unused")
	private List<IStorageItem> children;
	private ArrayList<IStorageItem> childrens = new ArrayList<IStorageItem>();

	public GroupTag(String name) {
		super();
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println(name);
		for (IStorageItem s : childrens) {
			s.display();
		}
	}

	public void addChild(IStorageItem child) {
		childrens.add(child);
	}

	public void display(int i) {
		// TODO Auto-generated method stub
		
	}

}
