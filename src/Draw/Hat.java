package Draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Hat extends LandscapeObject{
	//Attributes
	private String bodyColor; 			
	private String armColor; 			
	private int hatBodyLength = 80;		
	private int hatBodyHeight = 20;  
	private int circleSize = 20;
	private BasicStroke stroke = new BasicStroke(1);	




	
	//constructor
	Hat(Graphics2D g2, int x, int y, double scale, String s_armColor){
		super(g2, x, y, scale);
		this.armColor = "#" + s_armColor;
	}





	public void draw() {
		applyScale();
		drawHatBody();
	}





	public void applyScale() {
		hatBodyLength = hatBodyLength * (int)super.getScale();
		hatBodyHeight = hatBodyHeight * (int)super.getScale();
		}
	
	public void drawHatBody() {
		g2.setColor(Color.black);
		g2.fillRect(currentX, currentY, hatBodyLength, hatBodyHeight);
		drawTriangleTop();
	}
	public void drawTriangleTop() {
		int half = currentX+(int)((hatBodyLength)*.5);
		g2.setColor(Color.BLUE);
		int[] xs = {currentX+(int)(hatBodyLength*.5)-(int)((int)(hatBodyLength*.5)*.8),currentX+(int)((hatBodyLength)*.5), (int)(half*1.11111)};
		int[] ys = {currentY, currentY-40,currentY};
		Polygon p = new Polygon(xs,ys,3);
		g2.fillPolygon(p);
				
	}
}
