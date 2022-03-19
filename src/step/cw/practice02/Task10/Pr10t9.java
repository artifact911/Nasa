package step.cw.practice02.Task10;

import java.util.Scanner;

public class Pr10t9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[5][5];
        System.out.println("Input the start number:");
        int value = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
                value += 7;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
