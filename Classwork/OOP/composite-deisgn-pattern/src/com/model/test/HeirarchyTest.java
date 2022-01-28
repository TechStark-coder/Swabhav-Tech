/**Copyright to customer-app by asif
All rights reserved.
*/
package com.model.test;

import com.model.File;
import com.model.Folder;

public class HeirarchyTest {
	public static void main(String[] args) {
		Folder root = new Folder("movies");
		root.addChild(new File("abc.avi", 750));
		Folder sub = new Folder("marvel");
		Folder main = new Folder("Dc");
		

		sub.addChild(new File("marvel.avi", 900));
		main.addChild(new File("DC.avi", 100));

//		root.addChild(root);
//		root.addChild(new File("abc.avi", 750));
		

		Folder comedy = new Folder("comedy");
		comedy.addChild(new File("pqr.avi", 600));
		root.addChild(comedy);
		root.display();
		System.out.println();
		sub.display();
		System.out.println();
		main.display();
		System.out.println();
		comedy.display();

//		GroupTag root1 = new GroupTag("div");
//		GroupTag p1 = new GroupTag("p1");
//		root1.addChild(p1);
//		root1.display(level = 0);
//		root1.display();

	}

}
