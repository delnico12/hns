package game_state;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import elements.entity.Joueur;
import elements.gui.ressources.GameImage;
import elements.gui.screen.TileMap;
import main.Game;

import org.newdawn.slick.state.*;



public class PlayState extends BasicGameState{
	
	private boolean quit = false;
	TileMap map ;
	Joueur player;
	
	public PlayState(int State) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException  {	
		map = new TileMap();
		player = new Joueur();
		player.init(gc, sbg);
	}
	
	public void render (GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		map.render(gc, sbg, g);
		player.render(gc,sbg,g);
		
		
		
		/* Quit Menu */
		if(quit == true) {
				g.setColor(Color.gray);
				g.fillRect(Game.WIDTH/2-(Game.WIDTH/12), Game.HEIGHT/2-180,200, 150);
				g.setColor(Color.blue);
				g.drawString("Resume (R)",(Game.WIDTH/2-(Game.WIDTH/15)),Game.HEIGHT/2-60);
				g.drawString("Main Menu (M)",(Game.WIDTH/2-(Game.WIDTH/15)),Game.HEIGHT/2-120);
				g.drawString("Quit Game (Q)",(Game.WIDTH/2-(Game.WIDTH/15)),Game.HEIGHT/2-180);				
		}
		
		
	}
	
	public void update (GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
		
		player.update(gc, sbg, delta);
		
			Input input = gc.getInput();
			/*Inside Menu*/
		if(input.isKeyDown(Input.KEY_R) && quit == true) {
			quit = false;
		}
		else if(input.isKeyDown(Input.KEY_M) && quit == true) {
			sbg.enterState(0);
			quit = false;
		}
		else if(input.isKeyDown(Input.KEY_Q) && quit == true) {
			System.exit(0);
		}
		else if(input.isKeyDown(Input.KEY_ESCAPE)) {
			
			quit = true;
		}
	
		
	}
	
	public int getID() {
		return 1;
	}

}
