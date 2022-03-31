package Draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Arc2D;

public class Hat extends LandscapeObject{
	//Attributes
	enum HatShape{
		POINTY,
		ROUND
	}
	private String bodyColor; 			
	private String topColor; 			
	private int hatBodyLength = 80;		
	private int hatBodyHeight = 10;  
	private int topHeight = 30;
	private int topWidth = 80;
	private HatShape shape;
	private BasicStroke stroke = new BasicStroke(1);	




	
	//constructor
	Hat(Graphics2D g2, int x, int y, double scale, String bodyColor,String topColor,HatShape shape){
		super(g2, x, y, scale);
		this.topColor ="#" + topColor;
		this.bodyColor = "#" +bodyColor;
		this.shape = shape;
	}





	public void draw() {
		applyScale();
		drawHatBody();
		
		switch(shape) {
		case POINTY:
			drawPointyTop();
			break;
		case ROUND:
			drawRoundTop();
			break;
		}
		}
	





	public void applyScale() {
		hatBodyLength = hatBodyLength * (int)super.getScale();
		hatBodyHeight = hatBodyHeight * (int)super.getScale();
		topHeight = topHeight * (int)super.getScale();
		topWidth = topWidth * (int)super.getScale();

		}
	
	public void drawHatBody() {
		g2.setColor(Color.decode(bodyColor));
		g2.fillRect(currentX, currentY, hatBodyLength, hatBodyHeight);
	}
	public void drawPointyTop() {
		g2.setColor(Color.decode(topColor));
		int[] xs = {currentX,currentX+(int)(topWidth*.5),currentX+topWidth};
		int[] ys = {currentY, currentY-topHeight,currentY};
		Polygon p = new Polygon(xs,ys,3);
		g2.fillPolygon(p);			
	}
	public void drawRoundTop() {
		g2.setColor(Color.decode(topColor));
		g2.fill(new Arc2D.Double(currentX, (currentY-hatBodyHeight)-topHeight*.25, topWidth, topHeight, -10, 200, Arc2D.OPEN));
	}
}
