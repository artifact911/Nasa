package step.cw.practice.Practice08;

import java.util.Scanner;

public class Pr08t4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input start number of range:");
        int start = in.nextInt();
        System.out.println("Input finish number of range:");
        int finish = in.nextInt();
        in.close();

        for (int i = start; i <= finish; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println("Simple number is: " + i);
            }
        }
    }
}
