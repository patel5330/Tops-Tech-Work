//17.Calculate person’s insurance premium based on salary
#include <stdio.h>

int main() {
    double salary, premium;

   
    printf("Enter the person's salary: ");
    scanf("%lf", &salary);

   
    premium = 0.05 * salary;

    
    printf("Insurance premium: %.2lf\n", premium);

    return 0;
}