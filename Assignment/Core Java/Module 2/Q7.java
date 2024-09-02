//W.A.J.P to get the character at the given index within the String. Original String = 
//Tops Technologies! The character at position 0 is T, The character at position 10 is 
//o

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a positive intager:");
		int number = input.nextInt();

		int cout = 0;
		int temp = number;

		while (temp != 0) {
			temp = temp / 10;
			cout++;
		}

		System.out.println("The nmber of digits in" + number + "is" + cout);

	}
}