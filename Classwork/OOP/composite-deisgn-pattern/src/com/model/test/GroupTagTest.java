/**Copyright to customer-app by asif
All rights reserved.
*/
package com.model.test;

import java.util.logging.Level;

import com.model.GroupTag;

@SuppressWarnings("unused")
public class GroupTagTest {
	@SuppressWarnings("unused")
	private static int Level;

	public static void main(String[] args) {
		GroupTag root = new GroupTag("div");
		GroupTag p1 = new GroupTag("p1");
		root.addChild(p1);

//		root.display (Level=0);

	}

}
