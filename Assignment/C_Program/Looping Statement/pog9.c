//Write a program make a summation of given number (E.g., 1523 Ans: -11)
#include <stdio.h>
#include <stdlib.h> 

int main() {
    int number, sum = 0, digit;

    printf("Enter a number: ");
    scanf("%d", &number);

    // Convert negative number to positive for processing
    if (number < 0) {
        number = abs(number);
    }

    while (number > 0) {
        digit = number % 10;
        sum += digit;
        number /= 10;
    }

    // If the original number was negative, the sum is made negative
    if (number < 0) {
        sum = -sum;
    }

    printf("Summation of the digits of the given number: %d\n", sum);

    return 0;
}

