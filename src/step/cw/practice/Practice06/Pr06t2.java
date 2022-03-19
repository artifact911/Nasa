package step.cw.practice.Practice06;

import java.util.Scanner;

public class Pr06t2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        secondMethod(in);
    }

    private static void secondMethod(Scanner in) {
        System.out.println("Введите шестизначное число:");
        String mainNumber = in.next();
        if (mainNumber.length() != 6) {
            System.out.println("Введенное число не соответсвует условиям");
            secondMethod(in);
        } else {
            char[] chars = mainNumber.toCharArray();
            int num1 = Character.getNumericValue(chars[0]); // Из массива чаров достал символ из позиции 0
            //int num1 = (mainNumber / 100000);
           /* int num2 = (mainNumber / 10000) % 10;
            int num3 = (mainNumber / 1000) % 10;
            int num4 = (mainNumber / 100) % 10;
            int num5 = (mainNumber / 10) % 10;
            int num6 = mainNumber % 10;
            System.out.println ("" + num6 + num5 + num3 + num4 + num2 + num1);*/
            in.close();
        }
    }
}
