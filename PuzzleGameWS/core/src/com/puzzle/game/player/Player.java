package com.puzzle.game.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * File: Player.java
 * Purpose: Player object that interfaces with the user
 * @author Douglas Rudolph
 */
public class Player
{
	//x and y coordinate of the player object
	private float x, y;
	
	//object that maanges where lights are being rendered
	private LightRay lightRay;
	
	/**
	 * Player Constructor
	 * @param x: x coordinate
	 * @param y: y coordinate
	 */
	public Player(float x, float y)
	{
		this.x = x;
		this.y = y;
		lightRay = new LightRay();
	}
	
	/**
	 * updates the player data
	 */
	public void update()
	{
		
	}
	
	/**
	 * Renders the starting location of the player 
	 * TODO: Renders a light from the player towards the mouse when the player clicks on screen
	 * @param sRenderer
	 */
	public void render(ShapeRenderer sRenderer)
	{
		//if you click on screen, render lights
		if(Gdx.input.isTouched())
		{
			lightRay.render(sRenderer);
		}
	}
	
	

}
