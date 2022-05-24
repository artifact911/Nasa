package dmdev.java2.date.time.dtpractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Создать объект LocalDateTime, представляющий собой дату 25.06.2020 19:47. Используя этот объект, создать другой
 *     LocalDateTime представляющий собой дату через три месяца после сегодняшней. Вывести в консоль содержащиеся в нем объекты
 *     LocalDate и LocalTime;
 */
public class DTTask1 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 6, 25, 19, 47);
        LocalDateTime newDate = localDateTime.plusMonths(3L);

        LocalDate date = newDate.toLocalDate();
        LocalTime time = newDate.toLocalTime();

        System.out.println(date);
        System.out.println(time);
    }
}
