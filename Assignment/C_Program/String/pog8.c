//8. Write a program in C to count the total number of vowels or consonants in a
//string.
#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char inputString[100];
    int vowels = 0, consonants = 0;
    
    printf("Enter a string: ");
    fgets(inputString, sizeof(inputString), stdin);
    
    for(int i = 0; i < strlen(inputString); i++) {
        if(isalpha(inputString[i])) {
            char currentChar = tolower(inputString[i]);
            if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
    }
    
    printf("Total number of vowels: %d\n", vowels);
    printf("Total number of consonants: %d\n", consonants);
    
    return 0;
}
