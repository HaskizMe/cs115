package RealEstate;

public class Condo extends Residential {
	//Attributes
	private int floorLvl = 0;
	//Constructors
//	public Condo() {
//		super();
//		floorLvl = 0;
//	}
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
	public String toString() {
		//header portion
		String out1 = "---------------------------------------------------------------------";
		String out1_2 = "Residence Type:";
		String out1_3 = "Address:";
		String out1_4 = "Zip Code:";
		String out1_5 = "---------------------------------------------------------------------";
		String final1 = String.format("%s\n%s%-10s%s%-20s%s%d\n%s\n",out1,out1_2,"Condo",out1_3,getStreetAddress(),out1_4,getZip(),out1_5);
		String line = "-------------------------";
		//body portion
		String final2 = String.format("%s%.0f\n%s%d\n%s%d\n%s%d\n%s\n%s$%,.2f\n%s$%,.2f\n%s", "Sq Footage: ",getSize(),"Bedrooms: ",getBeds(),"Bathrooms: ",getBaths(),
				"Floor Levels: ",getFloorLvl(),line,"Appraisal Price: ",this.calculateAppraisalPrice(),"List Price: ", getListPrice(),line);
		//returning both strings
		return final1+final2;
	}
}
