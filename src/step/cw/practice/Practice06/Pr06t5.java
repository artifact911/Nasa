package step.cw.practice.Practice06;

import java.util.Scanner;

public class Pr06t5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean x = false;

        {
            x = true;
            System.out.println("Input a number from 1 to 100");
            int mainNumber = in.nextInt();

            if (mainNumber < 1 || mainNumber > 100) {
                x = false;
                System.out.println("The number of invalid");
            } else if (mainNumber % 3 == 0 & mainNumber % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (mainNumber % 5 == 0) {
                System.out.println("Buzz");
            } else if (mainNumber % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(mainNumber);
            }

        }
        while (!x) ;
    }
}
