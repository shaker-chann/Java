package thread;

public class ThreadDemo extends Thread {
	public void run() {
		//重写run方法，线程的任务方法，即执行体
		for(int i=0;i<10;i++) {
			//继承Thread类直接使用this获取当前线程对象，getname()方法返回当前线程的名字
			System.out.println(this.getName()+":"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建线程对象调用start方法启动线程
		//创建tDemo未指定线程的名字，输出默认值Thread—0
		ThreadDemo tDemo=new ThreadDemo();
		tDemo.start();
		//主线程任务
		for(int i=100;i<110;i++) {
			//使用Thread.currentThread().getName()获得主线程的名字
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
