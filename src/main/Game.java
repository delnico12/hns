package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import elements.gui.ressources.GameAnimation;
import elements.gui.ressources.GameImage;
import game_state.MenuState;
import game_state.PlayState;

public class Game extends StateBasedGame {
	
	public static int WIDTH = 1280; 
	public static int HEIGHT = 720;  
	public static final String GAMENAME = "Cuby"; 
	public static final int MENU = 0;
	public static final int PLAY = 1; 
	public static final int CELL = 32;
	
	public Game(String gameName) {
		super(gameName);
		this.addState(new MenuState(MENU));
		this.addState(new PlayState(PLAY));
		
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		GameAnimation.init(gc, this);
		GameImage.init(gc, this);
		this.getState(MENU).init(gc , this);
		this.getState(PLAY).init(gc , this);
		System.out.println(MENU);
		System.out.println(PLAY);		
		this.enterState(MENU);
	}
	
	public static void main(String[] args) {
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(new Game(GAMENAME));
			appgc.setDisplayMode(WIDTH, HEIGHT, false);
			appgc.start(); 
		}catch(SlickException e) {
			e.printStackTrace();
		}
		
	}   
}
