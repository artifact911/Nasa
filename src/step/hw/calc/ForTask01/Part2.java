package step.hw.calc.ForTask01;

import java.util.Scanner;

public class Part2 {
    public static char getOperation(int num2) {
        boolean flag = false;
        char symbol = ' ';
        do {
            flag = true;
            Scanner in = new Scanner(System.in);
            System.out.println("Input operation:");
            String oper = in.next();
            if (oper.equals("/") && num2 == 0) {
                flag = false;
                System.out.println("Input valid operation");
            } else {
                char[] arrayCh = oper.toCharArray();
                symbol = arrayCh[0];

            }
        } while (!flag);
        return symbol;
    }
}
