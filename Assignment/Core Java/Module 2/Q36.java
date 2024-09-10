//W.A.J. P to demonstrate try catch block, take two numbers from the user by
//Command line argument and perform the division operation and handle Arithmetic
//O/PException in thread main java. Lang. Arithmetic Exception:/ by zero


public class Q36 {
	public static void main(String[] args) {
		try {
            // Parse command line arguments
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Perform division
            try {
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: Division by zero is not allowed.");
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please provide valid integers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Please provide two command line arguments.");
        }
    }
}
		
		
