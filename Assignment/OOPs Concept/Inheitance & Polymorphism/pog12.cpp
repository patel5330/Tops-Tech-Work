#include <iostream>
using namespace std;

class NumberSwapper {
private:
    int num1, num2;

public:
    NumberSwapper(int a, int b) : num1(a), num2(b) {}

    friend void swapNumbers(NumberSwapper &ns);
};

void swapNumbers(NumberSwapper &ns) {
    ns.num1 = ns.num1 + ns.num2;
    ns.num2 = ns.num1 - ns.num2;
    ns.num1 = ns.num1 - ns.num2;
}

int main() {
    int x = 5, y = 10;
    NumberSwapper ns(x, y);

    cout << "Before swapping: x = " << x << ", y = " << y << endl;

    swapNumbers(ns);

    cout << "After swapping: x = " << x << ", y = " << y << endl;

    return 0;
}
