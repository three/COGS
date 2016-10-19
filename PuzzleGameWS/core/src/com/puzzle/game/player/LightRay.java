package com.puzzle.game.player;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.puzzle.game.objects.LightPool;

public class LightRay
{

	private LightPool lightPool;
	private boolean isEmitting;
	
	public LightRay()
	{
		lightPool = new LightPool();
		isEmitting = false;
	}
	
	public void render(ShapeRenderer sRenderer)
	{
		if(isEmitting)
		{
			lightPool.render(sRenderer);
		}
	}
	
	public void update()
	{
		
	}
	
}
