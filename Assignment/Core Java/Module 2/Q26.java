//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
//having a method with the same name 'message' that prints "This is first subclass" 
//and "This is second subclass" respectively. Call the methods 'message' by creating 
//an object for each subclass.

abstract class Parent1 {

	abstract void message();

}

class firstsubclass extends Parent1 {
	void message() {
		System.out.println("This is first subclass");
	}

}

class secondsubclass extends Parent1 {
	void messsage() {
		System.out.println(" This is  second subclass");
	}

	@Override
	void message() {
		// TODO Auto-generated method stub
		
	}
}

public class Q26 {
	public static void main(String[] args) {

		Parent1 first = new firstsubclass();
		Parent1 second = new secondsubclass();

		first.message();
		second.message();

	}

}
