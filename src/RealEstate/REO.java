package RealEstate;
import java.util.Scanner;
public class REO {
	
	static Listings reoListings = new Listings();


	public static void main(String[] args) {
		boolean done = false;
		Scanner in = new Scanner(System.in); 
		while(!done) {
		System.out.println("----------------------");
		System.out.println("Main Menu");
		System.out.println("----------------------");	
		System.out.println("1: Listings");
		System.out.println("2: Bids");
		System.out.println();
		System.out.println("What would you like to do? (1-2):");
		String choice = in.nextLine();
		//main switch statement
		switch (choice) {
		case "1":
			listingsMenu();
			break;
		case "2":
			bidsMenu();
			break;	
		}
		}
	}
	//beginning of ListingsMenu()
	private static void listingsMenu() {
		boolean done = false;
		Scanner input = new Scanner(System.in);
		while(!done) {
		System.out.println("----------------------");
		System.out.println("Listings Menu");
		System.out.println("----------------------");
		System.out.println("1: Add Listings");
		System.out.println("2: Show Listings");
		System.out.println("3: Auto Populate Listings (Dev tool)");
		System.out.println("ENTER: Exit back to previous menu");
		System.out.println();
		System.out.println("What would you like to do? (1-3):");
		String choice = input.nextLine();
		switch (choice) {
		case "1":
			addListingsMenu();
			break;
		case "2":
			showListings();
			break;
		case "3":
			autoPopulate();
			break;
		case "":
			done = true;
			break;
		}
		}
	}
	//end of listingMenu() 
	//beginning of addListingMenu()
	private static void addListingsMenu() {
		Scanner input = new Scanner(System.in);
		boolean done = false;
		while(!done) {
		System.out.println("----------------------");
		System.out.println("Add Listings Menu");
		System.out.println("----------------------");
		System.out.println("1: Add House");
		System.out.println("2: Add Condo");
		System.out.println("ENTER: Exit back to previous menu");
		System.out.println();
		System.out.println("What would you like to do? (1-2):");
		String choice = input.nextLine();
		switch(choice) {
		case "1":
			addHouse();
			break;
		case "2":
			addCondo();
			break;
		case "":
			done = true;
			break;
		}
		}
	}
	//end of addListingsMenu()
	//beginning of bidsMenu()
	private static void bidsMenu() {
		Scanner input = new Scanner(System.in);
		boolean done = false;
		while(!done) {
		System.out.println("----------------------");
		System.out.println("Bids Menu");
		System.out.println("----------------------");
		System.out.println("1: Add New Bid");
		System.out.println("2: Show Existing Bids");
		System.out.println("3: Auto Populate Bids (Dev Tool)");
		System.out.println("ENTER: Exit back to previous menu");
		System.out.println();
		System.out.println("What would you like to do? (1-3):");
		String choice = input.nextLine();
		switch(choice) {
		case "1":
			//System.out.println(h1);
			break;
		case "2":
			//System.out.println(c1);
			break;
		case "3":
			//autoPopulate();
			break;
		case "":
			done = true;
			break;
			}
		}
	}
	//end of bidsMenu()
	//beginning of add condo method
	private static void addHouse() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the street address for the residence:");
		String address = input.nextLine();
		System.out.print("Please enter the zip code for the residence:");
		int zip = input.nextInt();
		System.out.print("Please enter the number of bedrooms:");
		int beds = input.nextInt();
		System.out.print("Please enter the number of bathrooms:");
		int baths = input.nextInt();
		System.out.print("Please enter the square footage of the residence:");
		int sqFoot = input.nextInt();
		System.out.print("Please enter the size of the yard in acres:");
		double yd = input.nextDouble();
		System.out.println();
	//creating a house object to store the info above
		House h1 = new House(address,zip,beds,baths,sqFoot,yd);
		reoListings.addListing(address,h1);
		System.out.printf("Appraisal Price for this property is: $%,.2f \n",h1.calculateAppraisalPrice());
		System.out.print("Please enter the List Price for the property: ");
		double listPrice = input.nextDouble();
		h1.setListPrice(listPrice);
		System.out.println();
		System.out.println("You have created a new listing!");
	//printing the h1 toString()
		System.out.println(h1);
		System.out.println();
		System.out.println();		
	}
	//end of addHouse()
	//beginning of addCondo()
	private static void addCondo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the street address for the residence:");
		String address = input.nextLine();
		System.out.print("Please enter the zip code for the residence:");
		int zip = input.nextInt();
		System.out.print("Please enter the number of bedrooms:");
		int beds = input.nextInt();
		System.out.print("Please enter the number of bathrooms:");
		int baths = input.nextInt();
		System.out.print("Please enter the square footage of the residence:");
		int sqFoot = input.nextInt();
		System.out.print("Please enter the floor level of the condo: ");
		int floorLvl = input.nextInt();
		System.out.println();
	//creating a Condo object to store the info above
		Condo c1 = new Condo (address,zip,beds,baths,sqFoot,floorLvl);
		reoListings.addListing(address,c1);
		System.out.printf("Appraisal Price for this property is: $%,.2f \n",c1.calculateAppraisalPrice());
		System.out.print("Please enter the List Price for the property: ");
		double listPrice = input.nextDouble();
		c1.setListPrice(listPrice);
		System.out.println();
		System.out.println("You have created a new listing!");
	//printing the c1 toString()
		System.out.println(c1);
		System.out.println();
		System.out.println();		
	}
	//end of addCondo()
	//beginning of autoPopulate()
	private static void autoPopulate() {
		House house1 = new House("34 Elm",95129, 3, 2, 2200, .2);
		house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("34 Elm", house1);
		House house2 = new House("42 Hitchhikers",95136, 4, 3, 2800, .3);
		house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("42 Hitchhikers", house2);
		Condo condo1 = new Condo("4876 Industrial", 95177, 3, 1, 1800, 3);
		condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("4876 Industrial", condo1);
		House house3 = new House("2654 Oak",84062, 5, 53, 4200, .5);
		house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("2654 Oak", house3);
		Condo condo2 = new Condo("9875 Lexington",84063, 2, 1, 1500, 1);
		condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("9875 Lexington", condo2);
		Condo condo3 = new Condo("3782 Market", 84066, 3, 1, 1800, 2);
		condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("3782 Market", condo3);
		House house4 = new House("7608 Glenwood", 84055, 6, 3, 3900, .4);
		house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("7608 Glenwood", house4);
		House house5 = new House("1220 Apple", 84057, 8, 7, 7900, 1);
		house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("1220 Apple", house5);
		int currentSize = reoListings.getListings().size();

		
		System.out.println(currentSize + " residences have been added to the listings for testing purposes.");

	}
	private static void showListings() {
		reoListings.getListings();
		
	}
	
}
