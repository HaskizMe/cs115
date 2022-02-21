package week2;

public class IceCream extends DessertItem{

	//Attributes
	private int scoopCount;
	private double pricePerScoop;
	//constructors
	public IceCream() {
		super();
		scoopCount = 0;
		pricePerScoop = 0.0;
		setPackaging("");
	}
	public IceCream(String n, int sc, double pps) {
		super(n);
		scoopCount = sc;
		pricePerScoop = pps;
		setPackaging("Bowl");

	}
		//methods
	public int getScoopCount() {
		return scoopCount;
	}
	public void setScoopCount(int sc) {
		scoopCount = sc;
	}
	public double getPricePerScoop() {
		return pricePerScoop;
	}
	public void setPricePerScoop(double pps) {
		pricePerScoop = pps;
	}
	public double calculateCost() {
		return scoopCount * pricePerScoop;
	}
	public String toString() {
		String line1 = String.format("%s Ice Cream (%s)", getName(),getPackaging());
		String line2_2 = String.format("%d scoops @ $%.2f/Per Scoop ", getScoopCount(),getPricePerScoop());
		String line2_3 = String.format("$%.2f", calculateCost());
		String line2_4 = String.format("[Tax: $%.2f]", calculateTax());
		String line2 = String.format("%s\n\t%-45s%s%17s", line1,line2_2,line2_3,line2_4);
		return line2;
	}
}
