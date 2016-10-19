package com.puzzle.game.levels;

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
import com.puzzle.game.objects.BoxPool;
import com.puzzle.game.player.Player;

/** 
 * File LevelOne.java
 * Purpose: Used to render and update everything on screen
 * 
 * @author Dougvlas Rudolph
 */
public class LevelOne implements Screen
{
	//draws shapes to the screen
	private ShapeRenderer sRenderer;
	
	//Camera object that manages what gets rendered on screen for the level
	private OrthographicCamera camera;
	
	//Graphics object that can draw images
	private SpriteBatch batch;
	
	//physics body objects (explained in constructor)
	private Box2DDebugRenderer bRenderer;
	private World world; 
	
	//stores all the boxes in the level
	private BoxPool boxPool;
	
	//player object for the game
	private Player player;
	
	@Override
	public void show()
	{
		//create a ShapeRenderer
		sRenderer = new ShapeRenderer();
		//let shapes be renderered on the fly
		sRenderer.setAutoShapeType(true);
		
		//create a camera for the level
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		//draws images on screen 
		batch = new SpriteBatch();
		
		//used to render physics bodies on screen
		bRenderer = new Box2DDebugRenderer();
		//used to update physics bodies on screen 
		world = new World(new Vector2(0, -9.8f), false);
		
		//all the boxes being rendered to the screen
		boxPool = new BoxPool();
		boxPool.add(10,10,10,10);
		boxPool.add(100,25,15,50);
		boxPool.add(300,400,100,45);
		boxPool.add(200,200,30,30);
		player = new Player(10,10);
	}

	/**
	 * @param delta: the inbetween frames
	 */
	@Override
	public void render(float delta)
	{
		//RGB(Red, Green, Blue)
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		//update and render the players
		player.update();
		player.render(sRenderer);
		
		//render the all the boxes in the box pool on the screen
		boxPool.render(sRenderer);
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
