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
		setAppraisalPrice((97.00*getSize())+(10000.00*getBeds())+(12000.00*getBaths())+(yardAcres)*460000.00);

		return appraisalPrice;
	}
	public String toString() {	
		//header portion
		String out1 = "---------------------------------------------------------------------";
		String out1_2 = "Residence Type:";
		String out1_3 = "Address:";
		String out1_4 = "Zip Code:";
		String out1_5 = "---------------------------------------------------------------------";
		String final1 = String.format("%s\n%s%-10s%s%-20s%s%d\n%s\n",out1,out1_2,"House",out1_3,getStreetAddress(),out1_4,getZip(),out1_5);
		String line = "-------------------------";
		//body portion
		String final2 = String.format("%s%.0f\n%s%d\n%s%d\n%s%.2f\n%s\n%s$%,.2f\n%s$%,.2f\n%s", "Sq Footage: ",getSize(),"Bedrooms: ",getBeds(),"Bathrooms: ",getBaths(),
				"Yard Size (Acres): ",getYardAcres(),line,"Appraisal Price: ",this.calculateAppraisalPrice(),"List Price: ", getListPrice(),line);
		//returning both strings
		return final1+final2;
	}
}