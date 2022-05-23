package dmdev.java2.date.time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        long toEpochMilli = now.toInstant().toEpochMilli(); // млсек с 01.01.1970
        System.out.println(toEpochMilli);

        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS);
        System.out.println(plus);

        ZonedDateTime plusDays = plus.plusDays(1L);
        System.out.println(plusDays);

        // Обнулить до дня
        ZonedDateTime days = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(days);

        // Знаем время по смещению. В данном случае +0
        LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(localDateTime);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}

