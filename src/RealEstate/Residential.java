package RealEstate;

public abstract class Residential extends Property {

	//Attributes
	private int bedCount;
	private int bathCount;
	private double sqFootage;
	//Constructors
	public Residential() {
		super();
		bedCount = 0;
		bathCount = 0;
		sqFootage = 0.0;	
	}
	public Residential(String sa, int z, int bedc, int bathc, double sf) {
		super(sa,z);
		bedCount = bedc;
		bathCount = bathc;
		sqFootage = sf;
	}
	//methods
	public int getBeds() {
		return bedCount;
	}
	public void setBeds(int bedc) {
		bedCount = bedc;
	}
	public int getBaths() {
		return bathCount;
	}
	public void setBaths(int bathc) {
		bathCount = bathc;
	}
	public double getSize() {
		return sqFootage;
	}
	public void setSize(double sf) {
		sqFootage = sf;
	}
	public abstract double calculateAppraisalPrice();
}