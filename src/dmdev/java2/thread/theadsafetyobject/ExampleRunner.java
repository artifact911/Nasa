package dmdev.java2.thread.theadsafetyobject;

import java.util.ArrayList;
import java.util.List;

public class ExampleRunner {

    public static void main(String[] args) {
        // изменили лист в объексте, хотя никаких сеттеров там нет
        Example example = new Example(new ArrayList<>());
        List<Integer> list = example.getList();
        list.add(2);

        System.out.println(example.getList());

        // перепишем класс example и сделаем поле неизменяемым
        // стал падать ошибка
        // перепишем иначе
    }
}
