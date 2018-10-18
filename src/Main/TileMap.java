package Main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class TileMap extends BasicGameState {
	
	/* Create variables images*/
	private Image floor;
	private Image wallLeft;
	private Image wallRight;
	private Image wallUp;
	private Image wallDown;
	private Image cube;
	
	private int cell = 32;
	
	
	int genericMap[][]={{-2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-4},
						{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
						{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
						{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
						{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
						{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
						{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
						{-2 ,0 ,0, 0, 0, 0, 0, 0, 0, 0,-4},
						{-2,-3,-3,-3,-3,-1,-3,-3,-3,-3,-4}};

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		
	
		/* Images */
		floor = new Image("res/floor.png");
		wallLeft = new Image("res/wallLeft.png");
		wallRight = new Image("res/wallRight.png");
		wallUp= new Image("res/wallUp.png");
		wallDown = new Image("res/wallDown.png");
		cube = new Image("res/cube.png");
		
		
		
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException {
		
		for(int i = 0; i < genericMap.length; i++){
			   for(int j = 0; j < genericMap[i].length; j++){
					   System.out.println(" i vaut :"+i+" "+"j vaut : "+j+" La case vaut : "+genericMap[i][j]);
					   if(genericMap[i][j] == 0 ) {g.drawRect(i*cell, j*cell, 32, 32);}
				   
				 
		
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
