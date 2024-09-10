//Write a Java program to replace the second element of an Array List with the 
//specified element.

import java.util.ArrayList;

public class Q69 {
	public static void main(String[] args) {

		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Blue");
		colorList.add("Red");

		System.out.println(colorList);

		// replace the second element

		colorList.set(1, "White");
		System.out.println("Second Element Change:" + colorList);
	}
}
