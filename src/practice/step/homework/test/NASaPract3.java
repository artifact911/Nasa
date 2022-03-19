package practice.step.homework.test;

import java.util.Scanner;

public class NASaPract3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = in.nextInt();
        System.out.print("Input a number: ");
        int num2 = in.nextInt();
        int sumNum = num1 + num2;
        int negNum = num1 - num2;
        int umnNum = num1 * num2;

        System.out.printf("Моя сумма: %d \n", sumNum);
        System.out.printf("Моя разница: %d \n", negNum);
        System.out.printf("Мое произведение: %d \n", umnNum);
        in.close();


    }
}
