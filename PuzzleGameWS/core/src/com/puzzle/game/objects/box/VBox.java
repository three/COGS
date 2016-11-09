package com.puzzle.game.objects.box;

import com.badlogic.gdx.Gdx;

public class VBox extends Box
{

	/**
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public VBox(float x, float y, float width, float height)
	{
		super(x,y,width,height);
	}
	
	/**
	 *
	 */
	@Override
	public void update()
	{
		if(super.contains(Gdx.input.getX(), Gdx.input.getY()) && Gdx.input.justTouched())
		{
			System.out.println("I touched a VBOX");
		}
	}
	
	
	
}
