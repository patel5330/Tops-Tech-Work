//We have to calculate the percentage of marks obtained in three subjects (each out of 
//100) by student A and in four subjects (each out of 100) by student B. Create an 
//abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
//other classes 'A' and 'B' each having a method with the same name which returns the 
//percentage of the students. The constructor of student A takes the marks in three 
//subjects as its parameters and the marks in foursubjects asits parameters for student
//B. Create an object for each of the two classes and print the percentage of marks for 
//both the students.

import javax.security.auth.PrivateCredentialPermission;

abstract class Marks {

	abstract double getPercentage();
}

class A extends Marks {
	private double subject1, subject2, subject3;

	public A(double subject1, double subject2, double subject3) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	@Override
	double getPercentage() {
		int total = (int) (subject1 + subject2 + subject3);

		return (total / 3.0);
	}
}

class B extends Marks {

	private double subject1, subject2, subject3, subject4;

	public B(double subject1, double subject2, double subject3, double subject4) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
	}

@Override
double getPercentage() {
	int total=subject1+subject2+subject3,+subject'

	
	return total/4.0;
}

	public class Q28 {

	public static void main(String[] args) {
		A Student  A= new A(55, 22, 88);
		B Student   B = new B(75,80,42,45);
		
		
		System.out.println("parcentage of student a:"+StudentA.gel);
		
		
		
	}

}
