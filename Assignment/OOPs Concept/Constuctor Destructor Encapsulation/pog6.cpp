
#include <iostream>
#include <string>
using namespace std;

class Employee {
private:
    string name;
    int employeeID;
    double salary;

public:
    
    Employee(string empName, int empID, double empSalary) : name(empName), employeeID(empID), salary(empSalary) {}


    void setSalary(double performanceScore) {
        if (performanceScore > 0.8) {
            salary *= 1.1;  
        } else if (performanceScore > 0.6) {
            salary *= 1.05;  
        } else {
            
        }
    }

    
    void displayDetails() {
        cout << "Name: " << name << endl;
        cout << "Employee ID: " << employeeID << endl;
        cout << "Salary: $" << salary << endl;
    }
};

int main() {
    
    Employee emp1("John Doe", 101, 50000.0);

    
    cout << "Initial Employee Details:" << endl;
    emp1.displayDetails();

    
    emp1.setSalary(0.75);  
    cout << "\nEmployee Details after Performance Appraisal:" << endl;
    emp1.displayDetails();

    return 0;
}
