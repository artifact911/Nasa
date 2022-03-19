package step.cw.practice.Practice06;

import java.util.Scanner;

public class Pr06t2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean x = false;
        do {
            x = true;
            System.out.println("Введите шестизначное число:");
            String mainNumber = in.next(); // Тут я делаю введенное число типа String

            if (mainNumber.length() != 6) { // Тут я задал условие, если длина строки mainNumber не 6
                x = false;
                System.out.println("Число не соответствует требованиям!");

            } else {
                char[] chars = mainNumber.toCharArray(); // создал из своей шестизначной строки массив односимвольных чаров

                int num1 = Character.getNumericValue(chars[0]); // Из массива чаров достал символ из позиции 0
                int num2 = Character.getNumericValue(chars[1]); // Из массива чаров достал символ из позиции 1
                int num3 = Character.getNumericValue(chars[2]); // Из массива чаров достал символ из позиции 2
                int num4 = Character.getNumericValue(chars[3]); // Из массива чаров достал символ из позиции 3
                int num5 = Character.getNumericValue(chars[4]); // Из массива чаров достал символ из позиции 4
                int num6 = Character.getNumericValue(chars[5]); // Из массива чаров достал символ из позиции 5

                System.out.println("" + num6 + num5 + num3 + num4 + num2 + num1); // Пробел вначале , чтоб был String, а сумма
                in.close();
            }
        } while (!x);
    }
}
