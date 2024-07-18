//4. Write a program in C to count the total number of words in a string.
#include <stdio.h>
#include <string.h>

int countWords(char *str) {
    int count = 0;
    int isWord = 0;  // 0 means the previous character is a space, 1 means it's a word character.

    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] == ' ' || str[i] == '\t' || str[i] == '\n') {
            isWord = 0;
        } else if (isWord == 0) {
            isWord = 1;
            count++;
        }
    }

    return count;
}

int main() {
    char str[] = "This is a sample string to count words";
    int words = countWords(str);
    printf("Total words in the string: %d", words);
    return 0;
}
