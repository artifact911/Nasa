package andersen.toLab.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String name;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Введите имя:");
            name = input.nextLine();

            checkName(name);

//            Если Вы хотите игнорировать раскладку клавиатуры, раскомментируйте метод ниже
//            checkNameIgnoreKeyboardCase(name);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void checkNameIgnoreKeyboardCase(String name) {
        if (name.toUpperCase().equals("ВЯЧЕСЛАВ")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

    }

    private static void checkName(String name) {
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
