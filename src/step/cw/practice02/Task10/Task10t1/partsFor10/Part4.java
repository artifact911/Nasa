package step.cw.practice02.Task10.Task10t1.partsFor10;

import java.util.Arrays;

public class Part4 {
    public static void pr10t1Part4(int[] arrInt1, int[] arrInt2) {
        int[] uniqueArr1 = new int[arrInt1.length];
        int[] uniqueArr2 = new int[arrInt2.length];
        int unique1 = 0;
        int unique2 = 0;

        for (int i = 0; i < arrInt1.length; i++) {
            if (i != 0 && arrInt1[i] == arrInt1[i - 1]) {
                continue;
            }
            uniqueArr1[unique1] = arrInt1[i];
            unique1++;
        }
        for (int i = 0; i < arrInt2.length; i++) {
            if (i != 0 && arrInt2[i] == arrInt2[i - 1]) {
                continue;
            }
            uniqueArr2[unique2] = arrInt2[i];
            unique2++;
        }
        int[] uniqueArrAll = Arrays.copyOf(uniqueArr1, unique1 + unique2);
        System.arraycopy(uniqueArr2, 0, uniqueArrAll, unique1, unique2);
        System.out.println("Array with unique elements is: " + Arrays.toString(uniqueArrAll));
    }
}
