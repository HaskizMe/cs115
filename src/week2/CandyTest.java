package week2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	@Test
	void testGetCandyWeight() {
		Candy c1 = new Candy("Jelly beans", 5.5, 3.2);
		Double candyWeight = c1.getCandyWeight();
		assertEquals(candyWeight, 5.5);
	}

	@Test
	void testSetCandyWeight() {
		Candy c1 = new Candy("Jelly beans", 5.5, 3.2);
		c1.setCandyWeight(1.1);
		assertEquals(c1.getCandyWeight(), 1.1);
	}

	@Test
	void testGetPricePerPound() {
		Candy c1 = new Candy("Jelly beans", 5.5, 3.2);
		Double pricePerPound = c1.getPricePerPound();
		assertEquals(pricePerPound, 3.2);
	}

	@Test
	void testSetPricePerPound() {
		Candy c1 = new Candy("Jelly beans", 5.5, 3.2);
		c1.setPricePerPound(2.0);
		assertEquals(c1.getPricePerPound(), 2.0);
	}
	@Test
	void calculateCost() {
		Candy c1 = new Candy("Jelly beans", 5.5, 3.2);
		assertEquals(c1.calculateCost(), 17.6);
	}
	@Test
	void calculateTax() {
		Candy c1 = new Candy("Jelly beans", 5.5, 3.2);
		assertEquals(c1.calculateTax(), 1.276);
	}
	@Test
	void TestIsSameItem() {
		Candy c1 = new Candy("Jelly beans", 5.5, 3.2);
		Candy c2 = new Candy("Jelly beans", 5.5, 3.2);
		assertEquals(c1.isSameAs(c2), true);
	}

}
