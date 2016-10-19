package com.puzzle.game.objects;

/**
 * File: Line.java
 * Purpose: Game object that can store the line data in one location
 * @author Douglas Rudolph
 */
public class Line
{
	//coordinates of each vector
	private float x1,x2,y1,y2;
	
	/**
	 * Line Constructor - Initializes all Line data
	 * @param x1: x coordinate for vector 1
	 * @param y1: y coordinate for vector 1
	 * @param x2: x coordinate for vector 2
	 * @param y2: y coordinate for vector 2
	 */
	public Line(float x1, float y1, float x2, float y2)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	/**
	 * return x coordinate from x1 vector
	 * @return x1
	 */
	public float getX1()
	{
		return x1;
	}

	/**
	 *  set x coordinate from x1 vector
	 * @param x1
	 */
	public void setX1(float x1)
	{
		this.x1 = x1;
	}

	/** return x coordinate from x2 vector
	 * 
	 * @return
	 */
	public float getX2()
	{
		return x2;
	}

	/**
	 *  set x coordinate from x2 vector
	 * @param x2
	 */
	public void setX2(float x2)
	{
		this.x2 = x2;
	}

	/**
	 *  return y coordinate from y1 vector
	 * @return y1
	 */
	public float getY1()
	{
		return y1;
	}

	/**
	 *  set y coordinate from y1 vector
	 * @param y1
	 */
	public void setY1(float y1)
	{
		this.y1 = y1;
	}

	/**
	 *  return y coordinate from y2 vector
	 * @return
	 */
	public float getY2()
	{
		return y2;
	}

	/**
	 *  set y coordinate from y2 vector
	 * @param y2
	 */
	public void setY2(float y2)
	{
		this.y2 = y2;
	}
	
	
	
}
