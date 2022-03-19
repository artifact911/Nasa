package step.cw.practice.Practice05;

import java.util.Scanner;

public class Pr05t2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = in.nextInt();

        System.out.println("Input second number:");
        int num2 = in.nextInt();

        System.out.println("Input third number:");
        int num3 = in.nextInt();

        int x = 0;

        do {
            System.out.println("Choose operation: 1 - is \"+\"; 2 - is \"*\"");
            int operation = in.nextInt();

            switch (operation) {
                case 1: {
                    x++;
                    int sum = num1 + num2 + num3;
                    System.out.printf("The sum of the numbers is: %s", sum);
                    break;
                }
                case 2: {
                    x++;
                    int prod = num1 * num2 * num3;
                    System.out.printf("The product of the numbers is: %s", prod);
                    break;
                }

            }

        } while (x == 0);
        in.close();
    }
}
