package BlackJackTest;

import java.awt.Color;

import BlackJack.BJCard;
import BlackJack.BJDeck;
import BlackJack.BJHand;
import BlackJackBase.PCard;
import BlackJackBase.PGame;

public class PlayBlackJack {

	public static void main(String[] args) {
//
		BJDeck d1 = new BJDeck();
		BJHand h1 = new BJHand();
		BJHand h2 = new BJHand();
		PGame.setFont("DialogInput");
		PGame.setButtonTextColor(Color.black);
		PGame.setButtonHighlightColor(Color.DARK_GRAY);
		PGame.setButtonColor(Color.WHITE);
		PGame.setStatusTextColor(Color.WHITE);
		PGame.setBannerTextColor(Color.WHITE);
		PGame.setBannerColor(Color.BLACK);
		PGame.setBackgroundColor(Color.GREEN);		
		PGame.run(d1, h1, h2);
//		HandTest.run(d1, h1);
		
	}

}
