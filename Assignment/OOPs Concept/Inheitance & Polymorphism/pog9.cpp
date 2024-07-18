#include <iostream>
using namespace std;

class Matrix {
private:
    int size;
    int *arr;

public:
    Matrix(int s) : size(s), arr(new int[s]) {}

   
    Matrix operator+(const Matrix &m) {
        Matrix result(size);
        for (int i = 0; i < size; i++) {
            result.arr[i] = arr[i] + m.arr[i];
        }
        return result;
    }

    void inputValues() {
        cout << "Enter " << size << " values for the matrix:" << endl;
        for (int i = 0; i < size; i++) {
            cin >> arr[i];
        }
    }

    void display() {
        cout << "Matrix values: ";
        for (int i = 0; i < size; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    int size;
    cout << "Enter the size of the matrices: ";
    cin >> size;

    Matrix matrix1(size);
    Matrix matrix2(size);

    cout << "For Matrix 1:" << endl;
    matrix1.inputValues();

    cout << "For Matrix 2:" << endl;
    matrix2.inputValues();

    Matrix result = matrix1 + matrix2;

    cout << "Result of matrix addition:" << endl;
    result.display();

    return 0;
}
