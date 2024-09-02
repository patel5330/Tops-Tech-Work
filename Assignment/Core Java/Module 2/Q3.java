//Write a Java program that takes a year from user and print whether that year is a leap 
//year or not. B19. Write a program in Java to display the first 10 natural numbers 
//using while loop.
public class Q3 {
	public static void main(String[] args) {
		int year = 2000;
		if (year % 400 == 0) {
			System.out.println("is a Leap year" + year);

		} else if (year % 100 == 0) {
			System.out.println("is  not Leap year" + year);
		} else if (year % 4 == 0) {
			System.out.println("is a Laap year" + year);

		} else {
			System.out.println("is not a Leap year" + year);
		}

	}

}

