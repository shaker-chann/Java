package demo.limit;

/**
 * @Description: 基于令牌桶实现的一个限流；
 * @Author: csc
 * @Create: 2024-04-29
 */
public class TokenLimit extends Limit {

    /**
     * 获取令牌
     *
     * @param index 每个线程第几次获取，仅仅测试演示验证使用；后边可以改为每次申请的令牌数量
     * @return true:成功获取；false:失败
     */
    @Override
    public boolean isLimit(int index) {
        long now = System.currentTimeMillis();
        calNewTokenIfEmpty(index, now);
//        calNewTokenEvery(index, now);

        int token = this.count.get();
        if (token > 0) {
            this.count.decrementAndGet();
            lastTime = now;
            System.out.println(Thread.currentThread().getName() + " at " + index + " true " + System.currentTimeMillis());
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " at " + index + " false " + System.currentTimeMillis());
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
        if (this.count.get() == 0) {
            long gap = now - lastTime;
            long generateToken = gap * speed / 1000;
            int min = (int) Math.min(generateToken, capacity);
            //只有min大于0，才代表生成了新的token，需要重置lastTime
            this.count.set(min);
            System.out.println(Thread.currentThread().getName() + " at " + count + " set " + min + " tokens " + this.count + " capacity  gap " + gap + " last " + lastTime + " now " + now);
        } else {
            System.out.println(Thread.currentThread().getName() + " at " + count + " use " + " tokens " + this.count + " capacity  last " + lastTime + " now " + now);
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
        int all_permits = count.get() + reverse_permits;
        // 当前令牌数
        int min = (int) Math.min(capacity, all_permits);
        count.set(min);
        System.out.println(Thread.currentThread().getName() + " at " + j + " set " + min + " tokens " + count + " capacity  gap " + gap + " last " + lastTime + " now " + now);
    }

    public static void main(String[] args) throws Exception {
        new TokenLimit().testExec();
    }

}
