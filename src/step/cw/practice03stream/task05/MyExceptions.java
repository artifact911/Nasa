package step.cw.practice03stream.task05;

public class MyExceptions extends Exception {
    public MyExceptions() {
    }

    public MyExceptions(String message) {
        super(message);
    }

    public MyExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExceptions(Throwable cause) {
        super(cause);
    }

    public MyExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void Exception1() {
        throw new RuntimeException();
    }
}
