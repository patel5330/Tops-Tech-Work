#include <iostream>

class MathOperations {
public:
    int calculate(int a, int b) {
        return a + b;
    }

    float calculate(float a, float b) {
        return a + b;
    }

    int calculate(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                std::cout << "Invalid operation" << std::endl;
                return 0;
        }
    }
};

int main() {
    MathOperations math;

    std::cout << "Addition (int): " << math.calculate(5, 3) << std::endl;
    std::cout << "Addition (float): " << math.calculate(5.5f, 3.3f) << std::endl;
    std::cout << "Operation (+): " << math.calculate(5, 3, '+') << std::endl;
    std::cout << "Operation (-): " << math.calculate(5, 3, '-') << std::endl;
    std::cout << "Operation (*): " << math.calculate(5, 3, '*') << std::endl;
    std::cout << "Operation (/): " << math.calculate(10, 2, '/') << std::endl;

    return 0;
}
