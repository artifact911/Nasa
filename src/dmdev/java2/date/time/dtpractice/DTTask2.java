package dmdev.java2.date.time.dtpractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Создать объект LocalDateTime, представляющий собой сегодняшнюю дату. Преобразовать дату в строку вида "05.05.2017".
 *     Вывести эту строку на консоль;
 */
public class DTTask2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        String format = now.format(formatter);

        System.out.println(format);
    }

}
