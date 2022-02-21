package RealEstate;

public abstract class Property {

	//Attributes
	String streetAddress;
	private int zip;
	private double listPrice;
	protected double appraisalPrice;
	//Constructors
	public Property() {
		streetAddress = "";
		zip = 0;
		listPrice = 0.0;
		appraisalPrice = 0.0;
	}
	public Property(String sa,int z) {
		streetAddress = sa;
		zip = z;
	}
	//methods
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String sa) {
		streetAddress = sa;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int z) {
		zip = z;
	}
	public double getListPrice() {
		return listPrice;
	}
	public void setListPrice(double lp) {
		listPrice = lp;
	}
	public double getApprasialPrice() {
		return appraisalPrice;
	}
	protected void setAppraisalPrice(double ap) {
		appraisalPrice = ap;
	}
	public abstract double calculateAppraisalPrice();
	
	
}
