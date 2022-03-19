package step.cw.practice.Practice08;

import java.util.Scanner;

public class Pr08t5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNumber = in.nextInt();
        System.out.println("Input second number:");
        int secondNumber = in.nextInt();
        in.close();

        for (int i = 1; i <= 10; i++) {
            int productFN = firstNumber * i;
            System.out.printf(" %d * %d = %d ", firstNumber, i, productFN);
        }
        System.out.println();
        for (int p = 1; p < 40; p++) {
            System.out.print("---");
        }
        System.out.println();
        for (int o = 1; o <= 10; o++) {
            int productSN = secondNumber * o;
            System.out.printf(" %d * %d = %d ", secondNumber, o, productSN);
        }
    }
}
