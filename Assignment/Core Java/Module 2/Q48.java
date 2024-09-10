//Write a Java program to retrieve an element (at a specified index) from a given array 
//list.

import java.util.ArrayList;

public class Q48 {
	public static void main(String[] args) {
		ArrayList<String> colorList= new ArrayList<String>();
		colorList.add("red");
		colorList.add("blue"); 
		colorList.add(" geen");
		colorList.add("pink");
		
		System.out.println("Original list"+colorList);
		
		int index=2;
		String element=colorList.get(index);
		
		System.out.println("element at index"+index+":"+element);
		
		
		
	}
	
}





       
