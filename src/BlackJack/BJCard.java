package BlackJack;

import java.awt.Color;

import BlackJackBase.PCard;

public class BJCard extends PCard {
	//attributes 
	private int rank;
	private int suit;
	private boolean hidden;
	//attributes for values
	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int KNIGHT = 12;
	public static final int QUEEN = 13;
	public static final int KING = 14;
	//attributes for suits
	public static final int SPADE = 1;
	public static final int HEART = 2;
	public static final int DIAMOND = 3;
	public static final int CLUB = 4;
	//constructor
	public BJCard(int r, int s) {
		rank = r;
		suit = s;
		hidden = false;
	}	
	//methods
	public int getRank() {
		return rank;
	}
	public void setRank(int r) {
		rank = r;
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int s) {
		suit = s;
	}
	public void hideCard() {
		hidden = true;
	}
	public void showCard() {
		hidden = false;
	}
	public boolean isHidden() {
		return hidden;
	}
	public Color getFontColor() {
		Color c = null;
		if(suit==2||suit==3) {
			c = Color.red;
		}
		else {
			c = Color.black;
		}
		return c;
	}
	public String getText() {
		String srank = "";
		String ssuit = "";
		switch (rank) {
		case 1 :
			srank = "A";
			break;
		case 2 :
			srank = "2";
			break;
		case 3 :
			srank = "3";
			break;
		case 4 : 
			srank = "4";
			break;
		case 5 :
			srank = "5";
			break;
		case 6 :
			srank = "6";
			break;
		case 7 :
			srank = "7";
			break;
		case 8 :
			srank = "8";
			break;
		case 9 :
			srank = "9";
			break;
		case 10 :
			srank = "10";
			break;
		case 11 :
			srank = "J";
			break;
		case 12 :
			srank = "KN";
			break;
		case 13 :
			srank = "Q";
			break;
		case 14 :
			srank = "K";
			break;
		}		
		switch (suit) {
		case 1 :
			ssuit = "\u2660";
			break;
		case 2 :
			ssuit = "\u2665";
			break;
		case 3 :
			ssuit = "\u2666";
			break;
		case 4 :
			ssuit = "\u2663";
			break;
		}
						
		
		return srank+ssuit;
	}
}
