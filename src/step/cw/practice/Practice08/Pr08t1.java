package step.cw.practice.Practice08;

import java.util.Scanner;

public class Pr08t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int mainNumber = in.nextInt();
        in.close();

        for (int i = 1; i <= mainNumber; i++) {
            for (int o = 1; o <= mainNumber; o++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
