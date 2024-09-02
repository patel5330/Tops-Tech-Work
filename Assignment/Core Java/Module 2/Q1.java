//Write a Java program to Take three numbers from the user and print the greatest 
//number.

import java.util.Scanner;
public class Q1 {
	
public static void main(String[] args) {
			Scanner in = new Scanner(System.in);

			System.out.println("Enter Fist Number");
			int num1 = in.nextInt();

			System.out.println("Enter Second Number");
			int num2 = in.nextInt();

			System.out.println("Enter Three Number");
			int num3 = in.nextInt();

			if (num1 > num2)
				if (num1 > num3)
					System.out.println("The greatest: " + num1);

			if (num2 > num1)
				if (num2 > num3)
					System.out.println("The  gaeatest" + num2);

			if (num3 > num1)
				if (num3 > num2)
					System.out.println("The gaeatest" + num3);
		}
	}



