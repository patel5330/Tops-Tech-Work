//Write a program you have to make a summation of first and last Digit. (E.g.,
//1234 Ans: -5)


#include <stdio.h>
#include <stdlib.h>

int main() {
    int number, firstDigit, lastDigit, sum;

    printf("Enter a number: ");
    scanf("%d", &number);

    lastDigit = abs(number) % 10;  // Get the last digit

    while (number != 0) {
        firstDigit = number % 10;  // Get the first digit
        number /= 10;
    }

    sum = firstDigit + lastDigit;

    if (number < 0) {
        sum = -sum;  // If the original number was negative, make the sum negative
    }

    printf("Sum of the first and last digit of the given number: %d\n", sum);

    return 0;
}
