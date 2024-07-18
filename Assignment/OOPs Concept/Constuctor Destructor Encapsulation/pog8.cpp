#include <iostream>
#include <string>
using namespace std;

class Address {
public:
    string street;
    string city;
    string state;
    string zipCode;
};

class Student {
private:
    string name;
    string className;
    int rollNumber;
    int marks;
    char grade;
    Address address;

public:
    void setStudentInfo(string n, string cn, int rn, int m, char g, string street, string city, string state, string zip) {
        name = n;
        className = cn;
        rollNumber = rn;
        marks = m;
        grade = g;
        address.street = street;
        address.city = city;
        address.state = state;
        address.zipCode = zip;
    }

    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    void displayStudentInfo() {
        cout << "Name: " << name << endl;
        cout << "Class: " << className << endl;
        cout << "Roll Number: " << rollNumber << endl;
        cout << "Marks: " << marks << endl;
        cout << "Grade: " << grade << endl;
        cout << "Address: " << address.street << ", " << address.city << ", " << address.state << " " << address.zipCode << endl;
    }
};

int main() {
    Student student1;
    student1.setStudentInfo("John Doe", "12th Grade", 101, 85, student1.calculateGrade(), "123 Main St", "Anytown", "CA", "12345");
    student1.displayStudentInfo();

    return 0;
}
