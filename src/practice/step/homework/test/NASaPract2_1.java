package practice.step.homework.test;

import java.util.Scanner;

public class NASaPract2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = in.nextInt();
        System.out.print("Input a number: ");
        int num2 = in.nextInt();
        System.out.print("Input a number: ");
        int num3 = in.nextInt();
        String sum = "" + num1 + num2 + num3;

        System.out.printf("Общее: %s \n", sum);
        in.close();
    }
}
