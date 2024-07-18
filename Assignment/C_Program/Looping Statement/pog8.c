//Write a program to find out the max from given number (E.g., No: -1562
//Max number is 6
#include <stdio.h>

int main() {
    int number, maxDigit = 0, digit;

    printf("Enter a number: ");
    scanf("%d", &number);

    // Convert negative number to positive for processing
    if (number < 0) {
        number = -number;
    }

    while (number > 0) {
        digit = number % 10;
        if (digit > maxDigit) {
            maxDigit = digit;
        }
        number /= 10;
    }

    printf("Max digit in the given number: %d\n", maxDigit);

    return 0;
}
