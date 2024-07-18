//20.Accept monthly salary from the user and deduct 10% insurance premium,
//10% loan installment find out of remaining salary.
#include <stdio.h>

int main() {
    double monthlySalary, insurancePremium, loanInstallment, remainingSalary;

    /
    printf("Enter the monthly salary: ");
    scanf("%lf", &monthlySalary);

    
    insurancePremium = 0.1 * monthlySalary;

   
    loanInstallment = 0.1 * monthlySalary;

    
    remainingSalary = monthlySalary - insurancePremium - loanInstallment;

    
    printf("Insurance premium (10%%): %.2lf\n", insurancePremium);
    printf("Loan installment (10%%): %.2lf\n", loanInstallment);
    printf("Remaining salary after deductions: %.2lf\n", remainingSalary);

    return 0;
}