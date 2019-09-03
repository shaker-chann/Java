package thread;

public class SynBlockBank extends Thread {
	private BankAccount account;
	private double money;
	
	public SynBlockBank(String name,BankAccount account,double money) {
		super(name);
		this.account=account;
		this.money=money;
	}
	
	public void run() {
		synchronized(this.account) {
			double d=this.account.getBalance();
			if(money<0&&d<-money) {
				System.out.println(this.getName()+"failed,");
				return;
			}else {
				d+=money;
				System.out.println(this.getName()+"success,余额为："+d);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.account.setBalance(d);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//创建一个银行账户实例
		BankAccount myAccount=new BankAccount("6001", 500);
		////创建多个线程，对帐户进行存取钱操作
		SynBlockBank t1=new SynBlockBank("t1", myAccount, -300);
		SynBlockBank t2=new SynBlockBank("t2", myAccount, -300);
		SynBlockBank t3=new SynBlockBank("t3", myAccount, 100);
		SynBlockBank t4=new SynBlockBank("t4", myAccount, -200);
		SynBlockBank t5=new SynBlockBank("t5", myAccount, 200);
		
		t1.start();t2.start();t3.start();t4.start();t5.start();
		
		t1.join();t2.join();t3.join();t4.join();t5.join();
		
		System.out.println("account:"+myAccount.getBankNo()+",余额"
				+myAccount.getBalance());

	}

}
