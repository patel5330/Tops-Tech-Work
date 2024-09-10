//Write a Java program of swap two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Q63 {
	public static void main(String[] args) {
		ArrayList<String> colorList= new ArrayList<String>();
		colorList.add("red");
		colorList.add("blue"); 
		colorList.add(" geen");
		colorList.add("pink");
		
		System.out.println("Original list"+colorList);
		Collections.swap(colorList, 1, 3);
		
		System.out.println("list after swap element at index 1 and 3"+colorList);
		
	}

}
