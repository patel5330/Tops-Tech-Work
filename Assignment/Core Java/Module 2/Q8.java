//Write a Java program to count the letters, spaces, numbers and other characters of 
//an input string

import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class Q8 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String");
		String str = obj.nextLine();

		int isletters = 0;
		int isspaces = 0;
		int isdigt = 0;
		int isothercharacters = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				isletters++;
			} else if (Character.isDigit(ch)) {
				isdigt++;
			} else if (Character.isSpace(ch)) {
				isspaces++;
			} else {
				isothercharacters++;

			}

		}

		System.out.println("isletters" + isletters);
		System.out.println("isspaces" + isspaces);
		System.out.println("isothercharacters" + isothercharacters);
	}

}
