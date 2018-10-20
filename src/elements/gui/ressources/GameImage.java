package elements.gui.ressources;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameImage extends  BasicGameState {

	/* Create variables images*/
	public static Image floor;
	public static Image wallLeft;
	public static Image wallRight;
	public static Image wallUp;
	public static Image wallDown;
	public static Image cube;
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		/* Images Décor */
		floor = new Image("res/floor.png");
		wallLeft = new Image("res/wallLeft.png");
		wallRight = new Image("res/wallRight.png");
		wallUp= new Image("res/wallUp.png");
		wallDown = new Image("res/wallDown.png");
		
		/* Images Player */
		cube = new Image("res/cube.png");
		
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
