package com.puzzle.game.player;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.puzzle.game.objects.LightPool;

/**
 * File LightRay.java
 * Purpose: Used to render lights that the player shoots out
 * @author Douglas Rudolph
 */
public class LightRay
{
	//Light pool object that manages the lights the player shoots and its reflections 
	private LightPool lightPool;
	
	/**
	 * Initializes the light pool 
	 */
	public LightRay()
	{
		lightPool = new LightPool();
	}
	
	/**
	 * Renders the lights on screen
	 * @param sRenderer: ShapeRenderer that will be rendering the lights
	 */
	public void render(ShapeRenderer sRenderer)
	{
		lightPool.render(sRenderer);
	}
	
	/**
	 * updates the LightPool as the mouse moves
	 */
	public void update()
	{
		
	}
	
}
