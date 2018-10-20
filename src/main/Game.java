package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import elements.gui.ressources.GameImage;
import game_state.MenuState;
import game_state.PlayState;

public class Game extends StateBasedGame {
	
	public static int width = 1280; 
	public static int height = 720;  
	public static final String gameName = "Cuby"; 
	public static final int menu = 0;
	public static final int play = 1; 
	public static final int cell = 32;
	
	public Game(String gameName) {
		super(gameName);
		this.addState(new MenuState(menu));
		this.addState(new PlayState(play));
		
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		GameImage.init(gc, this);
		this.getState(menu).init(gc , this);
		this.getState(play).init(gc , this);
		System.out.println(menu);
		System.out.println(play);		
		this.enterState(menu);
	}
	
	public static void main(String[] args) {
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(new Game(gameName));
			appgc.setDisplayMode(width, height, false);
			appgc.start(); 
		}catch(SlickException e) {
			e.printStackTrace();
		}
		
	}   
}
