//28.Convert years into days and months
#include <stdio.h>

int main() {
    int years, months, days;

    
    printf("Enter the number of years: ");
    scanf("%d", &years);

    

    
    days = years * 365 + years / 4 - years / 100 + years / 400;

    /
    printf("Equivalent number of months: %d\n", months);
    printf("Equivalent number of days: %d\n", days);

    return 0;
}