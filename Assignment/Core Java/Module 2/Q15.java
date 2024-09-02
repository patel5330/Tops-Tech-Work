
//• W.A.J.P to compare a given string to the specified character sequence. Comparing 
//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
public class Q15 {
	public static void main(String[] args) {
		String obj1 = "topsint.com";
		String obj2 = "opsint.com";
		CharSequence ab = "topsint.com";

		System.out.println("Comparing" + obj1 + "and" + ab + ":" + obj1.contentEquals(ab));
		System.out.println("Comparing" + obj2 + "and" + ab + ":" + obj2.contentEquals(ab));
	}

}
