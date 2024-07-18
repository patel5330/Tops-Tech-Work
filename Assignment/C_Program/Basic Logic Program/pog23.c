//23.WAP to calculate swap 2 numbers with using of multiplication and division.
#include <stdio.h>

int main() {
    double num1, num2;

   
    printf("Enter the first number: ");
    scanf("%lf", &num1);
    printf("Enter the second number: ");
    scanf("%lf", &num2);

   
    num1 = num1 * num2;
    num2 = num1 / num2;
    num1 = num1 / num2;

    
    printf("After swapping:\n");
    printf("First number: %.2lf\n", num1);
    printf("Second number: %.2lf\n", num2);

    return 0;
}