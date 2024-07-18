#include <iostream>
#include <string>
using namespace std;

class Person {
private:
    string name;
    int age;
    string country;

public:
    void setName(string newName) {
        name = newName;
    }

    string getName() {
        return name;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    int getAge() {
        return age;
    }

    void setCountry(string newCountry) {
        country = newCountry;
    }

    string getCountry() {
        return country;
    }
};

int main() {
    Person person1;

    person1.setName("John");
    person1.setAge(25);
    person1.setCountry("USA");

    cout << "Name: " << person1.getName() << endl;
    cout << "Age: " << person1.getAge() << endl;
    cout << "Country: " << person1.getCountry() << endl;

    return 0;
}
