package com.puzzle.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

//IMPORT SHORTCUT - ctrl + shift + o

public class LevelOne implements Screen
{

	private ShapeRenderer sRenderer;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	
	private Box2DDebugRenderer bRenderer;
	private World world; 
	
	@Override
	public void show()
	{
		sRenderer = new ShapeRenderer();
		//MUST WRITE THIS LINE
		sRenderer.setAutoShapeType(true);
		
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch = new SpriteBatch();
		
		bRenderer = new Box2DDebugRenderer();
		world = new World(new Vector2(0, -9.8f), false);
	}

	@Override
	public void render(float delta)
	{
		//RGB(Red, Green, Blue)
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		
		sRenderer.setColor(Color.CYAN);
		
		
		//begins drawing
		sRenderer.begin();
		
		sRenderer.line(50,20, 0,0);
		
		//x,y,width, height
		sRenderer.rect(10, 10, 10, 10);
		
		
		//stops drawing
		sRenderer.end();
		
	}

	@Override
	public void resize(int width, int height)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose()
	{
		// TODO Auto-generated method stub
		
	}
	
	

}
