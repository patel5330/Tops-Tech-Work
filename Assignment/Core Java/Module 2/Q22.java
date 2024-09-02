//Create a class named 'Member' having the following members:
//1. Data members
//2. Name
//3. Age
//4. Phone number
//5. Address
//6. Salary
//It also has a method named 'printSalary' which prints the salary of the members.
   class Member{
	   String  name;
	   int Age;
	   String  phonenumber;
	   String Address;
	   int Salary;
	   
	   public void printsalary() {
		   System.out.println("Salary:"+ Salary);
	   }
	   
	    void showinfo() {
		   System.out.println("name:  "+name);
		   System.out.println("age:   "+Age);
		   System.out.println("phonenumber  "+phonenumber);
		   System.out.println("Address"  +Address);
		   System.out.println("Salary:   " +Salary);
		  
	   }
	      
	    public class Q22 {
       public static void main(String[] args) {
    	   Member s1= new Member();
    	   s1.name= "akshay";
    	   s1.Age=22;
    	   s1.phonenumber=9974434195;
    	   s1.Address="Hansot";
    	   s1.Salary=16000;
    	   Member.printsalary;
    	   
       }
	
}
	

}
