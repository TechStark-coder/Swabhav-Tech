package com.monocept.model;

public class Circle {
	private float radius;
	private String border;

	public float calculateArea() {
		return (3.142f * radius * radius);
	}

	public void setRadius(float pradius) {
		radius = pradius;
	}

	public void setBorder(String pborder) {
		if(pborder.equalsIgnoreCase("solid"))
		{
		border = "solid";
		}
		else if(pborder.equalsIgnoreCase("double"))
		{
			border = "Double";
		}
		else if (pborder.equalsIgnoreCase("dotted")) 
		{
			border = "Dotted";
		}
		else
		{
			border = "Solid";
		}
	}
	public float getRadius() {
		return radius;
	}

	public String getBorder() {
		return border;
	}

}
	
