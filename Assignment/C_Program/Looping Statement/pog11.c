//.Accept 5 names from user at run time
#include <stdio.h>

int main() {
    char names[5][50];  // Array to store 5 names, each of maximum length 50

    printf("Enter 5 names:\n");

    for (int i = 0; i < 5; i++) {
        printf("Enter name %d: ", i + 1);
        scanf("%s", names[i]);
    }

    printf("\nNames entered are:\n");
    for (int i = 0; i < 5; i++) {
        printf("%s\n", names[i]);
    }

    return 0;
}
