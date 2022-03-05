package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import BlackJackBase.PCard;
import BlackJackBase.PDeck;
import BlackJackTest.CardTest;
import BlackJackTest.DeckTest;

public class BJDeck implements PDeck {
	//attributes
	ArrayList<BJCard> cards;
	//constructor
	public BJDeck() {

		cards = new ArrayList<BJCard>();
//		for(int i = 1;i<=14;i++) {
//			for(int j = 1;j<=4;j++) {			
//			BJCard b1 = new BJCard(i,j);
//			//cards.add(b1);
//			//System.out.println("hey");
//			//will print out cards but as soon as you try to add them to a arraylist it will no longer print out the cards.
//			//CardTest.run(b1);
//
//			}
//		}
	BJCard b1 = new BJCard(1,3);
		//CardTest.run(b1);
	}
	/** Randomizes the deck. */
	public void shuffle() {
		Collections.shuffle(cards);
	}
	/** Adds a card to the end of the deck. */
	public void addCard(PCard card) {
		cards.add((BJCard)card);
	}
	/** Removes a card from the end of the deck. Returns Null if the deck is empty.*/
	public PCard dealCard() {
		BJCard b1 = new BJCard(1,1);
		if(cards.isEmpty()) {
			return null;
		}
		else {
			cards.remove(b1);
			return b1;		
			}
	}	
	/** Removes a card from the end of the deck and marks it as hidden. Returns Null if the deck is empty.*/
	public PCard dealHiddenCard() {
		BJCard b1 = new BJCard(1,1);
		int i = cards.size();
		if(cards.isEmpty()) {
			return null;
		}
		else {
			cards.remove(cards.get(i));
			b1.hideCard();
			return b1;
		}
	}
	/** Returns the number of cards in the deck. */
	public int cardCount() {
		return cards.size();
	}
//	public ArrayList<BJCard> getArray(){
//		return cards;
//	}
}
