package step.hw.meo;

public class MeoStaticMethods {

    public static <T extends Comparable<T>> T getMax(T o1, T o2) {
        //System.out.println("Inside");

        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }

    }
}
