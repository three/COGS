package com.puzzle.game.objects;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Shape;

/**
 * File: CollisionHelper.java
 * Purpose: Helper class to help with collision handling 
 * @author Douglas Rudolph
 */
public class CollisionHelper
{
	
	//reference to BoxPool
	private BoxPool	boxPool;
	
	//reference to LightPool
	private LightPool lightPool;

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
	public Vector2 collisionPoint(Box b, Line l)
	{	
		Function fBot = new Function(new Vector2(b.getX(), b.getY()), new Vector2(b.getX() + b.getWidth(), b.getY()));
		Function fTop = new Function(new Vector2(b.getX(), b.getY() + b.getHeight()), new Vector2(b.getX()+ b.getWidth(), b.getY() + b.getHeight()));
		Function fLeft = new Function(new Vector2(b.getX(), b.getY()), new Vector2(b.getX(), b.getY() + b.getHeight()));
		Function fRight = new Function(new Vector2(b.getX() + b.getWidth(), b.getY()), new Vector2(b.getX() + b.getWidth(), b.getY() + b.getHeight())); 
		//functions generated from sides of the box
		
		Function functions [] = {fBot, fTop, fLeft, fRight}; 
		//function generated from the line 
		
		Function lineFunction = new Function(new Vector2(l.getX1(), l.getY1()), new Vector2(l.getX2(), l.getY2()));
		
		for(Function f : functions)
		{
			Vector2 pointOfInt = Function.pointOfIntersection(lineFunction, f);
			if(b.contains(pointOfInt) == true)
			{
				return pointOfInt;
			}
		}
		return null;
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

