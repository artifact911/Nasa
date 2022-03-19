package step.cw.practice02.Task10.Task10t1;

import step.cw.practice02.Task10.Task10t1.partsFor10.*;

public class Pr10t1 {
    public static void main(String[] args) {
        int[] arrInt1 = new int[5];
        int[] arrInt2 = new int[5];

        int[] arrAll = Part1.pr10t1Part1(arrInt1, arrInt2);
        Part2.pr10t1Part2(arrAll);
        Part3.pr10t1Part3(arrInt1, arrInt2);
        Part4.pr10t1Part4(arrInt1, arrInt2);
        Part5.pr10t1Part5(arrInt1, arrInt2);
    }

}

