package thread;

public class SynLockBank extends Thread{
	private BankAccountSynLock account;
	private double money;
	
	public SynLockBank(String name,BankAccountSynLock account,double money) {
		super(name);
		this.account=account;
		this.money=money;
	}
	
	public void run() {
		this.account.access(money);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BankAccountSynLock myAccount=
				new BankAccountSynLock("6001", 500);
		SynLockBank t1=new SynLockBank("t1", myAccount, -300);
		SynLockBank t2=new SynLockBank("t2", myAccount, -300);
		SynLockBank t3=new SynLockBank("t3", myAccount, 100);
		SynLockBank t4=new SynLockBank("t4", myAccount, -200);
		SynLockBank t5=new SynLockBank("t5", myAccount, 200);
		
		t1.start();t2.start();t3.start();t4.start();t5.start();
		
		t1.join();t2.join();t3.join();t4.join();t5.join();
		
		System.out.println("account:"+myAccount.getBankNo()+",余额"
				+myAccount.getBalance());
	}

}
