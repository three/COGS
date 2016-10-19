package com.puzzle.game.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Player
{
	private float x, y;
	private LightRay lightRay;
	

	public Player(float x, float y)
	{
		this.x = x;
		this.y = y;
		lightRay = new LightRay();
	}
	
	public void update()
	{
		
	}
	
	public void render(ShapeRenderer sRenderer)
	{
		if(Gdx.input.isTouched())
		{
			lightRay.render(sRenderer);
		}
	}
	
	

}
