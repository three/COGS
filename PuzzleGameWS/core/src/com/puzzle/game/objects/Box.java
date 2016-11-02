package com.puzzle.game.objects;

import javax.sound.sampled.Line;

import com.badlogic.gdx.math.Rectangle;

/**
 * File: Box.java
 * Purpose: Used to keep tracks of boxes that can "reflect" lines on screen.
 * @author Douglas Rudolph
 */
public class Box extends Rectangle
{
	//x and y coordinate
	//width and height
	float xCord, yCord, widthSize, heightSize;
	Line l;
	
	/**
	 * Initializes values 
	 * @param x: x coordinate 
	 * @param y: y coordinate
	 * @param width: width of box
	 * @param height: height of box
	 */
	public Box(float xCord, float yCord, float widthSize, float heightSize)
	{
		this.xCord = xCord;
		this.yCord = yCord;
		this.widthSize = widthSize;
		this.heightSize = heightSize;
	}
	
	private Line lines[];
	/**
	 * upper, right, bottom, left
	 * @param lines
	 */
	public Box(Line ... lines) //bunch of lines for the box
	{
		this.lines = new Line[4];
		int index = 0;
		for(Line l: lines)
		{
			this.lines[index++] = l;
			
		}
	}

	/**
	 * @return x coordinate
	 */
	public float getX()
	{
		return x;
	}

	public float getxCord() {
		return xCord;
	}

	public void setxCord(float xCord) {
		this.xCord = xCord;
	}

	public float getyCord() {
		return yCord;
	}

	public void setyCord(float yCord) {
		this.yCord = yCord;
	}

	public float getWidthSize() {
		return widthSize;
	}

	public void setWidthSize(float widthSize) {
		this.widthSize = widthSize;
	}

	public float getHeightSize() {
		return heightSize;
	}

	public void setHeightSize(float heightSize) {
		this.heightSize = heightSize;
	}

	
	

}
