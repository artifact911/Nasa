package step.cw.practice02.Task10.Task10t1.partsFor10;

import java.util.Arrays;
import java.util.Random;

public class Part1 {
    public static int[] pr10t1Part1(int[] arrInt1, int[] arrInt2) {


        int min = -20;
        int max = 20;
        Random ran = new Random();

        for (int i = 0; i < arrInt1.length; i++) {
            arrInt1[i] = ran.nextInt(max - min) + min;
        }
        for (int i = 0; i < arrInt2.length; i++) {
            arrInt2[i] = ran.nextInt(max - min) + min;
        }
        //System.out.println(Arrays.toString(arrInt1));
        //System.out.println(Arrays.toString(arrInt2));
        int[] arrAll;
        arrAll = Arrays.copyOf(arrInt1, arrInt1.length + arrInt2.length);
        //System.out.println(Arrays.toString(arrAll));
        System.arraycopy(arrInt2, 0, arrAll, arrInt1.length, arrInt2.length);
        //String yy = Arrays.toString(arrAll);
        System.out.println("New array is: " + Arrays.toString(arrAll));
        //System.out.printf(" New array is: %s  ",  Arrays.toString(arrAll));
        return arrAll;
    }
}
