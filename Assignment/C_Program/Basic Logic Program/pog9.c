9. Find circumference of Triangle formula : triangle = a + b + c
include <stdio.h>

int main() {
    double width, length, height, area;

    
    printf("Enter the width of the rectangular prism: ");
    scanf("%lf", &width);
    printf("Enter the length of the rectangular prism: ");
    scanf("%lf", &length);
    printf("Enter the height of the rectangular prism: ");
    scanf("%lf", &height);

    
    area = 2 * (width * length + height * length + height * width);

    printf("Surface area of the rectangular prism: %.2lf\n", area);

    return 0;
}