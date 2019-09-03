package thread;

public class SynMethodBank extends Thread{
	private BankAccountSynMethod account;
	private double money;
	
	public SynMethodBank(String name,BankAccountSynMethod account,double money) {
		super(name);
		this.account=account;
		this.money=money;
	}
	
	public void run() {
		this.account.access(money);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BankAccountSynMethod myAccountSynMethod=
				new BankAccountSynMethod("6001", 500);
		SynMethodBank t1=new SynMethodBank("t1", myAccountSynMethod, -300);
		SynMethodBank t2=new SynMethodBank("t2", myAccountSynMethod, -300);
		SynMethodBank t3=new SynMethodBank("t3", myAccountSynMethod, 100);
		SynMethodBank t4=new SynMethodBank("t4", myAccountSynMethod, -200);
		SynMethodBank t5=new SynMethodBank("t5", myAccountSynMethod, 200);
		
		t1.start();t2.start();t3.start();t4.start();t5.start();
		
		t1.join();t2.join();t3.join();t4.join();t5.join();
		
		System.out.println("account:"+myAccountSynMethod.getBankNo()+",余额"
				+myAccountSynMethod.getBalance());

	}

}
