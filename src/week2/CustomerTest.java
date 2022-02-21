package week2;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testGetName() {
		Customer c1 = new Customer("Bill");
		assertEquals(c1.getName(),"Bill");
	}

	@Test
	void testGetID() {
		Customer c1 = new Customer("Bill");
		assertEquals(c1.getID(),0);	
		}

	@Test
	void testGetOrderHistory() {
		Order o2 = new Order();
		ArrayList<Order> a1 = new ArrayList<Order>();
		Customer c = new Customer();
		a1.add(o2);
		c.addToHistory(o2);
		assertEquals(c.getOrderHistory(),a1);	
		}

	@Test
	void testSetName() {
		Customer c1 = new Customer("Bill");
		c1.setName("tim");
		assertEquals(c1.getName(),"tim");	
		}

	@Test
	void testAddToHistory() {
		Order o2 = new Order();
		ArrayList<Order> a1 = new ArrayList<Order>();
		Customer c = new Customer();
		Candy c1 = new Candy("Candy Corn" , .25, .35);
		a1.add(o2);
		o2.addOrder(c1);
		c.addToHistory(o2);
		assertEquals(c.getOrderHistory(),a1);
		}

}
