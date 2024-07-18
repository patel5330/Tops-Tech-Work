#include <stdio.h>

int main() {
    int num, i = 1;
    long long factorial = 1;

    printf("Enter a positive integer: ");
    scanf("%d", &num);

    
    if (num < 0) {
        printf("Error! Factorial of a negative number doesn't exist.");
    } else {
        while (i <= num) {
            factorial *= i; 
            i++;  
        }
        printf("Factorial of %d = %lld", num, factorial);
    }

    return 0;
}
