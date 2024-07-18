//27.Convert days into months
#include <stdio.h>

int main() {
    int days, months;

    
    printf("Enter the number of days: ");
    scanf("%d", &days);

    months = days / 30;

   
    printf("Equivalent number of months: %d\n", months);

    return 0;
}