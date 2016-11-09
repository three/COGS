package com.puzzle.game.objects;

/**
 * File: Box.java
 * Purpose: Used to keep tracks of boxes that can "reflect" lines on screen.
 * @author Douglas Rudolph
 */
public class Box
{
	//x and y coordinate
	//width and height
	float x, y, width, height;

	/**
	 * Initializes values 
	 * @param x: x coordinate 
	 * @param y: y coordinate
	 * @param width: width of box
	 * @param height: height of box
	 */
	public Box(float x, float y, float width, float height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	private Line lines[];
	
	/**
	 * upper, right, bottom, left
	 * @param lines
	 */
	public Box(Line ...lines)
	{
		
		this.lines = new Line[4];
		
		int index=0;
		
		for(Line l: lines)
		{
			this.lines[index++]=l;
		}
	}

	/**
	 * @return x coordinate
	 */
	public float getX()
	{
		return x;
	}

	/**
	 * @param x: sets x coordinate
	 */
	public void setX(float x)
	{
		this.x = x;
	}

	/**
	 * @return y: returns y coordinate
	 */
	public float getY()
	{
		return y;
	}

	/**
	 * @param y: sets y coordinate
	 */
	public void setY(float y)
	{
		this.y = y;
	}

	/**
	 * @return width: returns box width 
	 */
	public float getWidth()
	{
		return width;
	}

	/**
	 * 
	 * @param width: sets box width 
	 */
	public void setWidth(float width)
	{
		this.width = width;
	}

	/**
	 * 
	 * @return height: returns box height 
	 */
	public float getHeight()
	{
		return height;
	}

	/**
	 * 
	 * @param height: sets  box height
	 */
	public void setHeight(float height)
	{
		this.height = height;
	}

	

}
