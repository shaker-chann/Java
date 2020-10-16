package sophisticatedApplications.date;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @Description:
 * @PackageName: sophisticatedApplications.date
 * @Author: 陈世超
 * @Create: 2020-10-16 19:31
 * @Version: 1.0
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = LocalDate.of(2020, 10, 22);
        System.out.println(localDate);
        localDate.plusDays(-1);
        localDate.plusMonths(1);
        localDate.plusWeeks(1);
        localDate.plusYears(1);

        LocalTime localTime = LocalTime.now();
        localTime = LocalTime.of(10, 10, 10, 10);
        localTime.plusHours(1);
        localTime.plusMinutes(1);
        localTime.plusSeconds(1);
        localTime.plusNanos(1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toLocalDate().until(localDate, ChronoUnit.DAYS));
        System.out.println(ChronoUnit.DAYS.between(localDate, localDateTime.toLocalDate()));

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone());
    }
}
