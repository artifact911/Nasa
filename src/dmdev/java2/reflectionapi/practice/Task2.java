package dmdev.java2.reflectionapi.practice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 2. Для получения данных программа должна использовать только get-методы (нельзя использовать значения приватный полей).
 */
public class Task2 {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");

        try {
            System.out.println(insertToDB(car));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static String insertToDB(Car car) throws NoSuchFieldException {

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
                                   .map(field -> getMethodName(car, field))
                .map(method -> {
                    try {
                        return method.invoke(car);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                })
                                   .map(value -> "'" + value + "'")
                                   .collect(Collectors.joining(", "));
        return String.format(template, table.schema(), table.table(), fieldNames, fieldValues);
    }

    public static Method getMethodName(Car car, Field field) {
        String name = field.getName();
        try {
            return car.getClass().getMethod("get" + name.substring(0, 1).toUpperCase() + name.substring(1));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
