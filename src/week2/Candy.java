package week2;

public class Candy extends DessertItem implements SameItem<Candy> {

	//Attributes
	private double candyWeight;
	private double pricePerPound;
	
	//contructors
	public Candy() {
		super();
		candyWeight = 0.0;
		pricePerPound = 0.0;
		setPackaging("");
	}

	public Candy(String n, double cw, double pp) {
		super(n);
		candyWeight = cw;
		pricePerPound = pp;
		setPackaging("Bag");
	}// end of constructor Candy()
	
	//methods
	public double getCandyWeight() {
		return candyWeight;
	}
	public void setCandyWeight(double cw) {
		candyWeight = cw;
	}
	public double getPricePerPound() {
		return pricePerPound;
	}
	public void setPricePerPound(double pp) {
		pricePerPound = pp;
	}
	public double calculateCost() {
		return candyWeight * pricePerPound;
	}
	public boolean isSameAs(Candy other1) {
		if(this.getName().equals(other1.getName()) && this.getPricePerPound() == other1.getPricePerPound()) {
		return true;
	}
		return false;
	}
	
	public String toString() {
		String line1 = String.format("%s (%s)", getName(),getPackaging());
		String line2_2 = String.format("%.2f lbs. @ $%.2f/lb ", getCandyWeight(),getPricePerPound());
		String line2_3 = String.format("$%.2f", calculateCost());
		String line2_4 = String.format("[Tax: $%.2f]", calculateTax());
		String line2 = String.format("%s\n\t%-45s%s%17s", line1,line2_2,line2_3,line2_4);
		return line2;
	}
		
}//end of Candy class
