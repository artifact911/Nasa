package step.cw.practice02.Task10;

import java.util.Arrays;
import java.util.Random;

public class Pr10t7 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[][] array = new int[3][3];
        int min = 0;
        int max = 20;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ran.nextInt(max - min) + min;
            }
        }

        System.out.println(Arrays.deepToString(array));
        System.out.println();

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        sortColumn(array[0], array[1], array[2]);
    }

    public static void sortColumn(int[] array0, int[] array1, int[] array2) {

        int[] array01 = new int[3];
        array01[0] = array0[0];
        array01[1] = array1[0];
        array01[2] = array2[0];
        Arrays.sort(array01);
        System.out.println("Min is: " + array01[0] + " Max is: " + array01[2]);

        int[] array11 = new int[3];
        array11[0] = array0[1];
        array11[1] = array1[1];
        array11[2] = array2[1];
        Arrays.sort(array11);
        System.out.println("Min is: " + array11[0] + " Max is: " + array11[2]);

        int[] array21 = new int[3];
        array21[0] = array0[2];
        array21[1] = array1[2];
        array21[2] = array2[2];
        Arrays.sort(array21);
        System.out.println("Min is: " + array21[0] + " Max is: " + array21[2]);


    }

}
