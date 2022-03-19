package step.hw.hw8.task02;

public class ExUnchecked extends RuntimeException {
    public ExUnchecked() {
    }

    public ExUnchecked(String message) {
        super(message);
    }

    public ExUnchecked(String message, Throwable cause) {
        super(message, cause);
    }

    public ExUnchecked(Throwable cause) {
        super(cause);
    }

    public ExUnchecked(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void getException() {
        throw new RuntimeException();
    }
}
