package step.cw.practice.Practice05;

import java.util.Scanner;

public class Pr05t3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = in.nextInt();

        System.out.println("Input second number:");
        int num2 = in.nextInt();

        System.out.println("Input third number:");
        int num3 = in.nextInt();

        boolean x = false;

        do {
            System.out.println("Choose operation: 1 - is \"max\"; 2 - is \"min\"; 3 - is \"middle\" ");
            int operation = in.nextInt();

            switch (operation) {
                case 1: {
                    x = true;
                    if (num1 > num2 & num1 > num3) {
                        System.out.printf("Max of numbers is %s", num1);
                    } else if (num2 > num1 & num2 > num3) {
                        System.out.printf("Max of numbers is %s", num2);
                    } else {
                        System.out.printf("Max of numbers is %s", num3);
                    }
                    break;
                }
                case 2: {
                    x = true;
                    if (num1 < num2 & num1 < num3) {
                        System.out.printf("Min of numbers is %s", num1);
                    } else if (num2 < num1 & num2 < num3) {
                        System.out.printf("Min of numbers is %s", num2);
                    } else {
                        System.out.printf("Min of numbers is %s", num3);
                    }
                    break;
                }
                case 3: {
                    x = true;
                    double middle = (num1 + num2 + num3) / 3d;
                    System.out.printf("Arithmetic mean of numbers is %s", middle);
                    break;
                }
            }
        } while (!x);
        in.close();

    }
}
