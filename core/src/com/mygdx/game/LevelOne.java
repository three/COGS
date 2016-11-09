package com.mygdx.game;

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


//IMPORT SHORTCUT : ctrl + shift + o

public class LevelOne implements Screen
{
	private World world;
	private ShapeRenderer sRenderer;
	private Box2DDebugRenderer bRenderer;
	private OrthographicCamera camera;
	
	private SpriteBatch batch;
	//same objects as in MyGdxGame.java

	
	
	@Override
	public void show() 
	{
		// TODO Auto-generated method stub
		sRenderer = new ShapeRenderer();
		sRenderer.setAutoShapeType(true); // IMPORTANT: allows you to draw shapes - don't forget this line 
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight()); //overall static class Gdx
		//^useful shit^
		batch = new SpriteBatch(); //default shader
		
		bRenderer = new Box2DDebugRenderer();
		world = new World(new Vector2(0, -9.8f), false); //set gravity vector, simulate inactive bodies
		
	}

	@Override
	public void render(float delta) 
	{
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0, 0, 0); //rgb alpha, 0 to 1
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		sRenderer.begin(); //needs to batch in cycles
		sRenderer.setColor(Color.FIREBRICK);

		sRenderer.rect(10, 10, 10, 10); //x, y, width, height 
		sRenderer.setColor(Color.CYAN);
		
		sRenderer.line(50,  50, 0, 0);
		

		sRenderer.end(); //needs to end the batch
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
