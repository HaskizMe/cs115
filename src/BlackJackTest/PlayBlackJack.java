package BlackJackTest;

import BlackJack.BJCard;
import BlackJack.BJDeck;
import BlackJack.BJHand;
import BlackJackBase.PCard;

public class PlayBlackJack {

	public static void main(String[] args) {
		BJCard card = new BJCard(BJCard.TWO,BJCard.HEART);
		//CardTest.run(card);
		//System.out.println(card.getRank());
		BJDeck d1 = new BJDeck();
		BJHand h1 = new BJHand();
		h1.addCard(card);
		DeckTest.run(d1);
		//HandTest.run(d1, h1);
		
	}

}
