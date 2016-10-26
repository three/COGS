package com.puzzle.game.objects;
import com.badlogic.gdx.math.Vector2;

/**
 * FILE: Function.java
 * LAST EDITED: 06/01/2016
 * PURPOSE: 
 * 	1. Used as a way to store math functions and perform basic algebra
 * 
 * @author Doug - github.com/TheRealDoug
 */
public class Function
{
	//slope
	public float m;
	
	//y-intercept
	public float b;

	/**
	 * Creates a function given a slope and y-intercept
	 * @param m: slope
	 * @param b: y-intercept
	 */
	public Function(float m, float b)
	{
		this.m = m;
		this.b = b;
	}

	/**
	 * Solves for the y-intercept
	 */
	public Function(Vector2 v1, Vector2 v2)
	{
		this.m = calculateSlope(v1,v2);
		this.b = v1.y-this.m*(v1.x);
	}

	/**
	 * Takes in a convex hull vector coordinate and a function of a line and finds the perpendicular bisector
	 * @param f: function 1
	 * @param v: vector 1
	 * @return perpendicular bisector as a function
	 */
	public static Function perpBisector(Function f, Vector2 v)
	{
		float m;
		
		if(f.m!=0)
			m = -(1/f.m);
		else 
		{
			m=0;
		}
		
		Function perpBi = new Function(m, v.y-m*(v.x));
		return perpBi;
	}

	/**
	 *  returns the point of intersection between 2 given functions (assumes that each function is linear)
	 * @param f1: function 1
	 * @param f2: function 2
	 * @return the vector where these two functions intersect
	 */
	public static Vector2 pointtOfIntersection(Function f1, Function f2)
	{
		float x;
		
		if(f1.m-f2.m!=0)
			x = (f2.b-f1.b)/(f1.m-f2.m);
		else
			x=0;
		
		float y = f1.solveForY(x);

		return new Vector2(x,y);
	}
	
	/**
	 * Returns [(y1-y2)/(x1-x2)]
	 * @param v1: vector 1
	 * @param v2: vector 2
	 * @return m
	 */
	private float calculateSlope(Vector2 v1, Vector2 v2)
	{
		m = (v1.y - v2.y)/(v1.x-v2.x);
		return m;
	}
	
	/**
	 * 
	 * @param y: y-location
	 * @return the x coordinate corresponding to the input y coordinates
	 */
	public float solveForX(float y)
	{
		return y/m -b;
	}

	/**
	 * 
	 * @param x: x-location
	 * @return: the y value corresponding with the input x coordinate
	 */
	public float solveForY(float x)
	{
		return m*x + (b);
	}

	/**
	 * custom toString method that returns the function in y-intercept form
	 */
	@Override
	public String toString()
	{
		return "y = "+ m + "x" + b;
	}
	
}