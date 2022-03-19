package step.hw.calc.ForTask01;

public class Part3 {
    public static double calc(int num1, int num2, char operation) {
        double total = 0;
        switch (operation) {
            case '/': {
                total = (double) num1 / num2;
                break;
            }
            case '*': {
                total = num1 * num2;
                break;
            }
            case '-': {
                total = num1 - num2;
                break;
            }
            case '+': {
                total = num1 + num2;
                break;
            }
            default: {
                System.out.println("I'm really old step.hw.calc. I couldn't make this operation");
            }
        }
        return total;
    }
}
