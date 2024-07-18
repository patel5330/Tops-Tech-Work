#include <stdio.h>
#include <string.h>

int main() {
    char str[100], reverse_str[100];
    int i, j, flag = 1;

    printf("Enter a string: ");
    gets(str);

    j = 0;
    for (i = strlen(str) - 1; i >= 0; i--) {
        reverse_str[j++] = str[i];
    }
    reverse_str[j] = '\0';

    for (i = 0; i < strlen(str); i++) {
        if (str[i] != reverse_str[i]) {
            flag = 0;
            break;
        }
    }

    if (flag == 1) {
        printf("The string is a palindrome.");
    } else {
        printf("The string is not a palindrome.");
    }

    return 0;
}
