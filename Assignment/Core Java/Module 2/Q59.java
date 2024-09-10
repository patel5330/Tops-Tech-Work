//Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.HashMap;

public class Q59 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Pink");
		hashMap.put(2, "Red");
		hashMap.put(3, "blank");
		hashMap.put(4, "yello");

		int size = hashMap.size();

		System.out.println("Sixe of hashMap" + size);
	}

}
