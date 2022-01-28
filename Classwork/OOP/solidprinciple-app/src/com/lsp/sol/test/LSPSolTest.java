/**Copyright to customer-app by asif
All rights reserved.
*/
package com.lsp.sol.test;

import com.lsp.solution.Rectangle;
import com.lsp.solution.Square;

public class LSPSolTest {
	public static void main(String[] args) {

		shouldNotModifyHeightIfWidthIsChanged(new Rectangle(5, 20));
		shouldNotModifyHeightIfWidthIsChanged(new Square(30));

	}

	private static void shouldNotModifyHeightIfWidthIsChanged(Rectangle rectangle) {
		int beforeChange = rectangle.getHeight();
		rectangle.setWidth(rectangle.getWidth() + 10);
		int afterChange = rectangle.getHeight();
		System.out.println(beforeChange == afterChange);
		System.out.println(beforeChange);
		System.out.println(afterChange);

	}
}