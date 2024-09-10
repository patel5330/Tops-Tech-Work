//• Take two numbers from the user and perform the division operation and handle 
//Arithmetic Exception. O/P- Enter two numbers: 10 0

import java.util.Scanner;

public class Q33 {
	public static void main(String[] args) {
	
 Scanner scanner=new Scanner(System.in);
 
	System.out.println("Enter fist number");
	int num1=scanner.nextInt();
	
	System.out.println("enter second number");
	int num2=scanner.nextInt();
	
	try {
		int result= num1/num2;
		System.out.println("result"+result);
	}catch ( ArithmeticException e) {
	System.out.println("can not by zero");
	}
	 System.out.println("end of pog...");	
	}
	
	
}
