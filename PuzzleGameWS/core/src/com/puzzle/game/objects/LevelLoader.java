package com.puzzle.game.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.badlogic.gdx.files.FileHandle;
import com.puzzle.game.objects.box.Box;
import com.puzzle.game.objects.box.VBox;

public class LevelLoader
{

	private String currentLvl;
	private static LevelLoader localLvlLoader = null;
	
	private LevelLoader()
	{
		currentLvl = null;
	}
	
	public static LevelLoader createLevelLoader()
	{
		
		if(localLvlLoader == null)
		{
			localLvlLoader = new LevelLoader();
		}
		
		return localLvlLoader;
		
	}
	
	public static void destryLevelLoader()
	{
		localLvlLoader = null;
	}
	
	public ArrayList<Box> loadLevel(FileHandle fileHandle)
	{
		ArrayList<Box> boxList = new ArrayList<Box>();
		
		File f = null;
		
		try
		{
			f = fileHandle.file();
			currentLvl = f.getName();
			Scanner scan = new Scanner(f);
			
			while(scan.hasNextLine())
			{
				float xLine = Float.parseFloat(scan.nextLine());
				float yLine = Float.parseFloat(scan.nextLine());
				float wLine = Float.parseFloat(scan.nextLine());
				float hLine = Float.parseFloat(scan.nextLine());
				String buffer = scan.nextLine();
				
				boxList.add(new VBox(xLine, yLine, wLine, hLine));
			}
			
			scan.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("COULDN'T LOAD IN LEVEL "+f.getName());
			e.printStackTrace();
		}
		
		return boxList;
	}
	
	
}
