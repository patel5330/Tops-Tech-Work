//
//Write a program in C to find the largest and smallest words in a string.

#include <stdio.h>
#include <string.h>

int main() {
    char str[100], small[20], large[20], word[20];
    int i, j, len, len1, len2;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

   
    sscanf(str, "%s", word);
    strcpy(small, word);
    strcpy(large, word);

    
    len = strlen(str);
    for (i = 0; i < len; i++) {
        if (str[i] == ' ') {
            word[j] = '\0';
            j = 0;
            len1 = strlen(word);
            if (len1 < strlen(small))
                strcpy(small, word);
            if (len1 > strlen(large))
                strcpy(large, word);
        } else {
            word[j++] = str[i];
        }
    }

   
    word[j] = '\0';
    len2 = strlen(word);
    if (len2 < strlen(small))
        strcpy(small, word);
    if (len2 > strlen(large))
        strcpy(large, word);

    printf("Smallest word: %s\n", small);
    printf("Largest word: %s\n", large);

    return 0;
}
