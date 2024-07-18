11.Find circumference of square formula : C = 4 * a

#include <stdio.h>

int main() {
    double side, perimeter;

    
    printf("Enter the length of one side of the square: ");
    scanf("%lf", &side);

    
    perimeter = 4 * side;

    
    printf("Circumference (Perimeter) of the square: %.2lf\n", perimeter);

    return 0;
}