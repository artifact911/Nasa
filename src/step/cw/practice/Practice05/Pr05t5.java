package step.cw.practice.Practice05;

import java.util.Scanner;

public class Pr05t5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean x = false;
        do {
            System.out.println("Input hours:");
            int hours = in.nextInt();

            if (hours >= 0 & hours < 6) {
                x = true;
                System.out.println("Good Night!");
            } else if (hours >= 6 & hours < 13) {
                x = true;
                System.out.println("Good Morning!");
            } else if (hours >= 13 & hours < 17) {
                x = true;
                System.out.println("Good Day!");
            } else if (hours >= 17 & hours <= 24) {
                x = true;
                System.out.println("Good Evening!");
            }
        } while (!x);
        in.close();
    }
}
