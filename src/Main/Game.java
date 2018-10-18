package Main;

/* NTTMMMMMMMMMMMdMMMMMMMMMMMMMMMMMMMMMMMMMMMM */


import org.newdawn.slick.*;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {
	
	public static int width = 1280;
	public static int height = 720;
	public static final String gameName = "Cuby" ;
	public static final int menu =0;
	public static final int play =1;
	/* map */
	
	public Game(String gameName) {
		super(gameName);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
		
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {

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
