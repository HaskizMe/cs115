package week2;
import java.util.Collections;
import java.util.Scanner;

import week2.Payable.PayType;
public class DessertShop2 {
	
	private static DessertItem userPromptCandy() {
		//initalization of variables
		Scanner in = new Scanner(System.in);
		Boolean valid = false;
		String name = "";
		double candyWeight = 0.0;
		double pricePerPound = 0.0;
		
		//name of candy
		System.out.print("Enter a type of candy: ");
		name = in.nextLine();
		
		//do while loop for candy weight
		do {
		System.out.print("Enter the candy weight purchased: ");
		String cw = in.nextLine();
		try {
		candyWeight = Double.parseDouble(cw);
		valid = true;
		}
		catch (Exception e) {
			System.out.print("Please enter a number: ");
		}
	}
		while(!valid);
		//end of candy weight
		
		//do while loop for pricePerPound
		do {
		System.out.print("Enter the price per pound: ");
		String pp = in.nextLine();
		try {
		pricePerPound = Double.parseDouble(pp);
		valid = false;
		}
		catch (Exception e) {
			System.out.print("Please enter a number: ");
		}
	}
		while(valid);
		//end of pricePerPound
		//in.close();
		Candy candy1 = new Candy(name,candyWeight,pricePerPound);
		return candy1;
		
	}
	private static DessertItem userPromptCookie() {
		//initalization of variables
		Scanner in = new Scanner(System.in);
		Boolean valid = false;
		String name = "";
		int cookieQty = 0;
		double pricePerDozen = 0.0;
		
		//name of cookie
		System.out.print("Enter a type of cookie: ");
		name = in.nextLine();
		
		//do while loop for cookieQty
		do {
		System.out.print("Enter the quantity purchased: ");
		String qty = in.nextLine();
		try {
		cookieQty = Integer.parseInt(qty);
		valid = true;
		}
		catch (Exception e) {
			System.out.print("Please enter a number: ");
		}
	}
		while(!valid);
		//end of cookieQty
		
		//do while loop for pricePerDozen
		do {
		System.out.print("Enter the price per dozen: ");
		String ppd = in.nextLine();
		try {
		pricePerDozen = Double.parseDouble(ppd);
		valid = false;
		}
		catch (Exception e) {
			System.out.print("Please enter a number:");
		}
	}
		while(valid);
		//end of pricePerDozen
		//in.close();
		Cookie cookie1 = new Cookie(name,cookieQty,pricePerDozen);
		return cookie1;
	}
	private static DessertItem userPromptIceCream() {
		//initalization of variables
		Scanner in = new Scanner(System.in);

		Boolean valid = false;
		String name = "";
		int scoopCount = 0;
		double pricePerScoop = 0.0;
		
		//name of ice cream
		System.out.print("Enter a type of ice cream used: ");
		name = in.nextLine();
		
		//do while loop of scoopCount
		do {
		System.out.print("Enter the number of scoops: ");
		String sc = in.nextLine();
		try {
		scoopCount = Integer.parseInt(sc);
		valid = true;
		}
		catch (Exception e) {
			System.out.print("Please enter a number ");
		}
	}
		while(!valid);
		//end of scoopCount
		
		//do while loop pricePerScoop
		do {
		System.out.print("Enter the price per scoop: ");
		String pps = in.nextLine();
		try {
		pricePerScoop = Double.parseDouble(pps);
		valid = false;
		}
		catch (Exception e) {
			System.out.print("Please enter a number: ");
		}
	}
		while(valid);
		//end of pricePerScoop
		//in.close();
		IceCream iceCream1 = new IceCream(name, scoopCount, pricePerScoop);
		return iceCream1;
	}
	private static DessertItem userPromptSundae() {
		//Initalization of varibles
		Scanner in = new Scanner(System.in);

		Boolean valid = false;
		String name = "";
		int scoopCount = 0;
		double pricePerScoop = 0.0;
		String topping = "";
		double toppingPrice = 0.0;
		
		//name of ice cream of sundae
		System.out.print("Enter a type of ice cream used: ");
		name = in.nextLine();
		
		//do while loop of scoopCount
		do {
		System.out.print("Enter the number of scoops: ");
		String sc = in.nextLine();
		try {
		scoopCount = Integer.parseInt(sc);
		valid = true;
		}
		catch (Exception e) {
			System.out.print("Please enter a number: ");
		}
	}
		while(!valid);
		//end of scoopCount
		
		//do while loop of pricePerScoop
		do {
		System.out.print("Enter the price per scoop: ");
		String pps = in.nextLine();
		try {
		pricePerScoop = Double.parseDouble(pps);
		valid = false;
		}
		catch (Exception e) {
			System.out.print("Please enter a number: ");
		}
	}
		while(valid);
		//end of pricePerScoop
		
		//name of topping
		System.out.print("Enter the type of topping used: ");
		topping = in.nextLine();
		
		//do while loop of toppingPrice
		do {
		System.out.print("Enter the price of the topping: ");
		String tp = in.nextLine();
		try {
		toppingPrice = Double.parseDouble(tp);
		valid = true;
		}
		catch (Exception e) {
			System.out.print("Please enter a number: ");
		}
	}
		while(!valid);
		//end of toppingPrice
		//in.close();
		Sundae sundae1 = new Sundae(name,scoopCount,pricePerScoop,topping,toppingPrice);
		return sundae1;	
		}

