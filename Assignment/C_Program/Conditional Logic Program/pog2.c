//2. Write a C program to read the value of an integer m and display the value of
//n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0
//3. WAP to check if the given year is a leap year or not in c
#include <stdio.h>

int main() {
    int m, n;

    printf("Enter the value of m: ");
    scanf("%d", &m);

    if (m > 0) {
        n = 1;
    } else if (m == 0) {
        n = 0;
    } else {
        n = -1;
    }

    printf("The value of n is: %d\n", n);

    return 0;
}

//C Program to Check if a Given Year is a Leap Year
#include <stdio.h>

int main() {
    int year;
    
    printf("Enter a year: ");
    scanf("%d", &year);
    
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        printf("%d is a leap year\n", year);
    } else {
        printf("%d is not a leap year\n", year);
    }
    
    return 0;
}
