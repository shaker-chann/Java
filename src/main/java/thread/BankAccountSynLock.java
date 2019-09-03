package thread;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccountSynLock {
	private String bankNo;
	private double balance;
	//定义锁对象
	private final ReentrantLock lock = new ReentrantLock();

	public BankAccountSynLock(String bankNo, double banlance) {
		this.bankNo = bankNo;
		this.balance = banlance;
	}

	public void access(double money) {
		//加锁
		lock.lock();
		try {
			//如果money<0,代表取钱操作，同时余额是否大于取钱金额
			if (money < 0 && balance < -money) {
				System.out.println(Thread.currentThread().getName() + "failed,");
				return;
			} else {
				balance += money;
				System.out.println(Thread.currentThread().getName() + "success,余额为：" + balance);
				try {
					//休眠1毫秒
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} finally {
			lock.unlock();
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
