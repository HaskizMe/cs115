package week2;

import java.util.ArrayList;

public class Order implements Payable {

	//Attributes
	private ArrayList<DessertItem> order;
	private PayType payMethod;
	//contructors
	public Order() {
		order = new ArrayList<DessertItem>();
		payMethod = PayType.CASH;
	}
	//Methods
	public ArrayList<DessertItem> getOrderList() {
		return order;
	}
	public void addOrder(DessertItem newDessert) {
		if(newDessert instanceof Candy) {
			for(DessertItem existing : this.order) {
				if(existing instanceof Candy) {
					if(((Candy)newDessert).isSameAs((Candy)existing)){
						((Candy)existing).setCandyWeight(((Candy) newDessert).getCandyWeight()+((Candy) existing).getCandyWeight());
						return;
					}
				}
			}
		}
		if(newDessert instanceof Cookie) {
			for(DessertItem existing : this.order) {
				if(existing instanceof Cookie) {
					if(((Cookie)newDessert).isSameAs((Cookie)existing)){
						((Cookie)existing).setCookieQty(((Cookie) newDessert).getCookieQty()+((Cookie) existing).getCookieQty());
						return;
					}
				}
			}
		}
		
		
		
		order.add(newDessert);
	}
	public int itemCount() {
		return order.size();
	}
	public double orderCost() {	
		double sumCost = 0.0;
		for(DessertItem d:getOrderList()) {
		sumCost = sumCost+d.calculateCost();	
		}
		return sumCost;
	}
	public double orderTax() {
		double sumTax = 0.0;
		for(DessertItem d : getOrderList()) {
		sumTax = sumTax + d.calculateTax();
		} 
	return sumTax;
	}
	public String toString() {
		String finalOutput = "";

		finalOutput +="--------------Receipt-------------\n";
		for (DessertItem d : order) {
			finalOutput += String.format("%s\n", d);
		}
		finalOutput +="--------------------------------\n";
		finalOutput += "Total number of items in order: "+order.size();
		String finalOutput1_2 = String.format("%s", "Order Subtotals:");
		String finalOutput1_1 = String.format("$%.2f", orderCost());
		String finalOutput1_3 = String.format("[Tax:$%.2f]", orderTax());
		String finalOutput1_4 = String.format("%s","Order Total:");
		String finalOutput1_5 = String.format("$%.2f", orderCost()+orderTax());
		String finalOutput2 = String.format("\n%s%42s%17s\n%s%46s\n", finalOutput1_2,finalOutput1_1,finalOutput1_3,finalOutput1_4,finalOutput1_5);
		String paidfor = "--------------------------------\n";
		paidfor += String.format("Paid for with %s\n", getPayType());
		return finalOutput+finalOutput2+paidfor;
	}
	public PayType getPayType() {
		return payMethod;
	}
	public void setPayType(PayType pT) {
		payMethod = pT;
	}
	
}//end of order class
