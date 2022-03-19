package step.hw.meo;

import java.util.Comparator;

public class ComissionComparator implements Comparator<Comission> {

    @Override
    public int compare(Comission o1, Comission o2) {
        return o1.compareTo(o2);
    }
}
