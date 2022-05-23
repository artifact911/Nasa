package dmdev.java2.io.filesex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FilesRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "dmdev", "java2", "io", "resources", "writer2.txt");
        Files.write(path, List.of("Hello World", "Java"));

        Path path1 = Path.of("src", "dmdev", "java2", "io", "resources", "test.txt");
        try (Stream<String> lines = Files.lines(path1)) {
            lines.forEach(System.out::println);
        }
    }
}
