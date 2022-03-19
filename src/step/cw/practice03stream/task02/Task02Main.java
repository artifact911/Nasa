package step.cw.practice03stream.task02;

import java.io.File;

public class Task02Main {
    public static void main(String[] args) {
        File file = new File("D:\\_ArtifactDOC\\_Developer\\Шаг\\IDE_IdeaProjects\\NASA\\src\\step.cw.practice03stream\\task02\\text");
        ThrowGeneration throwGeneration = new ThrowGeneration();
        try {
            throwGeneration.connectFile(file);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
