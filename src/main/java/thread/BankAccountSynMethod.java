package thread;

public class BankAccountSynMethod {
	private String bankNo;
	private double balance;
	
	public BankAccountSynMethod(String bankNo,double banlance) {
		this.bankNo=bankNo;
		this.balance=banlance;
	}
	//同步方法
	public synchronized void access(double money) {
		if(money<0&&balance<-money) {
			System.out.println(Thread.currentThread().getName()+"failed,");
			return;
		}else {
			balance+=money;
			System.out.println(Thread.currentThread().getName()
					+"success,余额为："+balance);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
