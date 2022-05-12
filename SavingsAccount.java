public class SavingsAccount extends BankAccount {
private static final double RATE = 0.025;
private int savingsNumber = 0;
private String accountNumber;

public SavingsAccount(String name,double balance) {
	super(name,balance);
	accountNumber = (super.getAccountNumber() + "-" + savingsNumber);
}

public void postInterest() {
	double interest = super.getBalance() * (RATE/12);
	super.deposit(interest);
}

public String getAccountNumber() {
	return accountNumber;
}

public SavingsAccount(SavingsAccount s1,double balance) {
	super(s1,balance);
	savingsNumber = (s1.savingsNumber + 1);
	accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	
}
}