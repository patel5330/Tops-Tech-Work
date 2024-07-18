//Write a program in C to remove characters from a string except alphabets.
#include <stdio.h>
#include <string.h>
#include <ctype.h>

void removeNonAlphabetic(char *str) {
    int i, j;
    for (i = 0, j = 0; str[i] != '\0'; i++) {
        if (isalpha(str[i])) {
            str[j++] = str[i];
        }
    }
    str[j] = '\0';
}

int main() {
    char inputString[100];
    printf("Enter a string: ");
    fgets(inputString, sizeof(inputString), stdin);
    removeNonAlphabetic(inputString);
    printf("String after removing non-alphabetic characters: %s", inputString);
    return 0;
}
