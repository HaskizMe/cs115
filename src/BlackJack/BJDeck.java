package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

public class BJDeck implements PDeck {
	//attributes
	private ArrayList<BJCard> cards;
	//constructor
	public BJDeck() {
		cards = new ArrayList<BJCard>();
		for (int i = 1;i<=14;i++) {
			for(int j = 1; j<=4;j++) {
			BJCard b1 = new BJCard(i,j);
			cards.add(b1);
			}
		}
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public void addCard(PCard card) {
		cards.add((BJCard)card);
	}
	public PCard dealCard() {
		BJCard b1 = new BJCard(0,0);
		if(cards.size()==0) {
			return null;
		}
		else {
			cards.add(b1);
		}
		return cards;
	}
	
	public PCard dealHiddenCard() {
		//BJCard b1 = new BJCard(0,0);
		int i = cards.size();
		if(cards.size()==0) {
			return null;
		}
		else {
			return cards.get(i-1);
			//b1 = b1.ishidden();
		}
	}
	public int cardCount() {
		return cards.size();
	}
}