	public static void main(String[] args) {
		
		boolean closed = false;
		while(!closed) {
		Order o1 = new Order();
		Scanner sIn = new Scanner(System.in);
		String choice;
		DessertItem orderItem;

		boolean done = false;
		while (!done) {
		     System.out.println("\n1: Candy");
		     System.out.println("2: Cookie");
		     System.out.println("3: Ice Cream");
		     System.out.println("4: Sundae");

		     System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
		     choice = sIn.nextLine();

		     if (choice.equals("")) {
		          done = true;
		     } else {
		          switch (choice) {
		               case "1":
		                    orderItem = userPromptCandy();
		                    o1.addOrder(orderItem);
		                    break;
		               case "2":
		                    orderItem = userPromptCookie();
		                    o1.addOrder(orderItem);
		                    break;
		               case "3":
		                    orderItem = userPromptIceCream();
		                    o1.addOrder(orderItem);
		                    break;
		               case "4":
		                    orderItem = userPromptSundae();
		                    o1.addOrder(orderItem);
		                    break;
		               }//end of switch (choice)
		          }//end of if (choice.equals(""))
		     }//end of while (!done)
		System.out.println("\n");
		
		Candy c1 = new Candy("Candy Corn", 1.5,.25);
		Candy c2 = new Candy("Gummy Bears", .25, .35);
		Cookie co1 = new Cookie("Chocolate Chip", 6, 3.99);
		IceCream i1 = new IceCream("Pistachio", 2, .79);
		Sundae s1 = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
		Cookie co2 = new Cookie("Oatmeal Raisin", 2, 3.45);
		
		o1.addOrder(c1);
		o1.addOrder(c2);
		o1.addOrder(co1);
		o1.addOrder(i1);
		o1.addOrder(s1);
		o1.addOrder(co2);

		String paymentMethod = "";
		PayType payM = null;
		boolean valid = false;
		while(!valid) {
			System.out.println("What form of payment will be used? (CASH, CARD, PHONE):");
			paymentMethod = sIn.nextLine();
			for(Payable.PayType p : Payable.PayType.values()) {
				if(paymentMethod.equalsIgnoreCase(p.name())) {
					payM = p;
					switch (payM) {
					case CASH:
						o1.setPayType(payM);
						break;
					case CARD:
						o1.setPayType(payM);
						break;
					case PHONE:
						o1.setPayType(payM);
						break;	
					}
					valid = true;
				}
			} //end of for loop
				if(!valid) {
					System.out.println("That's not a valid form of payment.");
				}
		} //end of while loop
		Collections.sort(o1.getOrderList());
		System.out.println(o1);
		System.out.println("--------------------------------");
		System.out.println();
		boolean valid2 = false;
//hello git
		do {
			System.out.println("Hit enter to start a new order:");
			String next = sIn.nextLine();
			if(next.isEmpty()) {
				valid2 = true;
			}
		}
		while(!valid2);
		
		//sIn.close();
		}
		
	}
}