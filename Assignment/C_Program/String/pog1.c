//Write a program in C to find the length of a string without using library
//functions
#include <stdio.h>

int main() {
    char str[] = "Hello, World!"; 
    int length = 0;

    while (str[length] != '\0') {
        length++;
    }

    printf("The length of the string is: %d", length);

    return 0;
}
