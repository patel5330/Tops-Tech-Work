//Write a Java program to get the number of elements in a hash set

import java.util.HashSet;

public class Q57 {
	public static void main(String[] args) {
		HashSet<String> hastSet = new HashSet<>();
		hastSet.add("pink");
		hastSet.add("yello");
		hastSet.add("red");
		hastSet.add("blank");
		
		
		System.out.println("hash Set"+hastSet);
		int size=hastSet.size();
		System.out.println("number of element in the haestset");
		
	}

}
