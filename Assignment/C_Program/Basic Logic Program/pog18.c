//18.Calculate person’s Annual salary
#include <stdio.h>

int main() {
    double monthlySalary, annualSalary;

    
    printf("Enter the person's monthly salary: ");
    scanf("%lf", &monthlySalary);

    
    annualSalary = monthlySalary * 12;

    
    printf("Annual salary: %.2lf\n", annualSalary);

    return 0;
}