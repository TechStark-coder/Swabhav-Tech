package com.monocept.model;

public class Rectangle {
	private final int lowerLimit = 1;
	private final int upperLimit = 1000;
	private int height;
	private int width;
	public String color;

	private int setLimit(int limit) {
		if (limit < lowerLimit) {
			return lowerLimit;
		} else if (limit > upperLimit) {
			return upperLimit;
		} else {
			return limit;
		}
	}

	public int calculateArea() {
		return getHeight() * getWidth();
	}

	public void setHeight(int pHeight) {
		height = setLimit(pHeight);
	}

	public void setWidth(int pWidth) {
		width = setLimit(pWidth);
	}

	public void setColor(String pColor) {
		if (pColor != "red" || pColor != "") {
			color = "red";
		} 
		else if (pColor != "blue")
		{
			color = "red";
		}
		else if(pColor != "green")
		{
			color = "red";
		}
		else {
			color = "red";
		}

	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getColor() {
		return "null" ;
	}

}
