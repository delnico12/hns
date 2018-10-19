package main;


import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import elements.gui.ressources.Button;


public class Menu extends BasicGameState{
	
	Image playNow; // Img bouton
	Image exitGame; // Img bouton
	
	Vector2f posPlayNow, posExitGame; // Position des boutons du menu
	Vector2f posMouse; // Position de la souris
	
	Rectangle hitboxPlayNow, hitboxExitGame; // Hitbox des boutons
	
	Button play, quit; // Bouton
	
	public Menu(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException  {
		playNow = new Image("res/playNow.png");
		exitGame = new Image("res/exitGame.png");
		
		posPlayNow = new Vector2f((Game.width / 2) - (playNow.getWidth() / 2), (Game.height / 2) - (playNow.getHeight() / 2));
		posExitGame = new Vector2f((Game.width / 2) - (exitGame.getWidth() / 2), (Game.height / 2) - (exitGame.getHeight() / 2) + 100);
				
		hitboxPlayNow = new Rectangle(posPlayNow.x, posPlayNow.y, playNow.getWidth(), playNow.getHeight());
		hitboxExitGame = new Rectangle(posExitGame.x, posExitGame.y, exitGame.getWidth(), exitGame.getHeight());		
	
		play = new Button(playNow, posPlayNow, hitboxPlayNow);
		quit = new Button(exitGame, posExitGame, hitboxExitGame);
	}
	
	public void render (GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		/* Text Menu */
		g.drawString("Welcome to Cuby", Game.width/2-(Game.width/12), Game.height/2-180);
		
		play.render();
		quit.render();
	}
	
	public void update (GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input input = gc.getInput();
		
		if(play.isHover(input) && play.isClicked(input))
			sbg.enterState(1);
		if(quit.isHover(input) && quit.isClicked(input))
			System.exit(0);
	}
	
	public int getID() {
		return 0;
	}

}
