package practice.step.homework.test;

import java.util.Scanner;

public class NASaPract5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int side1 = in.nextInt();
        System.out.print("Input a number: ");
        int side2 = in.nextInt();
        int sqare = side1 * side2;


        System.out.printf("Моя площадь: %d \n", sqare);
        in.close();
    }
}
