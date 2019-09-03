package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LambdaCallableFutureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用Lambda表达式Callable<Integer>对象
		//使用FutureTask类包装Callable
		FutureTask<Integer> task =new FutureTask<Integer>(
				(Callable<Integer>)()->{
					int i=0;
					for(;i<10;i++) {
						System.out.println(Thread.currentThread().getName()+":"+i);
					}
					return i;
				});
		//创建线程，使用FutureTask对象作为task作为Thread对象的Target，启动线程
		new Thread(task,"子线程").start();
		try {
			System.out.println("子健返回值："+task.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=100;i<110;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

	}

}
