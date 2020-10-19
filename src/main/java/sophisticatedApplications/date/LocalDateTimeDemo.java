package sophisticatedApplications.date;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @Description:
 * @PackageName: sophisticatedApplications.date
 * @Author: csc
 * @Create: 2020-10-16 19:31
 * @Version: 1.0
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = LocalDate.of(2020, 10, 21);
        System.out.println(localDate);
        localDate.plusDays(-1);
        localDate.plusMonths(1);

        LocalTime localTime = LocalTime.now();
        localTime = LocalTime.of(10, 10, 10, 10);
        localTime.plusHours(1);
        localTime.plusSeconds(1);

        // 格式化
        String dateStr = localDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(dateStr);
        System.out.println(LocalDate.parse(dateStr,DateTimeFormatter.ofPattern("yyyyMMdd")).toString());

        // 时间差计算
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toLocalDate().until(localDate, ChronoUnit.DAYS));
        System.out.println(ChronoUnit.DAYS.between(localDate, localDateTime.toLocalDate()));

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone());
    }
}
