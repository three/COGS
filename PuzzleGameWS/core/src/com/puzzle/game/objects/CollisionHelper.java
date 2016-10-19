package com.puzzle.game.objects;

public class CollisionHelper
{

	private BoxPool		boxPool;
	private LightPool	lightPool;

	public CollisionHelper(BoxPool boxPool, LightPool lightPool)
	{
		this.boxPool = boxPool;
		this.lightPool = lightPool;
	}
	
	public boolean isColliding()
	{
		 return false;
	}
	
	//compare all the lights against all the boxes
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
