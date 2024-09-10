// W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
//than account balance then program will show custom exception otherwise amount
//will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 
//2500
//Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.
class Account {

	String accNo;
	double balance = 0;

	void deposit(double amount) {
		if (amount > 0) {

			balance += amount;
			System.out.println(amount + " deposited successfully.");
		} else {
			System.out.println("invalid amount.");
		}
	}
	void withdrawal(double amount) {

		if (amount > 0) {

			if (amount <= balance) {
				balance -= amount;
				System.out.println(amount + " withdrawal successfully.");
			}

		} else {
			System.out.println("invalid amount.");
		}

	}

	void showBalance() {
		System.out.println("Account balance for the account (" + accNo + ") : " + balance);
	}

}
class SavingAccount extends Account {

	final int intRate = 6;

	double getInterestAmount() {
		return balance * 6 / 100;
	}
}

class CurrentAccount extends Account {

	final double odAmount = 5000;
	
	void withdrawalAgainstOverdraft(double amount) {
		if (amount > 0) {

			if (amount <= balance+odAmount) {
				balance -= amount;
				System.out.println(amount + " withdrawal successfully against overdraft.");
			}

		} else {
			System.out.println("invalid amount.");
		}

	}
	
}

public class Q38 {
	public static void main(String[] args) {

		SavingAccount acc1 = new SavingAccount();
		acc1.accNo = "xxxx1";

		CurrentAccount acc2 = new CurrentAccount();
		acc2.accNo = "xxxx2";

		acc1.showBalance();
		acc2.showBalance();

		acc1.deposit(500);
		acc2.deposit(1000);
		acc1.deposit(4500);
		acc1.withdrawal(400);

		acc1.showBalance();
		acc2.showBalance();
		
		System.out.println("interest amount : "+acc1.getInterestAmount());
		acc2.withdrawalAgainstOverdraft(3000);
		
		acc2.showBalance();
		
	}

}


