package com.company.liskov_1;

import com.company.liskov_fix.Shape;

public class Rectangle implements Shape {

	private int width;
	
	private int height;

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
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public int computeArea() {
		return width * height;
	}
}
