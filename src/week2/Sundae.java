package week2;

public class Sundae extends IceCream {

	//Attributes
	private String toppingName;
	private double toppingPrice;
	//constructors
	public Sundae() {
		super();
		toppingName = "";
		toppingPrice = 0.0;
		setPackaging("");

	}
	public Sundae(String n, int sc, double pps, String tn, double tp) {
		super(n, sc, pps);
		toppingName = tn;
		toppingPrice = tp;
		setPackaging("Boat");

	}
		//methods
	public String getToppingName() {
		return toppingName;
	}
	public void setToppingName(String tn) {
		toppingName = tn;
	}
	public double getToppingPrice() {
		return toppingPrice;
	}
	public void setToppingPrice(double tp) {
		toppingPrice = tp;
	}
	public double calculateCost() {
		return (getScoopCount() * getPricePerScoop()) + toppingPrice;
	}
	public String toString() {
		String line2_5 = String.format("%s sundae (%s)", getToppingName(),getPackaging());
		String line1 = String.format("%d scoops of %s ice cream @ $%.2f", getScoopCount(), getName(), getPricePerScoop());
		String line2_2 = String.format("%s topping @ $%.2f", getToppingName(), getToppingPrice());
		String line2_3 = String.format("$%.2f", calculateCost());
		String line2_4 = String.format("[Tax: $%.2f]", calculateTax());
		String line2 = String.format("%s\n\t%s\n\t%-45s%s%17s", line2_5,line1,line2_2,line2_3,line2_4);

		return line2;
	}

}
