package week2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest {

	@Test
	void testGetName() {
		Candy d1 = new Candy("Snickers", 1,1);
		String name = d1.getName();
		assertEquals(name, "Snickers");
	}
	@Test
	void testSetName() {
		Candy d1 = new Candy("Snickers",1,1);
		d1.setName("Jelly beans");
		assertEquals(d1.getName(), "Jelly beans");	
	}

	@Test
	void testGetTaxPercent() {
		Candy d1 = new Candy("Snickers", 1,1);
		assertEquals(d1.getTaxPercent(), 7.25);	
		}

	@Test
	void testSetTaxPercent() {
		Candy d1 = new Candy("Snickers",1,1);
		d1.setTaxPercent(3.2);
		assertEquals(d1.getTaxPercent(), 3.2);	
		}
	@Test
	void compareTo() {
		Candy d1 = new Candy("Snickers",3,3);
		Candy d2 = new Candy("Milky Way", 2, 2);
		int num = d1.compareTo(d2);
		assertEquals(num, 1);
		
		Candy d3 = new Candy("Snickers",1,1);
		Candy d4 = new Candy("Milky Way", 2, 2);
		int num2 = d3.compareTo(d4);
		assertEquals(num2, -1);
		
		Candy d5 = new Candy("Snickers",2,2);
		Candy d6 = new Candy("Milky Way", 2, 2);
		int num3 = d5.compareTo(d6);
		assertEquals(num3, 0);
		}
}

