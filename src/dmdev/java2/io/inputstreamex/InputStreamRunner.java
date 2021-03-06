package dmdev.java2.io.inputstreamex;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {

    public static void main(String[] args) throws IOException {

       /* //File.separator - чтобы не писать "/". Это не безопасно для разных ОС
        File file = new File(String.join(File.separator, "src", "dmdev", "java2", "io", "resources", "test.txt"));*/

        //Заменим верхнее на современное
        File file = Path.of("src", "dmdev", "java2", "io", "resources", "test.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {

            /*// считает весь файл
            byte[] bytes = inputStream.readAllBytes();
            String stringValue = new String(bytes);
            System.out.println(stringValue);*/

            // Если хоти считывать порциями:
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }
}
