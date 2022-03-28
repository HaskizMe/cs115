package Draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Snowman extends LandscapeObject{
	//Attributes
	private int levels;						//The number of levels (branch triangles) the tree will have.
	private String bodyColor; 				// The Hex color of the trunk, including the preceding '#'. Set in the constructor.
	private String armColor; 			// The Hex color of the branches, including the preceding '#'. Set in the constructor.
	private int armLength = 15;			//The trunk height in pixels.  Default of 15 for a scale of 1.  Modified by applyScale method().
	private int armHeight = 30;			//The branch width in pixels.  Default of 30 for a scale of 1.  Modified by applyScale method().
	private int bodyHeightAndWidth = 30;  //The branch height in pixels.  Default of 30 for a scale of 1.  Modified by applyScale method().
	private int baseOfBody = 30;              
	private double bodyOverlap = .35;		//Indicates how much of each triangle is overlapped by the one above it.
	private BasicStroke stroke = new BasicStroke(1);	//Stroke of 1 pixel use to outline each shape of the tree.

	
	//constructor
	Snowman(Graphics2D g2, int x, int y, double scale, int levels,  String s_bodyColor, String s_armColor){
		super(g2, x, y, scale);
		this.levels = levels;
		this.bodyColor = "#" + s_bodyColor;
		this.armColor = "#" + s_armColor;
	}
	
	//methods
	public void draw() {
		applyScale();
		drawBody();
		//drawArms();
	}

	public void applyScale() {
		bodyHeightAndWidth = bodyHeightAndWidth*(int)super.getScale();
	}
	
	public void drawBody() {

		for(int i = 0; i<levels;i++) {
			//bodyHeightAndWidth = (int)(getScale()*bodyHeightAndWidth);
			//bodyHeightAndWidth = (int)(getScale()*bodyHeightAndWidth);
			g2.setColor(Color.decode(bodyColor));
			g2.fillOval(currentX, currentY, bodyHeightAndWidth, bodyHeightAndWidth);
			g2.setStroke(stroke);
			g2.setColor(Color.black);
			g2.drawOval(currentX, currentY, bodyHeightAndWidth, bodyHeightAndWidth);
			int diff = (int)(bodyHeightAndWidth-(bodyHeightAndWidth*.9));
			currentX = (int)(currentX + (.5*diff));
			currentY = (currentY - bodyHeightAndWidth) + (int)(bodyHeightAndWidth*bodyOverlap);
			bodyHeightAndWidth = (int)(bodyHeightAndWidth*.9);
			
			if(i==levels-1) {
				//g2.setColor(Color.BLUE);
				//g2.fillOval(400, 300, bodyHeightAndWidth, bodyHeightAndWidth);

				//g2.fillOval(currentX, currentY, bodyHeightAndWidth, bodyHeightAndWidth);
				int[] x_coord = {100,200,150};
				int[] y_coord = {200,200,100};
				Polygon nose = new Polygon(x_coord , y_coord,3);
				g2.setColor(Color.orange);
				g2.drawPolygon(nose);
				g2.fill(nose);
				
			}


		}
//		int[] x_coord = {currentX,currentX,currentX +10};
//		int[] y_coord = {currentY,currentY -10,currentY};
//		Polygon nose = new Polygon(x_coord , y_coord,3);
//		g2.setColor(Color.orange);
//		g2.fill(nose);

	}
	
	public void drawArms() {
		
	}
}
