package step.cw.practice02.Task10;

import java.util.Arrays;
import java.util.Scanner;

public class Pr10t2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many employee do you have?");
        int employees = in.nextInt();
        int[] array = new int[employees];
        for (int i = 0; i < array.length; i++) {
            System.out.println("What the salary do they have?");
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Input option for sort: 1 - up, 2 - down");
        int option = in.nextInt();
        switch (option) {
            case 1:
                Arrays.sort(array);
                System.out.println("UP-sort is: " + Arrays.toString(array));
                break;
            case 2:
                boolean sorted = false;
                int temp;
                while (!sorted) {
                    sorted = true;
                    for (int i = array.length - 1; i > 0; i--) {
                        if (array[i] > array[i - 1]) {
                            temp = array[i];
                            array[i] = array[i - 1];
                            array[i - 1] = temp;
                            sorted = false;
                        }
                    }
                }
                System.out.println("DOWN-sort is: " + Arrays.toString(array));
                break;
            default:
                System.out.println("Invalid choose");
        }
    }
}
