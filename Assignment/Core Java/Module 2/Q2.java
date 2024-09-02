//Write a Java program that takes the user to provide a single character from the 
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
//message
import java.util.Scanner;

public class Q2{
	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any Character");
		Scanner r = new Scanner(System.in);
		ch = r.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowel ");
		} else {
			System.out.println("Consonant");
		}

	}

}
