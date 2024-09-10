//• Write a Java program to get a collection view of the values contained in this map.

import java.util.Collection;
import java.util.HashMap;

public class Q73 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		map.put(4, "Date");

		Collection<String> values = map.values();

		System.out.println("Collection view of the values: " + values);
	}
}
