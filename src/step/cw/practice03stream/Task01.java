package step.cw.practice03stream;

public class Task01 {
    public static void main(String[] args) {
        int age;
        chekAge(18);
    }

    public static void chekAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age less than 18");
        } else {
            System.out.println(age + " is more and equals than 18");
        }

    }
}

