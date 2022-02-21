package RealEstate;

public class House extends Residential {
	//Attributes
	private double yardAcres;
	//Constructors
	public House() {
		super();
		yardAcres = 0.0;
	}
	public House(String sa, int z, int bedc, int bathc, int sf, double ya) {
		super(sa,z,bedc,bathc,sf);
		yardAcres = ya;
	}
	//Methods
	public double getYardAcres() {
		return yardAcres;
	}
	public void setYardAcres(double ya) {
		yardAcres = ya;
	}
	public double calculateAppraisalPrice() {
		setAppraisalPrice((97.00*getSize())+(10000.00*getBeds())+(12000.00*getBaths())+(Math.round(yardAcres)*460000.00));
		return appraisalPrice;
	}
}