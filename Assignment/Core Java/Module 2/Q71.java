//Write a Java program to compare two sets and retain elements which are same on 
//both sets.

import java.util.HashSet;
import java.util.Set;

public class Q71 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();

		set1.add("yellow");
		set1.add("red");
		set1.add("pink");
		set1.add("green");

		set2.add("pink");
		set2.add("orange");
		set2.add("purple");

		System.out.println("set1:" + set1);
		System.out.println("set2" + set2);

		set1.retainAll(set2);

		System.out.println("common element" + set1);

	}

}
