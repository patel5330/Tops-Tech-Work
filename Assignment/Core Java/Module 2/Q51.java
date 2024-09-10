//• Write a Java program to search an element in an array list.

import java.util.ArrayList;

public class Q51 {
	public static void main(String[] args) {
		ArrayList<String> colorList= new ArrayList<String>();
		colorList.add("red");
		colorList.add("blue"); 
		colorList.add(" geen");
		colorList.add("pink");
		
		System.out.println("Original list"+colorList);
		
		
		System.out.println("index of red:"+colorList.indexOf("red"));
		System.out.println("index of red:"+colorList.indexOf("blue"));
		System.out.println("index of geen:"+colorList.indexOf("geen"));
		System.out.println("index of pink:"+colorList.indexOf("pink"));
		int index=colorList.indexOf("purple");
		
		
	}

}
