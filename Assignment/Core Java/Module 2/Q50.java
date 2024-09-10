//Write a Java program to remove the third element from an array list.

import java.util.ArrayList;

public class Q50 {
	public static void main(String[] args) {
		
		
		ArrayList<String> colorList= new ArrayList<String>();
		colorList.add("red");
		colorList.add("blue"); 
		colorList.add(" geen");
		colorList.add("pink");
		
		System.out.println("Original list"+colorList);
		
		colorList.remove("geen");
		colorList.remove(2);
	}	

}
