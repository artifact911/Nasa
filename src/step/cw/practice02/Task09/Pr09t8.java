package step.cw.practice02.Task09;

import java.util.Arrays;
import java.util.Random;

public class Pr09t8 {
    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        int min = -20;
        int max = 20;
        Random ran = new Random();
        int minRang = 0;
        int maxRang = 0;
        int negativeElem = 0;
        int positiveElem = 0;
        int zero = 0;
        int score = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ran.nextInt(max - min) + min;
        }
        System.out.println(Arrays.toString(arrayInt));
        Arrays.sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));

        minRang = arrayInt[0];
        maxRang = arrayInt[arrayInt.length - 1];

        for (int j : arrayInt) {
            if (j == 0) {
                zero++;
            }
            if (j < 0) {
                negativeElem++;
            }
            if (j > 0) {
                positiveElem++;
            }

        }
        System.out.println("Min rang is: " + minRang);
        System.out.println("Max rang is: " + maxRang);
        System.out.println("There are zero in the array: " + zero);
        System.out.println("There are negative numbers in the array: " + negativeElem);
        System.out.println("There are positive numbers in the array: " + positiveElem);

    }
}
