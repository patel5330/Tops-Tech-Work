//31.Convert kilometers into meter
#include <stdio.h>

int main() {
    double kilometers, meters;

    
    printf("Enter the distance in kilometers: ");
    scanf("%lf", &kilometers);

    meters = kilometers * 1000;

   
    printf("%.2lf kilometers is equivalent to %.2lf meters\n", kilometers, meters);

    return 0;
}