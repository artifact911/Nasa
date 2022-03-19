package step.cw.practice.Practice08;

import java.util.Scanner;

public class Pr08t2 { // Для стороны 7, иначе подбираем пробелы
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int mainNumber = in.nextInt();
        in.close();

        for (int i = 0; i < mainNumber; i++) {
            System.out.print("+");

        }
        System.out.println();
        for (int i = 0; i < mainNumber - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < mainNumber - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("+");

        }
        for (int i = 0; i < mainNumber; i++) {
            System.out.print("+");

        }
    }
}
