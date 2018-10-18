package Main;


import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;


public class Menu extends BasicGameState{
	
	Image playNow;
	Image exitGame;
	
	Vector2f posPlayNow, posExitGame; // Position des boutons du menu
	Vector2f posMouse; // Position de la souris
	
	Rectangle hitboxPlayNow, hitboxExitGame; // Hitbox des boutons
	Rectangle hitboxMouse; // Hitbox de la souris
	
	public Menu(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException  {
		playNow = new Image("res/playNow.png");
		exitGame = new Image("res/exitGame.png");
		
		posPlayNow = new Vector2f((Game.width / 2) - (playNow.getWidth() / 2), (Game.height / 2) - (playNow.getHeight() / 2));
		posExitGame = new Vector2f((Game.width / 2) - (exitGame.getWidth() / 2), (Game.height / 2) - (exitGame.getHeight() / 2) + 100);
		
		posMouse = new Vector2f(0, 0);
		
		hitboxPlayNow = new Rectangle(posPlayNow.x, posPlayNow.y, playNow.getWidth(), playNow.getHeight());
		hitboxExitGame = new Rectangle(posExitGame.x, posExitGame.y, exitGame.getWidth(), exitGame.getHeight());		
	}
	
	public void render (GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		/* Text Menu */
		g.drawString("Welcome to Cuby", Game.width/2-(Game.width/12), Game.height/2-180);
		
		playNow.draw(posPlayNow.x, posPlayNow.y);
		exitGame.draw(posExitGame.x, posExitGame.y);
	}
	
	public void update (GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input input = gc.getInput();
		
		posMouse.x = input.getMouseX();
		posMouse.y = input.getMouseY();
		
		hitboxMouse = new Rectangle(posMouse.x, posMouse.y, 1, 1);
		
		/*if( (xpos>(Game.width/2-(Game.width/12)) && xpos<(Game.width/2-(Game.width/12)+200)) && (ypos>(Game.height/2+90) && ypos<((Game.height/2+120)))) {
			if (input.isMouseButtonDown(0)) {
				sbg.enterState(1);
			}
		}
		if((xpos>(Game.width/2-(Game.width/12))&& xpos<(Game.width/2-(Game.width/12)+200)) && (ypos>(Game.height/2+30) && ypos<(Game.height/2+60))) {
			if (input.isMouseButtonDown(0)) {
				System.exit(0);
			}
		}*/
		
		if(hitboxMouse.intersects(hitboxPlayNow)) {
			if (input.isMouseButtonDown(0)) {
				sbg.enterState(1);
			}
		}
		if(hitboxMouse.intersects(hitboxExitGame)) {
			if (input.isMouseButtonDown(0)) {
				System.exit(0);
			}
		}
	}
	
	public int getID() {
		return 0;
	}

}
