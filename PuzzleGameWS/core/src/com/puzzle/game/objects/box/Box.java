package com.puzzle.game.objects.box;

import com.badlogic.gdx.math.Rectangle;
import com.puzzle.game.objects.Line;

/**
 * File: Box.java
 * Purpose: Used to keep tracks of boxes that can "reflect" lines on screen.
 * @author Douglas Rudolph
 */
public abstract class Box extends Rectangle
{

	private Line lines[];

	/**
	 * Initializes values 
	 * @param x: x coordinate 
	 * @param y: y coordinate
	 * @param width: width of box
	 * @param height: height of box
	 */
	public Box(float x, float y, float width, float height)
	{
		super(x,y,width,height);
	}
	
	
	
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

	public abstract void update();
	
	/**
	 * @return x coordinate
	 */
	public float getX()
	{
		return super.x;
	}


	/**
	 * @return y: returns y coordinate
	 */
	public float getY()
	{
		return super.y;
	}


	/**
	 * @return width: returns box width 
	 */
	public float getWidth()
	{
		return super.width;
	}

	/**
	 * 
	 * @return height: returns box height 
	 */
	public float getHeight()
	{
		return super.height;
	}

	
	public boolean contains(float x, float y)
	{
		if(super.contains(x, y))
		{
			return true;
		}
		
		return false;
	}
	

}
