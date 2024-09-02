//• Write a program in Java to display the pattern like right angle triangle with a number. 
//1
//12
//123
//1234
//12345
class series1 {
}

public class Q5 {
	public static void main(String[] args) {
		int rows=5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
