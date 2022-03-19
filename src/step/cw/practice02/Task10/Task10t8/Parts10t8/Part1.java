package step.cw.practice02.Task10.Task10t8.Parts10t8;

import java.util.Random;

public class Part1 {
    public static int[][] createArr(int[][] array) {
        Random ran = new Random();
        int min = 0;
        int max = 20;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ran.nextInt(max - min) + min;
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return array;
    }
}
