package Draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Flag extends LandscapeObject{
	//Attributes
	enum Position{
		RAISED,
		HALFMAST,
		NOFLAG
	}
	private String poleColor; 			
	private String flagColor; 			
	private int poleLength = 200;		
	private int poleWidth = 10;  
	private int flagLength = 40;
	private int flagHeight = 100;
	private Position shape;
	private BasicStroke stroke = new BasicStroke(1);	




	
	//constructor
	Flag(Graphics2D g2, int x, int y, double scale, String poleColor,String flagColor,Position shape){
		super(g2, x, y, scale);
		this.poleColor ="#" + poleColor;
		this.flagColor = "#" +flagColor;
		this.shape = shape;
	}





	public void draw() {
		applyScale();
		drawPole();
		
		switch (shape){
		case RAISED:
			drawFlag();
			break;
		case NOFLAG:
			break;
		case HALFMAST:
			drawHalfMast();
	}
	}
	public void applyScale() {
		poleLength = poleLength * (int)super.getScale();
		poleWidth = poleWidth * (int)super.getScale();
		flagLength = flagLength * (int)super.getScale();
		flagHeight = flagHeight * (int)super.getScale();
	}
	
	public void drawPole() {
		g2.setColor(Color.decode(poleColor));
		g2.fillRect(currentX, currentY, poleWidth, poleLength);
		
	}
	
	public void drawFlag() {
		g2.setColor(Color.decode(flagColor));
		int[] x_coord = {currentX+poleWidth,currentX+flagHeight, currentX+poleWidth};
		int[] y_coord = {currentY, currentY+(int)(flagLength*.5), currentY+flagLength};
		g2.fillPolygon(x_coord, y_coord, 3);
	}
	
	public void drawHalfMast() {
		g2.setColor(Color.decode(flagColor));
		int[] x_coord = {currentX+poleWidth,currentX+flagHeight, currentX+poleWidth};
		int[] y_coord = {currentY+(int)(poleLength*.3), currentY+(int)(poleLength*.3)+(int)(flagLength*.5), currentY+(int)(poleLength*.3)+flagLength};
		g2.fillPolygon(x_coord, y_coord, 3);	
	}
		
	}


