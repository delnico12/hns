package elements.tile;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Tile  {
	
	public Image image;
	public int x;
	public int y;
	public boolean isTraversable;
	public boolean doDamage;
	Rectangle tileHitbox;
	

	
	public void init(GameContainer 	cg, StateBasedGame sbg) throws SlickException {
		
		
	}

	

}
