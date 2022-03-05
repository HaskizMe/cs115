package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BJCardTest {

//	@Test
//	void testHideCard() {
//		BJCard b1 = new BJCard(1,1);
//		verify(b1,times(1)).hideCard());
//	}
//
//	@Test
//	void testShowCard() {
//		BJCard b1 = new BJCard(1,1);
//		assertEquals(b1.showCard(),b1.hidden);
//	}

	@Test
	void testIsHidden() {
		BJCard b1 = new BJCard(1,1);
		assertEquals(b1.isHidden(),false);
	}

	@Test
	void testGetText() {
		BJCard b1 = new BJCard(1,1);
		assertEquals(b1.getText(),"A\u2660");
	}

	@Test
	void testGetRank() {
		BJCard b1 = new BJCard(1,1);
		assertEquals(b1.getRank(),1);	
		}

	@Test
	void testSetRank() {
		BJCard b1 = new BJCard(1,1);
		b1.setRank(2);
		assertEquals(b1.getRank(),2);	
		}

	@Test
	void testGetSuit() {
		BJCard b1 = new BJCard(1,1);
		assertEquals(b1.getSuit(),1);	
		}

	@Test
	void testSetSuit() {
		BJCard b1 = new BJCard(1,1);
		b1.setSuit(2);
		assertEquals(b1.getSuit(),2);	
		}

}
