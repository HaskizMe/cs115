package RealEstate;

public class Condo extends Residential {
	//Attributes
	private int floorLvl;
	//Constructors
	public Condo() {
		super();
		floorLvl = 0;
	}
	public Condo(String sa, int z, int bedc, int bathc, int sf, int fl) {
		super(sa,z,bedc,bathc,sf);
		floorLvl = fl;
	}
	//Methods
	public int getFloorLvl() {
		return floorLvl;
	}
	public void setFloorLvl(int fl) {
		floorLvl = fl;
	}
	public double calculateAppraisalPrice() {
		setAppraisalPrice((88.00*getSize())+(8000.00*getBeds())+(10000.00*getBaths())+((getFloorLvl()-1)*5000.00));
		return appraisalPrice;
	}
}
