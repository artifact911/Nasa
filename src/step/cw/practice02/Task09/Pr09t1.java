package step.cw.practice02.Task09;

import java.util.Scanner;

public class Pr09t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input text:");
        String name = in.next();
        in.close();

        StringBuffer name2 = new StringBuffer(name);
        name2.reverse();
        System.out.println(name2);

    }
}
