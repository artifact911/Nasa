package step.cw.practice02.Task09;

import java.util.Arrays;
import java.util.Random;

public class Pr09t9 {
    public static void main(String[] args) {
        int[] arrayInt = new int[6];
        int min = -20;
        int max = 20;
        Random ran = new Random();
        int sumNegative = 0;
        int sumChet = 0;
        int sumNeChet = 0;
        int prodIndex3 = 1;
        int prodAll = 1;
        int sumPositiveBetween = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ran.nextInt(max - min) + min;
        }
        System.out.println(Arrays.toString(arrayInt));


        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < 0) {
                sumNegative += arrayInt[i];
            }
            if (arrayInt[i] % 2 == 0) {
                sumChet += arrayInt[i];
            }
            if (arrayInt[i] % 2 != 0) {
                sumNeChet += arrayInt[i];
            }
            if (i % 3 == 0) {
                prodIndex3 *= arrayInt[i];
            }
        }
        Arrays.sort(arrayInt);

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] != arrayInt[0] && i < arrayInt.length - 1) {
                prodAll *= arrayInt[i];
            }
            if (arrayInt[i] > 0 && i < arrayInt.length - 1) {
                sumPositiveBetween += arrayInt[i];
            }
        }
        System.out.println("Сумма отрицательных чисел: " + sumNegative);
        System.out.println("Сумма четных чисел: " + sumChet);
        System.out.println("Сумма нечетных чисел: " + sumNeChet);
        System.out.println("Произведение чисел с индексах кратных трём: " + prodIndex3);
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Произведение чисел между min и max элементом: " + prodAll);
        System.out.println("Сумма чисем между первым и последним положительным числом: " + sumPositiveBetween);
    }
}
