/**Copyright to customer-app by asif
All rights reserved.
*/
package com.lsp.solution;

public class Square extends Rectangle implements IPolygon {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void calculateArea() {
//		return (this.height * this.width);
	}

}
