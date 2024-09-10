//Write a Java program to associate the specified value with the specified key in a
//Hash Map.

import java.util.HashMap;

public class Q58 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		hashmap.put(1, "Ajay");
		hashmap.put(2, "Hiral");
		hashmap.put(3, "Yash");
		hashmap.put(4, "Axay");
		
	
		System.out.println("hashmap"+ hashmap);
		
		hashmap.put(5, "ankit");
		System.out.println("updata hash set"+hashmap);
	}
	

}
