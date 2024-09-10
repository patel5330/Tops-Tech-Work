//W.A.J. P to demonstrate try catch block,

public class Q32 {
	public static void main(String[] args) {
		try {

			int divideByZero = 5 / 0;
			System.out.println("this not printing");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught " + e.getMessage());
		}
		System.out.println("Rest set of the code");

	}

}
