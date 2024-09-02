//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 
//5 units by creating a class named 'Triangle' without any parameter in its constructor.
class Triangle {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double sidea, double sideb, double sidec) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	void printArea() {
		double area = side1 + side2 + side3;
		System.out.println("Area  " + area);
	}

	void printParmeterTriangle() {
		Double perimter = (side1 + side2 + side3) / 2.0;
		System.out.println("Perimeter of the teingle" + perimter);

	}

}

public class Q24 {
	public static void main(String[] args) {
		Triangle a1 = new Triangle(2, 3, 4);

		
		
		
		
		
		
		
		
		a1.printArea();
		a1.printParmeterTriangle();

	}

}
