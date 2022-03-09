package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BJCardTest {
	
	@Test
	void testIsHidden() {
		BJCard b1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		assertEquals(b1.isHidden(),false);
	}

	@Test
	void testGetText() {
		BJCard b1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		assertEquals(b1.getText(),"A\u2660");
	}

	@Test
	void testGetRank() {
		BJCard b1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		assertEquals(b1.getRank(),BJCard.ACE);	
		}

	@Test
	void testSetRank() {
		BJCard b1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		b1.setRank(2);
		assertEquals(b1.getRank(),BJCard.TWO);	
		}

	@Test
	void testGetSuit() {
		BJCard b1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		assertEquals(b1.getSuit(),BJCard.SPADE);	
		}

	@Test
	void testSetSuit() {
		BJCard b1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		b1.setSuit(BJCard.CLUB);
		assertEquals(b1.getSuit(),BJCard.CLUB);	
		}

}
