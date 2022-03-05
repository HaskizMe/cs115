package week1;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {

		ArrayList<String> num = new ArrayList<String>();
		num.add("a");
		num.add("b");
		num.add("c");
		
		for(int i = 0;i<num.size();i++) {
			for(int j = 1;j<=50;j++) {
				System.out.println(num.get(i)+j);
			}
		}

	}

}
