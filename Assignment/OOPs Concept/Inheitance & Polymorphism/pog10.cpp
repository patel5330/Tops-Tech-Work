#include <iostream>
#include <cstring>

class MyString {
private:
    char *str;

public:
    MyString(const char *s = "") {
        str = new char[strlen(s) + 1];
        strcpy(str, s);
    }

    MyString operator+(const MyString &s) {
        char *temp = new char[strlen(str) + strlen(s.str) + 1];
        strcpy(temp, str);
        strcat(temp, s.str);
        MyString result(temp);
        delete[] temp;
        return result;
    }

    void display() {
        std::cout << str << std::endl;
    }

    ~MyString() {
        delete[] str;
    }
};

int main() {
    MyString s1 = "Hello, ";
    MyString s2 = "world!";
    MyString s3 = s1 + s2;
    s3.display();

    return 0;
}
