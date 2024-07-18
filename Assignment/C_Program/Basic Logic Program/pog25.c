//25.Accept 5 expense from user and find average of expense
#include <stdio.h>

int main() {
    double expenses[5];
    double totalExpense = 0.0, averageExpense;
    int i;

   
    printf("Enter 5 expenses:\n");
    for (i = 0; i < 5; i++) {
        printf("Expense %d: ", i + 1);
        scanf("%lf", &expenses[i]);
        totalExpense += expenses[i];
    }

  
    averageExpense = totalExpense / 5;

   
    printf("\nAverage expense: %.2lf\n", averageExpense);

    return 0;
}