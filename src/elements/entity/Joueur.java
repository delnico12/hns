package elements.entity;

import java.awt.Rectangle;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import elements.gui.ressources.GameAnimation;
import elements.gui.ressources.GameImage;
import main.Game;

public class Joueur extends Entity {
	
	
	private int playerTouch = 0;
	
	public void init(GameContainer cg, StateBasedGame sbg) throws SlickException {
		
		startPosX = 640 ;
		startPosY = 360	;
		posX = startPosX;
		posY = startPosY;
		hp = 200;
		speedMvmt = 1;
		destroyable = true;
		ally = true;
		hitbox = new Rectangle(posX, posY, Game.CELL, Game.CELL);
		
	}

	@Override
	public void render(GameContainer cg, StateBasedGame sbg, Graphics g) throws SlickException {
		
		GameImage.cube.draw(posX,posY);
		
		
		switch(playerTouch)
		{
			case 0:
				GameImage.cube.draw(posX,posY);
				break;
			case 1:
				GameAnimation.cubeAnimationUp.draw(posX,posY);
				break;
			case 2:
				GameAnimation.cubeAnimationDown.draw(posX,posY);
				break;
			case 3:
				GameAnimation.cubeAnimationLeft.draw(posX,posY);
				break;
			case 4:
				GameAnimation.cubeAnimationRight.draw(posX,posY);
				break;

		}
		
		
		
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		/* Update  */
		GameAnimation.cubeAnimationUp.update(delta);
		GameAnimation.cubeAnimationDown.update(delta);
		GameAnimation.cubeAnimationRight.update(delta);
		GameAnimation.cubeAnimationLeft.update(delta);
		
		
		/* Input */	
		
		Input input = gc.getInput();
			
		
			/* Outside Menu*/
		if(input.isKeyDown(Input.KEY_Z)) {
			
			posY -= speedMvmt*delta;
			
			playerTouch = 1;
			
		}
		else if(input.isKeyDown(Input.KEY_S)) {
			posY += speedMvmt*delta;
			
			playerTouch = 2;
		}
		else if(input.isKeyDown(Input.KEY_Q)) {
			posX -= speedMvmt*delta;
			
			
			playerTouch = 3;
		}
		else if(input.isKeyDown(Input.KEY_D)) {
			posX += speedMvmt*delta;
			
			playerTouch = 4;
		}	
		else {
			playerTouch = 0;
		}
		
	}

	
	

	
}
