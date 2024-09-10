//Write a Java program to reverse elements in an array list.

import java.util.ArrayList;

public class Q60 {
	public static void main(String[] args) {
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("red");
		colorList.add("blue");
		colorList.add(" geen");
		colorList.add("pink");

		System.out.println("Original list" + colorList);
		System.out.println("reverse : " + colorList.reversed());

	}
}
