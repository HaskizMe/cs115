package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import BlackJackBase.PCard;
import BlackJackBase.PDeck;

public class BJDeck implements PDeck {
	//attributes
	ArrayList<BJCard> cards;
	//constructor
	public BJDeck() {
		cards = new ArrayList<BJCard>();
		for(int i = 1;i<=14;i++) {
			for(int j = 1;j<=4;j++) {			
			BJCard b1 = new BJCard(i,j);
			cards.add(b1);
			}
		}
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
		if(cards.isEmpty()) {
			return null;
		}
		else {
			return cards.remove(cards.size()-1);		
			}
	}	
	/** Removes a card from the end of the deck and marks it as hidden. Returns Null if the deck is empty.*/
	public PCard dealHiddenCard() {
		if(cards.isEmpty()) {
			return null;
		}
		else {
			BJCard b1 = cards.remove(cards.size()-1);
			b1.hideCard();
			return b1;
		}
	}
	/** Returns the number of cards in the deck. */
	public int cardCount() {
		return cards.size();
	}
}
