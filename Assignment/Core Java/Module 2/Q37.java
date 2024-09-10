//W.A.J.P to create the validate method that takes integer value as a parameter. If the 
//age is less than 18, then throw an Arithmetic Exception otherwise print a message 
//welcome to vote.
//O/P- Enter your age: 16
//Exception in thread main java. Lang. Arithmetic Exception: not valid



import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		try {
			validate(age);
			System.out.println("Welcome to vote.");
		} catch (ArithmeticException e) {
			System.out.println("Exception in thread main java.lang.ArithmeticException: " + e.getMessage());
		}
	}

	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("not valid");
		}
	}
}
