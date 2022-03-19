package step.hw.hw8.task06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Task06Work {
    public static void main(String[] args) {
        XmlReader[] array = {new XmlReader(), new XmlReader(), new XmlReader(), new XmlReader()};
        try {
            xmlReaderRunRead(array);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    static void xmlReaderRunRead(XmlReader[] array) throws FileNotFoundException {
        for (XmlReader value : array) {
            try {
                value.read();
            } catch (NullPointerException | Error | FileNotFoundException e) {
                System.err.println("Generated " + e.getClass().getName());
            } catch (FileSystemAlreadyExistsException e) {
                System.err.println("Generated " + e.getClass().getName() + " and it was changed");
                throw new FileNotFoundException("FileNotFoundException instead of FileSystemAlreadyExistsException");
            } catch (IOException e) {
                System.err.println("Generated " + e.getClass().getName() + " in the Class");
            }

        }

    }
}
