package BlackJack;
import java.util.ArrayList;
import BlackJackBase.PCard;
import BlackJackBase.PDeck;

public class BlackJack implements PDeck {

	//Attributes
	private ArrayList<BJCard> cards = new ArrayList<>();
	//Constructor
	public BlackJack() {
		cards = new ArrayList<BJCard>();
		BJCard bjCard = new BJCard(1,1);
		cards.add(bjCard);
	}
	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addCard(PCard card) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public PCard dealCard() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PCard dealHiddenCard() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int cardCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
