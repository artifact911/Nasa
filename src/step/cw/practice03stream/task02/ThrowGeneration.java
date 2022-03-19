package step.cw.practice03stream.task02;

import java.io.File;

public class ThrowGeneration {


    protected void connectFile(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("Hi Exception! File is not found");
        }

    }
}
