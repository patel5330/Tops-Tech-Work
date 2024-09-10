//• Write a Java program to update specific array element by given element.

import java.security.DomainCombiner;
import java.util.ArrayList;

public class Q49 {
	

	public static void main(String[] args) {
		
	
	ArrayList<String> colorList= new ArrayList<String>();
	colorList.add("red");
	colorList.add("blue"); 
	colorList.add(" geen");
	colorList.add("pink");
	
	System.out.println("Original list"+colorList);
	
	int index=3;
	String newelement="Orange";
	colorList.set(index, newelement);
	
	System.out.println("updata of element" +colorList);
	
	

	
}
}
