package week2;

public abstract class DessertItem implements Packaging, Comparable<DessertItem>{
	//Attributes
	private String name;
	private double taxPercent = 7.25;
	private String packaging = "";
	
	//constructors
	public DessertItem() {
		name = "";
	}
	public DessertItem(String n) {
		name = n;
	}
	//methods
	public String getName() {
	return name;
	}
	public void setName(String n) {
		name = n;
	}
	public double getTaxPercent() {
		return taxPercent;
	}
	public void setTaxPercent(double t) {
		taxPercent = t;
	}
	public abstract double calculateCost();
	
	public double calculateTax() {
		return calculateCost()*(taxPercent/100);
	}
	public String getPackaging() {
		return packaging;
	}
	public void setPackaging(String ps) {
		packaging = ps;
	}
	public int compareTo(DessertItem other) {
		if(this.calculateCost() > other.calculateCost()) {
			return 1;
		} else if(this.calculateCost()<other.calculateCost()) {
			return -1;
		}
			return 0;
	}
}
