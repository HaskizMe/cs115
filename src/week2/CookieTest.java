package week2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
	void testGetCookieQty() {
		Cookie cook1 = new Cookie("Oatmeal" , 3, 1.0);
		int qty = cook1.getCookieQty();
		assertEquals(qty, 3);
	}

	@Test
	void testSetCookieQty() {
		Cookie cook1 = new Cookie("Oatmeal", 3, 1.0);
		cook1.setCookieQty(4);
		assertEquals(cook1.getCookieQty(), 4);
	}

	@Test
	void testGetPricePerDozen() {
		Cookie cook1 = new Cookie("Oatmeal" , 3, 1.0);
		double ppd = cook1.getPricePerDozen();
		assertEquals(ppd, 1.0);	}

	@Test
	void testSetPricePerDozen() {
		Cookie cook1 = new Cookie("Oatmeal", 3, 1.0);
		cook1.setPricePerDozen(2.4);
		assertEquals(cook1.getPricePerDozen(), 2.4);	
		}
	@Test
	void testCalculateCost() {
		Cookie cook1 = new Cookie("Oatmeal", 3, 1.0);
		assertEquals(cook1.calculateCost(), .25);
	}
	@Test
	void testCalculateTax() {
		Cookie cook1 = new Cookie("Oatmeal", 3, 1.0);
		assertEquals(cook1.calculateTax(), .018125);
}
	@Test
	void TestIsSameItem() {
		Cookie cook1 = new Cookie("Oatmeal", 3, 1.0);
		Cookie cook2 = new Cookie("Oatmeal", 3, 1.0);
		assertEquals(cook1.isSameAs(cook2), true);
	}
}
