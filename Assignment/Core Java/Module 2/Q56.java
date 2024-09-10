//Write a Java program to iterate through all elements in a hash list.

import java.util.HashSet;
import java.util.Iterator;

public class Q56 {
	public static void main(String[] args) {
		HashSet<String> hastSet = new HashSet<>();
		hastSet.add("pink");
		hastSet.add("yello");
		hastSet.add("red");
		hastSet.add("blank");

		Iterator<String> iterator = hastSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

			System.out.println("iterate through all elements in a hash list");

		}

	}

}
