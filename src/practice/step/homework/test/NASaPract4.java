package practice.step.homework.test;

import java.util.Scanner;

public class NASaPract4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = in.nextInt();
        System.out.print("Input a number: ");
        int num2 = in.nextInt();
        float precent = (float) num1 / 100 * num2;

        System.out.printf("Процент: %f \n", precent);
        in.close();


    }
}
