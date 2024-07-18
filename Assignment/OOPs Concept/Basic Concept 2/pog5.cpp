#include <iostream>
using namespace std;

class Rectangle {
private:
    float length;
    float width;

public:
    void setDimensions(float len, float wid) {
        length = len;
        width = wid;
    }

    float calculateArea() {
        return length * width;
    }

    float calculatePerimeter() {
        return 2 * (length + width);
    }
};

int main() {
    Rectangle rect;
    rect.setDimensions(5.0, 3.0);

    cout << "Area of the rectangle: " << rect.calculateArea() << endl;
    cout << "Perimeter of the rectangle: " << rect.calculatePerimeter() << endl;

    return 0;
}
