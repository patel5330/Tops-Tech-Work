//Create a class with a method that prints "This is a parent class" and its subclass with 
//another method that prints "This is child class". Now, create an object for each of 
//the class and call 1 - method of parent class by object of parent class 2 - method of 
//child class by object of child class 3 - method of parent class by object of child class.

class Parent{
	
	void printparentMessage(){
		System.out.println("This is a parent class");
		}
	}

class Child extends Parent{
	
	
	void printprintChild() {
		System.out.println("This is child class");
	}
	
}


public class Q21 {
	public static void main(String[] args) {
		Parent abc=new Child();
		
		
		
		
		
		
	}
}
	
	


