package elements.tile;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import elements.gui.screen.TileMap;



public class TileManage {
	
	/* All tile */
	static Wall wall;
	static Floor floor;
	
	public static void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		wall = new Wall();
		floor = new Floor();
	}

	
	public void render(GameContainer gc, StateBasedGame sgb, Graphics g) throws SlickException {
		
		if(TileMap.genericMap[TileMap.xTab][TileMap.yTab] < 0 ) {wall.render(gc, sgb, g);}
		if(TileMap.genericMap[TileMap.xTab][TileMap.yTab] == 0 ) {floor.render(gc, sgb, g);}
		
	}

	
	public void update(GameContainer cg, StateBasedGame sgg, int g) throws SlickException {
		
		
	}

	
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
