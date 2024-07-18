//4.Write a program in C to combine two strings manually
#include <stdio.h>
#include <string.h>

int main() {
    char firstString[50], secondString[50];

    printf("Enter the first string: ");
    scanf("%s", firstString);

    printf("Enter the second string: ");
    scanf("%s", secondString);

    int length1 = strlen(firstString);
    int length2 = strlen(secondString);

    for (int i = 0; i < length2; i++) {
        firstString[length1 + i] = secondString[i];
    }

    firstString[length1 + length2] = '\0';

    printf("Combined string: %s\n", firstString);

    return 0;
}
