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
	/** Sets the card to the face down state. */
	public void hideCard() {
		hidden = true;
	}
	/** Sets the card to the face up state. */
	public void showCard() {
		hidden = false;
	}
	/** Finds if the card if face-down or face-up @return <b>true</b> if the card if face down. */
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
		case ACE :
			srank = "A";
			break;
		case TWO :
			srank = "2";
			break;
		case THREE :
			srank = "3";
			break;
		case FOUR : 
			srank = "4";
			break;
		case FIVE :
			srank = "5";
			break;
		case SIX :
			srank = "6";
			break;
		case SEVEN :
			srank = "7";
			break;
		case EIGHT :
			srank = "8";
			break;
		case NINE :
			srank = "9";
			break;
		case TEN :
			srank = "10";
			break;
		case JACK :
			srank = "J";
			break;
		case KNIGHT :
			srank = "KN";
			break;
		case QUEEN :
			srank = "Q";
			break;
		case KING :
			srank = "K";
			break;
		}		
		switch (suit) {
		case SPADE :
			ssuit = "\u2660";
			break;
		case HEART :
			ssuit = "\u2665";
			break;
		case DIAMOND :
			ssuit = "\u2666";
			break;
		case CLUB :
			ssuit = "\u2663";
			break;
		}
		return srank+ssuit;
	}
}
