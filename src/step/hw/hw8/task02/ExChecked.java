package step.hw.hw8.task02;

import java.io.IOException;

public class ExChecked extends IOException {
    public ExChecked() {
    }

    public ExChecked(String message) {
        super(message);
    }

    public ExChecked(String message, Throwable cause) {
        super(message, cause);
    }

    public ExChecked(Throwable cause) {
        super(cause);
    }

    public static void getException() throws IOException {
        throw new IOException();
    }
}
