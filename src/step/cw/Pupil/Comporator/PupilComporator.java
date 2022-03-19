// create if you want to sort another options

package step.cw.Pupil.Comporator;

import java.util.Comparator;

public class PupilComporator implements Comparator<Pupils> {
    @Override
    public int compare(Pupils o1, Pupils o2) {
        if (o1.getWeight() > o2.getWeight()) return 1;
        if (o1.getWeight() < o2.getWeight()) return -1;
        else return o1.getName().compareTo(o2.getName());

    }
}
