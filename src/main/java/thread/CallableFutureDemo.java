package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//创建callable的实现类
class Task implements Callable<Integer>{
	public Integer call() throws Exception{
		int i=0;
		for(;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		return i;
		
	}
}

public class CallableFutureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用FutureTask类包装Callable实现类的实例
		FutureTask<Integer> task =new FutureTask<Integer>(new Task());
		//创建线程，使用FutureTask对象作为task作为Thread对象的Target，启动线程
		new Thread(task,"子线程").start();
		//调用FutureTask对象task的get方法获取子线程结束后的返回值
		try {
			System.out.println("子键返回值："+task.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//主线程
		for(int i=100;i<110;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

	}

}
