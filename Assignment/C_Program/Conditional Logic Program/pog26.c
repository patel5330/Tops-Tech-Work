#include <stdio.h>

int main() {
    float units, total_bill, surcharge, bill_without_surcharge;

    printf("Enter the electricity units consumed: ");
    scanf("%f", &units);

    if (units <= 50) {
        total_bill = units * 0.50;
    } else if (units <= 150) {
        total_bill = 50 * 0.50 + (units - 50) * 0.75;
    } else if (units <= 250) {
        total_bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
    } else {
        total_bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
    }

    bill_without_surcharge = total_bill; 
    surcharge = total_bill * 0.20;  
    printf("Electricity Bill = $%.2f\n", total_bill);
    printf("Surcharge Amount = $%.2f\n", surcharge);
    printf("Total Bill without Surcharge = $%.2f\n", bill_without_surcharge);

    return 0;
}
