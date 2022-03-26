package RealEstate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
public class REO {
	
	static Listings reoListings = new Listings();
	static HashMap<Integer,String> bids = new HashMap<Integer,String>();
	static HashMap<String,Integer> amountOfBids = new HashMap<String,Integer>();
	static House house = new House("House",1, 1, 1, 1, .1);
	static Condo condo = new Condo("Condo", 1, 1, 1, 1, 1);
	


	public static void main(String[] args) {
		for(String element : reoListings.listings.keySet()) {
		amountOfBids.put(element, 0);
		}
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
			autoPopulateListings();
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
			addBid();
			break;
		case "2":
			showBids();
			break;
		case "3":
			autoPopulateBids();
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
	//beginning of autoPopulateListings()
	private static void autoPopulateListings() {
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

		
		System.out.println(8 + " residences have been added to the listings for testing purposes.");

	}
	//end of autoPopulateListings()
	//beginning of showListings()
	private static void showListings() {
		System.out.println("Current Listings for REO:");
		System.out.println();
		for(int i = 0; i < reoListings.getListings().size(); i++) {
			int b = i+1;
			System.out.println("Listing NO. "+ b);
			System.out.println(reoListings.getResidences().get(i));
			System.out.println();
			System.out.println();
	}
}
	//end of showListings()
	//beginning of addBid()
	private static void addBid() {


		boolean done = false;
		while(!done) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Current Listings for REO:");
		System.out.printf("%-10s%-5s\n", "NO.","Property (Bids)");
		System.out.println("-------------------------");
		int i = 1;
		
		//printing out the addresses and numbering them
		//cycling through Set<String> and giving us a string element which is the address
		//for(String element : reoListings.getStreetAddress()) {
		//printing the strings
		//System.out.println(reoListings.getResidences());

		for(String element : reoListings.listings.keySet()) {
			//now finding the residential
					//reoListings.listings.get(element);
			System.out.println(i+":"+ element+"("+amountOfBids.get(element)+")");

//					
//					if(reoListings.listings.get(element)instanceof Condo) {
//						System.out.println(i+":"+ element+"("+amountOfBids.get(element)+")");
//					}
//					if(reoListings.listings.get(element) instanceof House) {
//						System.out.println(i+":"+ element+"("+amountOfBids.get(element)+")");
//
//					}
			
			//putting the number associated with its address in a HashMap<Integer,String>
			bids.put(i, element);
			i++;
		
		}
		
		System.out.println("ENTER:Exit back to previous menu");
		System.out.println();
		System.out.println("For which property would you like to add a bid?:");
		int in = input.nextInt();
		//Takes in the user input and checks to see if it matches with the key integer
		int j = 0;
		for (Integer key : bids.keySet()){
			int k = 1;
			if(key==in) {
			System.out.println(reoListings.getListing(bids.get(key)));
			System.out.println("Please enter the name of the bidder: ");
			String name = input2.nextLine();
			System.out.println("Please enter the new bid:");
			double newBid = input2.nextDouble();
			System.out.println();
			System.out.println("New bid for property '" +bids.get(key) + "' added.");
			//System.out.println(house.getBids());
			//System.out.println(reoListings.getResidences().get(5));
			//remember to change the get to the corresponding number that was selected
			if(reoListings.getResidences().get(in) instanceof Condo) {
				house.newBid(name,newBid);
				amountOfBids.put(bids.get(key), k);
				System.out.println("condo");
				System.out.println(amountOfBids);
			}
			else {
			house.newBid(name, newBid);
			amountOfBids.put(bids.get(key), k);
			System.out.println(amountOfBids);

				System.out.println("house");
			}
			k++;
			}
		//done = true;
		}
		}
//		if(in==1) {
//			
//			bids.get()
//		}
//		switch (in) {
//		case "1":	
//			System.out.println(reoListings.getListing());
//			break;
//		case "2":
//			break;
//		case "3":
//			break;
//		case "4":
//			break;
//		case "5":
//			break;
//		case "6":
//			break;
//		case "7":
//			break;
//		case "8":
//			break;
//		case " ":
//			done = true;
//			break;
//		}
		
		//System.out.println(house.getBidCount());

		}
//}

	//end of addBid()
	//beginning of showBids()
	private static void showBids() {
		
	}
	//end of showBids()
	//beginning of autoPopulateBids()
	private static void autoPopulateBids() {
//		//Hard Coded set of names to be used as bidders
//		String[] autoBidders= {"Patric Stewart","Walter Koenig","William Shatner","Leonard Nimoy","DeForect Kelley","James Doohan","George Takei","Majel Barrett","Nichelle Nichol","Jonathan Frank"
//		,"Marina Sirtis","Brent Spiner","Gates McFadden","Michael Dorn","LeVar Burton","Wil Wheaton","Colm Meaney","Michelle Forbes"};
//		//Create an object of type Random,  r
//		Random r = new Random();
//		//Randomly select a number between 0 and the length of the autoBidders list - 1.  This will be your random index into the array.
//		int index = r.nextInt((autoBidders.length-1) +1);
//		//Create a random bid amount between -10% and +10% of the Appraisal Price
//		int maxBid = (int) res.calculateAppraisalPrice() * 1.1;
//
//		int minBid = (int) res.calculateAppraisalPrice() * .9;
//
//		int bidAmount = (int) Math.random() * ((maxBid - minBid) + 1)) + minBid;
//
//		//Use the random index number to select a random bidder and use the randomly generated bid amount to create a new bid.
//		res.newBid(autoBidders[index], bidAmount);
		
	}
	private static void addingBid() {
		//if()
		reoListings.getListing("34 Elm");
		System.out.println();
	}
	//end of showBids()
}//end of REO class
