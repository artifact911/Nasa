package practice.step.homework.test;

import java.util.Scanner;

public class NASaPract2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num1 = in.nextInt();
        int sm = num1 * 100;
        int dc = num1 * 1000;
        int mm = num1 * 10000;
        float mile = num1 / 1609f;

        System.out.printf("см: %d \n", sm);
        System.out.printf("дц: %d \n", dc);
        System.out.printf("мм: %d \n", mm);
        System.out.printf("миля: %f \n", mile);
        in.close();
    }

}
