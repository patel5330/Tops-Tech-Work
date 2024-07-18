//Write a C Program to Print the Multiplication Table of N
//i. E.g. 5 * 1 = 5
//ii. 5 * 2 = 10
//1. .
//2. .
//ii. 5 * 10 = 50
#include <stdio.h>

int main() {
    int N, i;

    printf("Enter the number N: ");
    scanf("%d", &N);

    for (i = 1; i <= 10; i++) {
        printf("%d * %d = %d\n", N, i, N * i);
    }

    return 0;
}
