package step.cw.practice.Practice07;

import java.util.Scanner;

public class Pr07t5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int mainNumber = in.nextInt();
        in.close();

        int factorial = 1;

        for (int i = 1; i <= mainNumber; i++) {
            factorial *= i;

        }
        System.out.println(factorial);
    }
}
