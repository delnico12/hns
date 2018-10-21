package elements.gui.ressources;

import java.awt.Font;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.geom.Vector2f;

public class Text {
	
	private Font font;
	private TrueTypeFont ttf;
	
	private String fontName;
	private int size;
	private Vector2f pos;
	private String text;
	private Color color;
	private boolean hasColor;
	
	public Text(Vector2f pos, String text) {
		this.pos = pos;
		this.text = text;
	}
	
	public Text(String fontName, int size, Vector2f pos, String text) {
		this.fontName = fontName;
		this.size = size;
		this.pos = pos;
		this.text = text;
		
		this.font = new Font(this.fontName, Font.BOLD, this.size);
		this.ttf = new TrueTypeFont(this.font, true);
		
		this.hasColor = false;
	}
	
	public Text(String fontName, int size, Vector2f pos, String text, Color color) {
		this.fontName = fontName;
		this.size = size;
		this.pos = pos;
		this.text = text;
		this.color = color;
		
		this.font = new Font(this.fontName, Font.BOLD, this.size);
		this.ttf = new TrueTypeFont(this.font, true);
		
		this.hasColor = true;
	}
	
	public void drawFont() {
		if(hasColor)
			this.ttf.drawString(this.pos.x, this.pos.y, this.text, this.color);
		else
			this.ttf.drawString(this.pos.x, this.pos.y, this.text);
	}
	
	public void drawString(Graphics g) {
		g.drawString(this.text, this.pos.x, this.pos.y);
	}
	
	public void setX(float x) {
		this.pos.x = x;
	}
	
	public void setY(float y) {
		this.pos.y = y;
	}
	
	public int getWidth() {
		return this.ttf.getWidth(this.text);
	}
	
	public int getHeight() {
		return this.ttf.getHeight(this.text);
	}
}
