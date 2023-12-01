package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @PackageName: thread
 * @Author: csc
 * @Create: 2020-10-19 15:01
 * @Version: 1.0
 */
public class ThreadLocalDemo {
    private static ExecutorService executorService = Executors.newFixedThreadPool(2);
    private static ThreadLocal<String> sThreadLocal = new InheritableThreadLocal<>();

    public static void main(String args[]) {
        //主线程
        sThreadLocal.set("这是在主线程中");
        System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get());

        executorService.submit(() ->
                System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get())
        );

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sThreadLocal.set("这是在主线程中-11111");
        executorService.submit(() -> {
            if ("pool-1-thread-2".equals(Thread.currentThread().getName()))
                System.out.println("线程名字：" + Thread.currentThread().getName() + "  2222222222---" + sThreadLocal.get());
            System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get());
        });
        executorService.submit(() ->
                System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get())
        );
        executorService.submit(() ->
                System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get())
        );
        executorService.shutdown();

//        //线程a
//        new Thread(() -> {
//            sThreadLocal.set("这是在线程a中");
//            System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get());
//
//        }, "线程a").start();
//        //线程b
//        new Thread(new Runnable() {
//            public void run() {
//                sThreadLocal.set("这是在线程b中");
//                System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get());
//            }
//        }, "线程b").start();
//        //线程c
//        new Thread(() -> {
//            sThreadLocal.set("这是在线程c中");
//            System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get());
//        }, "线程c").start();
    }

}
