package step.cw.practice02.Task09;

import java.util.Arrays;
import java.util.Scanner;

public class Pr09t6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input array's length:");
        int length = in.nextInt();
        int array[] = new int[length];
        System.out.println("Input array's elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int middle = sum / array.length;
        System.out.println("Sum is: " + sum);
        System.out.println("Middle is: " + middle);
    }
}
