#include <iostream>
using namespace std;


inline int multiply(int a, int b) {
    return a * b;
}


inline int cubic(int num) {
    return num * num * num;
}

int main() {
    int x, y;
    cout << "Enter two numbers: ";
    cin >> x >> y;

    
    cout << "Multiplication value: " << multiply(x, y) << endl;

    int z;
    cout << "Enter a number to find its cubic value: ";
    cin >> z;

    
    cout << "Cubic value: " << cubic(z) << endl;

    return 0;
}
