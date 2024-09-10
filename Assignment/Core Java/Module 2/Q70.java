//Write a Java program to print all the elements of an Array List using the position of 
//the elements.

import java.util.ArrayList;

public class Q70 {
	public static void main(String[] args) {
		
		ArrayList<String>arrayList= new ArrayList<String>();
		arrayList.add("pink");
		arrayList.add("red");
		arrayList.add("black");
		arrayList.add("yello");
		
		for(int i=0 ;i< arrayList.size();i++) {
			
			System.out.println(" elements of an Array List using the position of array"+i+":"+ arrayList.get(i));
			
		}
	}
}

	


