package game_state;

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
import elements.gui.ressources.Text;
import main.Game;


public class MenuState extends BasicGameState{
	
	Image playNow; // Img bouton
	Image exitGame; // Img bouton
	
	Vector2f posPlayNow, posExitGame; // Position des boutons
	
	Rectangle hitboxPlayNow, hitboxExitGame; // Hitbox des boutons
	
	Button play, quit; // Bouton
	Text welcome;
	
	public MenuState(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException  {
		playNow = new Image("res/playNow.png");
		exitGame = new Image("res/exitGame.png");
		
		posPlayNow = new Vector2f((Game.width / 2) - (playNow.getWidth() / 2), (Game.height / 2) - (playNow.getHeight() / 2));
		posExitGame = new Vector2f((Game.width / 2) - (exitGame.getWidth() / 2), (Game.height / 2) - (exitGame.getHeight() / 2) + 100);
		
		play = new Button(playNow, posPlayNow);
		quit = new Button(exitGame, posExitGame);
		
		welcome = new Text("Verdana", 15, new Vector2f(0, 0), "Welcome to Cuby");
		welcome.setX((Game.width / 2) - (welcome.getWidth() / 2));
		welcome.setY((Game.height / 2) - (welcome.getHeight() / 2) - 200);
	}
	
	public void render (GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		/* Text Menu */
		welcome.drawFont();
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
