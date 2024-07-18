//19.Calculate compound interest
#include <stdio.h>
#include <math.h>

int main() {
    double principal, rate, time, compoundInterest;
    int n;

    
    printf("Enter the principal amount: ");
    scanf("%lf", &principal);
    printf("Enter the annual interest rate (in decimal): ");
    scanf("%lf", &rate);
    printf("Enter the number of times interest is compounded per year: ");
    scanf("%d", &n);
    printf("Enter the time the money is invested for (in years): ");
    scanf("%lf", &time);

    
    compoundInterest = principal * pow(1 + (rate / n), n * time) - principal;

    
    printf("Compound interest: %.2lf\n", compoundInterest);

    return 0;
}