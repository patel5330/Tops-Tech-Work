/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 'Area' and 
call all the three methods. I3. Write a program which will ask the user to enter his/her 
marks (out of 100). Define a method that will display grades according to the marks 
entered as below:
	
	Marks Grade
	1-100 A
	1-90 B
	1-80 B
	1-70 C
	1-60 D
	41-50 DD
	40 Fail
	
	*/

import java.util.Scanner;

abstract class Shape {
	abstract void RectangleArea(double length, double breadth);

	abstract void SquareArea(double side);

	abstract void CircleArea(double radius);

	class Area extends Shape {

		@Override
		void RectangleArea(double length, double breadth) {
			double area = length * breadth;
			System.out.println("area of rectangle:" + area);

		}

		@Override
		void SquareArea(double side) {
			double area = side * side;
			System.out.println(" area of square" + area);

		}

		@Override
		void CircleArea(double radius) {
			double area = Math.PI * radius * radius;
			System.out.println("area of circle" + area);
		}

		public void displayGrades(int marks) {
			if(marks>=1 && marks<=100) {
				System.out.println("Grade A");
			}else if(marks>=91 && marks<100) {
				System.out.println("Grade B");
			}else if(marks>=81 &&  marks<90) {
					System.out.println("Grade B");
			}else if (marks>=71 && marks<80) {
				System.out.println("Grade C");
					
				
			}else if(marks>=61 && marks<70) {
				System.out.println("Grade D");
			}else if(marks>=41 && marks<60) {
				System.out.println("Grade DD");
			}else if(marks==40) {
				System.out.println("Grade:Fail");
			}else {
				System.out.println("invalid marks");
			}
		}

	}


public class Q30 {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		Area areaCalculator= new  Area();
		
		
		System.out.println("Enter length of rectangle");
		double lendth=scanner.nextDouble();
		
		System.out.println("Enter breadth of rectangle:");
		double breadth=scanner.nextDouble();
		areaCalculator.RectangleArea(lendth, breadth);
		
		System.out.println("Enter side of square");
		double side=scanner.nextDouble();
		areaCalculator.SquareArea(side);
		
		
		System.out.println("Enter radius of circle");
		double radius=scanner.nextDouble();
		areaCalculator.CircleArea(radius);
		
		
		System.out.println("Enter your marks(out of 100)");
		int marks=scanner.nextInt();
		areaCalculator.displayGrades(marks);
		
		scanner.close();
		
		
	}

	}

}
