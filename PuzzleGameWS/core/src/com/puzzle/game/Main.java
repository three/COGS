package com.puzzle.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import box2dLight.PointLight;
import box2dLight.RayHandler;

public class Main extends ApplicationAdapter {
	
	//physics world
	private World world;
	
	//ray handler is an object that will draw the lights
	private RayHandler rayHandler;
	
	//PointLight is a light 
	private PointLight light;
	private PointLight light2;
	private Box2DDebugRenderer brenderer;
	private OrthographicCamera camera;
	
	@SuppressWarnings("deprecation")
	@Override
	public void create () {
		
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		brenderer = new Box2DDebugRenderer();
		world = new World(new Vector2(0,-900), false);
		rayHandler = new RayHandler(world);
		rayHandler.setCombinedMatrix(camera.combined);
		light = new PointLight(rayHandler, 400, Color.BLUE,450,-140,10);
		light2 = new PointLight(rayHandler, 400, Color.RED, 450,140,10);
		createBody(BodyType.StaticBody, 0,0,-30,100,10);
		createBody(BodyType.DynamicBody, 1f,0,100,10,10);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		world.step(1/60f, 4, 2);
		brenderer.render(world, camera.combined);
		rayHandler.updateAndRender();
		
		
		
	}
	
	private void createBody(BodyType bType, float restitution, float positionX, float positionY, 
			float sizeX, float sizeY)
	{
		BodyDef bdef = new BodyDef();
		bdef.position.set(positionX, positionY);
		bdef.type = bType;
		
		Body b = world.createBody(bdef);
		
		PolygonShape shape = new PolygonShape();
		FixtureDef fdef = new FixtureDef();
		fdef.restitution = restitution;
		shape.setAsBox(sizeX, sizeY);
		fdef.shape = shape;
		b.createFixture(fdef);
	}
}
