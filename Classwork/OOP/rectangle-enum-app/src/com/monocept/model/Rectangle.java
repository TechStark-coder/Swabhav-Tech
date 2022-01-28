package com.monocept.model;

public class Rectangle {
		private int width;
		private int height;
		@SuppressWarnings("unused")
		private ColorOption color;
		
		public int calculateArea() {
			return getHeight() * getWidth();
		}

		public int getWidth() {
			return width;
		}

		public int getHeight() {
			return height;
		}
		public ColorOption getColor() {
			return color;
		}
		
		public void setHeight(int pHeight) {
			height = (pHeight);
		}

		public void setWidth(int pWidth) {
			width = (pWidth);
		}

		public void setColor(ColorOption pColor) {
			color = (pColor);
			
		}


}
