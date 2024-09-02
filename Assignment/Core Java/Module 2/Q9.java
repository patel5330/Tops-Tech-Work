//• Write a Java program to print the ASCII value of a given character.

public class Q9 {
	public static void main(String[] args) {
		char ch = 'a';
		int ascii = ch;
		int castAscii = (int) ch;

		System.out.println("The ASCII value of" + ch + "is" + ascii);
		System.out.println("The ASCII value of" + ch + "is" + castAscii);

	}
}

