package step.cw.practice02.Task10.Task10t1.partsFor10;

import java.util.Arrays;

public class Part5 {
    public static void pr10t1Part5(int[] arrInt1, int[] arrInt2) {
        Arrays.sort(arrInt1);
        Arrays.sort(arrInt2);

        int[] minMax1 = new int[]{arrInt1[0], arrInt1[arrInt1.length - 1]};
        int[] minMax2 = new int[]{arrInt2[0], arrInt2[arrInt2.length - 1]};

        int[] minMax = Arrays.copyOf(minMax1, 4);
        System.arraycopy(minMax2, 0, minMax, 2, 2);
        System.out.println("Min & Max elements from arrays are: " + Arrays.toString(minMax));
    }
}
