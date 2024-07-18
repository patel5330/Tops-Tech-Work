//Write a program in C to count the total number of alphabets, digits and special
//characters in a string.
#include <stdio.h>
#include <ctype.h>

int main() {
    char str[100];
    int alphabets, digits, special;
    alphabets = digits = special = 0;

    printf("Enter a string: ");
    gets(str);

    for (int i = 0; str[i] != '\0'; i++) {
        if (isalpha(str[i])) {
            alphabets++;
        } else if (isdigit(str[i])) {
            digits++;
        } else {
            special++;
        }
    }

    printf("\n**Total Alphabets: %d**", alphabets);
    printf("\n**Total Digits: %d**", digits);
    printf("\n**Total Special Characters: %d**", special);

    return 0;
}
