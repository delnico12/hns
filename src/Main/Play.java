package Main;

import org.newdawn.slick.*;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.*;



public class Play extends BasicGameState{
	
	Image map;
	boolean quit = false;
	int[] duration = {200,200};
	float cubePosX = 0;
	float cubePosY = 0;
	float shiftX = cubePosX + Game.width/2;
	float shiftY = cubePosY +Game.height/2;
	private Image cube;
	private SpriteSheet cubeSheetUp, cubeSheetDown,cubeSheetLeft,cubeSheetRight;
	private Animation cubeAnimationUp,cubeAnimationDown,cubeAnimationLeft,cubeAnimationRight;
	private int playerTouch = 0;
	private TileMap gameMap;
	
	
	public Play(int State) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException  {
		/* Images */
		cube = new Image("res/cube.png");
		
		
		/* SpriteSheet */
		cubeSheetUp = new SpriteSheet("res/cubeUp.png", 32 , 32);
		cubeSheetDown = new SpriteSheet("res/cubeDown.png", 32 , 32);
		cubeSheetLeft = new SpriteSheet("res/cubeLeft.png", 32 , 32);
		cubeSheetRight = new SpriteSheet("res/cubeRight.png", 32 , 32);
		
		/* Animations */
		cubeAnimationUp = new Animation(cubeSheetUp, 200);
		cubeAnimationDown = new Animation(cubeSheetDown,200);
		cubeAnimationLeft = new Animation(cubeSheetLeft, 200);
		cubeAnimationRight = new Animation(cubeSheetRight,200);
		
		
		/* map */
		gameMap = new TileMap();
		
	}
	
	public void render (GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		/* Start */
		cube.draw(shiftX,shiftY);
		gameMap.render(gc,sbg,g);
		
		
		/* Switch Player Touch */
		switch(playerTouch)
		{
			case 0:
				cube.draw(shiftX,shiftY);
				break;
			case 1:
				cubeAnimationUp.draw(shiftX,shiftY);
				break;
			case 2:
				cubeAnimationDown.draw(shiftX,shiftY);
				break;
			case 3:
				cubeAnimationLeft.draw(shiftX,shiftY);
				break;
			case 4:
				cubeAnimationRight.draw(shiftX,shiftY);
				break;

		}
		
		
		
		
		/* Quit Menu */
		if(quit == true) {
				g.setColor(Color.gray);
				g.fillRect(Game.width/2-(Game.width/12), Game.height/2-180,200, 150);
				g.setColor(Color.blue);
				g.drawString("Resume (R)",(Game.width/2-(Game.width/15)),Game.height/2-60);
				g.drawString("Main Menu (M)",(Game.width/2-(Game.width/15)),Game.height/2-120);
				g.drawString("Quit Game (Q)",(Game.width/2-(Game.width/15)),Game.height/2-180);				
		}
		
		
	}
	
	public void update (GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		/* Update  */
		cubeAnimationUp.update(delta);
		cubeAnimationDown.update(delta);
		cubeAnimationRight.update(delta);
		cubeAnimationLeft.update(delta);
		
		
		/* Input */	
		
		Input input = gc.getInput();
			/*Inside Menu*/
		if(input.isKeyDown(Input.KEY_R) && quit == true) {
			quit = false;
		}
		if(input.isKeyDown(Input.KEY_M) && quit == true) {
			sbg.enterState(0);
			quit = false;
		}
		if(input.isKeyDown(Input.KEY_Q) && quit == true) {
			System.exit(0);
		}
		
			/* Outside Menu*/
		if(input.isKeyDown(Input.KEY_Z)) {
			
			cubePosY += delta;
			playerTouch = 1;
		}
		else if(input.isKeyDown(Input.KEY_S)) {
			cubePosY -= delta;
			playerTouch = 2;
		}
		else if(input.isKeyDown(Input.KEY_Q)) {
			cubePosX += delta;
			playerTouch = 3;
		}
		else if(input.isKeyDown(Input.KEY_D)) {
			cubePosX -= delta;
			playerTouch = 4;
		}
		else if(input.isKeyDown(Input.KEY_ESCAPE)) {
			
			quit = true;
		}
		else {
			playerTouch = 0;
		}
		
	}
	
	public int getID() {
		return 1;
	}

}
