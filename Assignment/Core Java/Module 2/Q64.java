//Write a Java program to join two array lists
import java.util.ArrayList;
public class Q64 {



	    public static void main(String[] args) {
	        // Create the first ArrayList
	        ArrayList<String> list1 = new ArrayList<>();
	        list1.add("Apple");
	        list1.add("Banana");
	        list1.add("Cherry");

	        // Create the second ArrayList
	        ArrayList<String> list2 = new ArrayList<>();
	        list2.add("Date");
	        list2.add("Elderberry");
	        list2.add("Fig");

	        // Print the original lists
	        System.out.println("List 1: " + list1);
	        System.out.println("List 2: " + list2);

	        // Join the two ArrayLists
	        ArrayList<String> joinedList = new ArrayList<>(list1);
	        joinedList.addAll(list2);

	        // Print the joined list
	        System.out.println("Joined List: " + joinedList);
	    }
	}



