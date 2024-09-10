//Exception in thread main java.lang.ArithmeticException:/ by zero
//• W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
//exception and another one is to handle
public class Q34 {
	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int   result=a/b;
				
		}catch (ArithmeticException  e) {
			System.out.println("ArithmeticException : can not by zero");
			
		} catch (Exception e2) {
			
		
		System.out.println("Exception "+ e2.getMessage());
		
		}
		
		
	}

}





































