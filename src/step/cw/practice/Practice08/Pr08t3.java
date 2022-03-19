package step.cw.practice.Practice08;

import java.util.Scanner;

public class Pr08t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int length = in.nextInt();
        System.out.println("Input second number:");
        int width = in.nextInt();
        in.close();

        for (int i = 1; i <= length; i++) {
            System.out.print("+");
        }
        System.out.println();

        for (int o = 1; o <= width - 2; o++) {
            System.out.print("+");
            for (int p = 1; p <= width; p++) {
                System.out.print("  ");
            }
            System.out.println("+");

        }
        for (int i = 1; i <= length; i++) {
            System.out.print("+");
        }


    }
}
