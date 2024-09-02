//W.A.J.P to check whether a given string starts with the contents of another string. 
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts 
//with Red? False I3.
public class Q16 {
	public static void main(String[] args) {
		String  abc1="Red is favorite color";
		String abc2="Orange is also my favorite color";
		
		String starStr="Red";
		
		boolean starts1=abc1.startsWith(starStr);
		boolean starts2=abc2.startsWith(starStr);
		
		System.out.println( abc1  +"starts with"+  starStr  +  " ? "  + starts1);
		System.out.println(abc2  +"starts with" + starStr  +  " ? " + starts2);
		
		
	}

	}


