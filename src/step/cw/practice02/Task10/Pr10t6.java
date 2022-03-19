package step.cw.practice02.Task10;

import java.util.Arrays;
import java.util.Random;

public class Pr10t6 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[][] array = new int[5][5];
        int min = 0;
        int max = 20;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ran.nextInt(max - min) + min;
            }
        }

        System.out.println(Arrays.deepToString(array));
        System.out.println();

      /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

            }*/
        minMaxArr(array[0]);
        minMaxArr(array[1]);
        minMaxArr(array[2]);
        minMaxArr(array[3]);
        minMaxArr(array[4]);

    }

    public static void minMaxArr(int[] array) {
        Arrays.sort(array);
        int mn = array[0];
        int mx = array[array.length - 1];
        /*int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }*/
        System.out.printf("Min is: %d Max is: %d", mn, mx);
        System.out.println();
    }
}
