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
	private int armLength = 80;			//The trunk height in pixels.  Default of 15 for a scale of 1.  Modified by applyScale method().
	private int bodyHeightAndWidth = 30;  //The branch height in pixels.  Default of 30 for a scale of 1.  Modified by applyScale method().
	private double bodyOverlap = .35;		//Indicates how much of each triangle is overlapped by the one above it.
	private BasicStroke stroke = new BasicStroke(1);	//Stroke of 1 pixel use to outline each shape of the tree.
	private int leftEyeXCoord = 0;
	private int leftEyeYCoord = 0;
	private int eyeSize = 3;
	private int rightEyeXCoord = 0;
	private int xCoord1 = 0;
	private int xCoord2 = 0;
	private int xCoord3 = 0;
	private int yCoord1 = 0;
	private int yCoord2 = 0;
	private int yCoord3 = 0;
	private int armWidth = 5;



	
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
		drawSnowMan();
	}

	public void applyScale() {
		bodyHeightAndWidth = bodyHeightAndWidth*(int)super.getScale();
		leftEyeXCoord = leftEyeXCoord*(int)super.getScale();
		leftEyeYCoord = leftEyeYCoord*(int)super.getScale();
		eyeSize = eyeSize * (int)super.getScale();
		xCoord1 = xCoord1 * (int)super.getScale();
		xCoord2 = xCoord2 * (int)super.getScale();
		xCoord3 = xCoord3 * (int)super.getScale();
		yCoord1 = yCoord1 * (int)super.getScale();
		yCoord2 = yCoord2 * (int)super.getScale();
		yCoord3 = yCoord3 * (int)super.getScale();
		armLength = armLength * (int)super.getScale();
		armWidth = armWidth * (int)super.getScale();		
	}
	
	public void drawSnowMan() {	
		for(int i = 0; i<levels;i++) {
			g2.setColor(Color.decode(bodyColor));
			g2.fillOval(currentX, currentY, bodyHeightAndWidth, bodyHeightAndWidth);
			g2.setStroke(stroke);
			g2.setColor(Color.black);
			g2.drawOval(currentX, currentY, bodyHeightAndWidth, bodyHeightAndWidth);
			if(i==levels-2) {
				
				g2.setColor(Color.black);
				leftEyeXCoord = currentX+((int)((bodyHeightAndWidth*.5)*.5));
				leftEyeYCoord = currentY+((int)((bodyHeightAndWidth*.5)*.5));
				rightEyeXCoord = (int)(currentX+((int)((bodyHeightAndWidth*.5)*.5))*2.6);

				g2.fillOval(leftEyeXCoord, leftEyeYCoord, eyeSize, eyeSize);
				g2.fillOval(rightEyeXCoord, leftEyeYCoord, eyeSize, eyeSize);
				
				xCoord1 = this.currentX+(int)(.5*bodyHeightAndWidth);
				xCoord2 = this.currentX+(int)(.5*bodyHeightAndWidth);
				xCoord3 = this.currentX+(int)(.5*bodyHeightAndWidth)+(int)(bodyHeightAndWidth*.5);
				yCoord1 = this.currentY+(int)((.35*bodyHeightAndWidth)+5);
				yCoord2 = this.currentY+(int)((.35*bodyHeightAndWidth)*1.5);
				yCoord3 = this.currentY+(int)((.35*bodyHeightAndWidth)+5);
				int[] x_coord = {xCoord1,xCoord2,xCoord3};
				int[] y_coord = {yCoord1, yCoord2, yCoord3};
				Polygon nose = new Polygon(x_coord , y_coord,3);
				g2.setColor(Color.orange);
				g2.drawPolygon(nose);
				g2.fill(nose);
				break;
			}
			if(i==(levels/2)-2) {
				g2.setColor(Color.decode(armColor));
				g2.fillRect(currentX-(int)(bodyHeightAndWidth*.7), currentY-(int)(bodyHeightAndWidth*.5),armLength,armWidth);
				
			}
			int diff = (int)(bodyHeightAndWidth-(bodyHeightAndWidth*.9));
			currentX = (int)(currentX + (.5*diff));
			currentY = (currentY - bodyHeightAndWidth) + (int)(bodyHeightAndWidth*bodyOverlap);
			bodyHeightAndWidth = (int)(bodyHeightAndWidth*.9);


		}

	}

}
