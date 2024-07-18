//4. WAP to print table up to given numbers
#include <stdio.h>

int main() {
    int number, range;

    printf("Enter the number to print the table for: ");
    scanf("%d", &number);
    printf("Enter the range up to which the multiplication table should be displayed: ");
    scanf("%d", &range);

    printf("Multiplication Table of %d:\n", number);
    for (int i = 1; i <= range; i++) {
        printf("%d * %d = %d\n", number, i, number * i);
    }

    return 0;
}



