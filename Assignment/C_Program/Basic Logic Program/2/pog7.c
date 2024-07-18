//7. Accept marks from user and check pass or fail
#include <stdio.h>

int main() {
    int marks;

    printf("Enter the marks: ");
    scanf("%d", &marks);

    if (marks >= 40) {
        printf("Congratulations! You have passed.\n");
    } else {
        printf("Sorry, you have failed.\n");
    }

    return 0;
}
