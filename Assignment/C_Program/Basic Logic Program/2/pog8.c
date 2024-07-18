//8. WAP to accept the height of a person in centimeters and categorize the
//person according to their height.
#include <stdio.h>

int main() {
    float height;

    printf("Enter the height of the person (in centimeters): ");
    scanf("%f", &height);

    if (height < 150.0) {
        printf("The person is categorized as a Dwarf.\n");
    } else if (height >= 150.0 && height < 165.0) {
        printf("The person is categorized as having an Average height.\n");
    } else if (height >= 165.0) {
        printf("The person is categorized as Tall.\n");
    } else {
        printf("Invalid height input.\n");
    }

    return 0;
}
