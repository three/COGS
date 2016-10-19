package com.puzzle.game.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * File: BoxPool.java
 * Purpose: Used to keep track of all the boxes on screen
 * @author Douglas Rudolph
 */
public class BoxPool
{
	//boxPool
	private ArrayList<Box> boxPool;

	/**
	 * initialize the list of BoxPool
	 */
	public BoxPool()
	{
		boxPool = new ArrayList<Box>();
	}

	/**
	 * Add boxes by object reference
	 * @param b: Box to be added
	 */
	public void add(Box b)
	{
		boxPool.add(b);
	}
	
	/**
	 * Allows for boxes to be added parameters
	 * @param x: x coordinate
	 * @param y: y coordinate
	 * @param width: width of box
	 * @param height: height of box
	 */
	public void add(float x, float y, float width, float height)
	{
		boxPool.add(new Box(x,y,width,height));
	}
	
	/**
	 * render the boxes to the screen
	 * @param sRenderer: ShapeRenderer that will render all the boxes on screen
	 */
	public void render(ShapeRenderer sRenderer)
	{
		sRenderer.setColor(Color.CYAN);
		
		for(Box b: boxPool)
		{
			sRenderer.begin();
			sRenderer.rect(b.getX(), b.getY(), b.getWidth(), b.getHeight());
			sRenderer.end();
		}
	}

	/**
	 * 
	 * @return boxPool: returns the list of boxes
	 */
	public ArrayList<Box> getBoxPool()
	{
		return boxPool;
	}
}
