package step.cw.practice02.Task10.Task10t1.partsFor10;

import java.util.Arrays;

public class Part3 {
    public static void pr10t1Part3(int[] arrInt1, int[] arrInt2) {
        int[] forAllArr = new int[arrInt1.length + arrInt2.length];
        int forAll = 0;

        for (int i : arrInt1) {
            for (int j : arrInt2) {
                if (i == j) {
                    forAllArr[forAll] = i;
                    forAll++;
                }
            }
        }
        int[] forAllFinish = Arrays.copyOf(forAllArr, forAll);
        System.out.println("Arrays with public elements is: " + Arrays.toString(forAllFinish));
    }
}
