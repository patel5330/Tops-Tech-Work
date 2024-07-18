#include <iostream>
#include <string>
using namespace std;

class Car {
private:
    string company;
    string model;
    int year;

public:
    
    void setCompany(string c) {
        company = c;
    }

    void setModel(string m) {
        model = m;
    }

    void setYear(int y) {
        year = y;
    }

    
    string getCompany() {
        return company;
    }

    string getModel() {
        return model;
    }

    int getYear() {
        return year;
    }
};

int main() {
    Car myCar;

   
    myCar.setCompany("Toyota");
    myCar.setModel("Camry");
    myCar.setYear(2022);

    cout << "My car is a " << myCar.getYear() << " " << myCar.getCompany() << " " << myCar.getModel() << endl;

    return 0;
}
