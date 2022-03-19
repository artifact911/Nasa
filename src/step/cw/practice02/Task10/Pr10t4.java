package step.cw.practice02.Task10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pr10t4 {
    public static void main(String[] args) {
        int[] arrMain = new int[10];

        int min = -10;
        int max = 10;
        Random ran = new Random();

        for (int i = 0; i < arrMain.length; i++) {
            arrMain[i] = ran.nextInt(max - min) + min;
        }
        System.out.println(Arrays.toString(arrMain));
        Arrays.sort(arrMain);
        System.out.println(Arrays.toString(arrMain));

        Scanner in = new Scanner(System.in);
        System.out.println("Что ищем?");
        int searchNum = in.nextInt();

        int num = Arrays.binarySearch(arrMain, searchNum);

        if (num >= 0) {
            System.out.println("Индекс искомого числа" + num);
        } else {
            System.out.println("Не нашел");
        }
    }
}
