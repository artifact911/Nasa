package practice.step.homework.test;

import java.util.Scanner;

public class NASaPract2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int mainNum = in.nextInt();
        int num1 = (mainNum / 1000);
        int num2 = (mainNum / 100) % 10;
        int num3 = (mainNum / 10) % 10;
        int num4 = mainNum % 10;

        int allMnog = num1 * num2 * num3 * num4;

        System.out.printf("Произведение: %d \n", allMnog);
        in.close();
    }
}
