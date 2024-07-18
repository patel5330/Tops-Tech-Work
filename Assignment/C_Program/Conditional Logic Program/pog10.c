//10.WAP to check whether a number is negative, positive or zero.
#include <stdio.h>

int main() {
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (num > 0) {
        printf("%d is a positive number\n", num);
    } else if (num < 0) {
        printf("%d is a negative number\n", num);
    } else {
        printf("You entered 0\n");
    }

    return 0;
}
