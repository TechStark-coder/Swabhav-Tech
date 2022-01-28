/**Copyright to customer-app by asif
All rights reserved.
*/
package com.model;

import java.util.ArrayList;

public class File implements IStorageItem {

	private String name;
	private int type;
	private ArrayList<IStorageItem> Children = new ArrayList<IStorageItem>();

	public File(String name, int i) {
		this.name = name;
		this.type = i;
	}

	@Override
	public void display() {
		System.out.println(name + " : " + type);
		for (IStorageItem n : Children) {
//			System.out.println(n);
			n.display();
		}
	}

}

//}
