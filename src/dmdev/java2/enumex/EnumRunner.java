package dmdev.java2.enumex;

import java.util.Arrays;

public class EnumRunner {

    public static void main(String[] args) {
        ProcessorType processorType = ProcessorType.BIT_32;
        System.out.println(processorType);
        System.out.println(processorType.name());
        System.out.println(processorType.toString());
        System.out.println(ProcessorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(ProcessorType.BIT_32.ordinal());
        System.out.println(ProcessorType.BIT_64.getName());
        System.out.println(ProcessorType.BIT_64.getDescription());
    }
}
