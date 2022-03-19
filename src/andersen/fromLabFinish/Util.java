package andersen.fromLabFinish;

public class Util {

    public static int getFactorialRecursive(int n) {
        if (checkNumForFactorial(n)) {
            return n * getFactorialRecursive(n - 1);
        } else {
            return 1;
        }
    }

    public static int getFactorialIteration(int n) {
        int result = 1;
        if (checkNumForFactorial(n)) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        return result;
    }

    // Чтоб не дублировать код, вынес в отдельный метод
    private static boolean checkNumForFactorial(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else if (n < 0) {
            throw new IllegalArgumentException("Incorrect number");
        } else {
            return true;
        }
    }

    public static long getFibonacci(int n) {
        long a = 0;
        long b = 1;
        long c;

        if (n == 0 || n < 0) {
            throw new IllegalArgumentException("Incorrect number");
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2 || n == 3) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        if (b <= 0) {
            System.out.println("Too large number");
            return 0;
        } else {
            return b;
        }
    }

    //TODO
    /**
     * Попытался сделать метод универсальным для всех типов.
     * Создать массив T[] и вернуть его нельзя поэтому возвращаем Object[].
     * надо подумать, стоит ли так рисковать
     */
    public static <T> Object[] reversArray(T[] array) {
        Object[] newArray = new Object[array.length];
        int index = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            newArray[index] = array[i];
            index--;
        }
        return newArray;
    }

}
