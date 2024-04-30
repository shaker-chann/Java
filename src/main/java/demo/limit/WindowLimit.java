package demo.limit;

public class WindowLimit extends Limit {

    public static long nextTime = System.currentTimeMillis();
    //一个窗口的
    public static final long interval = 1000;
    public static final long maxCount = 2;
//    public static final AtomicInteger count = new AtomicInteger(0);
    public static final Object lock = new Object();

    public boolean isLimit(int index) {
        long now = System.currentTimeMillis();
        if (now <= nextTime) {
            int cur = count.incrementAndGet();
            if (cur <= maxCount) {
                System.out.println(Thread.currentThread().getName() + " at " + index + " get tokens cur " + cur + " nextTime " + nextTime + " now " + now);
                return true;
            } else {
                System.out.println(Thread.currentThread().getName() + " at " + index + " get tokens error " + cur + " nextTime " + nextTime + " now " + now);
                return false;
            }
        } else {
            //并发
            synchronized (lock) {
                if (now > nextTime) {
                    count.set(1);
                    long last = nextTime;
                    nextTime = now + interval;
                    System.out.println(Thread.currentThread().getName() + " at " + index + " new window reset " + last + " nextTime " + nextTime + " now " + now);
                    return true;
                } else {
                    System.out.println(Thread.currentThread().getName() + " at " + index + " new window reset error" + " nextTime " + nextTime + " now " + now);
                    return false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new WindowLimit().testExec();
    }

}
