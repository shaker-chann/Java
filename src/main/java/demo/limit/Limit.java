package demo.limit;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: 不借助额外的线程去生成令牌（需要保证额外的线程的可靠性）;不借助第三方组件
 * @Author: csc
 * @Create: 2024-04-30
 */
public abstract class Limit {
    public long lastTime = System.currentTimeMillis();
    public final long capacity = 4;
    public final long speed = 2;
    public final AtomicInteger count = new AtomicInteger(0);

    /**
     * 获取令牌
     *
     * @param index 每个线程第几次获取，仅仅测试演示验证使用；后边可以改为每次申请的令牌数量
     * @return true:成功获取；false:失败
     */
    public abstract boolean isLimit(int index);


    public void testExec() throws Exception {
        // 被限制的次数
        AtomicInteger limited = new AtomicInteger(0);
        AtomicInteger passed = new AtomicInteger(0);
        // 线程数
        final int threads = 2;
        // 每条线程的执行轮数
        final int turns = 7;

        ExecutorService pool = Executors.newFixedThreadPool(10);
        System.out.println("token start " + lastTime);
        // 同步器，线程执行结束后统计
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        long start = System.currentTimeMillis();
        for (int i = 0; i < threads; i++) {
            pool.submit(() -> {
                try {
                    for (int index = 0; index < turns; index++) {
                        boolean intercepted = isLimit(index);
                        if (intercepted) {
                            passed.incrementAndGet();
                        } else {
                            limited.getAndIncrement();
                        }
                        Thread.sleep(200);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //等待所有线程结束
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();

        float time = (System.currentTimeMillis() - start) / 1000F;
        //输出统计结果
        System.out.println("限制的次数为：" + limited.get() + ",通过的次数为：" + (threads * turns - limited.get()));
//        System.out.println("通过的次数为：" + passed.get() + ",限制的次数为：" + (threads * turns - limited.get()));
        System.out.println("限制的比例为：" + (float) limited.get() / (float) (threads * turns));
//        System.out.println("限制的比例为：" + (1 - (float) passed.get() / (float) (threads * turns)));
        System.out.println("运行的时长为：" + time);
        pool.shutdown();
    }

}
