package step.hw.hw2;

import java.util.Arrays;

public class RepeatTimesArray {
    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        int flag = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ((int) (Math.random() * 21) - 10);
        }
        System.out.println(Arrays.toString(arrayInt));
        Arrays.sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));

        for (int i = 0; i < arrayInt.length; i++) {
            if (i != 0 && arrayInt[i] == arrayInt[i - 1]) {
                continue;
            }
            for (int j = 0; j < arrayInt.length; j++) {
                if (arrayInt[i] == arrayInt[j]) {
                    flag++;
                }
            }
            if (flag > 1) {
                System.out.println("Repeat number is: " + arrayInt[i] + " " + flag + " times");
            }
            flag = 0;
        }

    }
}
