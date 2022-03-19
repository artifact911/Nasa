package step.cw.practice.Practice05;

import java.util.Scanner;

public class Pr05t4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of meters:");
        int meter = in.nextInt();

        boolean x = false;
        do {
            System.out.println("Choose direction of converts: 1 to mile; 2 to inch; 3 to yard");
            int direction = in.nextInt();
            switch (direction) {
                case 1: {
                    x = true;
                    double mile = meter * 0.0006;
                    System.out.printf("%s meter is %f mile", meter, mile);
                    break;
                }
                case 2: {
                    x = true;
                    double inch = meter * 39.3701;
                    System.out.printf("%s meter is %f inch", meter, inch);
                    break;
                }
                case 3: {
                    x = true;
                    double yard = meter * 1.0936;
                    System.out.printf("%s meter is %f yard", meter, yard);
                    break;
                }
            }
        } while (!x);
        in.close();

    }
}
