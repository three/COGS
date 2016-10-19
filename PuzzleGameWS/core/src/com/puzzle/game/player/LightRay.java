package com.puzzle.game.player;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.puzzle.game.objects.LightPool;

public class LightRay
{

	private LightPool lightPool;
	
	public LightRay()
	{
		lightPool = new LightPool();
	}
	
	public void render(ShapeRenderer sRenderer)
	{
		lightPool.render(sRenderer);
	}
	
	public void update()
	{
		
	}
	
}
