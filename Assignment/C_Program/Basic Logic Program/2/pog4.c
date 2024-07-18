//4. WAP to make simple calculator (operation include Addition, Subtraction,
//Multiplication, Division, modulo) using conditional statement


#include <stdio.h>

int main() {
    char operator;
    float num1, num2;

    printf("Enter an operator (+, -, *, /, %%): ");
    scanf(" %c", &operator);

    printf("Enter two numbers: ");
    scanf("%f %f", &num1, &num2);

    switch (operator) {
        case '+':
            printf("Result: %.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
            break;
        case '-':
            printf("Result: %.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
            break;
        case '*':
            printf("Result: %.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
            break;
        case '/':
            if (num2 != 0) {
                printf("Result: %.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
            } else {
                printf("Error! Division by zero is not allowed\n");
            }
            break;
        case '%':
            if (num2 != 0) {
                printf("Result: %.2f %% %.2f = %.2f\n", num1, num2, fmod(num1, num2));
            } else {
                printf("Error! Modulo by zero is not allowed\n");
            }
            break;
        default:
            printf("Error! Invalid operator\n");
    }

    return 0;
}




#include <stdio.h>

int main() {
    char operator;
    float num1, num2;

    printf("Enter an operator (+, -, *, /, %%): ");
    scanf(" %c", &operator);

    printf("Enter two numbers: ");
    scanf("%f %f", &num1, &num2);

    switch (operator) {
        case '+':
            printf("Result: %.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
            break;
        case '-':
            printf("Result: %.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
            break;
        case '*':
            printf("Result: %.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
            break;
        case '/':
            if (num2 != 0) {
                printf("Result: %.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
            } else {
                printf("Error! Division by zero is not allowed\n");
            }
            break;
        case '%':
            if (num2 != 0) {
                printf("Result: %.2f %% %.2f = %.2f\n", num1, num2, fmod(num1, num2));
            } else {
                printf("Error! Modulo by zero is not allowed\n");
            }
            break;
        default:
            printf("Error! Invalid operator\n");
    }

    return 0;
}
