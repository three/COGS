package com.puzzle.game;

import com.badlogic.gdx.Game;
import com.puzzle.game.levels.LevelOne;

public class Runner extends Game
{

	@Override
	public void create()
	{
		this.setScreen(new LevelOne());
	}

	
	
}
