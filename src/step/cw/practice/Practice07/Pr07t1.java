package step.cw.practice.Practice07;

import java.util.Scanner;

public class Pr07t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNumber = in.nextInt();
        System.out.println("Input second number:");
        int secondNumber = in.nextInt();
        in.close();

        do {
            System.out.println(firstNumber);
            firstNumber++;
        } while (firstNumber <= secondNumber);
    }

}
