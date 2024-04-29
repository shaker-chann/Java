package demo.limit;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: 基于令牌桶实现的一个限流；
 * 不借助额外的线程去生成令牌（需要保证额外的线程的可靠性）
 * 不借助第三方组件
 * @Author: csc
 * @Create: 2024-04-29
 */
public class TokenLimit {
    //速率 每秒2个
    public int speed = 2;
    public int capacity = 4;
    public AtomicInteger token = new AtomicInteger(0);
    public long lastTime = System.currentTimeMillis();

    /**
     * 获取令牌
     *
     * @param count 每个线程第几次获取，仅仅测试演示验证使用；后边可以改为每次申请的令牌数量
     * @return true:成功获取；false:失败
     */
    public boolean getToken(int count) {
        long now = System.currentTimeMillis();
        calNewTokenIfEmpty(count, now);
//        calNewTokenEvery(count, now);

        int token = this.token.get();
        if (token > 0) {
            this.token.decrementAndGet();
            lastTime = now;
            System.out.println(Thread.currentThread().getName() + " at " + count + " " + System.currentTimeMillis());
            return true;
        } else {
            return false;
        }
    }

    /**
     * 只有令牌桶为空才生成新的token
     * 有令牌的时候就不用计算补充令牌了
     * 预加载？当令牌少于某个数量时预加载？
     *
     * @param now 当前时间
     */
    private void calNewTokenIfEmpty(int count, long now) {
        if (token.get() == 0) {
            long gap = now - lastTime;
            int generateToken = (int) (gap * speed / 1000);
            int min = Math.min(generateToken, capacity);
            //只有min大于0，才代表生成了新的token，需要重置lastTime
            token.set(min);
            System.out.println(Thread.currentThread().getName() + " at " + count + " set " + min + " tokens " + token + " capacity  gap " + gap + " last " + lastTime + " now " + now);
        } else {
            System.out.println(Thread.currentThread().getName() + " at " + count + " use " + " tokens " + token + " capacity  last " + lastTime + " now " + now);
        }
    }

    /**
     * 每次请求来了都去判断生成新的token
     * 不管有没有令牌都要去计算
     * 更符合实际令牌生成的
     *
     * @param now 当前时间
     */
    private void calNewTokenEvery(int j, long now) {
        //时间间隔,单位为 ms
        long gap = now - lastTime;
        //计算时间段内的令牌数
        int reverse_permits = (int) (gap * speed / 1000);
        int all_permits = token.get() + reverse_permits;
        // 当前令牌数
        int min = Math.min(capacity, all_permits);
        token.set(min);
        System.out.println(Thread.currentThread().getName() + " at " + j + " set " + min + " tokens " + token + " capacity  gap " + gap + " last " + lastTime + " now " + now);
    }

    public static void main(String[] args) throws Exception {
        // 被限制的次数
        AtomicInteger limited = new AtomicInteger(0);
        // 线程数
        final int threads = 2;
        // 每条线程的执行轮数
        final int turns = 8;

        ExecutorService pool = Executors.newFixedThreadPool(10);
        TokenLimit order = new TokenLimit();
        System.out.println("token start " + order.lastTime);
        // 同步器，线程执行结束后统计
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        long start = System.currentTimeMillis();
        for (int i = 0; i < threads; i++) {
            pool.submit(() -> {
                try {
                    for (int count = 0; count < turns; count++) {
                        boolean intercepted = order.getToken(count);
                        if (!intercepted) {
                            // 被限制的次数累积
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
        System.out.println("限制的比例为：" + (float) limited.get() / (float) (threads * turns));
        System.out.println("运行的时长为：" + time);
        pool.shutdown();
    }

}
