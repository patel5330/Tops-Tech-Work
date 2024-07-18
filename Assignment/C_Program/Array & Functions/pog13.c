//3.WAP to accept 5 numbers from user and check entered number is even or odd
//using of array
#include <stdio.h>

#define NUMBERS_COUNT 5

int main() {
    
    int numbers[NUMBERS_COUNT];
    int i;

    
    printf("Enter 5 numbers:\n");
    for (i = 0; i < NUMBERS_COUNT; i++) {
        printf("Enter number %d: ", i + 1);
        scanf("%d", &numbers[i]);
    }

   
    printf("\nChecking if each number is even or odd:\n");
    for (i = 0; i < NUMBERS_COUNT; i++) {
        if (numbers[i] % 2 == 0) {
            printf("%d is even.\n", numbers[i]);
        } else {
            printf("%d is odd.\n", numbers[i]);
        }
    }

    return 0;
}
