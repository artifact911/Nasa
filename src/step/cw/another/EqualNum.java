package step.cw.another;

import java.util.Scanner;

public class EqualNum {
    public static void main(String[] args) {
        min();
        onTwo();
        sqare();
        squareAndSum();

    }

    public static void min() {
        Scanner cs = new Scanner(System.in);
        System.out.println("Input number:");
        int firstNum = cs.nextInt();
        System.out.println("Input number:");
        int secondNum = cs.nextInt();
        if (firstNum > secondNum) {
            System.out.println(secondNum);
        } else {
            System.out.println(firstNum);
        }
    }

    public static void onTwo() {
        Scanner cs = new Scanner(System.in);
        System.out.println("Input number:");
        int num = cs.nextInt();
        if (num % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void sqare() {
        Scanner cs = new Scanner(System.in);
        System.out.println("Input number:");
        int num = cs.nextInt();
        int numSquare = num * num;
        System.out.printf("Square of number: %d", numSquare);
        System.out.println();
    }

    public static void squareAndSum() {
        Scanner cs = new Scanner(System.in);
        System.out.println("Input number:");
        int firstNum = cs.nextInt();
        System.out.println("Input number:");
        int secondNum = cs.nextInt();
        System.out.println("Input square:");
        int square = cs.nextInt();
        int result = (int) Math.pow(firstNum, square) + (int) Math.pow(secondNum, square);

        System.out.println(result);
    }


}
