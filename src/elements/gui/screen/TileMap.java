package elements.gui.screen;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import elements.gui.ressources.GameImage;
import main.Game;


public class TileMap extends BasicGameState {
		
	
	
	int genericMap[][]={{-5,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-8},
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
		
	
		
		
		
		
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException {
		
		for(int i = 0; i < genericMap.length; i++){
			   for(int j = 0; j < genericMap[i].length; j++){
				   		
				   		
				   		/* map center block*/
				   		if(genericMap[i][j] == 0 ) {GameImage.floor.draw((i*Game.cell)+(Game.width/4)+(Game.cell/2),j*Game.cell+(Game.height/18)+(Game.cell/2), Game.cell, Game.cell);}
				   
				   		/* map border*/
				   		if(genericMap[i][j] == -2 ) {GameImage.wallUp.draw((i*Game.cell)+(Game.width/4)+(Game.cell/2),j*Game.cell+(Game.height/18)+(Game.cell/2), Game.cell, Game.cell);}
				   		if(genericMap[i][j] == -1 ) {GameImage.wallLeft.draw((i*Game.cell)+(Game.width/4)+(Game.cell/2),j*Game.cell+(Game.height/18)+(Game.cell/2), Game.cell, Game.cell);}
				   		if(genericMap[i][j] == -4 ) {GameImage.wallDown.draw((i*Game.cell)+(Game.width/4)+(Game.cell/2),j*Game.cell+(Game.height/18)+(Game.cell/2), Game.cell, Game.cell);}
				   		if(genericMap[i][j] == -3 ) {GameImage.wallRight.draw((i*Game.cell)+(Game.width/4)+(Game.cell/2),j*Game.cell+(Game.height/18)+(Game.cell/2), Game.cell, Game.cell);}
				   		
				   		/* map corner*/
				   		if(genericMap[i][j] == -5 ) {GameImage.wallCornerUL.draw((i*Game.cell)+(Game.width/4)+(Game.cell/2),j*Game.cell+(Game.height/18)+(Game.cell/2), Game.cell, Game.cell);}
				   		if(genericMap[i][j] == -6 ) {GameImage.wallCornerUR.draw((i*Game.cell)+(Game.width/4)+(Game.cell/2),j*Game.cell+(Game.height/18)+(Game.cell/2), Game.cell, Game.cell);}
				   		if(genericMap[i][j] == -8 ) {GameImage.wallCornerDL.draw((i*Game.cell)+(Game.width/4)+(Game.cell/2),j*Game.cell+(Game.height/18)+(Game.cell/2), Game.cell, Game.cell);}
				   		if(genericMap[i][j] == -7 ) {GameImage.wallCornerDR.draw((i*Game.cell)+(Game.width/4)+(Game.cell/2),j*Game.cell+(Game.height/18)+(Game.cell/2), Game.cell, Game.cell);}
				   	
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
