package dmdev.java2.date.time.dtpractice;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 5. Создать объект LocalDate, представляющий собой сегодняшнюю дату. Создать объект LocalDate, представляющий собой дату 07.07.2018.
 *     Использую созданные объекты, найти количество дней между этими двумя датами;
 */
public class DTTask5 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDay = LocalDate.of(2018, 7, 7);

        Period period = Period.between(prevDay, now);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        long between = ChronoUnit.DAYS.between(prevDay, now);
        System.out.println(between);
    }
}
