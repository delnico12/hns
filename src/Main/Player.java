package Main;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Vector2f;

public class Player {
	private Vector2f pos;
	
	private Image cube;
	private SpriteSheet cubeSheetUp, cubeSheetDown,cubeSheetLeft,cubeSheetRight;
	private Animation cubeAnimationUp,cubeAnimationDown,cubeAnimationLeft,cubeAnimationRight;
	private int playerTouch = 0;
	
	public Player(Vector2f pos) throws SlickException {
		this.pos.x = pos.x;
		this.pos.y = pos.y;
		
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
	
	public void render() throws SlickException {
		cube.draw(this.pos.x, this.pos.y);
		
		/* Switch Player Touch */
		switch(playerTouch)
		{
			case 0:
				cube.draw(this.pos.x, this.pos.y);
				break;
			case 1:
				cubeAnimationUp.draw(this.pos.x, this.pos.y);
				break;
			case 2:
				cubeAnimationDown.draw(this.pos.x, this.pos.y);
				break;
			case 3:
				cubeAnimationLeft.draw(this.pos.x, this.pos.y);
				break;
			case 4:
				cubeAnimationRight.draw(this.pos.x, this.pos.y);
				break;
		}
	}
	
	public void update(GameContainer gc, int delta) throws SlickException {
		/* Update  */
		cubeAnimationUp.update(delta);
		cubeAnimationDown.update(delta);
		cubeAnimationRight.update(delta);
		cubeAnimationLeft.update(delta);
	}
}
