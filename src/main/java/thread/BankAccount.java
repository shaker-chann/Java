package thread;

public class BankAccount {
	private String bankNo;
	private double balance;
	
	public BankAccount(String bankNo,double banlance) {
		this.bankNo=bankNo;
		this.balance=banlance;
	}

	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
