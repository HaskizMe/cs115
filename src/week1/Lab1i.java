package week1;
import java.util.Scanner;
import java.util.ArrayList;
public class Lab1i {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		int intNumber = 0;
		
		System.out.println("In this program, you will enter a list of numbers.");
		System.out.println();
		//start of do/while loop
		do {
		System.out.print("please enter a number or anything else to stop: ");
		String sNumber = in.nextLine();
		
		if(sNumber.isEmpty()) {
			valid = true;
			
		}
		else {
			try {
				intNumber = Integer.parseInt(sNumber);
				arrayList.add(intNumber);
			}
			catch(Exception e) {
				System.out.println("Invalid response. Please enter a number: ");
			}
		}
		}//end of do/while loop
		while (!valid);
		in.close();
		System.out.println();
		System.out.println("the total of the list of numbers is: " + sumNumbers(arrayList));
		System.out.println("the biggest number in the list is: " + maxNumber(arrayList));

	}//end of main method
	
	//sumNumbers method
	public static int sumNumbers(ArrayList<Integer> arrayList) {
		int sum = 0;
		for(int i=0; i<arrayList.size();i++) {
			sum = sum+arrayList.get(i);
		}
		return sum;
	}//end of sumNumbers method
	
	//maxNumber method
	public static int maxNumber(ArrayList<Integer> arrayList) {
		int max = arrayList.get(0);
		for(int i = 0; i<arrayList.size(); i++) {
			if(arrayList.get(i)>max) {
				max=arrayList.get(i);
			}
		}
		return max;
	}//end of maxNumber method

}//end of class