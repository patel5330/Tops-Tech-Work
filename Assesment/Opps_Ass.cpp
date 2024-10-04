#include <iostream>
#include <vector>
using namespace std;

class Lecturer {
 
    string name;
    string subject;
    string course;
    int num_lectures;

public:
     
    Lecturer() : name(""), subject(""), course(""), num_lectures(0) {}

  
    void addDetails(string n, string s, string c, int num) {
        name = n;
        subject = s;
        course = c;
        num_lectures = num;
    }

   
    void display() {
        cout << "Lecturer Name: " << name << endl;
        cout << "Subject: " << subject << endl;
        cout << "Course: " << course << endl;
        cout << "Number of Lectures: " << num_lectures << endl;
        cout << "----------------------------" << endl;
    }
};

int main() {
    vector<Lecturer> lecturers;  

    for (int i = 0; i < 5; i++) {
        string name, subject, course;
        int num_lectures;

        cout << "Enter details for Lecturer " << i + 1 << ":\n";
        cout << "Enter Lecturer's Name: ";
        cin >> ws;  // to consume any leftover newline characters
        getline(cin, name);
        cout << "Enter Subject Name: ";
        getline(cin, subject);
        cout << "Enter Course Name: ";
        getline(cin, course);
        cout << "Enter Number of Lectures: ";
        cin >> num_lectures;

        Lecturer lecturer;
        lecturer.addDetails(name, subject, course, num_lectures);
        lecturers.push_back(lecturer);  // Add lecturer to the list
    }

    // Displaying details of all lecturers
    cout << "\nLecture Details of All Lecturers:\n";
    for (int i = 0; i < lecturers.size(); i++) {
        lecturers[i].display();
    }

    return 0;
}
