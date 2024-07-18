#include <iostream>
using namespace std;

class Calculator {
private:
    float num1, num2;

public:
    Calculator(float n1, float n2) {
        num1 = n1;
        num2 = n2;
    }

    float add() {
        return num1 + num2;
    }

    float subtract() {
        return num1 - num2;
    }

    float divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            cout << "Error: Division by zero" << endl;
            return 0;
        }
    }

    float multiply() {
        return num1 * num2;
    }
};

int main() {
    float number1, number2;
    cout << "Enter two numbers: ";
    cin >> number1 >> number2;

    Calculator calc(number1, number2);

    cout << "Sum: " << calc.add() << endl;
    cout << "Difference: " << calc.subtract() << endl;
    cout << "Quotient: " << calc.divide() << endl;
    cout << "Product: " << calc.multiply() << endl;

    return 0;
}
