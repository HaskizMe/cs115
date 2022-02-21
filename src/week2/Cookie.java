package week2;

public class Cookie extends DessertItem implements SameItem<Cookie>{

	//Attributes
	private int cookieQty;
	private double pricePerDozen;
	//constructors
	public Cookie() {
		super();
		cookieQty = 0;
		pricePerDozen = 0.0;
		setPackaging("");
	}
	public Cookie(String n, int cq, double ppd) {
		super(n);
		cookieQty = cq;
		pricePerDozen = ppd;
		setPackaging("Box");

	}
		//methods
	public int getCookieQty() {
		return cookieQty;
	}
	public void setCookieQty(int cq) {
		cookieQty = cq;
	}
	public double getPricePerDozen() {
		return pricePerDozen;
	}
	public void setPricePerDozen(double ppd) {
		pricePerDozen = ppd;
	}
	public double calculateCost() {
		return (cookieQty/12.0) * pricePerDozen;
	}
	public boolean isSameAs(Cookie other2) {
		if(this.getName().equals(other2.getName()) && this.getPricePerDozen()==other2.getPricePerDozen()) {
		return true;
		}
		return false;
	}
	public String toString() {
		String line1 = String.format("%s Cookies (%s)", getName(),getPackaging());
		String line2_2 = String.format("%d cookies @ $%.2f/Per Dozen ", getCookieQty(),getPricePerDozen());
		String line2_3 = String.format("$%.2f", calculateCost());
		String line2_4 = String.format("[Tax: $%.2f]", calculateTax());
		String line2 = String.format("%s\n\t%-45s%s%17s", line1,line2_2,line2_3,line2_4);
		return line2;
	}
}
