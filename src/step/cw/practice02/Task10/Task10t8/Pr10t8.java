package step.cw.practice02.Task10.Task10t8;

import step.cw.practice02.Task10.Task10t8.Parts10t8.Part1;
import step.cw.practice02.Task10.Task10t8.Parts10t8.Part2;
import step.cw.practice02.Task10.Task10t8.Parts10t8.Part3;
import step.cw.practice02.Task10.Task10t8.Parts10t8.Part4;

public class Pr10t8 {
    public static void main(String[] args) {
        int[][] array1 = new int[2][2];
        int[][] array2 = new int[2][2];
        Part1.createArr(array1);
        Part1.createArr(array2);
        Part2.sum(array1, array2);
        Part3.difference(array1, array2);
        Part4.product(array1, array2);

    }


}
