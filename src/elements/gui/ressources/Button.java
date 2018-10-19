package elements.gui.ressources;

import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;

public class Button {
	
	Image img;
	Vector2f pos;
	Rectangle hitbox;
	
	public Button(Image img, Vector2f pos, Rectangle hitbox) {
		this.img = img;
		this.pos = pos;
		this.hitbox = hitbox;
	}
	
	public void render() throws SlickException {
		this.img.draw(this.pos.x, this.pos.y);
	}
	
	public boolean isHover(Input input) {
		Vector2f posMouse = new Vector2f(input.getMouseX(), input.getMouseY());
		Rectangle hitboxMouse = new Rectangle(posMouse.x, posMouse.y, 1, 1);
		
		if(hitboxMouse.intersects(this.hitbox))
			return true;
		else
			return false;
	}
	
	public float getX() {
		return this.pos.x;
	}
	
	public float getY() {
		return this.pos.y;
	}
}
