package week1;

import java.util.*;

import RealEstate.House;
import RealEstate.Listings;
import RealEstate.Residential;

public class test {

	public static void main(String[] args) {
		//header for toString()
		//Residential r1 = new Residential("flint lane",75762,3, 2, 1800, 50.5);
		House h1 = new House("10341 CR 1230", 75762, 3, 2, 1800, 50.5);
		//Residential r1 = h1;
		h1.setListPrice(h1.calculateAppraisalPrice()*1.1);

		Listings l = new Listings();
		String out1 = "---------------------------------------------------------------------";
		String out1_2 = "Residence Type:";
		String out1_3 = "Address:";
		String out1_4 = "Zip Code:";
		String out1_5 = "---------------------------------------------------------------------";
		System.out.printf("%s\n%s%-10s%s%-20s%s%d\n%s\n",out1,out1_2,"House",out1_3,h1.getStreetAddress(),out1_4,h1.getZip(),out1_5);
		String line = "-------------------------";
		System.out.printf("%s%.0f\n%s%d\n%s%d\n%s%.2f\n%s\n%s$%,.2f\n%s$%,.2f\n%s", "Sq Footage: ",h1.getSize(),"Bedrooms: ",h1.getBeds(),"Bathrooms: ", h1.getBaths(),
				"Yard Size (Acres): ",h1.getYardAcres(),line,"Appraisal Price: ",h1.calculateAppraisalPrice(),"List Price: ", h1.getListPrice(),line);
		h1.setListPrice(h1.calculateAppraisalPrice()*1.1);
	}

}
