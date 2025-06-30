package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static double add(double a, double b) {
		return a + b;
	}

	public static double subtract(double a, double b) {
		return a - b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		if (b == 0) {
			System.out.println("Error: Cannot divide by zero.");
			return 0;
		}
		return a / b;
	}

	public static void displayMenu() {
		System.out.println("\n======= CALCULATOR MENU =======");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		System.out.println("5. Exit");
		System.out.println("================================");
		System.out.print("Enter your choice (1-5): ");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			displayMenu(); 
			choice = scanner.nextInt(); 

			if (choice >= 1 && choice <= 4) {
				System.out.print("Enter first number: ");
				double num1 = scanner.nextDouble();
				System.out.print("Enter second number: ");
				double num2 = scanner.nextDouble();
				double result = 0;

				
				switch (choice) {
				case 1:
					result = add(num1, num2);
					System.out.println("Result: " + result);
					break;
				case 2:
					result = subtract(num1, num2);
					System.out.println("Result: " + result);
					break;
				case 3:
					result = multiply(num1, num2);
					System.out.println("Result: " + result);
					break;
				case 4:
					result = divide(num1, num2);
					System.out.println("Result: " + result);
					break;
				}
			} else if (choice == 5) {
				System.out.println("Exiting the calculator. Thank you!");
			} else {
				System.out.println("Invalid choice! Please select a valid option (1-5).");
			}

		} while (choice != 5);

		scanner.close();
	}
}
