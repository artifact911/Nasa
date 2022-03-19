package step.hw.hw8;

import staticMethods.randomIntArray.RandomIntArray;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        division(getIntNum());

    }

    private static int getIntNum() {
        int num = 0;
        System.out.println("Enter the number you want to divide:");
        try {
            num = new Scanner(System.in).nextInt();
            return num;
        } catch (InputMismatchException e) {
            System.err.println("Invalid divisible was entered");
        }
        return num;
    }

    private static void division(int num) {
        int[] array = RandomIntArray.getRandomArrayInt();
        System.out.println(Arrays.toString(array));
        try {
            for (int i = 0; i < array.length; i++) {
                try {
                    System.out.println(num + " / " + array[i] + " = " + num / array[i]);
                } catch (NullPointerException e) {
                    System.err.println("Failed to create an array.");
                    System.err.println(e.getClass().getName());
                } catch (ArithmeticException e) {
                    System.out.println("Divide by zero in index " + i);
                    System.err.println(e.getClass().getName());
                }
            }
        } catch (NullPointerException e) {
            System.err.println("Array is null");
            System.out.println(e.getClass().getName());
        }
    }

}

