//W.A.J.P to create a class Student with attributes roll no, name, age and course. 
//Initialize values through parameterized constructor. If age of student is not in 
//between 15 and 21 then generate user defined exception 
//"AgeNotWithinRangeException". If name contains numbers or special symbols 
//raise exception "NameNotValidException". Define the two exception classes.
class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException(String message) {
		super(message);
	}
}

class NameNotValidException extends Exception {
	public NameNotValidException(String message) {
		super(message);
	}
}

class Student {
	int rollNo;
	String name;
	int age;
	String course;

	public Student(int rollNo, String name, int age, String course)
			throws AgeNotWithinRangeException, NameNotValidException {
		if (age < 15 || age > 21) {
			throw new AgeNotWithinRangeException("Age is not between 15 and 21. Please re-enter the age.");
		}
		if (!name.matches("[a-zA-Z]+")) {
			throw new NameNotValidException("Name is not valid. Please re-enter the name.");
		}
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public void display() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Course: " + course);
	}
}

public class Q39 {
	public static void main(String[] args) {

		try {
			Student student = new Student(1, "JohnDoe", 20, "Computer Science");
			student.display();
		} catch (AgeNotWithinRangeException | NameNotValidException e) {
			System.out.println("Exception: " + e.getMessage());
		}

		try {
			Student student = new Student(2, "Jane123", 22, "Mathematics");
			student.display();
		} catch (AgeNotWithinRangeException | NameNotValidException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
