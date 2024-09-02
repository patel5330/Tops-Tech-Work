//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
//method by creating an object of each of the three classes.

abstract class Accout {

	abstract int getBalance();

}

class BankA extends Accout {
	private int balance = 100;

	@Override
	int getBalance() {
		return balance;

	}
}

class BankB extends Accout {
	private int balance = 150;

	@Override
	int getBalance() {

		return balance;
	}
}

class Bankc extends Accout {
	private int balance = 200;

	@Override
	int getBalance() {

		return balance;
	}

}

public class Q27 {

	public static void main(String[] args) {
		BankA bankA = new BankA();
		BankB bankB = new BankB();
		Bankc bankC = new Bankc();

		System.out.println("Balance of Bank A: $" + bankA.getBalance());
		System.out.println("Balance of Bank B: $" + bankB.getBalance());
		System.out.println("Balance of Bank C: $" + bankC.getBalance());

	}

}
