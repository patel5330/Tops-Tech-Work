//Accept 5 numbers from user and perform sum of array
#include <stdio.h>

int main() {
    int numbers[5];
    int i, sum = 0;

    // Input 5 numbers
    printf("Enter 5 numbers:\n");
    for (i = 0; i < 5; i++) {
        scanf("%d", &numbers[i]);
    }

    // Calculate the sum of the array
    for (i = 0; i < 5; i++) {
        sum += numbers[i];
    }

    // Print the sum
    printf("Sum of the numbers in the array: %d\n", sum);

    return 0;
}
