//32.Accept 2 numbers and find out its sum check it size.
#include <stdio.h>

int main() {
    int num1, num2, sum;

   
    printf("Enter the first number: ");
    scanf("%d", &num1);
    printf("Enter the second number: ");
    scanf("%d", &num2);

    
    sum = num1 + num2;

   
    printf("Sum of %d and %d is %d\n", num1, num2, sum);

    
    if (sum >= -32768 && sum <= 32767) {
        printf("Size of sum is short\n");
    } else if (sum >= -2147483648 && sum <= 2147483647) {
        printf("Size of sum is int\n");
    } else {
        printf("Size of sum is long long\n");
    }

    return 0;
}