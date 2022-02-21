package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {

	@Test
	void testGetYardAcres() {
		House h1 = new House("10341 CR 1230", 75762, 3, 2, 1800, 50.5);
		assertEquals(h1.getYardAcres(),50.5);
	}

	@Test
	void testSetYardAcres(){
		House h1 = new House("10341 CR 1230", 75762, 3, 2, 1800, 50);
		h1.setYardAcres(60.5);
		assertEquals(h1.getYardAcres(),60.5);
	}
	@Test
	void testCalculateAppraisallPrice(){
		House h1 = new House("10341 CR 1230", 75762, 3, 2, 1800, 50);
		assertEquals(h1.calculateAppraisalPrice(),23228600);
	}

}
