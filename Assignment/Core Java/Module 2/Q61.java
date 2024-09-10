//Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.List;

public class Q61 {
	public static void main(String[] args) {
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("red");
		colorList.add("blue");
		colorList.add(" geen");
		colorList.add("pink");

		System.out.println("Original list" + colorList);
		 List<String> subList =colorList.subList(1, 4);
		 System.out.println("Extracted portion: " + subList);
		
	}

}
