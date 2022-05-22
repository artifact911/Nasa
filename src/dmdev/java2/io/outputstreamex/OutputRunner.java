package dmdev.java2.io.outputstreamex;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class OutputRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("src", "dmdev", "java2", "io", "resources", "output.txt").toFile();

        // Если мы хотим дописывать, а не перезаписывать, то нужно написать так: FileOutputStream outputStream = new FileOutputStream
        // (file, true)
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            String value = "Hello World!";
            outputStream.write(value.getBytes(StandardCharsets.UTF_8));
            outputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8)); // модно перевели на новую строку
        }
    }
}
