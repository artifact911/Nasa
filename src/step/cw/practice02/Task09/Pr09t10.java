package step.cw.practice02.Task09;

import java.util.Arrays;
import java.util.Random;

public class Pr09t10 {
    public static void main(String[] args) {
        int[] arrayInt = new int[20];
        int min = -20;
        int max = 20;
        Random ran = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ran.nextInt(max - min) + min;
        }
        System.out.println(Arrays.toString(arrayInt));

        int chetNum = 0;
        int noChetNum = 0;
        int negativeNum = 0;
        int positiveNum = 0;
        int[] chetArr = new int[arrayInt.length];
        int[] noChetArr = new int[arrayInt.length];
        int[] negativeArr = new int[arrayInt.length];
        int[] positiveArr = new int[arrayInt.length];

        for (int value : arrayInt) {
            if (value % 2 == 0) {
                chetArr[chetNum] = value;
                chetNum++;
            } else {
                noChetArr[noChetNum] = value;
                noChetNum++;
            }
            if (value < 0) {
                negativeArr[negativeNum] = value;
                negativeNum++;
            } else {
                positiveArr[positiveNum] = value;
                positiveNum++;
            }
        }
        System.out.println(Arrays.toString(chetArr));
        System.out.println(Arrays.toString(noChetArr));
        System.out.println(Arrays.toString(negativeArr));
        System.out.println(Arrays.toString(positiveArr));

        int[] chetArr2;
        int[] noChetArr2;
        int[] negativeArr2;
        int[] positiveArr2;

        chetArr2 = Arrays.copyOf(chetArr, chetNum);
        noChetArr2 = Arrays.copyOf(noChetArr, noChetNum);
        negativeArr2 = Arrays.copyOf(negativeArr, negativeNum);
        positiveArr2 = Arrays.copyOf(positiveArr, positiveNum);

        System.out.println(Arrays.toString(chetArr2));
        System.out.println(Arrays.toString(noChetArr2));
        System.out.println(Arrays.toString(negativeArr2));
        System.out.println(Arrays.toString(positiveArr2));
    }
}
