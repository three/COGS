package com.mygdx.game;

import com.badlogic.gdx.Game;

public class Runner extends Game 
{

	@Override
	public void create() 
	{
		// TODO Auto-generated method stub
		this.setScreen(new LevelOne()); //new instance of LevelOne
	}
	

}
