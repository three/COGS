package com.mygdx.game;


/*
 * MathHelper is responsible for helping us with math.  No shit.
 */
public class MathHelper 
{
	/**
	 *
	 * @param Line
	 * @return a double which is the slope of our line 
	 */
	public static double findSlope(Line l)
	{
		
		double m = ((double)l.getY1() - (double)l.getY2()) / 
					((double)l.getX2() - (double)l.getX1());
		return m;
	}
	
	public static double findInverseSlope(double slope)
	{
		double m = (double)-1 / slope;
		return m;
	}
}
