package BlackJack;

import java.util.ArrayList;

import BlackJackBase.PCard;
import BlackJackBase.PHand;

public class BJHand implements PHand{
	//Attributes
	ArrayList<BJCard> hand;
	//Constructor
	public BJHand() {
		hand = new ArrayList<BJCard>();
	}
	//methods
	/** Returns the number of cards in the hand. */
	public int getSize() {
		return hand.size();
	}

	/** Adds a card to the end of the hand. */
	public void addCard(PCard card) {
		hand.add((BJCard)card);
	}

	/** Returns a card from the hand (but not removed). */
	public PCard getCard(int index) {
		return hand.get(index);
	}

	/** Removes and returns the card */
	public PCard removeCard(int index) {
		return hand.remove(index);
		//cards.remove(cards.size()-1)
	}


	/** Returns the point value of the current hand.
	 *  Basic BlackJack rules apply:
	 *  Ranks 2 - 10 are valued at their face value
	 *  Ranks Jack - King are valued at 10
	 *  Ace is valued at 11 if the total value of all cards in the hand is <= 21
	 *  Otherwise, Ace is valued as 1 
	 */	
	public int getValue() {
		int sum = 0;
		
		for(int i = 0;i<hand.size();i++) {
			//if(hand.get(i).equals(hand.get(i).equals(BJCard.JACK)||hand.get(i).equals(BJCard.KNIGHT)||hand.get(i).equals(BJCard.QUEEN)||hand.get(i).equals(BJCard.KING))) {
				hand.get(BJCard.JACK).setRank(10);
				hand.get(BJCard.KNIGHT).setRank(10);
				hand.get(BJCard.QUEEN).setRank(10);
				hand.get(BJCard.KING).setRank(10);
			
			if(sum<=21) {
				hand.get(BJCard.ACE).setRank(11);
			}
			else {
				hand.get(BJCard.ACE).setRank(1);
			}
			sum = sum + hand.get(i).getRank();
			
		}
		return sum;
		}
}

