package andersen.toLab.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Введите число:");
        try {
            number = input.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            }
        } catch (InputMismatchException e) {
            System.err.println("Ошибка ввода числа");
        }
        input.close();
    }
}
