//Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q53 {
	public static void main(String[] args) {
		ArrayList<String> originalList = new ArrayList<String>();
		originalList.add("apple");
		originalList.add("cherry");
		originalList.add("banana");

		ArrayList<String> copieList = new ArrayList<String>(originalList.size());

		for (int i = 0; i < originalList.size(); i++) {
			copieList.add(null);

			Collections.copy(copieList, originalList);

			System.out.println("Original List" + originalList);
			System.out.println("Copie List" + copieList);

		}

	}
}
