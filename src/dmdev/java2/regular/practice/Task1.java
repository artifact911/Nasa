package dmdev.java2.regular.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 1. Написать программу, проверяющую является ли введенная строка адресом почтового ящика.
 * В названии почтового ящика резрешить использование только букв, цифр и нижних подчеркиваний, при этом оно должно начинаться с буквы.
 * Возможные домены верхнего уровня: .org, .com
 */

public class Task1 {

    public static void main(String[] args) {
        String email;
        try (Scanner sc = new Scanner(System.in)) {
            email = sc.nextLine();
        }
        System.out.println(checkEmail(email));
    }

    private static boolean checkEmail(String email) {
        String regex = "[a-zA-Z]\\w*@\\w{3,}\\.(org|com)";

        return Pattern.matches(regex, email);
    }
}
