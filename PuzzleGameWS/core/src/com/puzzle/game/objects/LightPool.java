package com.puzzle.game.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class LightPool
{

	private ArrayList<Line> lights;
	
	public LightPool()
	{
		lights = new ArrayList<Line>();
	}
	
	public void add(Line l)
	{
		lights.add(l);
	}
	
	public void add(float x1, float y1, float x2, float y2)
	{
		lights.add(new Line(x1,y1,x2,y2));
	}
	
	public void remove(Line l)
	{
		lights.remove(l);
	}
	
	public void get(int index)
	{
		lights.get(index);
	}
	
	public void render(ShapeRenderer sRenderer)
	{
		for(Line l : lights)
		{
			sRenderer.begin();
			sRenderer.line(l.getX1(), l.getY1(), l.getX2(), l.getY2());
			sRenderer.end();
		}
	}
	
}
