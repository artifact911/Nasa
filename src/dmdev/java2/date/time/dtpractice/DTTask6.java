package dmdev.java2.date.time.dtpractice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Даны два объекста LocalDate из предыдущего задания. Посчитать количество секунд между полуночью первой даты и полуночтю второй;
 */
public class DTTask6 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDay = LocalDate.of(2018, 7, 7);

//        LocalDateTime.of(now, LocalTime.MIDNIGHT);
        //or
        LocalDateTime nowMidnight = now.atStartOfDay();
        LocalDateTime prevDayMidnight = prevDay.atStartOfDay();

        Duration between = Duration.between(prevDayMidnight, nowMidnight);
        long seconds = between.getSeconds();
        System.out.println(seconds);
    }
}
