#include <iostream>
using namespace std;

class MaxNumber {
private:
    int num1, num2;

public:
    MaxNumber(int a, int b) {
        num1 = a;
        num2 = b;
    }

    friend void findMax(MaxNumber obj);
};

void findMax(MaxNumber obj) {
    if (obj.num1 > obj.num2) {
        cout << "Max number is: " << obj.num1 << endl;
    } else {
        cout << "Max number is: " << obj.num2 << endl;
    }
}

int main() {
    MaxNumber numbers(10, 20);
    findMax(numbers);
    return 0;
}
