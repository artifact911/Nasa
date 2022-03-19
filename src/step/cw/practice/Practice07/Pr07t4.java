package step.cw.practice.Practice07;

import java.util.Scanner;

public class Pr07t4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNumber = in.nextInt();
        System.out.println("Input second number:");
        int secondNumber = in.nextInt();
        in.close();

        int sum = 0;
        int severalNum = 0;


        for (; firstNumber <= secondNumber; firstNumber++) {
            sum = sum + firstNumber;
            severalNum++;
        }
        double middle = sum / severalNum;
        System.out.println("The sum is: " + sum);
        System.out.println("The Middle Number is: " + middle);


    }
}
