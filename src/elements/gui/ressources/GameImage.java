package elements.gui.ressources;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameImage {

	/* Create variables images*/
	public static Image playNow;
	public static Image exitGame;
	
	public static Image floor;
	public static Image wallLeft;
	public static Image wallRight;
	public static Image wallUp;
	public static Image wallDown;
	public static Image wallCornerUL;
	public static Image wallCornerUR;
	public static Image wallCornerDL;
	public static Image wallCornerDR;
	
	public static Image cube;
	
	public static void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		/* Images menu */
		playNow = new Image("res/playNow.png");
		exitGame = new Image("res/exitGame.png");
		
		/* Images D�cor */
		floor = new Image("res/floor.png");
		wallLeft = new Image("res/wallLeft.png");
		wallRight = new Image("res/wallRight.png");
		wallUp= new Image("res/wallUp.png");
		wallDown = new Image("res/wallDown.png");
		wallCornerUL = new Image("res/wallCornerUL.png");
		wallCornerUR = new Image("res/wallCornerUR.png");
		wallCornerDL= new Image("res/wallCornerDL.png");
		wallCornerDR = new Image("res/wallCornerDR.png");
		
		
		/* Images Player */
		cube = new Image("res/cube.png");
		
	}
}
