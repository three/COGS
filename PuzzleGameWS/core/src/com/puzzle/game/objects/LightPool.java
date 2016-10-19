package com.puzzle.game.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * File: LightPool.java
 * Purpose: Manager object that helps with adding and removing lights from a list
 * @author Douglas Rudolph
 */
public class LightPool
{
	//list of lines (Lines are ways to representing lights)
	private ArrayList<Line> lights;
	
	/**
	 * init all data
	 */
	public LightPool()
	{
		lights = new ArrayList<Line>();
	}
	
	/**
	 * Adds a light to the pool
	 * @param l: light being added to the pool
	 */
	public void add(Line l)
	{
		lights.add(l);
	}
	
	/**
	 * Creates and adds a light to the pool
	 * @param x1: x coordinate for vector 1
	 * @param y1: y coordinate for vector 1
	 * @param x2: x coordinate for vector 2
	 * @param y2: y coordinate for vector 2
	 */
	public void add(float x1, float y1, float x2, float y2)
	{
		lights.add(new Line(x1,y1,x2,y2));
	}
	
	/**
	 * Removes lights from the light pool
	 * @param l: light being removed
	 */
	public void remove(Line l)
	{
		lights.remove(l);
	}
	
	/**
	 * Gets a Line (light) via array index 
	 * @param index: position in the light pool
	 * @return line: returns the line accessed
	 */
	public Line get(int index)
	{
		return lights.get(index);
	}
	
	/**
	 * Renders all the Lights on screen
	 * @param sRenderer: ShapeRenderer object that renders the lights
	 */
	public void render(ShapeRenderer sRenderer)
	{
		for(Line l : lights)
		{
			sRenderer.begin();
			sRenderer.line(l.getX1(), l.getY1(), l.getX2(), l.getY2());
			sRenderer.end();
		}
	}

	/**
	 * @return lightPool: returns the light pool as an ArrayList<Line>
	 */
	public ArrayList<Line> getLights()
	{
		return lights;
	}
	
}
