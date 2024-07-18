//26.Convert temperature Fahrenheit to Celsius
#include <stdio.h>

int main() {
    double fahrenheit, celsius;

   
    printf("Enter temperature in Fahrenheit: ");
    scanf("%lf", &fahrenheit);

   
    celsius = (5.0 / 9.0) * (fahrenheit - 32.0);

   
    printf("Temperature in Celsius: %.2lf\n", celsius);

    return 0;
}