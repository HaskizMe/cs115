package week1;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();
		System.out.println(num);
		num.add(11);
		System.out.println(num);
		num.remove(num.size()-1);
		System.out.println(num);
		num.removeAll(num);
		System.out.println(num.size());
	}

}
