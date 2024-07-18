#include <iostream>
using namespace std;

class Student {
protected:
    string name;
    int roll_number;

public:
    void getStudentInfo() {
        cout << "Enter student name: ";
        cin >> name;
        cout << "Enter roll number: ";
        cin >> roll_number;
    }
};

class Marks {
protected:
    float marks1, marks2;

public:
    void getMarks() {
        cout << "Enter marks for subject 1: ";
        cin >> marks1;
        cout << "Enter marks for subject 2: ";
        cin >> marks2;
    }
};

class Result : public Student, public Marks {
public:
    void displayResult() {
        cout << "\nStudent Name: " << name << endl;
        cout << "Roll Number: " << roll_number << endl;
        cout << "Marks in Subject 1: " << marks1 << endl;
        cout << "Marks in Subject 2: " << marks2 << endl;
    }
};

int main() {
    Result r;
    r.getStudentInfo();
    r.getMarks();
    r.displayResult();

    return 0;
}
