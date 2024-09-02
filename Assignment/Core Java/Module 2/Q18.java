
//W.A.J.P to find the second most frequent character in a given string. The given string 
//is: successes The second most frequent char in the string is: c
import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = ab.next();

		char[] ch = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
					break;

				}
			}

		}
	}

}
