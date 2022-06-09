package dmdev.java2.reflectionapi.practice;

import dmdev.java2.reflectionapi.model.User;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 1. Создать класс Car с полями String brand и String model. создать аннотации @Table (принимает название схемы и таблицы в базе данных) и
 *
 * @Column (принимает название колонки в таблице базы двнных). Пометить класс аннтацией @Table и поля аннотацией @Column. Написать
 * программу, принимающую объект класса Car с проинициальзированными полями и составляющую запрос "INSERT" в виде строки на основании
 * данных объекта.
 * Пример: дан объект Car car = new Car("Toyota", "Corolla");
 * Программа, принимающая этот объект, должны вывести в консоль строку:
 * "INSERT INTO garage.car (model, brand) VALUES ('Toyota', 'Corolla');"
 */
public class Task1 {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");

        try {
            System.out.println(insertToDB(car));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static String insertToDB(Car car) throws NoSuchFieldException {
        /*String table = car.getClass().getAnnotation(Table.class).table();
        String schema = car.getClass().getAnnotation(Table.class).schema();
        String brand = car.getClass().getDeclaredField("brand").getAnnotation(Column.class).columnName();
        String model = car.getClass().getDeclaredField("model").getAnnotation(Column.class).columnName();
        String nameBrand = car.getClass().getDeclaredField(brand).getName();
        String nameModel = car.getClass().getDeclaredField(model).getName();

        return String.format("INSERT INTO %s.%s (%s, %s) VALUES ('%s', '%s')",
                                         table, schema, nameModel, nameBrand, brand, model);*/

        String template = "INSERT INTO %s.%s (%s) VALUES (%s)";

        Table table = car.getClass().getAnnotation(Table.class);
        Field[] fields = car.getClass().getDeclaredFields();

        String fieldNames = Arrays.stream(fields)
                                  .filter(field -> field.isAnnotationPresent(Column.class))
                                  .sorted(Comparator.comparing(Field::getName))
                                  .map(field -> field.getAnnotation(Column.class))
                                  .map(Column::columnName)
                                  .collect(Collectors.joining(", "));

        String fieldValues = Arrays.stream(fields)
                                   .filter(field -> field.isAnnotationPresent(Column.class))
                                   .sorted(Comparator.comparing(Field::getName))
                                   .peek(field -> field.setAccessible(true))
                                   .map(field -> {
                                       try {
                                           return String.valueOf(field.get(car));
                                       } catch (IllegalAccessException e) {
                                           e.printStackTrace();
                                           return "";
                                       }
                                   })
                                   .map(value -> "'" + value + "'")
                                   .collect(Collectors.joining(", "));
        return String.format(template, table.schema(), table.table(), fieldNames, fieldValues);
    }
}
