package com.mygdx.game;

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

public class MyGdxGame extends ApplicationAdapter {
	
	//physics world
	private World world;
	
	//ray handler is an object that will draw the lights
	private RayHandler rayHandler; 
	
	//PointLight is a light 
	private PointLight light;
	private PointLight light2;
	private Box2DDebugRenderer brenderer; //images should take the shape of the body
	private OrthographicCamera camera;  //necessary for ortho view
	
	@SuppressWarnings("deprecation")
	@Override
	public void create () {
		//1st method called when loading a scene
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
		//OpenGL - Open Graphics Library
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		world.step(1/60f, 4, 2); //30 frames move, 20 update the collisions
		brenderer.render(world, camera.combined); //renders all the objects and scaling them to camera
		rayHandler.updateAndRender();
		
	}
	
	private void createBody(BodyType bType, float restitution, float positionX, float positionY, 
			float sizeX, float sizeY)
	{	//creates physics body
		BodyDef bdef = new BodyDef(); 
		bdef.position.set(positionX, positionY);
		bdef.type = bType;
		
		Body b = world.createBody(bdef);
		
		PolygonShape shape = new PolygonShape();
		FixtureDef fdef = new FixtureDef(); //attributes
		fdef.restitution = restitution; //bounce
		shape.setAsBox(sizeX, sizeY); //shape
		fdef.shape = shape;
		b.createFixture(fdef); //attributes can be changed on the fly
	}
	
	//albedo and reflectivity
}