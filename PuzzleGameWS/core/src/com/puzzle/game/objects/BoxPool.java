package com.puzzle.game.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class BoxPool
{

	private ArrayList<Box> boxPool;

	public BoxPool()
	{
		boxPool = new ArrayList<Box>();
	}

	public void add(Box b)
	{
		boxPool.add(b);
	}
	
	public void add(float x, float y, float width, float height)
	{
		boxPool.add(new Box(x,y,width,height));
	}
	
	/**
	 * render the boxes to the screen
	 * @param sRenderer
	 */
	public void render(ShapeRenderer sRenderer)
	{
		
		sRenderer.setColor(Color.CYAN);
		
		for(Box b: boxPool)
		{
			sRenderer.begin();
			sRenderer.rect(b.getX(), b.getY(), b.getWidth(), b.getHeight());
			sRenderer.end();
		}
		
		
	}
	
}
