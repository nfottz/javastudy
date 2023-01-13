package practice01_BankAccount;

public class MainClass {

	public static void main(String[] args) {

	BankAccount myAcc = new BankAccount("10101", 50_000);
	BankAccount yourAcc = new BankAccount("20202", 100_000);
	
	myAcc.transfer(yourAcc, 70_000);
	
	myAcc.inquiry();
	yourAcc.inquiry();
	
	}

}
