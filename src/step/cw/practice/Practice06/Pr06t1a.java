package step.cw.practice.Practice06; // Предыдущий лучше. Тут не возвращает к вопросу несоответствия

import java.util.Scanner;

public class Pr06t1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите шестизначное число:");
        int mainNumber = in.nextInt();
        if (mainNumber < 100000 || mainNumber > 999999) {
            System.out.println("Число не соответствует требованиям!");

        } else if (mainNumber > 100000 & mainNumber < 999999) {
            int num1 = mainNumber / 100000;
            int num2 = (mainNumber / 10000) % 10;
            int num3 = (mainNumber / 1000) % 10;
            int num4 = (mainNumber / 100) % 10;
            int num5 = (mainNumber / 10) % 10;
            int num6 = mainNumber % 10;
            if (num1 + num2 + num3 == num4 + num5 + num6) {
                System.out.println("Число Счастливое!");
            } else {
                System.out.println("Мы Сожалеем");
                in.close();
            }
        }
    }
}
