//Write a Java program to increase the size of an array list.

import java.util.ArrayList;

public class Q68 {
	public static void main(String[] args) {
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Blue");
		colorList.add("Red");

		System.out.println(colorList);

		System.out.println("length of colorList : " + colorList.size());

	}

}
	
	


