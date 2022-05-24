package dmdev.java2.date.time.dtpractice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Написать свою реализацию интерфейса TemporalAdjuster, которая бы прибавляла к дате 42 дня.
 */
public class DTTask8 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));

        System.out.println(localDateTime);
    }
}
