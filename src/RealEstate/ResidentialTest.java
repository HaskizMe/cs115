package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {

	@Test
	void testGetBeds() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		assertEquals(h1.getBeds(),4);
	}

	@Test
	void testSetBeds() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		h1.setBeds(4);
		assertEquals(h1.getBeds(),4);
	}

	@Test
	void testGetBaths() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		assertEquals(h1.getBaths(),5);
	}

	@Test
	void testSetBaths() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		h1.setBaths(3);
		assertEquals(h1.getBaths(),3);
	}

	@Test
	void testGetSize() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		assertEquals(h1.getSize(),1800);
	}

	@Test
	void testSetSize() {
		House h1 = new House("10341 CR 1230",75762, 4,5, 1800, 3.2);
		h1.setSize(1900.60);
		assertEquals(h1.getSize(),1900.60);
	}

}
