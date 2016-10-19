package com.puzzle.game.objects;

/**
 * File: CollisionHelper.java
 * Purpose: Helper class to help with collision handling 
 * @author Douglas Rudolph
 */
public class CollisionHelper
{
	
	//reference to BoxPool
	private BoxPool		boxPool;
	
	//reference to LightPool
	private LightPool	lightPool;

	/**
	 * 
	 * @param boxPool: BoxPool
	 * @param lightPool: LightPool
	 */
	public CollisionHelper(BoxPool boxPool, LightPool lightPool)
	{
		this.boxPool = boxPool;
		this.lightPool = lightPool;
	}
	
	/**
	 * Takes in a box and a line and checks to see if there is an interesting coordinate
	 * @return true: if a line is colliding with a box
	 * @return false: if a line is not colliding with a box
	 */
	public boolean isColliding(Box b, Line l)
	{
		 return false;
	}
	
	/**
	 * compare all the lights against all the boxes
	 */
	public void compareAll()
	{
		for(Line l: lightPool.getLights())
		{
			for(Box b: boxPool.getBoxPool())
			{
				//compare if l and b are colliding 
			}
		}
	}
	

}
