package BlackJack;

import java.awt.Color;
import java.util.HashMap;

import BlackJackBase.PCard;

public class BJCard extends PCard {
	//attributes
	public static HashMap<Integer,String> cards = new HashMap<Integer,String>();
	private int rank;
	private int suit;
	private boolean hidden;
	private static void playCards() {
		cards.put(1,"ACE");
		cards.put(2,"TWO");
		cards.put(3,"THREE");
		cards.put(4,"FOUR");
		cards.put(5,"FIVE");
		cards.put(6,"SIX");
		cards.put(7,"SEVEN");
		cards.put(8,"EIGHT");
		cards.put(9,"NINE");
		cards.put(10,"TEN");
		cards.put(11, "JACK");
		cards.put(12,"KNIGHT");
		cards.put(13,"QUEEN");
		cards.put(14,"KING");
		
		cards.put(101, "SPADE");
		cards.put(102, "HEART");
		cards.put(103, "DIAMOND");
		cards.put(104, "CLUB");
	}

	//constructor
	public BJCard(int r, int s) {
		rank = r;
		suit = s;
		hidden = false;
		HashMap<Integer,String> cards = new HashMap<Integer,String>();
		playCards();
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
