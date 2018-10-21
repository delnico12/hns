package elements.tile;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import elements.gui.ressources.GameImage;
import elements.gui.screen.TileMap;

public class Floor extends Tile {
	
	
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		isTraversable = true;
		doDamage = false;
		image = GameImage.floor;
	}

	
	public void render(GameContainer gc, StateBasedGame sgb, Graphics g) throws SlickException {
		image.draw(x,y);
		
	}

	

}
