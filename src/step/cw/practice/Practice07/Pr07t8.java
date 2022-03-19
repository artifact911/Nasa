package step.cw.practice.Practice07;

import java.util.Scanner;

public class Pr07t8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNumber = in.nextInt();
        System.out.println("Input second number:");
        int secondNumber = in.nextInt();
        in.close();

        for (int i = 1; i <= secondNumber; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("Numbers Fizz Buzz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Number Buzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Number Fizz " + i);
            } else {
                System.out.println(i);
            }
        }
    }
}
