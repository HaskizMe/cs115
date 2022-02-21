package week2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {

	@Test
	void testGetToppingName() {
		Sundae s1 = new Sundae("vanilla" , 3, 1.2, "Peanuts", 2.4);
		String top = s1.getToppingName();
		assertEquals(top, "Peanuts");
		}

	@Test
	void testSetToppingName() {
		Sundae s1 = new Sundae("Vanilla", 3, 1.2, "Peanuts", 2.4);
		s1.setToppingName("Sprinkles");
		assertEquals(s1.getToppingName(),"Sprinkles");
		}

	@Test
	void testGetToppingPrice() {
		Sundae s1 = new Sundae("vanilla" , 3, 1.2, "Peanuts", 2.4);
		double top = s1.getToppingPrice();
		assertEquals(top, 2.4);
		}

	@Test
	void testSetToppingPrice() {
		Sundae s1 = new Sundae("Vanilla", 3, 1.2, "Peanuts", 2.4);
		s1.setToppingPrice(2.4);
		assertEquals(s1.getToppingPrice(),2.4);	
		}
	@Test
	void calculateCost() {
		Sundae s1 = new Sundae("Vanilla", 3, 1.2, "Peanuts", 2.4);
		assertEquals(s1.calculateCost(), 6.0);
	}
	@Test
	void calculateTax() {
		Sundae s1 = new Sundae("Vanilla", 3, 1.0, "Peanuts", 2.4);
		assertEquals(s1.calculateTax(), .3915);
}
}
