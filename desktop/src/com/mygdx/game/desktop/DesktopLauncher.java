package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Runner;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 640;
		config.height = 480; //480p old gfx style
		
		
		new LwjglApplication(new Runner(), config); //accepts the game or the application adapter
		//Runner gets called
		//Runner creates the LevelOne instance upon being called
	}
}
