/*Create a class named 'Shape' with a method to print "This is this is shape". Then 
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
having a method to print  and "This is circular shape" 
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
object of 'Square' class*/

class Shape1 {
	void printShape1() {
		System.out.println("This is this is shape");
	}
}

class Rectangle2 extends Shape1 {
	void pintRectangle2() {
		System.out.println("This is rectangular shape");
	}
}

class Circle extends Shape1 {
	void printCircle() {
		System.out.println("This is circular shape");
	}
}

class Square extends Rectangle2 {
	void printSquare() {
		System.out.println("Square is a rectangle");
	}
}

public class Q31 {
	public static void main(String[] args) {

		Square square = new Square();
		square.printShape1();
		square.pintRectangle2();
	}
}