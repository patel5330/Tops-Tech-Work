//Write a Java program to compare two array lists.

import java.util.ArrayList;

public class Q62 {
	public static void main(String[] args) {
		ArrayList<String> set1=new ArrayList<String>();
		ArrayList<String> set2= new ArrayList<String>();
		
		set1.add("banana");
		set1.add("Cherry");
		set1.add("apple");
		
		
		set2.add("banana");
		set2.add("cherry");
		set2.add("apple");
		
		boolean areEqual =set1.equals(set2);
		 if (areEqual) {
	            System.out.println("The two ArrayLists are equal.");
	        } else {
	            System.out.println("The two ArrayLists are not equal.");
	        }
		
		
	}

}
