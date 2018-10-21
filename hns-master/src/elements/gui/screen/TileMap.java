package elements.gui.screen;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import elements.gui.ressources.GameImage;
import elements.tile.TileManage;
import main.Game;


public class TileMap extends BasicGameState {
	
	TileManage tiles;
	
	public static int xTab;
	public static int yTab;
	
	public static int genericMap[][]={	{-5,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-8},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
										{-6,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-7}};
	
	

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		
	tiles = new TileManage();
		
		
		
		
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException {
		
		/**/
		tiles.render(arg0, arg1, g);
		
		for(int i = 0; i < genericMap.length; i++){
			   for(int j = 0; j < genericMap[i].length; j++){
				   xTab = i;
				   yTab = j;
				   		
				   		/* map center block */
				   		if(genericMap[i][j] == 0 ) {GameImage.floor.draw((i*Game.CELL)+(Game.WIDTH/4)+(Game.CELL/2),j*Game.CELL+(Game.HEIGHT/18)+(Game.CELL/2), Game.CELL, Game.CELL);}
				   
				   		/* map border*/
				   		if(genericMap[i][j] == -2 ) {GameImage.wallUp.draw((i*Game.CELL)+(Game.WIDTH/4)+(Game.CELL/2),j*Game.CELL+(Game.HEIGHT/18)+(Game.CELL/2), Game.CELL, Game.CELL);}
				   		if(genericMap[i][j] == -1 ) {GameImage.wallLeft.draw((i*Game.CELL)+(Game.WIDTH/4)+(Game.CELL/2),j*Game.CELL+(Game.HEIGHT/18)+(Game.CELL/2), Game.CELL, Game.CELL);}
				   		if(genericMap[i][j] == -4 ) {GameImage.wallDown.draw((i*Game.CELL)+(Game.WIDTH/4)+(Game.CELL/2),j*Game.CELL+(Game.HEIGHT/18)+(Game.CELL/2), Game.CELL, Game.CELL);}
				   		if(genericMap[i][j] == -3 ) {GameImage.wallRight.draw((i*Game.CELL)+(Game.WIDTH/4)+(Game.CELL/2),j*Game.CELL+(Game.HEIGHT/18)+(Game.CELL/2), Game.CELL, Game.CELL);}
				   		
				   		/* map corner*/
				   		if(genericMap[i][j] == -5 ) {GameImage.wallCornerUL.draw((i*Game.CELL)+(Game.WIDTH/4)+(Game.CELL/2),j*Game.CELL+(Game.HEIGHT/18)+(Game.CELL/2), Game.CELL, Game.CELL);}
				   		if(genericMap[i][j] == -6 ) {GameImage.wallCornerUR.draw((i*Game.CELL)+(Game.WIDTH/4)+(Game.CELL/2),j*Game.CELL+(Game.HEIGHT/18)+(Game.CELL/2), Game.CELL, Game.CELL);}
				   		if(genericMap[i][j] == -8 ) {GameImage.wallCornerDL.draw((i*Game.CELL)+(Game.WIDTH/4)+(Game.CELL/2),j*Game.CELL+(Game.HEIGHT/18)+(Game.CELL/2), Game.CELL, Game.CELL);}
				   		if(genericMap[i][j] == -7 ) {GameImage.wallCornerDR.draw((i*Game.CELL)+(Game.WIDTH/4)+(Game.CELL/2),j*Game.CELL+(Game.HEIGHT/18)+(Game.CELL/2), Game.CELL, Game.CELL);}
				   	
				   		}
		}
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		
		
	}
	


	@Override
	public int getID() {
		
		return 0;
	}

	

}
