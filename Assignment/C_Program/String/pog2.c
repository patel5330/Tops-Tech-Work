//Write a program in C to separate individual characters from a string.
#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    int i, length;

    printf("Enter a string: ");
    gets(str);

    length = strlen(str);

    printf("Individual characters from the string: \n");
    for(i = 0; i < length; i++) {
        printf("%c\n", str[i]);
    }

    return 0;
}
