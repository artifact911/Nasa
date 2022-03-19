package step.hw.hw2;


import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arrayInt = new int[30];
        int min = 0;
        int max = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ((int) (Math.random() * 121) - 70);
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
        }
        System.out.println(Arrays.toString(arrayInt));

        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min);

        /*Arrays.sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));*/

    }
}
