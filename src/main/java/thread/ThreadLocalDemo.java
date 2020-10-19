package thread;

/**
 * @Description:
 * @PackageName: thread
 * @Author: 陈世超
 * @Create: 2020-10-19 15:01
 * @Version: 1.0
 */
public class ThreadLocalDemo {
    private static ThreadLocal<String> sThreadLocal = new ThreadLocal<>();

    public static void main(String args[]) {
        //主线程
        sThreadLocal.set("这是在主线程中");
        System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get());
        //线程a
        new Thread(() -> {
            sThreadLocal.set("这是在线程a中");
            System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get());

        }, "线程a").start();
        //线程b
        new Thread(new Runnable() {
            public void run() {
                sThreadLocal.set("这是在线程b中");
                System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get());
            }
        }, "线程b").start();
        //线程c
        new Thread(() -> {
            sThreadLocal.set("这是在线程c中");
            System.out.println("线程名字：" + Thread.currentThread().getName() + "---" + sThreadLocal.get());
        }, "线程c").start();
    }

}
