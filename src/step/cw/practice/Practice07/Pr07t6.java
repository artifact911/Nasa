package step.cw.practice.Practice07;

import java.util.Scanner;

public class Pr07t6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input length of line:");
        int length = in.nextInt();
        System.out.println("Input simvol of line:");
        String simvol = in.next();
        in.close();

        int i = 1;
        for (i = 1; i <= length; i++) {
            System.out.print(simvol);
        }


    }
}
