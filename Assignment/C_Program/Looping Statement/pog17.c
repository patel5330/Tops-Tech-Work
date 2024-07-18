//Calculate 5 numbers from user and calculate number of even and odd using
//of while loop

#include <stdio.h>

int main() {
    int i = 1, num, evenCount = 0, oddCount = 0;

    while (i <= 5) {
        printf("Enter number %d: ", i);
        scanf("%d", &num);
        
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
        
        i++;
    }

    printf("Number of even numbers: %d\n", evenCount);
    printf("Number of odd numbers: %d\n", oddCount);

    return 0;
}
