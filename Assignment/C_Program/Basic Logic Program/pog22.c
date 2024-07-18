//
//22.Calculate compound interest (Compound Interest formula:
//a. Formula to calculate compound interest annually is given by:
//Amount= P(1 + R/100)t
b. Compound Interest = Amount – P
#include <stdio.h>
#include <math.h>

int main() {
    double principal, rate, time, amount, compoundInterest;

    printf("Enter the principal amount: ");
    scanf("%lf", &principal);
    printf("Enter the annual interest rate (in percentage): ");
    scanf("%lf", &rate);
    printf("Enter the time period (in years): ");
    scanf("%lf", &time);

    X
    amount = principal * pow(1 + rate / 100, time);

    X
    compoundInterest = amount - principal;

    printf("Compound interest: %.2lf\n", compoundInterest);

    return 0;
}