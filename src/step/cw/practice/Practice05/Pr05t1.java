package step.cw.practice.Practice05;

import java.util.Scanner;

public class Pr05t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number:");
        int mainNumber = in.nextInt();
        in.close();

        switch (mainNumber % 2) {
            case 1: {
                System.out.println("Odd Number");
                break;
            }
            default: {
                System.out.println("Even Number");
            }
        }
    }
}
