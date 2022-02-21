package week2;

public class DessertShop {

	public static void main(String[] args) {
		Order o1 = new Order();

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
		
		for(DessertItem i : o1.getOrderList()) {
			System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", i.getName(), i.calculateCost(), i.calculateTax());
		}

		System.out.println("----------------------------------------------");
		System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", "Order Subtotals:", o1.orderCost(),o1.orderTax());
		System.out.printf("%-25s$%-8.2f\n", "Order total:", o1.orderCost()+o1.orderTax());
		System.out.println("Total number of items in order: " + o1.itemCount());

	}

}
