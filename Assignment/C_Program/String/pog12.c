//Write a program in C to find the number of times a given word 'is' appears in
//the given string.
#include <stdio.h>
#include <string.h>

int countOccurrences(const char *str, const char *word) {
    int count = 0;
    int wordLen = strlen(word);

    while (*str) {
        if (strstr(str, word) == str) {
            count++;
            str += wordLen;
        } else {
            str++;
        }
    }
    return count;
}

int main() {
    char inputString[] = "This is a simple string where 'is' is used multiple times.";
    char wordToFind[] = "is";

    int occurrences = countOccurrences(inputString, wordToFind);

    printf("The word '%s' appears %d times in the given string.\n", wordToFind, occurrences);

    return 0;
}
