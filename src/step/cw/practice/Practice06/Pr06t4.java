package step.cw.practice.Practice06;

import java.util.Scanner;

public class Pr06t4 {
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
                        System.out.println("January");
                        break;
                    case 2:
                        System.out.println("February");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("September");
                        break;
                    case 10:
                        System.out.println("October");
                        break;
                    case 11:
                        System.out.println("November");
                        break;
                    case 12:
                        System.out.println("December");
                        break;
                }
            }

        } while (!x);
    }
}
