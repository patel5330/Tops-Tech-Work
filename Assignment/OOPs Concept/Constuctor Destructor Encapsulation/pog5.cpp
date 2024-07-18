#include <iostream>
using namespace std;

class Triangle {
private:
    double side1, side2, side3;

public:
    Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    string getType() {
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
};

int main() {
    double s1, s2, s3;
    cout << "Enter the lengths of the three sides of the triangle: ";
    cin >> s1 >> s2 >> s3;

    Triangle triangle(s1, s2, s3);
    cout << "The triangle is " << triangle.getType() << "." << endl;

    return 0;
}
