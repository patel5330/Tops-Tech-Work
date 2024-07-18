//Write a program in C to find the maximum number of characters in a string.
#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    int maxLength = 0;

    printf("Enter a string: ");
    scanf("%[^\n]", str);

    maxLength = strlen(str);

    printf("The maximum number of characters in the string is: %d\n", maxLength);

    return 0;
}
