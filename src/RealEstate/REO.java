package RealEstate;
import java.util.Scanner;
public class REO {


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
			break;
		case "3":
			break;
		case "":
			done = true;
			break;
		}
		}
	}
	//end of listingMenu() 
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
			System.out.println("adding House");
			break;
		case "2":
			System.out.println("adding Condo");
			break;
		case "":
			done = true;
			break;
		}
		}
	}
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
			System.out.println("adding new bid");
			break;
		case "2":
			System.out.println("showing bids");
			break;
		case "3":
			System.out.println("dev tool");
			break;
		case "":
			done = true;
			break;
			}
	
		}
	}
}
