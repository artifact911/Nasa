package step.cw.practice02.Task10;

import java.util.Arrays;
import java.util.Random;

public class Pr10t3 {
    public static void main(String[] args) {
        int[] arrMain = new int[15];

        int min = -30;
        int max = 30;
        Random ran = new Random();

        for (int i = 0; i < arrMain.length; i++) {
            arrMain[i] = ran.nextInt(max - min) + min;
        }
        System.out.println(Arrays.toString(arrMain));

        int[] arr7 = Arrays.copyOf(arrMain, 7);
        int[] arr8 = new int[8];
        System.arraycopy(arrMain, arr7.length, arr8, 0, arr8.length);

        BubbleSort.bubbleSort(arr7);
        BubbleSort.bubbleSortReverse(arr8);

        // System.out.println(Arrays.toString(arr7));
        // System.out.println(Arrays.toString(arr8));

        int[] arrFinish = Arrays.copyOf(arr7, arrMain.length);
        System.arraycopy(arr8, 0, arrFinish, arr7.length, arr8.length);
        System.out.println(Arrays.toString(arrFinish));


    }
}
