//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
//having a method with the same name 'message' that prints "This is first subclass" 
//and "This is second subclass" respectively. Call the methods 'message' by creating 
//an object for each subclass.

abstract class Parent {

	abstract void message();

}

class firstsubclass extends Parent {
	void message() {
		System.out.println("This is first subclass");
	}

}

class secondsubclass extends Parent {
	void messsage() {
		System.out.println(" This is  second subclass");
	}
}

public class Q26 {
	public static void main(String[] args) {

		Parent first = new firstsubclass();
		Parent second = new secondsubclass();

		first.message();
		second.message();

	}

}
