#include <iostream>
#define PI 3.14159

class AreaCalculator {
public:
    
    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    
    float calculateArea(float base, float height) {
        return 0.5 * base * height;
    }

    
    float calculateArea(float radius) {
        return PI * radius * radius;
    }
};

int main() {
    AreaCalculator calculator;

   
    int rectArea = calculator.calculateArea(5, 10);
    std::cout << "Area of Rectangle: " << rectArea << std::endl;

    
    float triArea = calculator.calculateArea(4.0, 7.5);
    std::cout << "Area of Triangle: " << triArea << std::endl;

  
    float cirArea = calculator.calculateArea(3.0);
    std::cout << "Area of Circle: " << cirArea << std::endl;

    return 0;
}
