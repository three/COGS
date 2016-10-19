package com.puzzle.game;

import com.badlogic.gdx.Game;
import com.puzzle.game.levels.LevelOne;

/**
 * File: Runner.java
 * Purpose: the starting point to the game 
 * @author Douglas Rudolph
 */
public class Runner extends Game
{
	/**
	 * Sets the screen to LevelOne
	 */
	@Override
	public void create()
	{
		this.setScreen(new LevelOne());
	}
	
}
