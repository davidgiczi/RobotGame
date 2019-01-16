package com.david.giczi.robot.model;

public class Cell {

	private int x;
	private int y;
	
	
	public Cell(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Cell [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
