//29.Convert minutes into seconds and hours
#include <stdio.h>

int main() {
    int minutes, hours, seconds;

   
    printf("Enter the number of minutes: ");
    scanf("%d", &minutes);

    
    seconds = minutes * 60;

   
    hours = minutes / 60;

    
    printf("Equivalent number of seconds: %d\n", seconds);
    printf("Equivalent number of hours: %d\n", hours);

    return 0;
}