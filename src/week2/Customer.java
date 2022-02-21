package week2;
import java.util.ArrayList;
public class Customer {
	//Attributes
	private String custName = "";
	private ArrayList<Order> orderHistory;
	private int custID;
	private static int nextCustID = 1000;
	//constructors
	public Customer() {
		custName = "";
		orderHistory = new ArrayList<Order>();
		custID = 0;
		nextCustID = 0;
	}
	public Customer(String n) {
		custName = n;
		orderHistory = new ArrayList<Order>();
		custID = 0;
		nextCustID = 0;
	}
	//methods
	public String getName() {
		return custName;
	}
	public int getID() {
		return custID;
	}
	public ArrayList<Order>getOrderHistory(){
		return orderHistory;
	}
	public String setName(String n) {
		return custName = n;
	}
	public void addToHistory(Order o) {
		orderHistory.add(o);
	}
}
