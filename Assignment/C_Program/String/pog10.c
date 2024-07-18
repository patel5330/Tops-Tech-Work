//0.Write a program in C to extract a substring from a given string
#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "This is the main string";
    int start = 5; 
    int length = 4; 
    char substr[50];

   
    strncpy(substr, &str[start], length);
    substr[length] = '\0'; 
    
    printf("The extracted substring is: %s\n", substr);

    return 0;
}
