package com.puzzle.game;

import com.badlogic.gdx.Game;

public class Runner extends Game
{

	@Override
	public void create()
	{
		this.setScreen(new LevelOne());
	}

	
	
}
