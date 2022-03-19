package step.cw.practice.Practice06;

import java.util.Scanner;

public class Pr06t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean x = false;

        do {
            x = true;
            System.out.println("Введите номер месяца:");
            int numOfMonth = in.nextInt();

            if (numOfMonth < 1 || numOfMonth > 12) {
                x = false;
                System.out.println("Нам неизвестен такой месяц.");
            } else {
                switch (numOfMonth) {
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("Winter!");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Spring!");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Summer!");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Autumn!");
                        break;
                }
            }

        } while (!x);
    }
}
