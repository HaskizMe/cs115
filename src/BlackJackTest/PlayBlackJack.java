package BlackJackTest;

import BlackJack.BJCard;
import BlackJack.BJDeck;
import BlackJack.BJHand;
import BlackJackBase.PCard;

public class PlayBlackJack {

	public static void main(String[] args) {
		BJCard card = new BJCard(BJCard.ACE,BJCard.HEART);
		BJCard card1 = new BJCard(BJCard.KING,BJCard.HEART);
		BJCard card2 = new BJCard(BJCard.KNIGHT,BJCard.HEART);
		BJCard card3 = new BJCard(BJCard.ACE,BJCard.HEART);


		//CardTest.run(card);
		//System.out.println(card.getRank());
		BJDeck d1 = new BJDeck();
		BJHand h1 = new BJHand();
		//DeckTest.run(d1);
		h1.addCard(card1);
		h1.addCard(card3);
		h1.addCard(card2);
		h1.addCard(card);
		//System.out.println(h1.getSize());
		//h1.removeCard(0);
		//System.out.println(h1.getCard(0));
		System.out.println(h1.getValue());

		HandTest.run(d1, h1);
		
	}

}
