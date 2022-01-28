/**Copyright to customer-app by asif
All rights reserved.
*/
package lsp.violation;

public class Rectangle {

	protected int width;
	protected int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int calculateArea() {
		return (this.height * this.width);

	}

}
