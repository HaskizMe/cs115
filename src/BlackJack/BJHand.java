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
			if(hand.get(i).getRank()==BJCard.JACK||hand.get(i).getRank()==BJCard.KNIGHT||hand.get(i).getRank()==BJCard.QUEEN||hand.get(i).getRank()==BJCard.KING) {
				hand.get(i).setRank(10);
			}
			if(hand.get(i).getRank()==BJCard.ACE && sum<=21) {
				hand.get(i).setRank(11);
			}
			if(hand.get(i).getRank()==11 && sum > 11) {
				hand.get(i).setRank(1);
			}

			sum = sum + hand.get(i).getRank();		
		}
		return sum;
		}
}

