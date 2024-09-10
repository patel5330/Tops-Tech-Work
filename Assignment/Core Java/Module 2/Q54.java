//Write a Java program to shuffle elements in an array list

import java.util.ArrayList;
import java.util.Collections;

public class Q54 {
	public static void main(String[] args) {
		ArrayList<String> colorList= new ArrayList<String>();
		colorList.add("red");
		colorList.add("blue"); 
		colorList.add(" geen");
		colorList.add("pink");
		
		System.out.println("Original list"+colorList);
		
		Collections.shuffle(colorList);
		System.out.println(colorList);
	}

}
