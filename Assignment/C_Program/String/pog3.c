//Write a program in C to print individual characters of a string in reverse order
#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Hello, World!";
    int length = strlen(str);
    
    for (int i = length - 1; i >= 0; i--) {
        printf("%c ", str[i]);
    }
    
    return 0;
}
