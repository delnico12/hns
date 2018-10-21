package elements.tile;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import elements.gui.ressources.GameImage;
import elements.gui.screen.TileMap;


public class Wall extends Tile{
	
	Image img1,img2,img3,img4,img5,img6,img7,img8;
	
	
	

	
	public void init(GameContainer cg, StateBasedGame sbg) throws SlickException {
		
		isTraversable = false;
		doDamage = false;
		
		img1 = GameImage.wallUp;
		img2 = GameImage.wallDown;
		img3 = GameImage.wallLeft;
		img4 = GameImage.wallRight;
		img5 = GameImage.wallCornerUL;
		img6 = GameImage.wallCornerUR;
		img7 = GameImage.wallCornerDL;
		img8 = GameImage.wallCornerDR;
	}

	
	public void render(GameContainer cg, StateBasedGame sbg, Graphics g) throws SlickException {
		if(TileMap.genericMap[TileMap.xTab][TileMap.yTab] == -1 ) {img1.draw(x,y);}
		if(TileMap.genericMap[TileMap.xTab][TileMap.yTab] == -2 ) {img2.draw(x,y);}
		if(TileMap.genericMap[TileMap.xTab][TileMap.yTab] == -3 ) {img3.draw(x,y);}
		if(TileMap.genericMap[TileMap.xTab][TileMap.yTab] == -4 ) {img4.draw(x,y);}
		if(TileMap.genericMap[TileMap.xTab][TileMap.yTab] == -5 ) {img5.draw(x,y);}
		if(TileMap.genericMap[TileMap.xTab][TileMap.yTab] == -6 ) {img6.draw(x,y);}
		if(TileMap.genericMap[TileMap.xTab][TileMap.yTab] == -7 ) {img7.draw(x,y);}
		if(TileMap.genericMap[TileMap.xTab][TileMap.yTab] == -8 ) {img8.draw(x,y);}
		
	}

	

}
