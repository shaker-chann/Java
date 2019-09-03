package thread;

/*
 * MAX_PRIORITY最高优先级，10
 * NORM_PRIORITY普通优先级，5
 * MIN_PRIORITY最低优先级，1
 */

class MyPriorityThread extends Thread{
	public MyPriorityThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(this.getName()+",其优先级为："
					+this.getPriority()+",循环变量值为"+i);
		}
	}
}

public class PriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getPriority());
		
		MyPriorityThread t1=new MyPriorityThread("max");
		t1.setPriority(Thread.MAX_PRIORITY);
		
		MyPriorityThread t2=new MyPriorityThread("normal");
		
		MyPriorityThread t3=new MyPriorityThread("min");
		t3.setPriority(Thread.MIN_PRIORITY);
		
		MyPriorityThread t4=new MyPriorityThread("appoint");
		t4.setPriority(8);
		
		t1.start();t2.start();t3.start();t4.start();

	}

}
