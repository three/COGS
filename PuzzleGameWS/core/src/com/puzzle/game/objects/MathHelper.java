package com.puzzle.game.objects;

/**
 * File: MathHelper.java
 * Purpose: Helper file used to find the slope and find the inverse. Used for adding lines on screen
 * @author Douglas Rudolph
 */
public class MathHelper
{
	
	/**
	 * TODO: Fix the case where the slope returns infinity 
	 * @param l
	 * @return
	 */
	public static double findSlope(Line l)
	{
		double m = ((double)l.getY1() - (double)l.getY2())/ ((double)l.getX1()-(double)l.getX2());
		return m;
	}
	
	/**
	 * inverts the slope of the line
	 * @param m: the slope of a line
	 * @return the reciprocal 
	 */
	public static double findInverse(double m)
	{
		return (double) (-1*Math.pow(m, -1));
	}
	
	/*public static Vector3 toVector3(Line l)
	{
		double
	}*/
}
