#include <iostream>

class BankAccount {
private:
    int accountNumber;
    double balance;

public:
    BankAccount(int accNum, double bal) : accountNumber(accNum), balance(bal) {}

    void deposit(double amount) {
        balance += amount;
        std::cout << "Deposit of $" << amount << " successful. New balance: $" << balance << std::endl;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            std::cout << "Withdrawal of $" << amount << " successful. New balance: $" << balance << std::endl;
        } else {
            std::cout << "Insufficient funds. Withdrawal of $" << amount << " unsuccessful." << std::endl;
        }
    }
};

int main() {
    
    BankAccount account1(12345, 1000.00);

    
    account1.deposit(500.50);
    account1.withdraw(200.75);
    account1.withdraw(1500.00);

    return 0;
}
