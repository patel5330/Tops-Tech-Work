//5. WAP to print factorial of given number
#include <stdio.h>

int main() {
    int num, i;
    unsigned long long fact = 1;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (num < 0) {
        printf("Error! Factorial of a negative number doesn't exist.");
    } else {
        for (i = 1; i <= num; ++i) {
            fact *= i;
        }
        printf("Factorial of %d = %llu\n", num, fact);
    }

    return 0;
}
