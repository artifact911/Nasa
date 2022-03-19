package step.cw.practice03stream.task05;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();


        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] arrayInt = new int[1];
            arrayInt[2] = 99;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            System.load(null);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            File file = new File("Yara.txt");
            FileReader fileReader = new FileReader(file);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            MyExceptions.Exception1();
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
