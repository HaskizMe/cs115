package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CondoTest {

	@Test
	void testGetFloorLvl() {
		Condo c1 = new Condo("10341 CR 1230", 75762, 3, 2, 1800, 2);
		assertEquals(c1.getFloorLvl(),2);
	}

	@Test
	void testSetFloorLvl() {
		Condo c1 = new Condo("10341 CR 1230", 75762, 3, 2, 1800, 2);
		c1.setFloorLvl(3);
		assertEquals(c1.getFloorLvl(),3);
	}
	@Test
	void testCalculateAppraisalPrice() {
		Condo c1 = new Condo("10341 CR 1230", 75762, 3, 2, 1800, 2);
		assertEquals(c1.calculateAppraisalPrice(),207400);
	}
}
