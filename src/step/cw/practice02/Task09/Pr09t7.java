package step.cw.practice02.Task09;

import java.util.Arrays;
import java.util.Scanner;

public class Pr09t7 {
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
        System.out.print("Input number:");
        int testNum = in.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == testNum) {
                count++;
            }
        }
        System.out.print("Input number meets " + count + " times");
    }
}
