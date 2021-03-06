package Draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JPanel;

import Draw.Flag.Position;
import Draw.Hat.HatShape;

import java.awt.geom.*;
import java.util.Scanner;

/**
 * Class used to create a DrawPanel where shapes will be drawn by the programmer (via code).
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Light
 * @since 2019-12-01
 */
public class DrawPanel1 extends JPanel {
	//Attributes
	private static final long serialVersionUID = 6311020027600344213L;
	
	//Landscape Colors
	private final String LIGHT_SKY_BLUE = "87CEFA";
	private final String MIDNIGHT_BLUE = "191970";
	private final String SNOW3 = "CDC9C8";
	private final String WHITE = "FFFFFF";
	private final String MY_WHITE_SMOKE = "F5F5F5";
	private final String LAWN_GREEN = "7CFC00";
	private final String MEDIUM_SPRING_GREEN = "00FA9A";
	private final String SPRING_GREEN = "00FF7F";
	
	//Tree Colors
	private final String BROWN = "A52A2A";
	private final String DARK_GREEN = "006400";
	private final String FOREST_GREEN = "228B22";
	private final String GRAY = "808080";
	private final String GREEN = "008000";
	
	//House Colors
	private final String DARK_SLATE_GRAY = "2F4F4F";
	private final String FIREBRICK = "B22222";
	private final String INDIAN_RED = "CD5C5C";
	private final String MAROON = "800000";
	private final String MOCCASIN = "FFE4B5";
	private final String RED = "FF0000";
	private final String SADDLE_BROWN = "8B4513";
	private final String SIENNA = "A0522D";
	private final String SLATE_GRAY = "708090";
	private final String PERU = "CD853F";
	private final String WHITE_SMOKE = "F5F5F5";
	private final String BURLYWOOD = "DEB887";


	

	public DrawPanel1() {
		this.setPreferredSize(new Dimension(1600, 900));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);			//Sets the background of the DrawPanel LIGHT_GRAY.  You may change this if desired.
	}
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw12b
	 * Draw all your objects here.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;			//Allows us to draw using both the Graphics class methods and the Graphics2D class methods
		HatShape pointy = HatShape.POINTY;
		HatShape round = HatShape.ROUND;
		Position raised = Position.RAISED;
		Position halfMast = Position.HALFMAST;
		Position noFlag = Position.NOFLAG;


		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//Makes drawn shapes and fonts clearer

		//DrawTree landscape
		Scanner in = new Scanner(System.in);
		System.out.println("Please choose a scene: ");
		System.out.println("1.) Summer's Day");
		System.out.println("2.) Winters's Day");
		System.out.println("3.) Night Time");
		int input = in.nextInt();
		switch(input) {
		case 1 :
			g2.setColor(Color.decode("#" + LIGHT_SKY_BLUE));
			g2.fillRect(0,0,this.getWidth(),this.getHeight());
			
			g2.setColor(Color.decode("#" + LAWN_GREEN));
			g2.fillOval((-600), 350, this.getWidth() + 1200, 700);
			break;
		case 2 :
			g2.setColor(Color.decode("#" + LIGHT_SKY_BLUE));
			g2.fillRect(0,0,this.getWidth(),this.getHeight());
			
			g2.setColor(Color.decode("#" + WHITE));
			g2.fillOval((-600), 350, this.getWidth() + 1200, 700);
			break;
		case 3 :
			g2.setColor(Color.decode("#" + MIDNIGHT_BLUE));
			g2.fillRect(0,0,this.getWidth(),this.getHeight());
			
			g2.setColor(Color.decode("#" + DARK_GREEN));
			g2.fillOval((-600), 350, this.getWidth() + 1200, 700);
			break;
		default:
			System.out.println("not valid");
			break;
		}
		
		//DrawTree Trees
		Tree t1 = new Tree(g2, 50, 400, 1, 3, BROWN , DARK_GREEN);
		t1.draw();
		
		Tree t2 = new Tree(g2, 200, 375, 1, 5, BROWN , GRAY);
		t2.draw();
		
		Tree t3 = new Tree(g2, 250, 380, 1, 4, BROWN , FOREST_GREEN);
		t3.draw();
		
		Tree t4 = new Tree(g2,450,360,3,2,BROWN, DARK_GREEN);
		t4.draw();
		
		Tree t5 = new Tree(g2,600,700,4,6,PERU, SPRING_GREEN);
		t5.draw();
		
		Tree t6 = new Tree(g2,770,400,1,4,BURLYWOOD, GREEN);
		t6.draw();
		
		Tree t7 = new Tree(g2,850,600,4,5,WHITE_SMOKE, FOREST_GREEN);
		t7.draw();
		
		Tree t8 = new Tree(g2,1400,600,8,2,RED, SPRING_GREEN);
		t8.draw();
		
		Tree t9 = new Tree(g2,150,700,4,3,FIREBRICK, FOREST_GREEN);
		t9.draw();
		
		Snowman s1 = new Snowman(g2, 980, 300, 2, 4, GRAY,SADDLE_BROWN); 
		s1.draw();	
		
		Snowman s2 = new Snowman(g2, 300, 400, 4, 4, WHITE,MAROON); 
		s2.draw();
		
		Hat h1 = new Hat(g2,970,220,1,MAROON, MY_WHITE_SMOKE,pointy);
		h1.draw();
		
		Hat h2 = new Hat(g2,280,250,2,RED,DARK_SLATE_GRAY,round);
		h2.draw();
		
		Flag f1 = new Flag(g2,510,120,2,SNOW3,MIDNIGHT_BLUE,raised);
		f1.draw();
		
		Flag f2 = new Flag(g2,1100,50,3,SIENNA,RED,halfMast);
		f2.draw();
		
		Flag f3 = new Flag(g2,800,150,1,PERU,RED,noFlag);
		f3.draw();
		
		//Populate the scene with your own trees here!
		
		
	}//end of method paintComponent(Graphics)

}//end of class DrawPanel