package Main;


import org.newdawn.slick.*;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.lwjgl.input.Mouse;


public class Menu extends BasicGameState{
	
	Image playNow;
	Image exitGame;
	
	public Menu(int state) {
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException  {
		
		playNow = new Image("res/playNow.png");
		exitGame = new Image("res/exitGame.png");
	}
	
	public void render (GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		/* Text Menu */
		g.drawString("Welcome to Cuby", Game.width/2-(Game.width/12), Game.height/2-180);
		playNow.draw((Game.width / 2) - (playNow.getWidth() / 2), (Game.height / 2) - (playNow.getHeight() / 2));
		exitGame.draw((Game.width / 2) - (exitGame.getWidth() / 2), (Game.height / 2) - (exitGame.getHeight() / 2) + 100);
		
		/* test*/
		int buttonY1 = Game.height/2+90;
		int buttonY2 = Game.height/2+120;
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		g.drawString("Mouse x : "+xpos+"y : "+ypos, 100, 100);
		g.drawString("y before "+buttonY1+"y after : "+buttonY2, 100, 200);
		
		
	}
	
	public void update (GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input input = gc.getInput();
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		if( (xpos>(Game.width/2-(Game.width/12)) && xpos<(Game.width/2-(Game.width/12)+200)) && (ypos>(Game.height/2+90) && ypos<((Game.height/2+120)))) {
			if (input.isMouseButtonDown(0)) {
				sbg.enterState(1);
			}
		}
		if((xpos>(Game.width/2-(Game.width/12))&& xpos<(Game.width/2-(Game.width/12)+200)) && (ypos>(Game.height/2+30) && ypos<(Game.height/2+60))) {
			if (input.isMouseButtonDown(0)) {
				System.exit(0);
			}
		}
		
		
	}
	
	public int getID() {
		return 0;
	}

}
