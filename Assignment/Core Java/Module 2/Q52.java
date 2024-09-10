//Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q52 {
	
		public static void main(String[] args) {
			ArrayList<String> colorList= new ArrayList<String>();
			colorList.add("red");
			colorList.add("blue"); 
			colorList.add(" geen");
			colorList.add("pink");
			
			System.out.println("Original list"+colorList);
			Collections.sort(colorList);
			Collections.sort(colorList,Collections.reverseOrder());
			System.out.println(colorList);
			
	}
	

}
