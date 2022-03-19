package step.cw.practice02.Task09;

import java.util.Scanner;

public class Pr09t4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a text:");
        String mainText = in.nextLine();
        in.close();

        StringBuffer mainText2 = new StringBuffer(mainText);
        mainText2.reverse();
        //System.out.println(mainText2);

        if (mainText.equals(mainText2.toString())) { // Перевести StringBuffer in String
            System.out.println("Палиндром");
        } else {
            System.out.println("Нет, не палиндром");
        }
    }
}
