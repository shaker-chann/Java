package thread;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.TtlRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:
 * @PackageName: thread
 * @Author: csc
 * @Create: 2020-10-19 11:04
 * @Version: 1.0
 */
public class InheritableThreadLocalDemo {
    public static InheritableThreadLocal inheritableThreadLocal = new InheritableThreadLocal();

    public static void main(String[] args) throws InterruptedException {
//        demo();
        problem();
//        deal();
    }

    public static void demo() throws InterruptedException {
        System.out.println("主线程 start");
        inheritableThreadLocal.set("csc0");

        new Thread(() -> {
            System.out.println("子线程 start");
            System.out.println("子线程 read：-----" + inheritableThreadLocal.get());
            System.out.println("子线程 end");
        }).start();

        System.out.println("主线程 sleep");
        Thread.sleep(3000);
        System.out.println("主线程 end");
    }

    public static void problem() throws InterruptedException {
        System.out.println("主线程 start");
        inheritableThreadLocal.set("csc0");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            System.out.println("子线程0 start");
            System.out.println("子线程0 read：-----" + inheritableThreadLocal.get());
            System.out.println("子线程0 end");
        });

        Thread.sleep(1000);
        inheritableThreadLocal.set("csc1");
        executorService.submit(() -> {
            System.out.println("子线程1 start");
            System.out.println("子线程1 read：-----" + inheritableThreadLocal.get());
            System.out.println("子线程1 end");
        });

        Thread.sleep(1000);
        inheritableThreadLocal.set("csc2");
        executorService.submit(() -> {
            System.out.println("子线程2 start");
            // 打印为csc0,而不是csc2
            System.out.println("子线程2 read：-----" + inheritableThreadLocal.get());
            System.out.println("子线程2 end");
        });

        System.out.println("主线程 sleep");
        Thread.sleep(2000);
        System.out.println("主线程 end");
        executorService.shutdown();
    }

    public static void deal() throws InterruptedException {
        // 在父线程中设置
        TransmittableThreadLocal<String> context = new TransmittableThreadLocal<String>();
        System.out.println("主线程 start");
        context.set("value-set-in-parent");


        // 额外的处理，生成修饰了的对象ttlRunnable
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable ttlRunnable = TtlRunnable.get(() -> {
            System.out.println("子线程 start");
            System.out.println("子线程 read：-----" + context.get());
            System.out.println("子线程 end");
        });
        executorService.submit(ttlRunnable);

        Thread.sleep(1000);
        context.set("csc");
        Runnable ttlRunnable1 = TtlRunnable.get(() -> {
            System.out.println("子线程 start");
            System.out.println("子线程 read：-----" + context.get());
            System.out.println("子线程 end");
        });
        executorService.submit(ttlRunnable1);

        System.out.println("主线程 sleep");
        Thread.sleep(3000);
        System.out.println("主线程 end");
        executorService.shutdown();
    }
}
