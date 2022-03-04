package BlackJackTest;

import BlackJack.BJCard;
import BlackJack.BJDeck;
import BlackJackBase.PCard;

public class PlayBlackJack {

	public static void main(String[] args) {
		//BJCard card = new BJCard(14,1);
		PCard p1 = new PCard();
		BJDeck d1 = new BJDeck();
		//System.out.println(d1);
		DeckTest.run((PCard)d1);
		//CardTest.run(card);
	}

}
