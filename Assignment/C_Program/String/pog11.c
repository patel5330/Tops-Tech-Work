//Write a program in C to read a sentence and replace lowercase characters with
//uppercase and vice versa
#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char sentence[1000];
    printf("Enter a sentence: ");
    fgets(sentence, sizeof(sentence), stdin);

    for (int i = 0; i < strlen(sentence); i++) {
        if (islower(sentence[i])) {
            sentence[i] = toupper(sentence[i]);
        } else if (isupper(sentence[i])) {
            sentence[i] = tolower(sentence[i]);
        }
    }

    printf("After swapping case: %s", sentence);

    return 0;
}
