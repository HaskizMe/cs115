package week2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IceCreamTest {

	@Test
	void testGetScoopCount() {
		IceCream ice1 = new IceCream("vanilla" , 3, 1.2);
		int scoop = ice1.getScoopCount();
		assertEquals(scoop, 3);
	}

	@Test
	void testSetScoopCount() {
		IceCream ice1 = new IceCream("Vanilla", 3, 1.2);
		ice1.setScoopCount(4);
		assertEquals(ice1.getScoopCount(),4);
	}

	@Test
	void testGetPricePerScoop() {
		IceCream ice1 = new IceCream("vanilla" , 3, 1.2);
		int scoop = ice1.getScoopCount();
		assertEquals(scoop, 3);	}

	@Test
	void testSetPricePerScoop() {
		IceCream ice1 = new IceCream("Vanilla", 3, 1.2);
		ice1.setScoopCount(4);
		assertEquals(ice1.getScoopCount(),4);
	}
	@Test
	void calculateCost() {
		IceCream ice1 = new IceCream("Vanilla", 3, 1.0);
		assertEquals(ice1.calculateCost(), 3.0);
	}
	@Test
	void calculateTax() {
		IceCream ice1 = new IceCream("Vanilla", 4, 1.0);
		assertEquals(ice1.calculateTax(), .29);
}
}
