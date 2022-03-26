package Draw12a;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JPanel;
import java.awt.geom.*;

/**
 * Class used to create a DrawPanel where shapes will be drawn by the programmer (via code).
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Light
 * @since 2019-12-01
 */
public class DrawPanel extends JPanel {
	//Attributes
	private static final long serialVersionUID = 6311020027600344213L;

	public DrawPanel() {
		this.setPreferredSize(new Dimension(1600, 900));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);			//Sets the background of the DrawPanel LIGHT_GRAY.  You may change this if desired.
	}
	
	
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw12a
	 * Draw all your objects in the paintComponent method.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;			//Allows us to draw using both the Graphics class methods and the Graphics2D class methods

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//Makes drawn shapes and fonts clearer
		//My red rectangle
		g2.setColor(Color.red);
		g2.setStroke(new BasicStroke(8));
		g2.drawRect(100, 100, 200, 50);
		//my filled rectangle
		Rectangle2D.Double rec1 = new Rectangle2D.Double(350, 100, 200,50);
		double cx = rec1.getCenterX();
		double cy = rec1.getCenterY();
		g2.rotate(35,cx,cy);
		g2.draw(rec1);
		g2.fill(rec1);
		g2.rotate(-35,cx,cy);
		//my black triangle
		g2.setStroke(new BasicStroke(3));
		int[] x_coord = {600,800,700};
		int[] y_coord = {150,150,50};
		g2.setColor(Color.CYAN);
		g2.drawPolygon(x_coord, y_coord, 3);
		//rotated triangle
		g2.setStroke(new BasicStroke(3));
		int[] x_coord_1 = {850,1050,950};
		int[] y_coord_1 = {150,150,50};
		g2.setColor(Color.CYAN);
		Polygon p2 = new Polygon(x_coord_1,y_coord_1,3);
		Double cx_1=850.0;
		Double cy_1=150.0;
		g2.rotate(-69,cx_1,cy_1);
		g2.drawPolygon(p2);
		g2.fill(p2);
		g2.rotate(69, cx_1,cy_1);
		//ellipse
		g2.setColor(Color.yellow);
		g2.setStroke(new BasicStroke(5));
		g2.drawOval(1100, 100, 50, 100);
		//rotated ellipse
		g2.drawOval(1200,100,100,50);
		g2.fillOval(1200,100,100,50);
		//rounded rectangle	
		g2.setColor(Color.decode("#8017C5"));
		g2.drawRoundRect(100, 300, 200, 50, 10, 10);
		Rectangle2D.Double rec2 = new Rectangle2D.Double(100, 300, 200,50);
		double cx_2 = rec2.getCenterX();
		double cy_2 = rec2.getCenterY();
		g2.rotate(90,cx_2,cy_2);
		g2.drawRoundRect(50, 50, 200, 50, 10, 10);
		g2.fillRoundRect(50, 50, 200, 50, 10, 10);
		g2.rotate(-90,cx_2,cy_2);
		//circle
		g2.setStroke(new BasicStroke(2));
		g2.setColor(Color.decode("#20C20E"));
		g2.drawOval(650,275,100,100);
		g2.fillOval(775,275,100,100);
		//octagon
		g2.setColor(Color.blue);
		int[] x_coord_3 = {925,975,1000,1000,975,925,900,900};
		int[] y_coord_3 = {300,300,325,375,400,400,375,325};
		int[] x_coord_4 = {1075,1125,1150,1150,1125,1075,1050,1050};
		int[] y_coord_4 = {300,300,325,375,400,400,375,325};
		g2.drawPolygon(x_coord_3, y_coord_3, 8);
		g2.fillPolygon(x_coord_4, y_coord_4, 8);
		
		/*
		 * Use this section to write your code.
		 * DrawShapes
		 * Draw at least 6 shapes in BOTH draw and fill formats using methods found in the Graphics class and/or the Graphics2D class.
		 * In other words, if you draw an empty rectangle, you should also draw a filled rectangle.  That counts as one (1) shape.
		 * The empty and filled versions of the shape should be at different orientations.
		 * One of the shapes MUST be a triangle.
		 * Each shape should be a different color.  An empty and a filled rectangle may be the same color, but they must be a different color from an empty and filled triangle.
		 * At least one of the colors should NOT be a standard color from the COLOR palette.
		 * Each empty shape should have a different stroke size.
		 * Be sure all shapes are located such that they can all be seen.
		 */
		

		
	}//end of method paintComponent(Graphics)

}//end of class DrawPanel