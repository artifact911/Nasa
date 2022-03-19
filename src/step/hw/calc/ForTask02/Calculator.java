package step.hw.calc.ForTask02;

import step.hw.calc.ForTask01.Part3;

import java.util.Scanner;

public class Calculator {
    private Integer num1;
    private Integer num2;
    private Character operation;

    public Calculator() {
    }

    public Calculator(Integer num1, Integer num2, Character operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }


    private Integer getNumFromScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        return sc.nextInt();
    }

    private void insertChar() {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        char symbol = ' ';
        do {
            flag = true;
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
        in.close();
        operation = symbol;
    }

    private void insertNum1() {
        num1 = getNumFromScanner();
    }

    private void insertNum2() {
        num2 = getNumFromScanner();
    }

    public void setAllVariables() {
        insertNum1();
        insertNum2();
        insertChar();
    }

    public void total() {
        double result = Part3.calc(num1, num2, operation);
        int resultInt = (int) result;

        if (result - resultInt == 0) {
            System.out.printf("Total is: %d %c %d = %d", num1, operation, num2, resultInt);
        } else {
            System.out.printf("Total is: %d %c %d = %f", num1, operation, num2, result);
        }
        System.out.println();


    }


}
