package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTest {

	@Test
	void testGetStreetAddress() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		assertEquals(h1.getStreetAddress(), "10341 CR 1230");
	}

	@Test
	void testSetStreetAddress() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		h1.setStreetAddress("hello");
		assertEquals(h1.getStreetAddress(), "hello");
	}

	@Test
	void testGetZip() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		assertEquals(h1.getZip(), 75762);
	}

	@Test
	void testSetZip() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		h1.setZip(84606);
		assertEquals(h1.getZip(), 84606);
	}
	@Test
	void testGetListPrice() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		assertEquals(h1.getListPrice(), 0.0);
	}
	@Test
	void testSetListPrice() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		h1.setListPrice(333000.00);
		assertEquals(h1.getListPrice(), 333000.00);
	}

}
