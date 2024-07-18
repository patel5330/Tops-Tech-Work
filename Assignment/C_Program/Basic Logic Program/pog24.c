//24.Accept 5 employees name and salary and count average and total salary
#include <stdio.h>

int main() {
    char names[5][50];
    double salaries[5];
    double totalSalary = 0.0, averageSalary;
    int i;

    for (i = 0; i < 5; i++) {
        printf("Enter name of employee %d: ", i + 1);
        scanf("%s", names[i]);
        printf("Enter salary of employee %d: ", i + 1);
        scanf("%lf", &salaries[i]);
        totalSalary += salaries[i];
    }

    
    averageSalary = totalSalary / 5;

   
    printf("\nTotal salary of all employees: %.2lf\n", totalSalary);
    printf("Average salary of all employees: %.2lf\n", averageSalary);

    return 0;
}