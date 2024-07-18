//.If bill exceeds Rs. 800 then a surcharge of 18% will be charged andthe
//minimum bill should be of Rs. 256/-
#include <stdio.h>

int main() {
    int customerID, units;
    char customerName[50];
    float chargePerUnit, totalAmount, surcharge = 0, netAmount;

    printf("Enter customer ID: ");
    scanf("%d", &customerID);
    printf("Enter customer name: ");
    scanf("%s", customerName);
    printf("Enter units consumed: ");
    scanf("%d", &units);

    if (units <= 350) {
        chargePerUnit = 1.20;
    } else if (units > 350 && units < 600) {
        chargePerUnit = 1.50;
    } else if (units >= 600 && units < 800) {
        chargePerUnit = 1.80;
    } else {
        chargePerUnit = 2.0;
    }

    totalAmount = units * chargePerUnit;

    if (totalAmount > 800) {
        surcharge = totalAmount * 0.18;
        if (totalAmount + surcharge < 256) {
            netAmount = 256;
        } else {
            netAmount = totalAmount + surcharge;
        }
    } else {
        netAmount = totalAmount;
    }

    printf("Customer ID: %d\n", customerID);
    printf("Customer Name: %s\n", customerName);
    printf("Units Consumed: %d\n", units);
    printf("Total Amount to be Paid: $%.2f\n", netAmount);

    return 0;
}

