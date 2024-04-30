package demo.limit;

/**
 * @Description: 基于漏斗算法实现的限流；
 * @Author: csc
 * @Create: 2024-04-30
 */
public class FunnelLimit extends Limit {

    /**
     * 涉及到count变量（仅仅原子变量，set和incrementAndGet是两步操作）的修改，所以加synchronized同步
     */
    @Override
    public synchronized boolean isLimit(int index) {
        long now = System.currentTimeMillis();
        long gap = now - lastTime;
        //漏水的操作
        long leak = gap * speed / 1000;
        int max = (int) Math.max(0, count.get() - leak);
        System.out.println(Thread.currentThread().getName() + " at " + index + " set " + max + " tokens " + count + " capacity  gap " + gap + " last " + lastTime + " now " + now);
        count.set(max);
        lastTime = now;

        int cur = count.getAndIncrement();
        if (cur < capacity) {
            System.out.println(Thread.currentThread().getName() + " at " + cur + " true " + System.currentTimeMillis());
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " at " + count + " false limit " + System.currentTimeMillis());
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        new FunnelLimit().testExec();
    }

}
