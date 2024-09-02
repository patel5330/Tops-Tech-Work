//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 
//and by both.

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {

		System.out.print("\nDivided by 3");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0)
				System.out.println(i+",");

		}
		System.out.println("Divided by 3 and 5");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && 5 == 0)
				System.out.println(i + ",");
		}
		System.out.println("\n");

	}

}
