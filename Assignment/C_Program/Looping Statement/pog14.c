
//Accept 5 numbers from user and find those numbers factorials
#include <stdio.h>

int main() {
    int i, num;
    long long factorial;

    for (i = 1; i <= 5; i++) {
        printf("Enter a positive integer for number %d: ", i);
        scanf("%d", &num);

        factorial = 1;

        if (num < 0) {
            printf("Error! Factorial of a negative number doesn't exist.\n");
        } else {
            int j;
            for (j = 1; j <= num; j++) {
                factorial *= j;
            }
            printf("Factorial of %d = %lld\n", num, factorial);
        }
    }

    return 0;
}
