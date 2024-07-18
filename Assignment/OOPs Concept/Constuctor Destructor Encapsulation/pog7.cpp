#include <iostream>
using namespace std;

class Date {
private:
    int day, month, year;

public:
    void setDay(int d) {
        day = d;
    }

    int getDay() {
        return day;
    }

    void setMonth(int m) {
        month = m;
    }

    int getMonth() {
        return month;
    }

    void setYear(int y) {
        year = y;
    }

    int getYear() {
        return year;
    }

    bool isValidDate() {
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (day > 29) {
                    return false;
                }
            } else {
                if (day > 28) {
                    return false;
                }
            }
        }
        return true;
    }
};

int main() {
    Date date;
    date.setDay(9);
    date.setMonth(5);
    date.setYear(2024);

    cout << "Day: " << date.getDay() << endl;
    cout << "Month: " << date.getMonth() << endl;
    cout << "Year: " << date.getYear() << endl;

    if (date.isValidDate()) {
        cout << "The date is valid." << endl;
    } else {
        cout << "The date is invalid." << endl;
    }

    return 0;
}
