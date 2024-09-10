
//• W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch 
//block. try {
//try
//{//code}
//catch (Exception e)
//{//code}
//catch (Exception e)
//{//code}
import java.util.ArrayList;

public class Q35 {

	public static void main(String[] args) {

		
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");

		try {
		
			try {
				
				for (int i = 0; i < list.size(); i++) {
					System.out.println("Element at position " + i + ": " + list.get(i));
				}
			} catch (IndexOutOfBoundsException e) {
			
				System.out.println("Index out of bounds: " + e.getMessage());
			}
		} catch (Exception e) {
			

			System.out.println("An error occurred: " + e.getMessage());
		}
	}

}
