/**Copyright to customer-app by asif
All rights reserved.
*/
package lsp.violation.test;

import lsp.violation.Rectangle;
import lsp.violation.Square;

public class LspViolationTest {

	public static void main(String[] args) {

//		Rectangle rectangle = new Rectangle(5, 20);
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