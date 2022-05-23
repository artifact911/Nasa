package dmdev.java2.io.outputstreamex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class WriterRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("src", "dmdev", "java2", "io", "resources", "writer.txt").toFile();

        // Если мы хотим дописывать, а не перезаписывать, то нужно написать так: FileOutputStream outputStream = new FileOutputStream
        // (file, true)
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
            fileWriter.append("Hello World!");
            fileWriter.newLine();
            fileWriter.append("Java");
        }
    }
}
