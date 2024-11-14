package demo.limit;

public class WindowLimit extends Limit {

    public static volatile long nextTime = System.currentTimeMillis();
    //一个窗口的
    public static final long interval = 100;
    public static final long maxCount = 3;
    public static final Object lock = new Object();

    public boolean isLimit(int index) {
        long now = System.currentTimeMillis();
        if (now <= nextTime) {
            if (count.get() < maxCount) {
                int cur = count.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + " at " + index + " true nextTime " + nextTime + " now " + now + " get tokens cur " + count.get());
                return true;
            } else {
                System.out.println(Thread.currentThread().getName() + " at " + index + " error nextTime " + nextTime + " now " + now + " get tokens cur " + count.get());
                return false;
            }
        } else {
            //并发
            synchronized (lock) {
                if (now > nextTime) {
                    count.set(1);
                    long last = nextTime;
                    nextTime = now + interval;
                    System.out.println(Thread.currentThread().getName() + " at " + index + " true new window reset " + last + " nextTime " + nextTime + " now " + now + " get tokens cur " + count.get());
                    return true;
                } else {
                    System.out.println(Thread.currentThread().getName() + " at " + index + " error new window reset error" + " nextTime " + nextTime + " now " + now + " get tokens cur " + count.get());
                    return false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new WindowLimit().testExec();
    }

}
