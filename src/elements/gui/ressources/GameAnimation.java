package elements.gui.ressources;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.StateBasedGame;

public class GameAnimation {
	
	
	
	
	public static SpriteSheet cubeSheetUp, cubeSheetDown,cubeSheetLeft,cubeSheetRight;
	public static Animation cubeAnimationUp;
	public static Animation cubeAnimationDown;
	public static Animation cubeAnimationLeft;
	public static Animation cubeAnimationRight;
	
	
	public static void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		/* Create SpriteSheet */
		cubeSheetUp = new SpriteSheet("res/cubeUp.png", 32 , 32);
		cubeSheetDown = new SpriteSheet("res/cubeDown.png", 32 , 32);
		cubeSheetLeft = new SpriteSheet("res/cubeLeft.png", 32 , 32);
		cubeSheetRight = new SpriteSheet("res/cubeRight.png", 32 , 32);
		
		/* Animations */
		cubeAnimationUp = new Animation(cubeSheetUp, 200);
		cubeAnimationDown = new Animation(cubeSheetDown,200);
		cubeAnimationLeft = new Animation(cubeSheetLeft, 200);
		cubeAnimationRight = new Animation(cubeSheetRight,200);
		
		
	}
}


