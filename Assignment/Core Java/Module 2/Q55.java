//Write a Java program to append the specified element to the end of a hash set.

import java.util.HashSet;

public class Q55 {
	public static void main(String[] args) {
		HashSet<String> color= new HashSet<>();
		color.add("Blue");
		color.add("Red");
		color.add("Orange");
		color.add("Pink");
		
		System.out.println(color);
		
		//append
		String newelement="silver";
		
		color.add(newelement);
		System.out.println(color);
		
		
	}
	 
}
