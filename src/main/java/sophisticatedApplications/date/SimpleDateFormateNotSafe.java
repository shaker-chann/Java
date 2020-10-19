package sophisticatedApplications.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:
 * @PackageName: sophisticatedApplications.date
 * @Author: csc
 * @Create: 2020-10-16 18:10
 * @Version: 1.0
 */
public class SimpleDateFormateNotSafe {
    /**
     * 只创建一份，避免频繁地创建对象和销毁对象
     * 单线程下可以不出错
     * 多线程下则不安全, 不同的线程会对不同日期字符串进行解析，
     * 会出现线程 A 解析到一半被挂起，线程 B 运行时将 A 的解析到一半的字符串覆盖掉，
     * 这样轮到 A 运行时会解析失败，或者使用了 B 的字符串
     */
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 通过 ThreadLocal 为每个线程做一份变量副本，实现线程安全
     * ThreadLocal 提供一种 lombda 构造方式
     * 返回此线程局部变量的当前线程的“初始值”。线程第一次使用 get() 方法访问变量时将调用此方法，
     * 但如果线程之前调用了 set(T) 方法，则不会对该线程再调用 initialValue 方法。通常，此方法
     * 对每个线程最多调用一次，但如果在调用 get() 后又调用了 remove()，则可能再次调用此方法。
     */
    private static ThreadLocal<DateFormat> threadLocal
            = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    /**
     * 线程安全的 DateTimeFormatter
     * 推荐使用，因为该类是不可变的，并且是线程安全的
     */
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    String dateStr = "2019-04-16 10:26:30";
                    // 解决方法
                    // 1、可以只在需要时创建对象，也可以避免错误，但是频繁创建与销毁会导致额外的开销，性能低
//                    SimpleDateFormat newInNeed = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    for (int j = 0; j < 10; j++) {

                        try {
                            // 直接使用不但运行结果错误，最后还会抛出 NumberFormatException: 异常
//                            System.out.println(format.parse(dateStr));

                            // 2、使用加了 synchronized 的同步方法，但是并发量高时，性能影响大，线程阻塞
//                            synchronized (format){
//                                System.out.println(format.parse(dateStr));
//                            }

                            // 3、使用 ThreadLocal 来解决，比较优雅的一种做法
                            System.out.println(threadLocal.get().parse(dateStr));

                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        // 4、使用DateFormatter，该类是线程安全的，可以放心使用
//                        LocalDateTime localDateTime = LocalDateTime.parse(dateStr, dtf);
//                        System.out.println(localDateTime);
                    }
                }
            });
        }

        service.shutdown();
    }

}
