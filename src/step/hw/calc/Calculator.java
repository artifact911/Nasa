package step.hw.calc;

import step.hw.calc.ForTask01.Part1;
import step.hw.calc.ForTask01.Part2;
import step.hw.calc.ForTask01.Part3;

public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        char operation;
        double total;

        num1 = Part1.getInt();
        num2 = Part1.getInt();
        operation = Part2.getOperation(num2);
        total = Part3.calc(num1, num2, operation);
        System.out.printf("Total is: %d %c %d = %f", num1, operation, num2, total);
        System.out.println();
    }
}
