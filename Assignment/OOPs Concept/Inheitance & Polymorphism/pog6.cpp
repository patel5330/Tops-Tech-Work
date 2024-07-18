#include <iostream>
using namespace std;

// Base class
class Base {
private:
    int privateVar = 10;
protected:
    int protectedVar = 20;
public:
    int publicVar = 30;
};


class Derived : public Base {
public:
    void accessBaseMembers() {
        cout << "Protected member of base class: " << protectedVar << endl;
        cout << "Public member of base class: " << publicVar << endl;
    }
};

int main() {
    Derived d;
    d.accessBaseMembers();

    
    return 0;
}
