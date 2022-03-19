package step.cw.practice02.Task10.Task10t1.partsFor10;

import java.util.Arrays;

public class Part2 {
    public static void pr10t1Part2(int[] arrAll) {
        int noRepeat = 0;
        int[] noRepArr = new int[arrAll.length];
        Arrays.sort(arrAll);
        //System.out.println(Arrays.toString(arrAll));

        for (int i = 0; i < arrAll.length; i++) {
            if (i != 0 && arrAll[i] == arrAll[i - 1]) {
                continue;
            }
            noRepArr[noRepeat] = arrAll[i];
            noRepeat++;
        }
        int[] noRepFinish = Arrays.copyOf(noRepArr, noRepeat);
        System.out.println("Arrays without repeat is: " + Arrays.toString(noRepFinish));
    }
}
