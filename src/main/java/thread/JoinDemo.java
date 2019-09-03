package thread;

//在A线程中调用了B线程的join()方法时，表示只有当B线程执行完毕时，A线程才能继续执行

class JoinThread extends Thread{
	public JoinThread(String name) {
		super(name);
		
	}
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(this.getName()+":"+i);
	}
}

public class JoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinThread thread=new JoinThread("被join的子线程");
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("子线程死亡状态isalive"+thread.isAlive());

	}

}
